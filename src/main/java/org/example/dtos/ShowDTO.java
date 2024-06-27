package org.example.dtos;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ShowDTO {
    private String id;
    private TheatreDTO theatre;
    private MovieDTO movie;
    private LocalDateTime showTime;
    private List<SeatDTO> seats;
}
