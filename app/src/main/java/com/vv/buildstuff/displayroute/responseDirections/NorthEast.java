package com.vv.buildstuff.displayroute.responseDirections;

/**
 * Created by vvennava on 10/4/14.
 */
public class NorthEast {
    private double lat;
    private double lng;

    public NorthEast() {
    }

    public NorthEast(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "northeast[" +
                "lat=" + lat +
                ", lng=" + lng +
                ']';
    }
}
