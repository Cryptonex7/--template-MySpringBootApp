package com.example.mySpringBoot.controllers;

import com.example.mySpringBoot.models.tables.MyEntity;
import com.example.mySpringBoot.services.MySpringBootService;
import com.example.mySpringBoot.models.pojos.MyEntityRequestPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("/api")
public class MySpringBootController {

    @Autowired
    MySpringBootService mySpringbootService;

    @GetMapping("/getEntities")
    public ResponseEntity<List<MyEntity>> getAllEntities() {
        return ResponseEntity.ok().body(mySpringbootService.getAllEntities());
    }

    @GetMapping("/getNames")
    public ResponseEntity<List<String>> getAllNames() {
        return ResponseEntity.ok().body(mySpringbootService.getAllNames());
    }

    @PostMapping("/add")
    public ResponseEntity<MyEntity> addEntity(
            @RequestBody MyEntityRequestPayload myEntityRequestPayload
    ) {
        return ResponseEntity.ok().body(
            mySpringbootService.addEntity(myEntityRequestPayload)
        );
    }
}
