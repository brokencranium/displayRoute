package com.vv.buildstuff.displayroute.responseDirections;

/**
 * Created by vvennava on 10/4/14.
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(propOrder = {"regionId", "regionName", "countrySubdivisionName"})

public class Agencies {
    private String name;
    private String url;
    private String phone;

    public Agencies() {
    }

    public Agencies(String name, String url, String phone) {
        this.name = name;
        this.url = url;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Agencies [" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", phone='" + phone + '\'' +
                ']';
    }
}
