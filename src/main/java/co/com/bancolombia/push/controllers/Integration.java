package co.com.bancolombia.push.controllers;

import co.com.bancolombia.push.dto.Request;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin("*")
public class Integration {

    @PostMapping("/rest/add/postPush")
    public ResponseEntity postPush(@RequestBody Request request){
        if(request!= null){
            request.setReceived(true);
            return ResponseEntity.status(200).body(request);
        }
        return ResponseEntity.status(500).body(null);
    }
}
