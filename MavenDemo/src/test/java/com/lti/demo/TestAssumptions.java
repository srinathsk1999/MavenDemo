package com.lti.demo;

import org.junit.Test;
import org.junit.jupiter.api.Assumptions;

class TestAssumptions {



    @Test
        void testOnDev()
        {
            System.setProperty("ENV", "DEV");
            Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), TestAssumptions::message);
            System.out.println(" continue execution");
        }



       @Test
        void testOnProd()
        {
            System.setProperty("ENV", "PROD");
            Assumptions.assumeFalse("PROD".equals(System.getProperty("ENV")),TestAssumptions::message);
            System.out.println(" don't continue execution");
        }



       private static String message () {
            return "TEST Execution Failed :: ";
        }



}
