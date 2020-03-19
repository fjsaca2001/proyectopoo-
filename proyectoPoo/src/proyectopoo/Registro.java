package proyectopoo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 * @author franjo2001
 */
public class Registro extends JFrame {

    // Creacion de una lista para almacenar los valores
    static List<Producto> productos = new ArrayList<Producto>();

    // configuracion del panel de visualizacion
    public Registro() {
        initComponents();
        setTitle("Dino Store/Registros");// titulo de la ventana
        setLocationRelativeTo(null);// se establece la ubicacion de la ventana
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblUnidad = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listProductos = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        btMenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listCantidad = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("Registro de producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 33, 290, 41));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre: ");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 113, 90, 30));

        lblUnidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUnidad.setForeground(new java.awt.Color(255, 255, 255));
        lblUnidad.setText("Unidad:");
        getContentPane().add(lblUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 196, 70, 30));

        lblCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidad.setText("Cantidad:");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 274, 90, 30));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio:");
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, 30));

        txtUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 196, 205, 30));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 275, 205, 30));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 330, 210, 30));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 114, 205, 30));

        guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 101, 33));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 18, -1, -1));

        jScrollPane1.setViewportView(listProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 140, 231));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("$");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        btMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btMenu.setText("Menú");
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, 33));

        jLabel4.setFont(new java.awt.Font("Gargi", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Producto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 113, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gargi", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 113, -1, -1));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo: ", "Comestible", "Utensilios", "Oficina", "Industriales" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 192, -1));

        jScrollPane2.setViewportView(listCantidad);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 50, 231));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 840, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Configuracion del boton guardar
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // almacenar datos
        String nombre = txtNombre.getText();
        String unidad = txtUnidad.getText();
        int cantidad = Integer.parseInt(txtCantidad.getText());
        double precio = Double.parseDouble(txtPrecio.getText());
        String tipo = (String) type.getSelectedItem();
        //creamos Objeto
        Producto producto = new Producto(nombre.toLowerCase(), unidad, cantidad, precio, tipo);
        //agregamos los productos
        productos.add(producto);
        clearList();// Limpiamos las casillas
        visualizar_productos_lista();// presentamos datos
    }//GEN-LAST:event_guardarActionPerformed
    // opciones del boton menu
    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
        Menu objmenu = new Menu();
        objmenu.show();
        // cerrar la ventana
        dispose();
    }//GEN-LAST:event_btMenuActionPerformed

    private void txtUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_typeActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed
    // MEtodo para visualizar los datos
    public void visualizar_productos_lista() {
        // variables del metodo
        String[] prodNombres = new String[productos.size()];
        String[] prodCantidad = new String[productos.size()];
        //recorrer los productos de la lista productos
        int c = 0;
        for (Producto producto : productos) {
            prodNombres[c] = producto.getNombre();
            prodCantidad[c] = String.valueOf(producto.getCantidad());
            c++;
        }
        // presentacion de los datos
        listProductos.setListData(prodNombres);
        listCantidad.setListData(prodCantidad);
    }

    public void clearList() {
        // limpiar las casillas
        txtNombre.setText("");
        txtUnidad.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMenu;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblUnidad;
    private javax.swing.JList<String> listCantidad;
    private javax.swing.JList<String> listProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtUnidad;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
