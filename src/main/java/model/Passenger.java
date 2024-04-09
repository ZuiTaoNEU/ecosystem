package model;

public class Passenger {

    // The primary key
    private String passengerEmail; // Also be used as login username

    // The foreign key
    private String currFlightCode; // Current flight

    // The passenger's information
    private String passengerName;
    private String passengerPassword;
    private Integer passengerLuggageNo;

    public Passenger(String passengerEmail, String currFlightCode, String passengerName, String passengerPassword, Integer passengerLuggageNo) {
        this.passengerEmail = passengerEmail;
        this.currFlightCode = currFlightCode;
        this.passengerName = passengerName;
        this.passengerPassword = passengerPassword;
        this.passengerLuggageNo = passengerLuggageNo;
    }

    public String getPassengerEmail() {
        return passengerEmail;
    }

    public void setPassengerEmail(String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }

    public String getCurrFlightCode() {
        return currFlightCode;
    }

    public void setCurrFlightCode(String currFlightCode) {
        this.currFlightCode = currFlightCode;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerPassword() {
        return passengerPassword;
    }

    public void setPassengerPassword(String passengerPassword) {
        this.passengerPassword = passengerPassword;
    }

    public Integer getPassengerLuggageNo() {
        return passengerLuggageNo;
    }

    public void setPassengerLuggageNo(Integer passengerLuggageNo) {
        this.passengerLuggageNo = passengerLuggageNo;
    }
}
