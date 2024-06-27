package org.example.dtos;

import lombok.Data;

@Data
public class SeatAvailiabityDTO {
    private SeatDTO seat;
    private ShowDTO show;
    private boolean isBooked;

}
