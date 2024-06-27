package org.example.dtos;

import lombok.Data;
import org.example.enums.BookingStatus;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class BookingDTO {
    private String id;
    private UserDTO dto;
    private List<SeatDTO> seats;
    private ShowDTO showDTO;
    private BookingStatus bookingStatus;
    private LocalDateTime bookingTime;
}

// /booking/createBooking : Params(showId,seats,userId)
// /booking/bookingId
// /booking/cancel/{bookingId}