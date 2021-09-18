package com.example.secondscreen;

public class model_rs {

    int imageRS;

    public int getImageRS() {
        return imageRS;
    }

    public void setImageRS(int imageRS) {
        this.imageRS = imageRS;
    }

    public String getCityCountryRS() {
        return cityCountryRS;
    }

    public void setCityCountryRS(String cityCountryRS) {
        this.cityCountryRS = cityCountryRS;
    }

    public String getNumbhotelsRS() {
        return numbhotelsRS;
    }

    public void setNumbhotelsRS(String numbhotelsRS) {
        this.numbhotelsRS = numbhotelsRS;
    }

    String cityCountryRS;
    String numbhotelsRS;

    public model_rs(int imageRS, String cityCountryRS, String numbhotelsRS) {
        this.imageRS = imageRS;
        this.cityCountryRS = cityCountryRS;
        this.numbhotelsRS = numbhotelsRS;
    }

}
