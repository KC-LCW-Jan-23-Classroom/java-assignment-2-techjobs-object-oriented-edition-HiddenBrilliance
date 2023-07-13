package org.launchcode.techjobs.oo;

import java.util.*;


public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job that = (Job) o;
        return id == that.id;
    }


    //    @Override
    public String toString(Job job) {

        this.name = getName();
        this.employer = getEmployer();
        this.location = getLocation();
        this.positionType = getPositionType();
        this.coreCompetency = getCoreCompetency();

// string with newline in front of label
        String[] jobFieldLabelsAndNewLine = {"/n" + "ID: ", "/n" + "Name: " , "/n" + "Employer: " , "/n" + "Location: ",  "/n" + "Position Type: ", "/n"+ "Core Competency: " };
// new line behind value
        String[] jobFieldsValuesAndNewLine = {job.getId() + "/n", job.getName() + "/n", job.employer.getValue() + "/n", job.getLocation().getValue() + "/n", job.getPositionType().getValue() + "/n", job.getCoreCompetency().getValue() + "/n"};

        String fieldLabelsAndValues = "";

        // interates through length of jobfields as it is equal to values
        for (int i = 0; i < jobFieldsValuesAndNewLine.length; i++) {

            // declare the string values for jobfield/value iteration
            String jobFieldLabelsAndNewLines = jobFieldLabelsAndNewLine[i];
            String jobFieldValuesAndNewLines = jobFieldsValuesAndNewLine[i];

            // expecting one large string with newlines in front and back
            fieldLabelsAndValues += jobFieldLabelsAndNewLines + jobFieldValuesAndNewLines;

        }




return fieldLabelsAndValues;
    }





    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
