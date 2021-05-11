package com.bridgelabz;

import com.opencsv.bean.CsvBindByName;

public class StateCode {
    @CsvBindByName(column = "SrNo")
    private int SrNo;

    @CsvBindByName(column = "StateName",required = true)
    private String StateName;

    @CsvBindByName(column = "TIN")
    private int TIN;

    @CsvBindByName(column = "StateCode", required = true)
    private String StateCode;

    public StateCode() {
    }

    public int getSrNo() {
        return SrNo;
    }

    public void setSrNo(int srNo) {
        this.SrNo = srNo;
    }

    public String getStateName() {
        return StateName;
    }

    public void setStateName(String stateName) {
        this.StateName = stateName;
    }

    public int getTIN() {
        return TIN;
    }

    public void setTIN(int TIN) {
        this.TIN = TIN;
    }

    public String getStateCode() {
        return StateCode;
    }

    public void setStateCode(String stateCode) {
        this.StateCode = stateCode;
    }

    @Override
    public String toString() {
        return "StateCode{" +
                "SrNo=" + SrNo +
                ", StateName='" + StateName + '\'' +
                ", TIN=" + TIN +
                ", StateCode='" + StateCode + '\'' + '}'
                +"\n";
    }
}
