package com.ranking.ranking.infraestructura.adaptador.entidad;

import javax.persistence.*;

@Entity
@Table(name = "game")
public class GameEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    @Column(name = "puntos_jugador_uno")
    private int puntosJugadorUno;

    @Column(name = "puntos_jugador_2")
    private int puntosJugadorDos;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_set", referencedColumnName = "id")
    private SetEntity idSet;

    public GameEntity(int puntosJugadorUno, int puntosJugadorDos, SetEntity idSet) {
        this.puntosJugadorUno = puntosJugadorUno;
        this.puntosJugadorDos = puntosJugadorDos;
        this.idSet = idSet;
    }
}
