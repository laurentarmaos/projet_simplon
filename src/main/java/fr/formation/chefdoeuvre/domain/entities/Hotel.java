package fr.formation.chefdoeuvre.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hotels")
public class Hotel extends AbstractEntity {

    @Column(name = "hotel_name", nullable = false)
    private String hotelName;

    @Column(name = "hotel_street_nb", nullable = false)
    private long hotelStreetNb;

    @Column(name = "hotel_street", nullable = false)
    private String hotelStreet;

    @Column(name = "hotel_zip_code", nullable = false)
    private long hotelZipCode;

    @Column(name = "hotel_city", nullable = false)
    private String hotelCity;

    @Column(name = "hotel_country", nullable = false)
    private String hotelCountry;

    @Column(name = "hotel_capacity", nullable = false)
    private long hotelCapacity;

    public Hotel() {

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
	return "Hotel [hotelName=" + hotelName + ", hotelStreetNb=" + hotelStreetNb + ", hotelStreet=" + hotelStreet
		+ ", hotelZipCode=" + hotelZipCode + ", hotelCity=" + hotelCity + ", hotelCountry=" + hotelCountry
		+ ", hotelCapacity=" + hotelCapacity + "]";
    }

}
