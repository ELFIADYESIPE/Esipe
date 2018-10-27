package org.RestCommon;

import esipeMavenProjet.mavenRestProject.Planning;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testUpdatePlanning() {
    	Planning p = new Planning(3);
    	p.planningUpdate();
    	int id = p.getId();
    	boolean test = false;
    	
    	if(id == 4) {
    		test = true;
    	} else {
    		teste = false;
    	}
    	
    	assertTrue("La méthode doit correctement marche",  test );
    	
    }
}
