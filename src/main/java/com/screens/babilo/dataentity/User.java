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
@Table(name = "User_Registration")
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;
    @Id
    private Integer userId;
    private String password;
    private String name;
    private String emailId;
    private String phoneNumber;
}
