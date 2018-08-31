package main.java.mongoperson.mongoDatabasePerson;

import java.util.ArrayList;

public class MongoPersonPlace {
    private ArrayList<ArrayList<String>> descriptionReferenceList;
    private String original;

    public void testPlaces()
    {
        if (descriptionReferenceList.size() > 1)
            System.out.println("referenceList greater than 1\n");
        else if (descriptionReferenceList.get(0).size() > 1)
            System.out.println("Inner array greater than 1\n");

    }

    @Override
    public String toString()
    {
        String output = "";

        output += original;
        output += "\n\t\t\tDescriptionReferenceList: ";

        if (descriptionReferenceList.get(0).size() > 0)
        {
            output += descriptionReferenceList.get(0).get(0);
            for (int i = 1; i < descriptionReferenceList.get(0).size(); i++)
                output += ", " + descriptionReferenceList.get(0).get(i);
        }

        return output;
    }

    public ArrayList<ArrayList<String>> getDescriptionReferenceList() {
        return descriptionReferenceList;
    }

    public String getOriginal() {
        return original;
    }
}
