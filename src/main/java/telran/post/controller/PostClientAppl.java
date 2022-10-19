package telran.post.controller;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class PostClientAppl {

    public static void main(String[] args) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        RequestEntity<String> request = new RequestEntity<>(HttpMethod.GET,new URI("https://jsonplaceholder.typicode.com/posts/8"));
        ResponseEntity<String>  response =  restTemplate.exchange(request, String.class );

        System.out.println(response.getStatusCodeValue());
        System.out.println(response.getBody());
        System.out.println(response.getHeaders());
    }
}
