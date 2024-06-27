package org.example.dtos;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ShowDTO {
    private String id;
    private ScreenDTO screenDTO;
    private MovieDTO movie;
    private LocalDateTime showTime;
}
