package com.example.abndp5bynooralmashhadani;

public class Place {
    private int placeImageResourceID;
    private String placeName;
    private String placeLocation;
    private String placeInfo;

    public Place(int placeImageResourceId, String placeName, String placeLocation, String placeInfo) {
        this.placeImageResourceID = placeImageResourceId;
        this.placeName = placeName;
        this.placeLocation = placeLocation;
        this.placeInfo = placeInfo;
    }

    public int getPlaceImageResourceID() {
        return placeImageResourceID;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceLocation() {
        return placeLocation;
    }

    public String getPlaceInfo() {
        return placeInfo;
    }
}