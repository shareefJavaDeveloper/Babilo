package com.screens.babilo.dataentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MovieBooking implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;
    @Id
    private Integer movieBookingId;
    private Integer movieId;
    private Integer seatNumber;
    private Integer ticketNumber;
    private Date date;
}
