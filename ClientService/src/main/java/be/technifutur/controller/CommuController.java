package be.technifutur.controller;

import java.net.URI;
import java.util.List;
import java.util.Random;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/commu")
public class CommuController {
    private final RestTemplate template;
    private final DiscoveryClient discoveryClient;

    public CommuController(RestTemplate template, DiscoveryClient discoveryClient) {
        this.template = template;
        this.discoveryClient = discoveryClient;
    }

    @GetMapping
    public String startCommu(){
        List<ServiceInstance> instances = discoveryClient.getInstances("film-service");
        URI uri = instances
            .get(new Random().nextInt(instances.size()))
            .getUri()
            .resolve("/commu");
        String responseBody = template.getForObject(uri, String.class);

        return "passé par client : " + responseBody;
    }
    
}
