package pl.maciej.hotelsapplication.remote.rest.dto.request;

import java.util.List;

public class AddReservationDto {
    private List<RoomsReservationDto> rooms;
    private PersonReservationDto person;

    public AddReservationDto() {
    }

    public AddReservationDto(List<RoomsReservationDto> hotels, PersonReservationDto person) {
        this.rooms = hotels;
        this.person = person;
    }

    public List<RoomsReservationDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomsReservationDto> rooms) {
        this.rooms = rooms;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }
}
