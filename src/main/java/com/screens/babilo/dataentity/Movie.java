package com.screens.babilo.dataentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Movie_Registration")
public class Movie implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;

    @Id
    private Integer movieId;
    private String movieName;
    private String movieDirector;
    private Integer movieRating;
    private BigDecimal moviePrice;
}
