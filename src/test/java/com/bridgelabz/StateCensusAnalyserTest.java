package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


public class StateCensusAnalyserTest {

    public static final String STATECENSUS_CSVFILE = "./src/main/resources/StateCensusData.csv";
    public static final String STATECODES_CSVFILE = "./src/main/resources/IndiaStateCode.csv";
    public static final String WRONG_FILE = "/useless.txt";

    @Test
    public void GivenTheStateCodesCsvFile_IfHasCorrectNumberOfRecords_ShouldReturnTrue() {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();

        try {
            int count = stateCensusAnalyser.loadCsvData(STATECENSUS_CSVFILE, StateCensus.class);
            System.out.println(count);
            Assert.assertEquals(29, count);
        } catch (CensusAnalyserException e) {
            e.printStackTrace();
        }
    }

}


