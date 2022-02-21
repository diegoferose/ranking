package com.ranking.ranking.dominio.modelo;

public class RegistroMarcadorPartido {
    private int idPartido;
    private int idSet;
    private int idGame;
    private int idJugador;
    private int puntosJugadorUno;
    private int puntosJugadorDos;

    public RegistroMarcadorPartido(int idPartido, int idSet, int idGame, int idJugador) {
        this.idPartido = idPartido;
        this.idSet = idSet;
        this.idGame = idGame;
        this.idJugador = idJugador;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public int getIdSet() {
        return idSet;
    }

    public void setIdSet(int idSet) {
        this.idSet = idSet;
    }

    public int getIdGame() {
        return idGame;
    }

    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getPuntosJugadorUno() {
        return puntosJugadorUno;
    }

    public void setPuntosJugadorUno(int puntosJugadorUno) {
        this.puntosJugadorUno = puntosJugadorUno;
    }

    public int getPuntosJugadorDos() {
        return puntosJugadorDos;
    }

    public void setPuntosJugadorDos(int puntosJugadorDos) {
        this.puntosJugadorDos = puntosJugadorDos;
    }
}
