package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.CoreCompetency;
import org.launchcode.techjobs.oo.PositionType;


import org.junit.Assert;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();

        Assert.assertNotEquals(testJob1, testJob2);
    }


    @Test
    public void testJobConstructorSetsAllFields() {

        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertEquals("Product tester", testJob.getName());
        Assert.assertEquals(new Employer("ACME").getValue(), testJob.getEmployer().getValue());
        Assert.assertEquals(new Location("Desert").getValue(), testJob.getLocation().getValue());
        Assert.assertEquals(new PositionType("Quality control").getValue(), testJob.getPositionType().getValue());
        Assert.assertEquals(new CoreCompetency("Persistence").getValue(), testJob.getCoreCompetency().getValue());


        Assert.assertTrue(testJob instanceof Job); // null check per recommendation from intelliJ
        Assert.assertTrue(testJob.getEmployer() instanceof Employer);
        Assert.assertTrue(testJob.getLocation() instanceof Location);
        Assert.assertTrue(testJob.getPositionType() instanceof PositionType);
        Assert.assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);


    }


    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Chuck", new Employer("Apple"), new Location("Kansas City"), new PositionType("Manager"), new CoreCompetency("Tech Sales"));
        Job job2 = new Job("Chuck", new Employer("Apple"), new Location("Kansas City"), new PositionType("Manager"), new CoreCompetency("Tech Sales"));

        Assert.assertFalse(job1.equals(job2));
    }


    // only test that is showing is the one for Name: Janice
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob1 = new Job("Janice", new Employer("NASA"), new Location("New York"), new PositionType("Web Dev"), new CoreCompetency("Java"));

        String stringTestJob1 = testJob1.toString();
        char firstChar = stringTestJob1.charAt(0);
        char lastChar = stringTestJob1.charAt(stringTestJob1.length() - 1);

        Assert.assertEquals('\n', firstChar);
        Assert.assertEquals('\n', lastChar);


    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {


        Job testJob2 = new Job("Eric", new Employer("BitWig"), new Location("France"), new PositionType("Tech Support"), new CoreCompetency("Hardware"));
        String[] jobFieldLabels = {"ID:  ", " Name: ", " Employer: ", " Location: ", " Position Type: ", " Core Competency: "};
        String jobFieldLabelsString = String.join(",", jobFieldLabels);
        String[] jobFields = {String.valueOf(testJob2.getId()) , testJob2.getName() , testJob2.getEmployer().getValue() , testJob2.getLocation().getValue() , testJob2.getPositionType().getValue() , testJob2.getCoreCompetency().getValue()};
        String jobFieldValuesString = String.join(",", jobFields);
        Assert.assertEquals("ID:  , Name: , Employer: , Location: , Position Type: , Core Competency: ", jobFieldLabelsString.toString());
        Assert.assertEquals("4,Eric,BitWig,France,Tech Support,Hardware", jobFieldValuesString);



    }

    @Test
        public void testToStringHandlesEmptyField(){
            Job emptyJobTest = new Job("", new Employer(""), new Location(""), new PositionType(""),
                    new CoreCompetency(""));

            String expectedValue = "\n" + "ID: " + emptyJobTest.getId() +"\n" +
                    "Name: Data not available" +"\n" +
                    "Employer: Data not available" + "\n" +
                    "Location: Data not available" + "\n" +
                    "Position Type: Data not available" +  "\n" +
                    "Core Competency: Data not available" +  "\n";

            Assert.assertEquals(expectedValue, emptyJobTest.toString());
    }
}

