package main.java.mongoperson.mongoDatabasePerson;

import java.util.ArrayList;

public class MongoDatabaseDate {
    private MongoDatetime datetime;
    private String original;
    private ArrayList<MongoNormalizedDate> normalized;
    private String formal;

    @Override
    public String toString()
    {
        String output = "";

        output += "Datetime: " + datetime;
        if (original != null)
            output += "; Original: " + original;
        if (normalized != null)
            output += "; Normalized: " + normalized.get(0);
        if (formal != null)
            output += "; Formal: " + formal;

        return output;
    }

    public MongoDatetime getDatetime() {
        return datetime;
    }

    public String getOriginal() {
        return original;
    }

    public ArrayList<MongoNormalizedDate> getNormalized() {
        return normalized;
    }

    public String getFormal() {
        return formal;
    }
}
