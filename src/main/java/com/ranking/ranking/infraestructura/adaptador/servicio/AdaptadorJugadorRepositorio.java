package com.ranking.ranking.infraestructura.adaptador.servicio;

import com.ranking.ranking.dominio.modelo.jugador.RegistroJugador;
import com.ranking.ranking.dominio.puerto.jugador.JugadorRepositorio;
import com.ranking.ranking.infraestructura.adaptador.mapper.MapperRegistroJugador;
import com.ranking.ranking.infraestructura.adaptador.repositorio.RepositorioJugadorJPA;
import org.springframework.stereotype.Repository;

@Repository
public class AdaptadorJugadorRepositorio implements JugadorRepositorio {
    RepositorioJugadorJPA repositorioJugadorJPA;
    MapperRegistroJugador mapperRegistroJugador;

    public AdaptadorJugadorRepositorio(RepositorioJugadorJPA repositorioJugadorJPA, MapperRegistroJugador mapperRegistroJugador) {
        this.repositorioJugadorJPA = repositorioJugadorJPA;
        this.mapperRegistroJugador = mapperRegistroJugador;
    }

    @Override
    public void crear(RegistroJugador registroJugador) {
        repositorioJugadorJPA.save(
                mapperRegistroJugador.convetirDominioAEntity(registroJugador)
        );
    }
}
