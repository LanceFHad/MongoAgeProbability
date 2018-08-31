package main.java.databaseclasses.mongoperson.mongoDatabasePerson;

import java.util.ArrayList;

public class MongoDatabasePersonNameform {
    private String fullText;
    private ArrayList<MongoNameParts> parts;

    public String getFullText()
    {
        return fullText;
    }

    @Override
    public String toString()
    {
        String output = "";

        for (int i = 0; i < parts.size(); i++)
            output += "\n\t\t\t" + parts.get(i);

        return output;
    }

    public ArrayList<MongoNameParts> getParts() {
        return parts;
    }
}
