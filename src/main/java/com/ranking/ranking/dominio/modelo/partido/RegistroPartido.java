package com.ranking.ranking.dominio.modelo.partido;

import com.ranking.ranking.dominio.modelo.jugador.RegistroJugador;
import com.ranking.ranking.infraestructura.adaptador.entidad.JugadorEntity;

import javax.persistence.*;

public class RegistroPartido {
    private int id;
    private String estado;
    private RegistroJugador jugadorUno;
    private RegistroJugador jugadorDos;
}
