package main.java.mongoperson.mongoDatabasePerson;

public class MongoNameParts {
    private String type;
    private String value;

    @Override
    public String toString()
    {
        return "Type: " + type + ", Value: " + value;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
