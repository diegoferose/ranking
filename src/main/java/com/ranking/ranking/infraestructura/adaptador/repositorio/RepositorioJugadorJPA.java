package com.ranking.ranking.infraestructura.adaptador.repositorio;

import com.ranking.ranking.infraestructura.adaptador.entidad.JugadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioJugadorJPA extends JpaRepository<JugadorEntity,Integer> {
}
