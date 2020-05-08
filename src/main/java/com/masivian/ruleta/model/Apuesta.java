package com.masivian.ruleta.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Apuesta {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Integer numero;

    @Column(nullable = false)
    private Color color;

    @Column(nullable = false)
    private BigDecimal dinero;

    @Column(nullable = false)
    private String idUsuario;

    @ManyToOne
    private Ruleta ruleta;

    protected Apuesta(){}

    public Apuesta(Integer numero, Color color, BigDecimal dinero, String idUsuario, Ruleta ruleta) {
        this.numero = numero;
        this.color = color;
        this.dinero = dinero;
        this.idUsuario = idUsuario;
        this.ruleta = ruleta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BigDecimal getDinero() {
        return dinero;
    }

    public void setDinero(BigDecimal dinero) {
        this.dinero = dinero;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Ruleta getRuleta() { return ruleta; }

    public void setRuleta(Ruleta ruleta) { this.ruleta = ruleta; }

    @Override
    public String toString() {
        return "Apuesta{" +
                "id=" + id +
                ", numero=" + numero +
                ", color=" + color +
                ", dinero=" + dinero +
                ", idUsuario='" + idUsuario +
                ", ruleta='" + ruleta + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apuesta apuesta = (Apuesta) o;
        return id.equals(apuesta.id) &&
                Objects.equals(numero, apuesta.numero) &&
                color == apuesta.color &&
                dinero.equals(apuesta.dinero) &&
                idUsuario.equals(apuesta.idUsuario) &&
                Objects.equals(ruleta, apuesta.ruleta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero, color, dinero, idUsuario, ruleta);
    }

}
