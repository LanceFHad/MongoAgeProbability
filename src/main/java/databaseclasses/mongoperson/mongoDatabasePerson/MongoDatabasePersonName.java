package main.java.databaseclasses.mongoperson.mongoDatabasePerson;

import java.util.ArrayList;

public class MongoDatabasePersonName {
    private ArrayList<MongoDatabasePersonNameform> nameForms;
    private String type;
    private Boolean preferred;

    public String toString()
    {
        String output = "";

        for (int i = 0; i < nameForms.size(); i++)
        {
            output += "\n\t\t" + nameForms.get(i).getFullText();
            output += ", Type: " + type;
            output += ", Preferred: " + preferred;
            output += nameForms.get(i);
        }
        return output;
    }

    public ArrayList<MongoDatabasePersonNameform> getNameForms() {
        return nameForms;
    }

    public String getType() {
        return type;
    }

    public Boolean getPreferred() {
        return preferred;
    }
}
