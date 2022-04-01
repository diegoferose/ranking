package com.ranking.ranking.infraestructura.adaptador.mapper;

import com.ranking.ranking.dominio.modelo.jugador.RegistroJugador;
import com.ranking.ranking.infraestructura.adaptador.entidad.JugadorEntity;
import org.springframework.stereotype.Component;

@Component
public class MapperRegistroJugador {
    public JugadorEntity convetirDominioAEntity(RegistroJugador registroJugador){
        return new JugadorEntity(
                registroJugador.getId(),
                registroJugador.getNombre()
        );
    }
}
