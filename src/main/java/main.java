package main.java;

import com.google.gson.Gson;
import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import main.java.mongoperson.mongoDatabasePerson.MongoDatabasePersonFact;
import org.bson.Document;
import main.java.mongoperson.*;

import java.util.ArrayList;

public class main
{
    public static void main(String[] args)
    {
        Gson gson = new Gson();
        MongoClient mongo = new MongoClient("localhost", 8080);
        MongoDatabase db = mongo.getDatabase("familysearch");
        MongoCollection snapshot = db.getCollection("snapshot");
        FindIterable<Document> docs = snapshot.find();

        for (Document doc : docs)
        {
            MongoPerson current = gson.fromJson(doc.toJson(), MongoPerson.class);
            ArrayList<MongoDatabasePersonFact> facts = current.getPersons().get(0).getFacts();

        }
    }
}
