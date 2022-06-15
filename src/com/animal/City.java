package com.animal;

public class City implements Comparable<City>{
    private int Code;
    private String name;
    private String streets;
    private String parks;

    public City(int code, String name, String streets, String parks) {
        Code = code;
        this.name = name;
        this.streets = streets;
        this.parks = parks;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreets() {
        return streets;
    }

    public void setStreets(String streets) {
        this.streets = streets;
    }

    public String getParks() {
        return parks;
    }

    public void setParks(String parks) {
        this.parks = parks;
    }

    @Override
    public String toString() {
        return "City{" +
                "Code=" + Code +
                ", name='" + name + '\'' +
                ", streets='" + streets + '\'' +
                ", parks='" + parks + '\'' +
                '}';
    }

    @Override
    public int compareTo(City o) {
        if (this.Code==o.Code) {
            return 0;
        }else if (this.Code>o.Code){
         return -1;
        }else
            return 1;
    }
}
