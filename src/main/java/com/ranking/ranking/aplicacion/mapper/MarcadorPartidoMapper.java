package com.ranking.ranking.aplicacion.mapper;

import com.ranking.ranking.dominio.modelo.RegistroMarcadorPartido;
import com.ranking.ranking.infraestructura.dto.RegistrarPuntoDto;
import org.springframework.stereotype.Component;

@Component
public class MarcadorPartidoMapper {
    //patron factory
    public RegistroMarcadorPartido registroPuntoDtoARegistroMarcadorPartido(
            RegistrarPuntoDto registrarPuntoDto
    ){
        return new RegistroMarcadorPartido(
                registrarPuntoDto.getIdPartido(),
                registrarPuntoDto.getIdSet(),
                registrarPuntoDto.getIdGame(),
                registrarPuntoDto.getIdJugador()
        );
    }
}
