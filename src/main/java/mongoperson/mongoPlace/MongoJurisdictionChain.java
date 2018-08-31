package main.java.mongoperson.mongoPlace;

public class MongoJurisdictionChain {
    private double id;
    private String name;

    @Override
    public String toString()
    {
        return "ID: " + id + ", Name: " + name;
    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
