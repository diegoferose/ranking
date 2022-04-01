package com.ranking.ranking.dominio.puerto.marcador;

import com.ranking.ranking.dominio.modelo.marcador.RegistroMarcadorPartido;
import com.ranking.ranking.dominio.modelo.dto.MarcadorDto;

public interface RegistroMarcadorRepositorio {
    MarcadorDto crear(RegistroMarcadorPartido registroMarcadorPartido);
}
