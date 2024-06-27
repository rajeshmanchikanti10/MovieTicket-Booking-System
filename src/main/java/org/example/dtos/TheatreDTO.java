package org.example.dtos;

import lombok.Data;

import java.util.List;

@Data
public class TheatreDTO {
    private String theatreId;
    private String location;
    private List<ScreenDTO> screens;
}
