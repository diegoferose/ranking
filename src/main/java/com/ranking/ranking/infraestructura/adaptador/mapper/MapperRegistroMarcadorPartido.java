package com.ranking.ranking.infraestructura.adaptador.mapper;

import com.ranking.ranking.dominio.modelo.marcador.RegistroMarcadorPartido;
import com.ranking.ranking.infraestructura.adaptador.entidad.GameEntity;
import com.ranking.ranking.infraestructura.adaptador.entidad.SetEntity;
import org.springframework.stereotype.Component;

@Component
public class MapperRegistroMarcadorPartido {
    public GameEntity mapperDominioAEntidad(RegistroMarcadorPartido registroMarcadorPartido){
        SetEntity setEntity = new SetEntity();
        setEntity.setId(registroMarcadorPartido.getIdSet());
        return new GameEntity(
                registroMarcadorPartido.getPuntosJugadorUno(),
                registroMarcadorPartido.getPuntosJugadorDos(),
                setEntity
        );
    }
}
