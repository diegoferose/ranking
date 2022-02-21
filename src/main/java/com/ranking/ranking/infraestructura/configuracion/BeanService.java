package com.ranking.ranking.infraestructura.configuracion;

import com.ranking.ranking.aplicacion.mapper.MarcadorPartidoMapper;
import com.ranking.ranking.aplicacion.service.ServicioMarcadorAplicacion;
import com.ranking.ranking.dominio.puerto.RegistroMarcadorRepositorio;
import com.ranking.ranking.dominio.servicio.ServicioMarcadorDominio;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class BeanService {
    @Bean
    public ServicioMarcadorDominio servicioMarcadorDominio(RegistroMarcadorRepositorio registroMarcadorRepositorio){
        return new ServicioMarcadorDominio(registroMarcadorRepositorio);
    }
    @Bean
    public  ServicioMarcadorAplicacion servicioMarcadorAplicacion(
            MarcadorPartidoMapper marcadorPartidoMapper, ServicioMarcadorDominio servicioMarcadorDominio
    ){
        return new ServicioMarcadorAplicacion(marcadorPartidoMapper,servicioMarcadorDominio);
    }
}
