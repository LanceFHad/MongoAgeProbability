package main.java.databaseclasses.mongoperson;

public class MongoRelationship {
    private MongoRelationshipResource person1;
    private MongoRelationshipResource person2;
    private String type;

    public String toString()
    {
        String output = "";

        output += "Person1: " + person1;
        output += ", Person2: " + person2;
        output += ", Type: " + type;

        return output;
    }

    public MongoRelationshipResource getPerson1() {
        return person1;
    }

    public MongoRelationshipResource getPerson2() {
        return person2;
    }

    public String getType() {
        return type;
    }
}
