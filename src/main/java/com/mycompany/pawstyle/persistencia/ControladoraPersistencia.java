package com.mycompany.pawstyle.persistencia;

import com.mycompany.pawstyle.logica.Duenio;
import com.mycompany.pawstyle.logica.Mascota;
import java.util.List;

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

    public List<Mascota> traerMascotas() {
        //return porque devuelve una lista
        return mascoJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
        try {
            mascoJpa.destroy(num_cliente);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public Mascota traerMascota(int num_cliente) {
        //Retornamos a la mascota que haya encontrado
        return mascoJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco) {
        try {
            mascoJpa.edit(masco);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return duenioJpa.findDuenio(id_duenio);
    }

    public void modidicarDuenio(Duenio dueno) {
        try {
            duenioJpa.edit(dueno);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
