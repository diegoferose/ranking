package com.ranking.ranking.aplicacion.service;

import com.ranking.ranking.aplicacion.mapper.MarcadorPartidoMapper;
import com.ranking.ranking.dominio.modelo.dto.MarcadorDto;
import com.ranking.ranking.dominio.servicio.ServicioMarcadorDominio;
import com.ranking.ranking.infraestructura.dto.RegistrarPuntoDto;

public class ServicioMarcadorAplicacion {
    MarcadorPartidoMapper marcadorPartidoMapper;
    ServicioMarcadorDominio servicioMarcadorDominio;

    public ServicioMarcadorAplicacion(MarcadorPartidoMapper marcadorPartidoMapper, ServicioMarcadorDominio servicioMarcadorDominio) {
        this.marcadorPartidoMapper = marcadorPartidoMapper;
        this.servicioMarcadorDominio = servicioMarcadorDominio;
    }

    public MarcadorDto ejecutar(RegistrarPuntoDto registrarPuntoDto) {
        return servicioMarcadorDominio.ejecutar(
                marcadorPartidoMapper.registroPuntoDtoARegistroMarcadorPartido(
                        registrarPuntoDto
                )
        );
    }
}
