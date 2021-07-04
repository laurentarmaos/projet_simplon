package fr.formation.chefdoeuvre.domain.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import fr.formation.chefdoeuvre.validation.UniqueRoomName;

@UniqueRoomName
public class RoomCreate {

    private String roomName;

    @NotNull
    private Long roomNb;

    @NotNull
    private Long roomSize;

    @NotNull
    private Long roomFloor;

    @NotBlank
    private String hotelName;

    @NotBlank
    private String categoryName;

    public RoomCreate() {

    }

    public String getRoomName() {
	return roomName;
    }

    public void setRoomName(String roomName) {
	this.roomName = roomName;
    }

    public Long getRoomNb() {
	return roomNb;
    }

    public void setRoomNb(Long roomNb) {
	this.roomNb = roomNb;
    }

    public Long getRoomSize() {
	return roomSize;
    }

    public void setRoomSize(Long roomSize) {
	this.roomSize = roomSize;
    }

    public Long getRoomFloor() {
	return roomFloor;
    }

    public void setRoomFloor(Long roomFloor) {
	this.roomFloor = roomFloor;
    }

    public String getHotelName() {
	return hotelName;
    }

    public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
    }

    public String getCategoryName() {
	return categoryName;
    }

    public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
    }

}
