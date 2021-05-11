package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;


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

    @Test
    public void GivenTheStateCensusCsvFile_IfDoesntExist_ShouldThrowCensusAnalyserException() {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();

        try {
            stateCensusAnalyser.loadCsvData(WRONG_FILE, StateCensus.class);
        } catch (CensusAnalyserException e) {
            e.printStackTrace();
            Assert.assertEquals(CensusAnalyserException.CensusExceptionType.NO_SUCH_FILE, e.type);
        }
    }

    @Test
    public void GivenTheStateCensusCsvFile_WhenCorrect_ButFileExtensionIncorrect_ShouldThrowCensusAnalyserException() {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();

        try {
            stateCensusAnalyser.loadCsvData(STATECODES_CSVFILE, StateCensus.class);
        } catch (CensusAnalyserException e) {
            e.printStackTrace();
            Assert.assertEquals(CensusAnalyserException.CensusExceptionType.INCORRECT_DATA_ISSUE, e.type);
        }
    }
}


