package com.example.secondscreen;

public class model_pd {

    int imagePD;
    String cityCountryPD;
    String numbhotelsPD;

    public int getImagePD() {
        return imagePD;
    }

    public void setImagePD(int imagePD) {
        this.imagePD = imagePD;
    }

    public String getCityCountryPD() {
        return cityCountryPD;
    }

    public void setCityCountryPD(String cityCountryPD) {
        this.cityCountryPD = cityCountryPD;
    }

    public String getNumbHotels() {
        return numbhotelsPD;
    }

    public void setNumbHotels(String numbHotels) {
        this.numbhotelsPD = numbHotels;
    }

    public model_pd(int imagePD, String cityCountryPD, String numbHotels) {
        this.imagePD = imagePD;
        this.cityCountryPD = cityCountryPD;
        this.numbhotelsPD = numbHotels;
    }


}
