package fr.formation.chefdoeuvre.domain.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class HotelCreate {

    @NotBlank
    private String hotelName;

    @NotNull
    private long hotelStreetNb;

    @NotBlank
    private String hotelStreet;

    @NotNull
    private long hotelZipCode;

    @NotBlank
    private String hotelCity;

    @NotBlank
    private String hotelCountry;

    @NotNull
    private long hotelCapacity;

    public HotelCreate() {

    }

    public String getHotelName() {
	return hotelName;
    }

    public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
    }

    public long getHotelStreetNb() {
	return hotelStreetNb;
    }

    public void setHotelStreetNb(long hotelStreetNb) {
	this.hotelStreetNb = hotelStreetNb;
    }

    public String getHotelStreet() {
	return hotelStreet;
    }

    public void setHotelStreet(String hotelStreet) {
	this.hotelStreet = hotelStreet;
    }

    public long getHotelZipCode() {
	return hotelZipCode;
    }

    public void setHotelZipCode(long hotelZipCode) {
	this.hotelZipCode = hotelZipCode;
    }

    public String getHotelCity() {
	return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
	this.hotelCity = hotelCity;
    }

    public String getHotelCountry() {
	return hotelCountry;
    }

    public void setHotelCountry(String hotelCountry) {
	this.hotelCountry = hotelCountry;
    }

    public long getHotelCapacity() {
	return hotelCapacity;
    }

    public void setHotelCapacity(long hotelCapacity) {
	this.hotelCapacity = hotelCapacity;
    }

    @Override
    public String toString() {
	return "HotelCreate [hotelName=" + hotelName + ", hotelStreetNb=" + hotelStreetNb + ", hotelStreet="
		+ hotelStreet + ", hotelZipCode=" + hotelZipCode + ", hotelCity=" + hotelCity + ", hotelCountry="
		+ hotelCountry + ", hotelCapacity=" + hotelCapacity + "]";
    }

}
