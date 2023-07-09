package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();

        assertNotEquals(testJob1, testJob2);
    }


    @Test
    public void testJobConstructorSetsAllFields() {

        Job testingAllFields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", testingAllFields.getName());
        assertEquals(new Employer("ACME"), testingAllFields.getEmployer());
        assertEquals(new Location("Desert"), testingAllFields.getLocation());
        assertEquals(new PositionType("Quality control"), testingAllFields.getPositionType());
        assertEquals(new CoreCompetency("Persistence"), testingAllFields.getCoreCompetency());


        assertTrue(testingAllFields.getName() instanceof String);
        assertTrue(testingAllFields.getEmployer() instanceof Employer);
        assertTrue(testingAllFields.getLocation() instanceof Location);
        assertTrue(testingAllFields.getPositionType() instanceof PositionType);
        assertTrue(testingAllFields.getCoreCompetency() instanceof CoreCompetency);


    }


    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Chuck", new Employer("Apple"), new Location("Kansas City"), new PositionType("Manager"), new CoreCompetency("Tech Sales"));
        Job job2 = new Job("Chuck", new Employer("Apple"), new Location("Kansas City"), new PositionType("Manager"), new CoreCompetency("Tech Sales"));

        assertFalse(job1.equals(job2));
    }


    // only test that is showing is the one for Name: Janice
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob = new Job("Janice", new Employer("NASA"), new Location("New York"), new PositionType("Web Dev"), new CoreCompetency("Java"));
        assertEquals("Name: Janice" + "\n", testJob.getName().toString());
        assertEquals(new Employer("Employer: NASA" + "\n"), testJob.getEmployer().toString());
        assertEquals(new Location("Location: New York" + "\n"), testJob.getLocation().toString());
        assertEquals(new PositionType("Position Type: Web Dev" + "\n"), testJob.getPositionType().toString());
        assertEquals(new CoreCompetency("Core Competency: Java" + "\n"), testJob.getCoreCompetency().toString());

    }
}

