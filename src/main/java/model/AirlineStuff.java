package model;

public class AirlineStuff {

    // The primary key
    protected Integer airlineStuffNo;

    // The foreign key
    protected String airlineCode; // the airline where the stuff works

    // Personal Information
    protected String airlineStuffName;
    protected String airlineStuffEmail; // Also be used as login username
    protected String airlineStuffPassword;

    public AirlineStuff(Integer airlineStuffNo, String airlineCode, String airlineStuffName, String airlineStuffEmail, String airlineStuffPassword) {
        this.airlineStuffNo = airlineStuffNo;
        this.airlineCode = airlineCode;
        this.airlineStuffName = airlineStuffName;
        this.airlineStuffEmail = airlineStuffEmail;
        this.airlineStuffPassword = airlineStuffPassword;
    }

    public Integer getAirlineStuffNo() {
        return airlineStuffNo;
    }

    public void setAirlineStuffNo(Integer airlineStuffNo) {
        this.airlineStuffNo = airlineStuffNo;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getAirlineStuffName() {
        return airlineStuffName;
    }

    public void setAirlineStuffName(String airlineStuffName) {
        this.airlineStuffName = airlineStuffName;
    }

    public String getAirlineStuffEmail() {
        return airlineStuffEmail;
    }

    public void setAirlineStuffEmail(String airlineStuffEmail) {
        this.airlineStuffEmail = airlineStuffEmail;
    }

    public String getAirlineStuffPassword() {
        return airlineStuffPassword;
    }

    public void setAirlineStuffPassword(String airlineStuffPassword) {
        this.airlineStuffPassword = airlineStuffPassword;
    }
}
