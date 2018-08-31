package main.java;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class main
{
    public static void main(String[] args)
    {
        MongoClient mongo = new MongoClient("localhost", 8080);
        MongoDatabase db = mongo.getDatabase("familysearch");
        MongoCollection snapshot = db.getCollection("snapshot");
        FindIterable<Document> docs = snapshot.find();

        for (Document doc : docs)
        {

        }
    }
}
