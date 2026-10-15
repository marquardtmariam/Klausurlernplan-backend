package com.example.projekt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KlausurController {

    @GetMapping("Klausur und Themen")
    public List<KlausurEntry> index() {
        return List.of(new KlausurEntry("Prog2"), new KlausurEntry("Frameworks"));

    }
}