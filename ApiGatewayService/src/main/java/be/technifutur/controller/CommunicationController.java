package be.technifutur.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CommunicationController {
    private final RestTemplate template;

    public CommunicationController(RestTemplate template) {
        this.template = template;
    }

    @GetMapping("/film")
    public String getFilm(){
        return template.getForObject("http://film-service/commu", String.class);
    }

    @GetMapping("/client")
    public String getClient(){
        return template.getForObject("http://client-service/commu", String.class);
    }
}
