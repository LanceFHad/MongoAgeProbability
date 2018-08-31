package main.java.mongoperson;

import main.java.mongoperson.mongoDatabasePerson.MongoDatabasePerson;
import main.java.mongoperson.mongoPlace.MongoPlace;
import main.java.mongoperson.mongoSourceDescription.MongoSourceDescription;

import java.util.ArrayList;

public class MongoPerson {
    private ArrayList<MongoRelationship> relationships;
    private String _id;
    private String description;
    private ArrayList<MongoPlace> places;
    private ArrayList<MongoDatabasePerson> persons;
    private ArrayList<MongoSourceDescription> sourceDescriptions;

    public void testPlaces()
    {
        for (MongoDatabasePerson person : persons)
            person.testPlaces();
    }

    public void testPlaceNames()
    {
        if (places != null && places.size() > 0)
        {
            for (MongoPlace place : places)
                place.testNames();

        }
    }


    public String toString()
    {
        String output = "";

        output += "ID: " + _id;

        if (description != null)
            output += "\nDescription: " + description;

        if (relationships != null)
        {
            output += "\nRelationships: ";
            for (int i = 0; i < relationships.size(); i++)
                output += "\n\t" + relationships.get(i);
        }

        if (places != null)
        {
            output += "\nPlaces: ";
            for (int i = 0; i < places.size(); i++) {
                if (i != 0)
                    output += "\n";
                output += places.get(i);
            }
        }

        if (persons != null)
        {
            output += "\nPersons: ";
            for (int i = 0; i < persons.size(); i++)
                output += "\n\t" + persons.get(i);
        }

        if (sourceDescriptions != null)
        {
            output += "\nSourceDescriptions: ";
            for (int i = 0; i < sourceDescriptions.size(); i++) {
                if (i != 0)
                    output += "\n";
                output += "\n" + sourceDescriptions.get(i);
            }
        }
        return output;
    }

    public ArrayList<MongoRelationship> getRelationships() {
        return relationships;
    }

    public String get_id() {
        return _id;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<MongoPlace> getPlaces() {
        return places;
    }

    public ArrayList<MongoDatabasePerson> getPersons() {
        return persons;
    }

    public ArrayList<MongoSourceDescription> getSourceDescriptions() {
        return sourceDescriptions;
    }
}
