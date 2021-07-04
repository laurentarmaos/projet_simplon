package fr.formation.chefdoeuvre.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;

import fr.formation.chefdoeuvre.validation.DateSupVerification;

@DateSupVerification
public class ReservationCreate {

    private String reservation;

    @Future
    private LocalDate dateStart;

    @Future
    private LocalDate dateEnd;

    @NotBlank
    private String clientLastName;

    @NotBlank
    private String clientFirstName;

    @NotBlank
    private String roomName;

    @NotBlank
    private String hotelName;

    public ReservationCreate() {

    }

    public String getReservation() {
	return reservation;
    }

    public void setReservation(String reservation) {
	this.reservation = reservation;
    }

    public LocalDate getDateStart() {
	return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
	this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
	return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
	this.dateEnd = dateEnd;
    }

    public String getClientLastName() {
	return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
	this.clientLastName = clientLastName;
    }

    public String getClientFirstName() {
	return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
	this.clientFirstName = clientFirstName;
    }

    public String getRoomName() {
	return roomName;
    }

    public void setRoomName(String roomName) {
	this.roomName = roomName;
    }

    public String getHotelName() {
	return hotelName;
    }

    public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
    }

    @Override
    public String toString() {
	return "ReservationCreate [reservation=" + reservation + ", dateStart=" + dateStart + ", dateEnd=" + dateEnd
		+ ", clientLastName=" + clientLastName + ", clientFirstName=" + clientFirstName + ", roomName="
		+ roomName + ", hotelName=" + hotelName + "]";
    }

}
