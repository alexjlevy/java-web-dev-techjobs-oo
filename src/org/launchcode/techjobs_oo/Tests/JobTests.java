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
Job almostSameJob;

@Before
public void createTestJob(){
    testJob = new Job();
    otherTestJob = new Job();
    fancyTestJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType ("Quality Control"), new CoreCompetency("Persistence"));
    almostSameJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType ("Quality Control"), new CoreCompetency("Persistence"));
}
@Test
public void testSettingJobId(){
    assertNotEquals(testJob.getId(), otherTestJob.getId());
    assertTrue(testJob.getId()+1 == otherTestJob.getId() || testJob.getId()-1 == otherTestJob.getId());
}
@Test
public void testJobContructorSetsAllFields(){
    assertEquals("Product tester", fancyTestJob.getName());
    assertEquals("ACME", fancyTestJob.getEmployer().getValue());
    assertEquals("Desert", fancyTestJob.getLocation().getValue());
    assertEquals("Quality Control", fancyTestJob.getPositionType().getValue());
    assertEquals("Persistence", fancyTestJob.getCoreCompetency().getValue());
    assertTrue(fancyTestJob.getEmployer() instanceof Employer);
    assertTrue(fancyTestJob.getLocation() instanceof Location);
    assertTrue(fancyTestJob.getPositionType() instanceof PositionType);
    assertTrue(fancyTestJob.getCoreCompetency() instanceof CoreCompetency);
}
@Test
public void testJobsForEquality(){
    assertFalse(fancyTestJob.equals(almostSameJob));
}

}
