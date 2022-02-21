package com.ranking.ranking.infraestructura.adaptador.entidad;

import javax.persistence.*;

@Entity
@Table(name = "partido")
public class PartidoEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    @Column(name = "estado")
    private String estado;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_jugador_uno", referencedColumnName = "id")
    private JugadorEntity jugadorUno;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_jugador_dos", referencedColumnName = "id")
    private JugadorEntity jugadorDos;
}
