package com.example.projekt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KlausurController {

    @GetMapping("/")
    public List<KlausurEntry> index() {
        KlausurEntry prog2 = new KlausurEntry("Prog2");
        prog2.setThemen("Vererbung, Interfaces, Collections");

        KlausurEntry datenbanksysteme = new KlausurEntry("Datenbanksysteme");
        datenbanksysteme.setThemen("SQL, relationelle Datenmodelle, ERM");

        return List.of(prog2, datenbanksysteme);
    }
}