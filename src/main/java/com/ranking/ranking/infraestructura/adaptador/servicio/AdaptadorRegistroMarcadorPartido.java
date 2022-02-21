package com.ranking.ranking.infraestructura.adaptador.servicio;

import com.ranking.ranking.dominio.modelo.RegistroMarcadorPartido;
import com.ranking.ranking.dominio.modelo.dto.MarcadorDto;
import com.ranking.ranking.dominio.puerto.RegistroMarcadorRepositorio;
import org.springframework.stereotype.Repository;

@Repository
public class AdaptadorRegistroMarcadorPartido implements RegistroMarcadorRepositorio {
    @Override
    public MarcadorDto crear(RegistroMarcadorPartido registroMarcadorPartido) {
        return null;
    }
}
