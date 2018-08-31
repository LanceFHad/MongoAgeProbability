package main.java.databaseclasses.mongoperson.mongoSourceDescription;
import main.java.databaseclasses.mongoperson.MongoDatabaseIdentifier;

public class MongoSourceDescription {
    private String about;
    private String resourceType;
    private MongoDatabaseIdentifier identifiers;
    private MongoComponentOf componentOf;
    private MongoModifiedSource modified;
    private String id;

    @Override
    public String toString()
    {
        String output = "";

        if (id != null)
            output += "\tID: " + id;
        if (resourceType != null)
            output += "\n\tResource Type: " + resourceType;
        if (about != null)
            output += "\n\tAbout: " + about;
        if (identifiers != null)
            output += "\n\tIdentifiers: " + identifiers;
        if (componentOf != null)
            output += "\n\tComponentOf: " + componentOf;
        if (modified != null)
            output += "\n\tModified: " + modified;

        return output;
    }
}
