package model;

public class AirportStuff {

    // The primary key
    private Integer airportStuffNo;

    // The foreign keys
    private String airportNo; // The airport where the stuff works

    // Personal Information
    private String airportStuffName;
    private String airportStuffEmail; // Also be used as login username
    private String airportStuffPassword;

    public AirportStuff(String airportStuffName, Integer airportStuffNo, String airportStuffEmail, String airportStuffPassword, String airportNo) {
        this.airportStuffName = airportStuffName;
        this.airportStuffNo = airportStuffNo;
        this.airportStuffEmail = airportStuffEmail;
        this.airportStuffPassword = airportStuffPassword;
        this.airportNo = airportNo;
    }

    public String getAirportStuffName() {
        return airportStuffName;
    }

    public void setAirportStuffName(String airportStuffName) {
        this.airportStuffName = airportStuffName;
    }

    public Integer getAirportStuffNo() {
        return airportStuffNo;
    }

    public void setAirportStuffNo(Integer airportStuffNo) {
        this.airportStuffNo = airportStuffNo;
    }

    public String getAirportStuffEmail() {
        return airportStuffEmail;
    }

    public void setAirportStuffEmail(String airportStuffEmail) {
        this.airportStuffEmail = airportStuffEmail;
    }

    public String getAirportStuffPassword() {
        return airportStuffPassword;
    }

    public void setAirportStuffPassword(String airportStuffPassword) {
        this.airportStuffPassword = airportStuffPassword;
    }

    public String getAirportNo() {
        return airportNo;
    }

    public void setAirportNo(String airportNo) {
        this.airportNo = airportNo;
    }
}
