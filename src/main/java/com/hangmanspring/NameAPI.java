package com.hangmanspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/names")
@CrossOrigin("http://localhost:3000/")
public class NameAPI {

    @Autowired
    NamesService namesService;

    @PostMapping
    public ResponseEntity<String> addName(@RequestBody Names name) {
        try {
            namesService.addNames(name);
            return ResponseEntity.ok("Added Name: " + name.getName());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(e.getMessage());
        }

    }

    @GetMapping
    public List<Names> getNames() {
        return namesService.getNames();
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCol(@RequestBody String question , @PathVariable int id) {
         try {
             namesService.putMethod(question,id);
             return ResponseEntity.status(HttpStatus.CREATED).body("Successfully");
         }catch (Exception e) {
             return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(e.getMessage());
         }
    }

}
