package pl.maciej.hotelsapplication.remote.rest.dto.response;

import pl.maciej.hotelsapplication.domain.model.ReservationStatusType;
import pl.maciej.hotelsapplication.remote.rest.dto.request.RoomsReservationDto;
import pl.maciej.hotelsapplication.remote.rest.dto.request.PersonReservationDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationStatusType status;
    private PersonReservationDto person;
    private List<RoomsReservationDto> hotels;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, ReservationStatusType status, PersonReservationDto person) {
        this.id = id;
        this.status = status;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }
}
