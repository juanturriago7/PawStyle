package com.mycompany.pawstyle.persistencia;

import com.mycompany.pawstyle.logica.Duenio;
import com.mycompany.pawstyle.logica.Mascota;

public class ControladoraPersistencia {
    
    //Va a tener 2 instancias para poder usar mi jpade duenio y de mascota
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        //Ahora vamos a usar los metodos del jpa controller
        //Crear en la BD el duenio
        duenioJpa.create(duenio);
        
        //Crear en la BD la mascota
        mascoJpa.create(masco);
        
        
        
    }
}
