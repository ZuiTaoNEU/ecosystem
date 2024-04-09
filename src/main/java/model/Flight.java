package model;

import java.util.Date;

public class Flight {

    // The primary key
    private String flightCode; // For example: CA1292

    // The foreign key
    private Integer routeCode; // The route of the flight
    private String airplaneCode; // The airplane for the flight

    // The flight's information
    private Date flightDepartureTime;
    private Date flightArrivalTime;
    private Double flightPrice;
    private Integer passengerNo; // The passenger's number in this flight
    private String takeoffGate;
    private String landingGate;
    private String baggageCarrousel;

    public Flight(String flightCode, Integer routeCode, String airplaneCode, Date flightArrivalTime,
                  Date flightDepartureTime, Double flightPrice, Integer passengerNo, String takeoffGate,
                  String landingGate, String baggageCarrousel) {
        this.flightCode = flightCode;
        this.routeCode = routeCode;
        this.airplaneCode = airplaneCode;
        this.flightArrivalTime = flightArrivalTime;
        this.flightDepartureTime = flightDepartureTime;
        this.flightPrice = flightPrice;
        this.passengerNo = passengerNo;
        this.takeoffGate = takeoffGate;
        this.landingGate = landingGate;
        this.baggageCarrousel = baggageCarrousel;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public Integer getRouteCode() {
        return routeCode;
    }

    public Date getFlightDepartureTime() {
        return flightDepartureTime;
    }

    public void setFlightDepartureTime(Date flightDepartureTime) {
        this.flightDepartureTime = flightDepartureTime;
    }

    public Date getFlightArrivalTime() {
        return flightArrivalTime;
    }

    public void setFlightArrivalTime(Date flightArrivalTime) {
        this.flightArrivalTime = flightArrivalTime;
    }

    public void setRouteCode(Integer routeCode) {
        this.routeCode = routeCode;
    }

    public String getAirplaneCode() {
        return airplaneCode;
    }

    public void setAirplaneCode(String airplaneCode) {
        this.airplaneCode = airplaneCode;
    }

    public Integer getPassengerNo() {
        return passengerNo;
    }

    public void setPassengerNo(Integer passengerNo) {
        this.passengerNo = passengerNo;
    }

    public Double getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(Double flightPrice) {
        this.flightPrice = flightPrice;
    }

    public String getTakeoffGate() {
        return takeoffGate;
    }

    public void setTakeoffGate(String takeoffGate) {
        this.takeoffGate = takeoffGate;
    }

    public String getLandingGate() {
        return landingGate;
    }

    public void setLandingGate(String landingGate) {
        this.landingGate = landingGate;
    }

    public String getBaggageCarrousel() {
        return baggageCarrousel;
    }

    public void setBaggageCarrousel(String baggageCarrousel) {
        this.baggageCarrousel = baggageCarrousel;
    }

}
