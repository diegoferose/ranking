package com.ranking.ranking.infraestructura;

import com.ranking.ranking.aplicacion.service.ServicioMarcadorAplicacion;
import com.ranking.ranking.dominio.modelo.dto.MarcadorDto;
import com.ranking.ranking.infraestructura.dto.RegistrarPuntoDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("marcador")
public class MarcadorPartidoControlador {
    private final ServicioMarcadorAplicacion servicioMarcadorAplicacion;

    public MarcadorPartidoControlador(ServicioMarcadorAplicacion servicioMarcadorAplicacion) {
        this.servicioMarcadorAplicacion = servicioMarcadorAplicacion;
    }

    @PostMapping
    public MarcadorDto registrarPunto(@RequestBody RegistrarPuntoDto registrarPuntoDto){
        return servicioMarcadorAplicacion.ejecutar(registrarPuntoDto);
    }
}
