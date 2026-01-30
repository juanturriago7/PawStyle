package com.mycompany.pawstyle.logica;

import com.mycompany.pawstyle.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    //Acá nos crea un objeto para que podamos llamar a cada uno de los metodos que tengamos en controladora de persistencia
    //Y en controladora de persistencia a su vez, nos va a llamar todo la logica de dueniojpacontroller y mascotajpacontroller
    ControladoraPersistencia controlPesis = new ControladoraPersistencia();

    //La controladora recibe los datos de la interfaz grafica
    public void guardar(String nombreMasco, String raza, String color, String observaciones, String nombreDuenio, 
            String celDuenio, String alergico, String atenEsp) {
        
        //Creamos el duenio y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        //Creamos la mascota y asignamos sus valores
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);
        
        //Llama a la persistencia para guardar en la BD
        controlPesis.guardar(duenio,masco);
        

        
        
    }

    public List<Mascota> traerMascotas() {
        
        return controlPesis.traerMascotas();
        
        
    }

    public void borrarMascota(int num_cliente) {
       //Llamamos la controladora de persistencia para que haga la accion con la BD
       controlPesis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
       return controlPesis. traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, String observaciones, 
            String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
        
        //A masco que es la varia vieja, para que ocupe el mismo espacio en memoria, le vamos asignar los nuevos valores de todo lo que quieremos cambiar
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
       
        //Modifico la mascota
        controlPesis.modificarMascota(masco);
        
        //Primero identificamos el duenio
        //Vamos a crear un metodo que nos busque el id del duenio
        Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        //Setteamos el duenio, sus valores nuevos
        dueno.setCelDuenio(celDuenio);
        dueno.setNombre(nombreDuenio);
        
        //Llamar al modificar duenio
        this.modificarDuenio(dueno);
        
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPesis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
        controlPesis.modidicarDuenio(dueno);
    }
    
}
