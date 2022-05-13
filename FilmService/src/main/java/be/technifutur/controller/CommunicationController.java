package be.technifutur.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/commu")
public class CommunicationController {
    @GetMapping
    public String textCommu(){
        return "communication réussie";
    }
}
