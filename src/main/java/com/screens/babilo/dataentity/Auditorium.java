package com.screens.babilo.dataentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Auditorium_Registration")
public class Auditorium implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;
    @Id
    private Integer auditoriumId;
    private String auditoriumName;
    private String auditoriumLocation;
    private String movieId;
    private Integer seatAvailable;

}
