package org.example.dtos;

import lombok.Data;

import java.util.List;
@Data
public class ScreenDTO {
    private String screenId;
    private TheatreDTO theatreDTO;
    private List<SeatDTO> seats;
    private List<ShowDTO> shows;
}
