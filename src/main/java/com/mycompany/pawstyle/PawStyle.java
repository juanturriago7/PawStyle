package com.mycompany.pawstyle;

import com.mycompany.pawstyle.igu.Principal;

public class PawStyle {

    public static void main(String[] args) {
        
        //Se instancia principal para poder utilizarlo
        Principal princ = new Principal();    
        //Se hace visible
        princ.setVisible(true);
        //Esto es para que no se afecte por la posicion
        princ.setLocationRelativeTo(null);
        
        
    }
}
