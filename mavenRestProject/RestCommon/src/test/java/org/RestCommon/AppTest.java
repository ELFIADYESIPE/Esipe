package org.RestCommon;

import edu.elfiady.ingé2.outils.representation.Planning;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
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
    public void testModifierPlanning_MethodMustBeInvokedSuccefully()
    {
    	Planning planning = new Planning(2);
    	planning.modifierPlanning();
    	int id = planning.getId();
    	boolean test = false;
    	if(id == 3) {
    		test = true;
    	}
    	else {
    		test = false;
    	}
        assertTrue("La méthode doit correctement marche",  test );
    }
}
