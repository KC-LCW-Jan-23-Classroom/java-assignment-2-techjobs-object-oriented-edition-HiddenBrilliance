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


        ArrayList<HashMap> allJobFields = new ArrayList<>(); // create ArrayList for HashMap
        HashMap<String, String> jobFields = new HashMap<>(); // create HashMap

        jobFields.put("ID: ", String.valueOf(job.getId())); // items put into HashMap by String Key, Value Pairs
        jobFields.put("Name: ", job.getName());
        jobFields.put("Employer: ", job.getEmployer().getValue());
        jobFields.put("Location : ", job.getLocation().getValue());
        jobFields.put("Position Type : ", job.getPositionType().getValue());
        jobFields.put("Core Competency: ", job.getCoreCompetency().getValue());

        allJobFields.add(jobFields); // adds HashMap to ArrayList

        String value = "";

        for (Map<String, String> aJobField : allJobFields // for Each single Jobfield in ArrayList allJobFields
        ) {
            Set<Map.Entry<String, String>> entries = aJobField.entrySet();
            for (Map.Entry<String, String> entry : entries
            ) {
                value += (entry.getKey() + entry.getValue());


            }


        }
        return value;
    }



//        if (jobFields == null) {
//
//
//            return "No job"; //change
//        } else  {
//
//            jobFields.add(String.valueOf(job.getId()));
//            jobFields.add(job.getName());
//            jobFields.add(job.getEmployer().getValue());
//            jobFields.add(job.getLocation().getValue());
//            jobFields.add(job.getPositionType().getValue());
//            jobFields.add(job.getCoreCompetency().getValue());
//            jobFields.add( "/n" + job.getCoreCompetency().getValue() + "/n");
//            String result = "";
//             for (String jobField: jobFields
//                 ) {
//              result =  result + "/n" + jobField + "/n";
//            }
//return result;





//        jobFields.put("ID", String.valueOf(testJob.getId()));
//        jobFields.put("Name", testJob.getName());
//        jobFields.put("Employer", testJob.getEmployer().getValue());
//        jobFields.put("Location", testJob.getLocation().getValue());
//        jobFields.put("Position Type", testJob.getPositionType().getValue());
//        jobFields.put("Core Competency", testJob.getCoreCompetency().getValue());




//        ArrayList<HashMap> allJobFields = new ArrayList<>(); // once HashMap made print each entry using forEach
//        allJobFields.add(jobFields);
//
//// forEach(Map<String, String> jobField : allJobFields) {System.out.println}












//                "ID: " + "/n" + testJob.getId() + "/n";
//                "Name: " + "/n" + testJob.getName() + "/n";
//                "Employer: " + "/n" + employer +
//                "Location: " + location +
//                "Position Type: " + positionType +
//                "Core Competency: " + coreCompetency +






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
