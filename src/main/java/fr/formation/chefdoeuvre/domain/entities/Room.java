package fr.formation.chefdoeuvre.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room extends AbstractEntity {

    @Column(name = "room_name", nullable = false)
    private String roomName;

    @Column(name = "room_number", nullable = false)
    private Long roomNb;

    @Column(name = "room_size", nullable = false)
    private Long roomSize;

    @Column(name = "room_floor", nullable = false)
    private Long roomFloor;

    @ManyToOne
    @JoinColumn(name = "id_hotels", nullable = false)
    private Hotel hotelId;

    @ManyToOne
    @JoinColumn(name = "id_categories", nullable = false)
    private Category categoryId;

    public Room() {

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

    public Hotel getHotelId() {
	return hotelId;
    }

    public void setHotelId(Hotel hotelId) {
	this.hotelId = hotelId;
    }

    public Category getCategoryId() {
	return categoryId;
    }

    public void setCategoryId(Category categoryId) {
	this.categoryId = categoryId;
    }

}
