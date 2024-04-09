package model;

public class Airplane {

    // The primary key
    private String airplaneCode; // The airplane's code. For example: CA982

    // The foreign key
    private String airlineCode; // The airline which the airplane belongs
    private String currFlightCode; // The flight which the airplane is flying

    // The airplane's information
    private Integer maxPassengerCapacity;
    private Integer maxLuggageNo;

    public Airplane(String airplaneCode, String airlineCode, String currFlightCode, Integer maxPassengerCapacity, Integer maxLuggageNo) {
        this.airplaneCode = airplaneCode;
        this.airlineCode = airlineCode;
        this.currFlightCode = currFlightCode;
        this.maxPassengerCapacity = maxPassengerCapacity;
        this.maxLuggageNo = maxLuggageNo;
    }

    public String getAirplaneCode() {
        return airplaneCode;
    }

    public void setAirplaneCode(String airplaneCode) {
        this.airplaneCode = airplaneCode;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getCurrFlightCode() {
        return currFlightCode;
    }

    public void setCurrFlightCode(String currFlightCode) {
        this.currFlightCode = currFlightCode;
    }

    public Integer getMaxPassengerCapacity() {
        return maxPassengerCapacity;
    }

    public void setMaxPassengerCapacity(Integer maxPassengerCapacity) {
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    public Integer getMaxLuggageNo() {
        return maxLuggageNo;
    }

    public void setMaxLuggageNo(Integer maxLuggageNo) {
        this.maxLuggageNo = maxLuggageNo;
    }
}
