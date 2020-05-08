package com.masivian.ruleta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Ruleta {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private Estado estado;

    protected Ruleta(){}

    public Ruleta(Estado estado) {
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ruleta{" +
                "id=" + id +
                ", estado=" + estado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ruleta ruleta = (Ruleta) o;
        return id.equals(ruleta.id) &&
                estado == ruleta.estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, estado);
    }

}
