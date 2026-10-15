package com.example.projekt;

public class KlausurEntry {

    private String klausur;
    private String themen;
    private boolean done;


    public KlausurEntry(String klausur) {

        this.klausur = klausur;
    }

    public String getKlausur() {
        return klausur;
    }

    public void setKlausur(String klausur) {

        this.klausur = klausur;
    }

    public String getThemen() {

        return themen;
    }

    public void setThemen(String themen) {

        this.themen = themen;
    }

    public boolean isDone() {

        return done;
    }

    public void setDone(boolean done) {

        this.done = done;
    }


}
