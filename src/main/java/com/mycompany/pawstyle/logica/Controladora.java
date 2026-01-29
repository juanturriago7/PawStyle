package com.mycompany.pawstyle.logica;

import com.mycompany.pawstyle.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    //Acá nos crea un objeto para que podamos llamar a cada uno de los metodos que tengamos en controladora de persistencia
    //Y en controladora de persistencia a su vez, nos va a llamar todo la logica de dueniojpacontroller y mascotajpacontroller
    ControladoraPersistencia controlPesis = new ControladoraPersistencia();

    //La controladora recibe los datos de la interfaz grafica
    public void guardar(String nombreMasco, String raza, String color, String observaciones, String nombreDuenio, String celDuenio, String alergico, String atenEsp) {
        
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
    
}
