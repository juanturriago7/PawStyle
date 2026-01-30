package com.mycompany.pawstyle.igu;

import com.mycompany.pawstyle.logica.Controladora;
import com.mycompany.pawstyle.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {
    
    //Es una buena practica inicializarlas en null
    //Siempre que haya una varia global que sea una clase, tratar de inicializar así sea en null
    Controladora control = null;
    
    //Esta linea no esta 
    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VerDatos.class.getName());


    public VerDatos() {
        control = new Controladora();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 48)); // NOI18N
        jLabel1.setText("Visualización de Datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Datos de mascotas:");

        btnEditar.setIcon(new javax.swing.ImageIcon("/home/cr7/Pictures/PawStyle/edit.png")); // NOI18N
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        btnEliminar.setIcon(new javax.swing.ImageIcon("/home/cr7/Pictures/PawStyle/delete.png")); // NOI18N
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon("/home/cr7/Pictures/PawStyle/atras.png")); // NOI18N
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1)))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //metodo para cuando se abra la ventana
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Boton de eliminar
        //Lo ideal de la validación es para evitar que el usuario de eliminar, sin tener nada seleccionado, porque ahi fallaria todo
        //Si tiene más de cero filas, es porque por lo menos tiene un regristo
        if(tablaMascotas.getRowCount() > 0){
            //Si el regusltado es distinto menos 1, significa que no hay nada seleccionado, porque arranca desde 0
            if(tablaMascotas.getSelectedRow()!=-1){
                //Como ya validamos que es distinto a menos 1, ya podemos hacer el proceso de obtencion del ID
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(),0)));
                //Llamo al metodo borrar en mi logica
                control.borrarMascota(num_cliente);
                
                //Aviso al usuario que borró correctamente
                mostrarMensaje("Mascota eliminada correctamente", "Info", "Borrado de mascota");
                //Tiene que volver a cargar la tabla para que se muestre la base de datos y ya no aparezca el registro que se borró
                cargarTabla();
                  
                
            }
            else{
                mostrarMensaje("No seleccionó ninguna mascota", "Error", "Error al eliminar");
                
            }
            
        }
        else{
                mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
            
        }
        
    
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        //Boton de Editar
        //Lo ideal de la validación es para evitar que el usuario de eliminar, sin tener nada seleccionado, porque ahi fallaria todo
        //Si tiene más de cero filas, es porque por lo menos tiene un regristo
        if(tablaMascotas.getRowCount() > 0){
            //Si el regusltado es distinto menos 1, significa que no hay nada seleccionado, porque arranca desde 0
            if(tablaMascotas.getSelectedRow()!=-1){
                 //Como ya validamos que es distinto a menos 1, ya podemos hacer el proceso de obtencion del ID
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(),0)));
                
                //Instanciamos modificar
                //Hay que pasar el num del cliente al constructor para que el sepa a quien se le apunta
                ModificarDatos pantallaModi =  new ModificarDatos(num_cliente);
                //Para que sea visible
                pantallaModi.setVisible(true);
                //Para que lo ponga en el medio
                pantallaModi.setLocationRelativeTo(null);
                
                //Hacer que la ventana se cierre
                this.dispose();
                
                
            }else{
                mostrarMensaje("No seleccionó ninguna mascota", "Error", "Error al eliminar");
                
            }
            
        }else{
                mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
            
        }
        
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        // Crea una instancia de tu ventana principal
        Principal princ = new Principal();
        // La hace visible
        princ.setVisible(true);
        // Posiciona la ventana en el centro de tu monitor
        princ.setLocationRelativeTo(null);
    
        // Cierra la ventana actual de Cargar Datos
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    //Metodo para los mensajes de alerta
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        
         JOptionPane optionPane = new JOptionPane(mensaje);
         if(tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
         }else if(tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
         }
         JDialog dialog = optionPane.createDialog(titulo);
         dialog.setAlwaysOnTop(true);
         dialog.setVisible(true);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    
    //Ponemos el metodo publico porque lo vamos a utilizar en la clase de editar tambien
    public void cargarTabla() {
        //Definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            //Agregamos un parametro para que no se pueda modificar la tabla
            //Que filas y columnas no seas editables
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
            
        };
        
        //Establecemos los nombres de la columnas
        //Creamos un vector
        String titulos[] = {"Num", "Nombre", "Raza", "Color", "Alergico", "At. Esp","Duenio", "Cel"};
        //Ahora los setteamos a la tabla
        modeloTabla.setColumnIdentifiers(titulos);
        
        
        //Carga de los datos desde la base de datos
        List <Mascota> listaMascotas = control.traerMascotas();
        
        //recorrer la lista y mostrar cada uno de los elementos en la tabla
        //Preguntar si es null, si no es vacia, vamos a hacer esto
        if(listaMascotas != null){
            //Por cada mascota en la lista de mascotas, cargamelas en la tabla
            for(Mascota masco : listaMascotas){
                //Se pone tipo objetc, porque tengo varios datos de String y enteros, es para que no tengamos que hacer conversiones
                Object[] objeto = {masco.getNum_cliente(), masco.getNombre(), masco.getRaza(), 
                    masco.getColor(), masco.getAlergico(), masco.getAtencion_especial(), 
                    masco.getUnDuenio().getNombre(), masco.getUnDuenio().getCelDuenio()};
                
                modeloTabla.addRow(objeto);
                
                        
            }
        } 
        
        //tablaMascotas es la variable de la tabla del jframe
        //Entonces aqui asignamos toda la logica para que se muestre en el jframe
        tablaMascotas.setModel(modeloTabla);
        
    }
}
