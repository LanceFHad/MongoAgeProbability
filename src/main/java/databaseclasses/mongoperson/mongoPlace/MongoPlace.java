package main.java.databaseclasses.mongoperson.mongoPlace;

import java.util.ArrayList;

public class MongoPlace {
    private ArrayList<ArrayList<MongoJurisdictionChain>> jurisdictionChain;
    private String id;
    private ArrayList<MongoPlaceName> names;

    public void testNames()
    {
        if (names != null && names.size() > 1)
            System.out.println("Names greater than 1\n");
    }

    public String toString()
    {
        String output = "";

        output += "\n\tID: " + id;
        output += "\n\tNames: " + names.get(0);
        for (int i = 1; i < names.size(); i++)
            output += ", " + names.get(i);
        output += "\n\tJurisdictionChain: ";
        for (int j = 0; j < jurisdictionChain.size(); j++)
        {
            for (int i = 0; i < jurisdictionChain.get(j).size(); i++)
                output += "\n\t\t" + jurisdictionChain.get(j).get(i);
        }
        return output;

    }

    public ArrayList<ArrayList<MongoJurisdictionChain>> getJurisdictionChain() {
        return jurisdictionChain;
    }

    public String getId() {
        return id;
    }

    public ArrayList<MongoPlaceName> getNames() {
        return names;
    }
}
