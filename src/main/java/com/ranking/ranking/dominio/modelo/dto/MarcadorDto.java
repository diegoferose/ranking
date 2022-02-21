package com.ranking.ranking.dominio.modelo.dto;

public class MarcadorDto {
    private int idPrimerJugador;
    private int idSegungundoJugador;
    private String nombrePrimerJugador;
    private String nombreSegundoJugador;
    private String marcadorPrimerJugador;
    private String marcadorSegundoJugador;

    public MarcadorDto(int idPrimerJugador, int idSegungundoJugador, String nombrePrimerJugador, String nombreSegundoJugador, String marcadorPrimerJugador, String marcadorSegundoJugador) {
        this.idPrimerJugador = idPrimerJugador;
        this.idSegungundoJugador = idSegungundoJugador;
        this.nombrePrimerJugador = nombrePrimerJugador;
        this.nombreSegundoJugador = nombreSegundoJugador;
        this.marcadorPrimerJugador = marcadorPrimerJugador;
        this.marcadorSegundoJugador = marcadorSegundoJugador;
    }

    public int getIdPrimerJugador() {
        return idPrimerJugador;
    }

    public void setIdPrimerJugador(int idPrimerJugador) {
        this.idPrimerJugador = idPrimerJugador;
    }

    public int getIdSegungundoJugador() {
        return idSegungundoJugador;
    }

    public void setIdSegungundoJugador(int idSegungundoJugador) {
        this.idSegungundoJugador = idSegungundoJugador;
    }

    public String getNombrePrimerJugador() {
        return nombrePrimerJugador;
    }

    public void setNombrePrimerJugador(String nombrePrimerJugador) {
        this.nombrePrimerJugador = nombrePrimerJugador;
    }

    public String getNombreSegundoJugador() {
        return nombreSegundoJugador;
    }

    public void setNombreSegundoJugador(String nombreSegundoJugador) {
        this.nombreSegundoJugador = nombreSegundoJugador;
    }

    public String getMarcadorPrimerJugador() {
        return marcadorPrimerJugador;
    }

    public void setMarcadorPrimerJugador(String marcadorPrimerJugador) {
        this.marcadorPrimerJugador = marcadorPrimerJugador;
    }

    public String getMarcadorSegundoJugador() {
        return marcadorSegundoJugador;
    }

    public void setMarcadorSegundoJugador(String marcadorSegundoJugador) {
        this.marcadorSegundoJugador = marcadorSegundoJugador;
    }
}
