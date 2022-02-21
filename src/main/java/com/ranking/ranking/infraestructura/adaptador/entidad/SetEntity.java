package com.ranking.ranking.infraestructura.adaptador.entidad;

import javax.persistence.*;

@Entity
@Table(name = "set")
public class SetEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    @Column(name = "numero_de_set")
    private int numeroDeSet;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_partido", referencedColumnName = "id")
    private PartidoEntity partido;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroDeSet() {
        return numeroDeSet;
    }

    public void setNumeroDeSet(int numeroDeSet) {
        this.numeroDeSet = numeroDeSet;
    }

    public PartidoEntity getPartido() {
        return partido;
    }

    public void setPartido(PartidoEntity partido) {
        this.partido = partido;
    }
}
