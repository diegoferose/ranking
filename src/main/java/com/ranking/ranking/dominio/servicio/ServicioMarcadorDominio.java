package com.ranking.ranking.dominio.servicio;

import com.ranking.ranking.dominio.modelo.jugador.RegistroJugador;
import com.ranking.ranking.dominio.modelo.marcador.RegistroMarcadorPartido;
import com.ranking.ranking.dominio.modelo.dto.MarcadorDto;
import com.ranking.ranking.dominio.puerto.jugador.JugadorRepositorio;
import com.ranking.ranking.dominio.puerto.marcador.RegistroMarcadorRepositorio;

public class ServicioMarcadorDominio {
    RegistroMarcadorRepositorio registroMarcadorRepositorio;
    JugadorRepositorio jugadorRepositorio;

    public ServicioMarcadorDominio(RegistroMarcadorRepositorio registroMarcadorRepositorio, JugadorRepositorio jugadorRepositorio) {
        this.registroMarcadorRepositorio = registroMarcadorRepositorio;
        this.jugadorRepositorio = jugadorRepositorio;
    }

    public MarcadorDto ejecutar(RegistroMarcadorPartido registroMarcadorPartido){
        generarDatosDePrueba();
        return new MarcadorDto(1,2,
                "Diego","axxa",
                "40","15");
    }

    private void generarDatosDePrueba(){
        jugadorRepositorio.crear(
                new RegistroJugador(
                        1,"Diego"
                )
        );
        jugadorRepositorio.crear(
                new RegistroJugador(
                        2,"Luis"
                )
        );
    }

}
