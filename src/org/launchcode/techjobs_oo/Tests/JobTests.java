package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;

import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.CoreCompetency;

import static org.junit.Assert.*;

public class JobTests {

Job testJob;
Job otherTestJob;
Job fancyTestJob;

@Before
public void createTestJob(){
    testJob = new Job();
    otherTestJob = new Job();
    fancyTestJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType ("Quality Control"), new CoreCompetency("Persistence"));
}
@Test
public void testSettingJobId(){
    assertNotEquals(testJob, otherTestJob);
}
@Test
public void testJobContructorSetsAllFields(){
    assertEquals("ACME", fancyTestJob.getEmployer().getValue());
    assertTrue(fancyTestJob.getEmployer() instanceof Employer);
}


}
