package be.ehb.ngoapp.controller;

import be.ehb.ngoapp.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EventController {

    @Autowired
    private EventRepository eventRepository;

}