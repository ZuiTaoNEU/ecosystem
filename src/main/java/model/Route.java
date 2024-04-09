package model;

public class Route {

    // The primary key
    private Integer routeCode;

    // The foreign key
    private String airlineCode; // The airline which run the route
    private String departureAirport; // The departure
    private String arrivalAirport; // The arrival

    public Route(Integer routeCode, String airlineCode, String departureAirport, String arrivalAirport) {
        this.routeCode = routeCode;
        this.airlineCode = airlineCode;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Integer getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(Integer routeCode) {
        this.routeCode = routeCode;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }
}
