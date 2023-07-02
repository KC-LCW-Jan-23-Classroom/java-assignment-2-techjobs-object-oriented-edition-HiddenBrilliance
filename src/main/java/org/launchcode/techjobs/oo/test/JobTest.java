package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
@Test
    public void testSettingJobId(){
    Job testJob1 = new Job();
    Job testJob2 = new Job();

    assertNotEquals(testJob1.equals(testJob2));
}
    private void assertNotEquals(boolean b) {

    }

    @Test
    public void testJobConstructorSetsAllFields() {

    Job testingAllFields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals(testingAllFields.getName() instanceof String);
    assertEquals(testingAllFields.getEmployer() instanceof Employer);
    assertEquals(testingAllFields.getLocation() instanceof Location);
    assertEquals(testingAllFields.getPositionType() instanceof PositionType);
    assertEquals(testingAllFields.getCoreCompetency() instanceof CoreCompetency);


    assertTrue(testingAllFields.getName() instanceof String);
    assertTrue(testingAllFields.getEmployer() instanceof Employer);
    assertTrue(testingAllFields.getLocation() instanceof Location);
    assertTrue(testingAllFields.getPositionType() instanceof PositionType);
    assertTrue(testingAllFields.getCoreCompetency() instanceof CoreCompetency);


}
    private void assertEquals(boolean b) {

    }

    private void assertTrue(boolean b) {

    }

    @Test
    public void testJobsForEquality(){
    Job job1 = new Job("Chuck", new Employer("Apple"), new Location("Kansas City"), new PositionType("Manager"), new CoreCompetency("Tech Sales"));
    job1.getId();
    Job job2 = new Job("Chuck", new Employer("Apple"), new Location("Kansas City"), new PositionType("Manager"), new CoreCompetency("Tech Sales"));
    job2.getId();

    assertFalse(job1.equals(job2));
    }
    private void assertFalse(boolean b){

    }



}

