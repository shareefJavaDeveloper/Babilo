package com.screens.babilo.controller;

import com.screens.babilo.dataentity.Theater;
import com.screens.babilo.dataentity.Ticket;
import com.screens.babilo.serviceImpl.StoredProcedureCustomRepositoryImpl;
import com.screens.babilo.serviceImpl.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketServiceImpl ticketService;

    @Autowired
    private StoredProcedureCustomRepositoryImpl storedProcedureCustomRepository;

    @PostMapping("/ticketBooking")
    public ResponseEntity<HttpStatus> theaterRegistration(@RequestBody Ticket ticket) throws SQLException {
        ticketService.addTicket(ticket);
        storedProcedureCustomRepository.executeStoredProcedure("SP_PAYMENT");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
