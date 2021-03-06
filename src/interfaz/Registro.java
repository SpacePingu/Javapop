/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.Cliente;
import logica.Usuarios;

/**
 *
 * @author adryh
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form registro
     */
    public Registro() {
        initComponents();

        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        ImageIcon img = new ImageIcon(s + "\\src\\iconos\\JavaPop_logo_.png");
        this.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPass1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jPass2 = new javax.swing.JPasswordField();
        jTextCiudad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jFormatTarjeta = new javax.swing.JFormattedTextField();
        jFormattedCp = new javax.swing.JFormattedTextField();
        jFormDni = new javax.swing.JFormattedTextField();
        jRadioPremium = new javax.swing.JRadioButton();
        jRadioFree = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextWeb = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDescripcion = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jComboHorario = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jFormattedTelefono = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(400, 200));

        jPanel1.setEnabled(false);

        jLabel1.setText("Registro");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");

        jTextName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DNI ");

        jTextEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Email");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Contraseña");

        jPass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPass1ActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Repite la contraseña");

        jPass2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextCiudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ciudad");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Código Postal");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Trajeta de crédito");

        try {
            jFormatTarjeta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormatTarjeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormatTarjeta.setText("");

        try {
            jFormattedCp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedCp.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            jFormDni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########?")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormDni.setToolTipText("");

        buttonGroup1.add(jRadioPremium);
        jRadioPremium.setText("Usuario Premium ");
        jRadioPremium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPremiumActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioFree);
        jRadioFree.setSelected(true);
        jRadioFree.setText("Usuario Normal");
        jRadioFree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioFreeActionPerformed(evt);
            }
        });

        jLabel10.setText("Tipo de usuario ");

        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setText("  Cuota de 30€ ");

        jLabel13.setText("Sin cuota, totalmente gratuito");

        jTextWeb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextWeb.setEnabled(false);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Web");

        jTextDescripcion.setColumns(20);
        jTextDescripcion.setRows(5);
        jTextDescripcion.setEnabled(false);
        jScrollPane1.setViewportView(jTextDescripcion);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Descripción");

        jComboHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "24:00" }));
        jComboHorario.setEnabled(false);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Horario de apertura");

        try {
            jFormattedTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ### ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTelefono.setEnabled(false);

        jLabel16.setText("Número de telefono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioPremium)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioFree)
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormDni)
                            .addComponent(jTextCiudad)
                            .addComponent(jTextName)
                            .addComponent(jTextEmail)
                            .addComponent(jPass1)
                            .addComponent(jPass2)
                            .addComponent(jFormatTarjeta)
                            .addComponent(jFormattedCp, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jTextWeb)
                            .addComponent(jComboHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTelefono))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jFormDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(jTextWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jComboHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jFormattedCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jFormatTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioPremium)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioFree)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPass1ActionPerformed
        String pass1 = new String(jPass1.getPassword());
        if (pass1.length() < 7) {
            JOptionPane.showMessageDialog(jPanel1, "La contraseña debe tener mínimo 8 caracteres");
        }
    }//GEN-LAST:event_jPass1ActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jRadioPremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPremiumActionPerformed
        if (jRadioPremium.isSelected()) {
            jTextDescripcion.enable(true);
            jTextWeb.enable(true);
            jFormattedTelefono.enable(true);
            jComboHorario.enable(true);
        }
        JOptionPane.showMessageDialog(jPanel1,
                " Deberá completar el registro de usuario Premium \n"
                + "rellenando los datos de la derecha.\n"
                + "\n"
                + "Ser usuario Premium le permitirá poder vender sus\n"
                + "productos en JavaPop.\n"
                + "\n"
                + "Cuando se complete el registro Premium se cargará\n"
                + "una cuota de 30€ en su tarjeta de crédito.");

    }//GEN-LAST:event_jRadioPremiumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Log log = new Log();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
        Boolean valido = true;
        String errores = "Los siguientes campos son incorrectos:";
        String pass1 = new String(jPass1.getPassword());
        String pass2 = new String(jPass2.getPassword());
        String regdni = jFormDni.getText();
        String regnombre = jTextName.getText();
        String regemail = jTextEmail.getText();
        String regciudad = jTextCiudad.getText();
        String regtarjeta = jFormatTarjeta.getText();
        String regcp = jFormattedCp.getText();
        String regpredes = jTextDescripcion.getText();
        String regpreweb = jTextWeb.getText();
        String regprehor = jComboHorario.getItemAt(WIDTH);
        String regpretel = jFormattedTelefono.getText();
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(regemail);

        if (regdni.contains(" ")) {
            errores += "\nDNI no válido";
            valido = false;
        }
        if (!matcher.matches()) {
            errores += "\nEmail no válido";
            valido = false;
        }
        if (regtarjeta.contains(" ")) {
            errores += "\nNúmero de tarjeta no válido";
            valido = false;
        }
        if (!pass1.equals(pass2)) {
            errores += "\nLas contraseñas no son iguales";
            valido = false;
        }
        if (pass1.contains(" ")) {
            errores += "\nLa contraseña contiene caracteres prohibidos ";
            valido = false;
        }
        if (valido == false) {
            JOptionPane.showMessageDialog(jPanel1, errores);
        }
        if (valido == true) {
            if (jRadioFree.isSelected()) {

                Cliente c = new Cliente(regdni, regnombre, regemail, pass1, regciudad, regcp, regtarjeta, false, null, null, null, null);
                Usuarios.clientes.add(c);
                System.out.print(c);
                Usuarios.guardarClientes();

                JOptionPane.showMessageDialog(jPanel1, "Registro usuario completado");
                Log log = new Log();
                log.setVisible(true);
                this.dispose();
            } else {
                Cliente c = new Cliente(regdni, regnombre, regemail, pass1, regciudad, regcp, regtarjeta, true, regpredes, regprehor, regpretel, regpreweb);
                Usuarios.clientes.add(c);
                System.out.print(c);
                Usuarios.guardarClientes();
                JOptionPane.showMessageDialog(jPanel1, "Registro usuario premium completado");
                Log log = new Log();
                log.setVisible(true);
                this.dispose();

            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioFreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioFreeActionPerformed
        if (jRadioFree.isSelected()) {
            jTextDescripcion.enable(false);
            jTextWeb.enable(false);
            jFormattedTelefono.enable(false);
            jComboHorario.enable(false);
        }
    }//GEN-LAST:event_jRadioFreeActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboHorario;
    private javax.swing.JFormattedTextField jFormDni;
    private javax.swing.JFormattedTextField jFormatTarjeta;
    private javax.swing.JFormattedTextField jFormattedCp;
    private javax.swing.JFormattedTextField jFormattedTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPass1;
    private javax.swing.JPasswordField jPass2;
    private javax.swing.JRadioButton jRadioFree;
    private javax.swing.JRadioButton jRadioPremium;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCiudad;
    private javax.swing.JTextArea jTextDescripcion;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextWeb;
    // End of variables declaration//GEN-END:variables
}
