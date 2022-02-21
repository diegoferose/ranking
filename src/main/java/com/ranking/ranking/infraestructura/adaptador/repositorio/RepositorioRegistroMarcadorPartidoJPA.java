package com.ranking.ranking.infraestructura.adaptador.repositorio;

import com.ranking.ranking.infraestructura.adaptador.entidad.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioRegistroMarcadorPartidoJPA extends JpaRepository<GameEntity,Integer> {
}
