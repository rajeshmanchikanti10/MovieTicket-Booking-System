package org.example.dtos;

import lombok.Data;
import org.example.enums.SeatType;
@Data
public class SeatDTO {
    private String id; //row_col
    private int row,column;
    private SeatType seatType;
    private boolean isBooked;
}
