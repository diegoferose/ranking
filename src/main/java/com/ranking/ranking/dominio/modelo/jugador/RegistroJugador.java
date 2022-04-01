package com.ranking.ranking.dominio.modelo.jugador;

import javax.persistence.Column;

public class RegistroJugador {
    private int id;
    private String nombre;

    public RegistroJugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
