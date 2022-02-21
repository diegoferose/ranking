package com.ranking.ranking.infraestructura.adaptador.entidad;

import javax.persistence.*;

@Entity
@Table(name = "jugador")
public class JugadorEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;
}
