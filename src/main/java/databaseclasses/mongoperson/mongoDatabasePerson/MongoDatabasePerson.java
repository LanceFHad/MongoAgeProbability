package main.java.databaseclasses.mongoperson.mongoDatabasePerson;

import main.java.databaseclasses.mongoperson.MongoDatabaseIdentifier;

import java.util.ArrayList;

public class MongoDatabasePerson {
    private MongoGender gender;
    private MongoDatabaseIdentifier identifiers;
    private ArrayList<MongoGender> putativeGender;
    private ArrayList<MongoDatabasePersonName> names;
    private ArrayList<MongoDatabasePersonFact> facts;
    private String id;

    public void testPlaces()
    {
        if (facts != null && facts.size() > 0)
        {
            for (MongoDatabasePersonFact fact : facts)
                fact.testPlaces();
        }
    }

    @Override
    public String toString()
    {
        String output = "";

        output += "ID: " + id;
        output += "\n\tIdentifiers: " + identifiers;
        output += "\n\tGender: " + gender;
        output += "\n\tPutativeGender:";
        for (int i = 0; i < putativeGender.size(); i++ )
            output += "\n\t\t" + putativeGender.get(i);

        if (names != null)
        {
            output += "\n\tNames: ";
            for (int i = 0; i < names.size(); i++)
                output += names.get(i);
        }
        if (facts != null)
        {
            output += "\n\tFacts: ";
            for (int i = 0; i < facts.size(); i++)
                output += "\n\t" + facts.get(i);
        }

        return output;
    }

    public MongoGender getGender() {
        return gender;
    }

    public MongoDatabaseIdentifier getIdentifiers() {
        return identifiers;
    }

    public ArrayList<MongoGender> getPutativeGender() {
        return putativeGender;
    }

    public ArrayList<MongoDatabasePersonName> getNames() {
        return names;
    }

    public ArrayList<MongoDatabasePersonFact> getFacts() {
        return facts;
    }

    public String getId() {
        return id;
    }
}
