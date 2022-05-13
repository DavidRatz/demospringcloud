package be.technifutur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class FilmApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(FilmApp.class, args);
    }
}
