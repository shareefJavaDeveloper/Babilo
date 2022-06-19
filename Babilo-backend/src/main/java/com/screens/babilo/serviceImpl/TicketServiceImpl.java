package com.screens.babilo.serviceImpl;

import com.screens.babilo.dao.TicketDao;
import com.screens.babilo.dataentity.Ticket;
import com.screens.babilo.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketDao ticketDao;

    @Override
    public void addTicket(Ticket ticket) {
        ticketDao.saveAndFlush(ticket);
    }
}
