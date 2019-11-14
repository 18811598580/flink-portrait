package com.youfan.util;

import com.alibaba.fastjson.JSONObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 * Created by li on 2019/1/5.
 */
public class MongoUtils {

    private static MongoClient mongoClient = new MongoClient("192.168.80.134",27017);



    public static Document findoneby(String tablename, String database,String yearbasetype){
        //获取数据库
        MongoDatabase mongoDatabase = mongoClient.getDatabase(database);
        //获取表连接对象
        MongoCollection mongoCollection = mongoDatabase.getCollection(tablename);
        Document  doc = new Document();
        doc.put("info", yearbasetype);
        FindIterable<Document> itrer = mongoCollection.find(doc);
        MongoCursor<Document> mongocursor = itrer.iterator();
        if(mongocursor.hasNext()){
            //找出info为yearbasetype的document记录
            return mongocursor.next();
        }else{
            return null;
        }
    }


    public static void saveorupdatemongo(String tablename,String database,Document doc) {
        MongoDatabase mongoDatabase = mongoClient.getDatabase(database);
        MongoCollection<Document> mongocollection = mongoDatabase.getCollection(tablename);
        //判断是否有该id，如果没有_id,插入数据
        if(!doc.containsKey("_id")){
            ObjectId objectid = new ObjectId();
            doc.put("_id", objectid);
            mongocollection.insertOne(doc);
            return;
        }
        Document matchDocument = new Document();
        String objectid = doc.get("_id").toString();
        matchDocument.put("_id", new ObjectId(objectid));
        FindIterable<Document> findIterable =  mongocollection.find(matchDocument);
        if(findIterable.iterator().hasNext()){
            //更新doc
            mongocollection.updateOne(matchDocument, new Document("$set",doc));
            try {
                System.out.println("come into saveorupdatemongo ---- update---"+ JSONObject.toJSONString(doc));
            } catch (Exception e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else{
            mongocollection.insertOne(doc);
            try {
                System.out.println("come into saveorupdatemongo ---- insert---"+JSONObject.toJSONString(doc));
            }catch (Exception e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
