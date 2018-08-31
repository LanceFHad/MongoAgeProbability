package main.java.databaseclasses.mongoperson;

import java.util.ArrayList;

public class MongoDatabaseIdentifier {
    private ArrayList<String> Persistent;

    public String toString()
    {
        String output = "";

        for (int i = 0; i < Persistent.size(); i++)
            output += "\n\t\t" + Persistent.get(i);

        return output;
    }
}
