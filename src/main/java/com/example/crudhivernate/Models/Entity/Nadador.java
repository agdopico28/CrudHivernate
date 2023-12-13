package com.example.crudhivernate.Models.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;


@Entity
@Table(name = "nadador")
public class Nadador implements Serializable {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "numeroFederado")
    private String numeroFederado;
    @Column(name = "edad")
    private int edad;


    @Column(name = "email")
    private int email;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroFederado() {
        return numeroFederado;
    }

    public int getEdad() {
        return edad;
    }

    public int getEmail() {
        return email;
    }

    public Nadador(int id, String nombre, String numeroFederado, int edad, int email) {
        this.id = id;
        this.nombre = nombre;
        this.numeroFederado = numeroFederado;
        this.edad = edad;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroFederado(String numeroFederado) {
        this.numeroFederado = numeroFederado;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public Nadador(){

    }
}

