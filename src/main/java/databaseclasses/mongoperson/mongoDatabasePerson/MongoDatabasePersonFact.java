package main.java.databaseclasses.mongoperson.mongoDatabasePerson;

public class MongoDatabasePersonFact {
    private MongoDatabaseDate date;
    private String type;
    private MongoPersonPlace place;

    public void testPlaces()
    {
        if (place != null)
            place.testPlaces();
    }

    @Override
    public String toString()
    {
        String output = "";

        output += "\tDate: " + date;
        output += "\n\t\tEvent: " + type;
        output += "\n\t\tPlace: " + place;

        return output + "\n";
    }

    public MongoDatabaseDate getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public MongoPersonPlace getPlace() {
        return place;
    }
}
