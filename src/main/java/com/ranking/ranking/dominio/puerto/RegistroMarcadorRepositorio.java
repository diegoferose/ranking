package com.ranking.ranking.dominio.puerto;

import com.ranking.ranking.dominio.modelo.RegistroMarcadorPartido;
import com.ranking.ranking.dominio.modelo.dto.MarcadorDto;

public interface RegistroMarcadorRepositorio {
    MarcadorDto crear(RegistroMarcadorPartido registroMarcadorPartido);
}
