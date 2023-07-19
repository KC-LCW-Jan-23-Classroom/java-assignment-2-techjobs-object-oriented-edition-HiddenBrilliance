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



   @Override
    public String toString() {
        this.name = getName();
        this.employer = getEmployer();
        this.location = getLocation();
        this.positionType = getPositionType();
        this.coreCompetency = getCoreCompetency();

        String[] jobFieldLabels = {"ID: ", "Name: ", "Employer: ", "Location: ", "Position Type: ", "Core Competency: "};
        String[] jobFieldsValues = {String.valueOf(this.getId()), this.getName(), this.getEmployer().getValue(), this.getLocation().getValue(), this.getPositionType().getValue(), this.getCoreCompetency().getValue()};

        StringBuffer stringOutput = new StringBuffer();

        String jobDisplayWithNewLines = ""; // says Job displayWithNewLines out of scope how to get it into scope
       for (int i = 0; i < jobFieldLabels.length; i++) {

            String newLineBeginning = "\n";
            String newLineEnd = "\n";

           if (jobFieldsValues[i] == "") {
               stringOutput.append(newLineBeginning);
               stringOutput.append(jobFieldLabels[i]);
               stringOutput.append("Data not available");
               stringOutput.append(newLineEnd);
           }

           else {
            stringOutput.append(newLineBeginning);
            stringOutput.append(jobFieldLabels[i]);
            stringOutput.append(jobFieldsValues[i]);
            stringOutput.append(newLineEnd);}




        }

        return stringOutput.toString();


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
