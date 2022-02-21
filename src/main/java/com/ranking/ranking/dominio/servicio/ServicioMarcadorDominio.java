package com.ranking.ranking.dominio.servicio;

import com.ranking.ranking.dominio.modelo.RegistroMarcadorPartido;
import com.ranking.ranking.dominio.modelo.dto.MarcadorDto;
import com.ranking.ranking.dominio.puerto.RegistroMarcadorRepositorio;

public class ServicioMarcadorDominio {
    RegistroMarcadorRepositorio registroMarcadorRepositorio;

    public ServicioMarcadorDominio(RegistroMarcadorRepositorio registroMarcadorRepositorio) {
        this.registroMarcadorRepositorio = registroMarcadorRepositorio;
    }

    public MarcadorDto ejecutar(RegistroMarcadorPartido registroMarcadorPartido){
        return new MarcadorDto(1,2,
                "Diego","axxa",
                "40","15");
    }
}
