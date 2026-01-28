package com.mycompany.pawstyle.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Para indicar que duenio es una entidad 
////Se mapea la clase como entidad, así me la detecta como tabla en la base de datos
@Entity
public class Duenio implements Serializable {
    
    //Id = Es la primary key de mi base de datos
    //Generate = es para que se genere automatico en modo secuencia
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_duenio;
    private String nombre;
    private String celDuenio;

    
    //Constructor vacio
    public Duenio() {
    }

    //Constructor con parametros
    public Duenio(int id_duenio, String nombre, String celDuenio) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
    }
    
    //Metodos por defectos en cada clase, getters y setters

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
    
    
}
