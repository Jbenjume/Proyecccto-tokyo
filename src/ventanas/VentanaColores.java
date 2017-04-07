/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Random;
/**
 *
 * @author Jhonston
 */
public class VentanaColores extends javax.swing.JFrame {

    public static String accion;
    public static int valor;
    public static String Acciones1[]= {
        "<html><center>Te has ganado <h1 text='red'>Un caramelo</h1 text='red'><center></html>",
        "<html><center>Realiza <h1 text='red'> 10 </h1 text='red'>sentadillas<center></html>",
        "<html><center>Tomate una foto debajo de las letras <br><h1 text='green'>\"TOKIO\"</h1 text='green'> y compartela usando <br><h1 text='red'>#YOSOYESPOL</h1 text='red'></center></html>",
        "<html><center>Tienes que bailar como <br><h1 text='red'>\"El marcianito\"</h1 text='red'></center></html>"};
    public static String Acciones2[]={
        "<html><center>Actualiza tu historia de <h1 text='green'>Whatsapp</h1 tex='green'> con el mejor proyecto de <h1 text='orange'>\"PHYCOM\" </h1 text='orange'> y añade el <h1 text='red'>#YOSOYESPOL</h1 text='red'><center></html>",
        "<html><center>Tienes que cantar y bailar la canción: <br><h1 text='red'>\"La bomba\"</h1 text='red'></center></html>",
        "<html><center>Di la frase <h1 text='red'>\"PHYCOM TOKIO ESPOL\"</h1 text='red'>al revés<center></html>",
        "<html><center>Explota un<h1 text='orange'> globo</h1 text='orange'>con la espalda<center></html>"};
    public static String Acciones3[]={
        "<html><center>Di la frase <h1 text='red'>\"PHYSICAL COMPUTER\"</h1 text='red'>al revés<center></html>",
        "<html><center>Realiza un boomerang en<h1 text='purple'> Instagram</h1 text='purple'> al lado del logo del club <h1 text='orange'>\"PHYCOM\"</h1 text='orange'> y añade el <h1 text='red'>#YOSOYESPOL</h1 text='red'></center></html>",
        "<html><center>Danos una idea de un proyecto <br>que podamos realizar <br>y que involucre la meta <h1 text='orange'>PHYCOM</h1 text='orange'></center></html>",
        "<html><center>Te has ganado <h1 text='red'>Un chupete</h1 text='red'><center></html>"};
    public static String Acciones4[]={
        "<html><center>Tienes que cantar y bailar la canción: <br><h1 text='red'>\"Pen Pineapple Apple Pen\"</h1 text='red'></center></html>",
        "<html><center>Escribe las palabras <h1 text='red'>\"PHYSICAL COMPUTER YOSOYESPOL\"</h1 text='red'>con tu mano dominante<center></html>",
        "<html><center>Tomate una foto con el <br><h1 text='green'>\"TOKIORIGAMI\"</h1 text='green'> y compartela usando <br><h1 text='red'>#YOSOYESPOL</h1 text='red'></center></html>",
        "<html><center>Realiza <h1 text='red'> 10 </h1 text='red'>sapitos<center></html>"};
    public static String Acciones5[]={
        "<html><center>Actualiza tu historia de<h1 text='yellow'> Snapchat</h1 text='yellow'> con el mejor proyecto de<h1 text='orange'>\"PHYCOM\"</h1 text='orange'> y añade el <h1 text='red'>#YOSOYESPOL</h1 text='red'></center></html>",
        "<html><center>Danos una idea de un proyecto <br>que podamos realizar <br>y que involucre la meta <h1 text='orange'>PHYCOM</h1 text='orange'></center></html>",
        "<html><center>Te has ganado <h1 text='red'>Un chupete</h1 text='red'><center></html>",
        "<html><center>Tienes que cantar y bailar la canción: <br><h1 text='red'>\"Asereje\"</h1 text='red'></center></html>"};
    public static String Acciones6[]={
        "<html><center>Tienes que cantar y bailar la canción: <br><h1 text='red'>\"Chacarron\"</h1 text='red'></center></html>",
        "<html><center>Danos una idea de un proyecto <br>que podamos realizar <br>y que involucre la meta <h1 text='orange'>PHYCOM</h1 text='orange'></center></html>",
        "<html><center>Actualiza tu estado de<h1 text='purple'> Facebook</h1 text='purple'> con el mejor proyecto de<h1 text='orange'>\"PHYCOM\"</h1 text='orange'> y añade el <h1 text='red'>#YOSOYESPOL</h1 text='red'></center></html>",
        "<html><center>Explota <h1 text='red'>un globo</h1 text='red'>con la espalda<center></html>"};
    public static String Acciones7[]={
        "<html><center>Tienes que cantar y bailar la canción: <br><h1 text='red'>\"El gato volador\"</h1 text='red'></center></html>",
        "<html><center>Te has ganado <h1 text='red'>Un caramelo</h1 text='red'><center></html>",
        "<html><center>Tienes que cantar y bailar la canción: <br><h1 text='red'>\"Oppa Gangnam Style\"</h1 text='red'></center></html>",
        "<html><center>Sube una foto a tu<h1 text='purple'> Twitter</h1 text='purple'> con el mejor proyecto de<h1 text='orange'>\"PHYCOM\"</h1 text='orange'> y añade el <h1 text='red'>#YOSOYESPOL</h1 text='red'></center></html>"};
    public static String Acciones8[]={
        "<html><center>Actualiza tu historia de<h1 text='purple'> Messenger</h1 text='purple'> con el mejor proyecto de<h1 text='orange'>\"PHYCOM\"</h1 text='orange'> y añade el <h1 text='red'>#YOSOYESPOL</h1 text='red'></center></html>",
        "<html><center>Tienes que cantar y bailar la canción: <br><h1 text='red'>\"Como los gorilas\"</h1 text='red'></center></html>",
        "<html><center>Tienes que cantar y bailar la canción: <br><h1 text='red'>\"La papaya\"</h1 text='red'></center></html>",
        "<html><center>Tienes que cantar y bailar la canción: <br><h1 text='red'>\"Macarena\"</h1 text='red'></center></html>"};
    public static String MiAccion(){
        Random NumAleatorio = new Random();
        int N = NumAleatorio.nextInt(4);
        switch (valor)
        {
            case 1:
                accion = Acciones1[N];
                break;
            case 2:
                accion = Acciones2[N];
                break;
            case 3:
                accion = Acciones3[N];
                break;
            case 4:
                accion = Acciones4[N];
                break;
            case 5:
                accion = Acciones5[N];
                break;
            case 6:
                accion = Acciones6[N];
                break;
            case 7:
                accion = Acciones7[N];
                break;
            case 8:
                accion = Acciones8[3];
                break;
        }   
        return accion;
    }
    public VentanaColores() {
        initComponents();
        this.setLocationRelativeTo(null);
        }
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBlack = new javax.swing.JButton();
        jButtonBlue = new javax.swing.JButton();
        jButtonGreen = new javax.swing.JButton();
        jButtonOrange = new javax.swing.JButton();
        jButtonPink = new javax.swing.JButton();
        jButtonPurple = new javax.swing.JButton();
        jButtonRed = new javax.swing.JButton();
        jButtonYellow = new javax.swing.JButton();
        jLabelSeleccionColor = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBlack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/black/black3.png"))); // NOI18N
        jButtonBlack.setBorder(null);
        jButtonBlack.setBorderPainted(false);
        jButtonBlack.setContentAreaFilled(false);
        jButtonBlack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBlack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBlack.setIconTextGap(-3);
        jButtonBlack.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/black/black2.png"))); // NOI18N
        jButtonBlack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/black/black.png"))); // NOI18N
        jButtonBlack.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonBlack.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBlackActionPerformed(evt);
            }
        });
        jButtonBlack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButtonBlackKeyTyped(evt);
            }
        });
        getContentPane().add(jButtonBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 210, 190));

        jButtonBlue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/blue/blue3.png"))); // NOI18N
        jButtonBlue.setBorder(null);
        jButtonBlue.setBorderPainted(false);
        jButtonBlue.setContentAreaFilled(false);
        jButtonBlue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBlue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBlue.setIconTextGap(-3);
        jButtonBlue.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/blue/blue2.png"))); // NOI18N
        jButtonBlue.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/blue/blue.png"))); // NOI18N
        jButtonBlue.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonBlue.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBlueActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 210, 190));

        jButtonGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/green/green3.png"))); // NOI18N
        jButtonGreen.setBorder(null);
        jButtonGreen.setBorderPainted(false);
        jButtonGreen.setContentAreaFilled(false);
        jButtonGreen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGreen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGreen.setIconTextGap(-3);
        jButtonGreen.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/green/green2.png"))); // NOI18N
        jButtonGreen.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/green/green.png"))); // NOI18N
        jButtonGreen.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonGreen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGreenActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 210, 190));

        jButtonOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/orange/orange3.png"))); // NOI18N
        jButtonOrange.setBorder(null);
        jButtonOrange.setBorderPainted(false);
        jButtonOrange.setContentAreaFilled(false);
        jButtonOrange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOrange.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonOrange.setIconTextGap(-3);
        jButtonOrange.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/orange/orange2.png"))); // NOI18N
        jButtonOrange.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/orange/orange.png"))); // NOI18N
        jButtonOrange.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonOrange.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonOrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrangeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 60, 210, 190));

        jButtonPink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/pink/pink3.png"))); // NOI18N
        jButtonPink.setBorder(null);
        jButtonPink.setBorderPainted(false);
        jButtonPink.setContentAreaFilled(false);
        jButtonPink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPink.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPink.setIconTextGap(-3);
        jButtonPink.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/pink/pink2.png"))); // NOI18N
        jButtonPink.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/pink/pink.png"))); // NOI18N
        jButtonPink.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonPink.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPinkActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPink, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 210, 190));

        jButtonPurple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/purple/purple3.png"))); // NOI18N
        jButtonPurple.setBorder(null);
        jButtonPurple.setBorderPainted(false);
        jButtonPurple.setContentAreaFilled(false);
        jButtonPurple.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPurple.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPurple.setIconTextGap(-3);
        jButtonPurple.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/purple/purple2.png"))); // NOI18N
        jButtonPurple.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/purple/purple.png"))); // NOI18N
        jButtonPurple.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonPurple.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPurple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPurpleActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPurple, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 210, 190));

        jButtonRed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/red/red3.png"))); // NOI18N
        jButtonRed.setBorder(null);
        jButtonRed.setBorderPainted(false);
        jButtonRed.setContentAreaFilled(false);
        jButtonRed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRed.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRed.setIconTextGap(-3);
        jButtonRed.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/red/red2.png"))); // NOI18N
        jButtonRed.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/red/red.png"))); // NOI18N
        jButtonRed.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonRed.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 210, 190));

        jButtonYellow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/yellow/yellow3.png"))); // NOI18N
        jButtonYellow.setBorder(null);
        jButtonYellow.setBorderPainted(false);
        jButtonYellow.setContentAreaFilled(false);
        jButtonYellow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonYellow.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonYellow.setIconTextGap(-3);
        jButtonYellow.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/yellow/yellow2.png"))); // NOI18N
        jButtonYellow.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/yellow/yellow.png"))); // NOI18N
        jButtonYellow.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonYellow.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYellowActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonYellow, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 240, 210, 190));

        jLabelSeleccionColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seleccion color.png"))); // NOI18N
        getContentPane().add(jLabelSeleccionColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, -1));

        jButtonExit.setBackground(new java.awt.Color(48, 20, 9));
        jButtonExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Salir");
        jButtonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jButtonExit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButtonExitKeyTyped(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dojo.jpg"))); // NOI18N
        jLabelFondo.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabelFondo.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabelFondo.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBlueActionPerformed
        VentanaAcciones a= new VentanaAcciones();
        a.setVisible(true);
        valor=2;
        VentanaAcciones.jLabelAcciones.setText(MiAccion());
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBlueActionPerformed

    private void jButtonPurpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPurpleActionPerformed
        VentanaAcciones a= new VentanaAcciones();
        a.setVisible(true);
        valor=6;
        VentanaAcciones.jLabelAcciones.setText(MiAccion());
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPurpleActionPerformed

    private void jButtonGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGreenActionPerformed
        VentanaAcciones a= new VentanaAcciones();
        a.setVisible(true);
        valor=3;
        VentanaAcciones.jLabelAcciones.setText(MiAccion());
        this.setVisible(false);
    }//GEN-LAST:event_jButtonGreenActionPerformed

    private void jButtonOrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrangeActionPerformed
        VentanaAcciones a= new VentanaAcciones();
        a.setVisible(true);
        valor=4;
        VentanaAcciones.jLabelAcciones.setText(MiAccion());
        this.setVisible(false);
    }//GEN-LAST:event_jButtonOrangeActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBlackActionPerformed
        VentanaAcciones a= new VentanaAcciones();
        a.setVisible(true);
        valor=1;
        VentanaAcciones.jLabelAcciones.setText(MiAccion());
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBlackActionPerformed

    private void jButtonPinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPinkActionPerformed
        VentanaAcciones a= new VentanaAcciones();
        a.setVisible(true);
        valor=5;
        VentanaAcciones.jLabelAcciones.setText(MiAccion());
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPinkActionPerformed

    private void jButtonRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedActionPerformed
        VentanaAcciones a= new VentanaAcciones();
        a.setVisible(true);
        valor=7;
        VentanaAcciones.jLabelAcciones.setText(MiAccion());
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRedActionPerformed

    private void jButtonYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYellowActionPerformed
        VentanaAcciones a= new VentanaAcciones();
        a.setVisible(true);
        valor=8;
        VentanaAcciones.jLabelAcciones.setText(MiAccion());
        this.setVisible(false);
    }//GEN-LAST:event_jButtonYellowActionPerformed

    private void jButtonBlackKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonBlackKeyTyped
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER){
            jButtonBlack.doClick();
        }
    }//GEN-LAST:event_jButtonBlackKeyTyped

    private void jButtonExitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonExitKeyTyped
        char cTeclaPresionada=evt.getKeyChar();
        String tecla = Character.toString(cTeclaPresionada);
        tecla = tecla.toUpperCase();
        cTeclaPresionada = tecla.toCharArray()[0];
        System.out.println(tecla);
        if (cTeclaPresionada==KeyEvent.VK_Q){
            jButtonBlack.doClick();
        }
        else if (cTeclaPresionada==KeyEvent.VK_W){
            jButtonBlue.doClick();
        }
        else if (cTeclaPresionada==KeyEvent.VK_E){
            jButtonGreen.doClick();
        }
        else if (cTeclaPresionada==KeyEvent.VK_R){
            jButtonOrange.doClick();
        }
        else if (cTeclaPresionada==KeyEvent.VK_A){
            jButtonPink.doClick();
        }
        else if (cTeclaPresionada==KeyEvent.VK_S){
            jButtonPurple.doClick();
        }
        else if (cTeclaPresionada==KeyEvent.VK_D){
            jButtonRed.doClick();
        }
        else if (cTeclaPresionada==KeyEvent.VK_F){
            jButtonYellow.doClick();
        }
        else if (cTeclaPresionada==KeyEvent.VK_ESCAPE){
            jButtonExit.doClick();
        }
    }//GEN-LAST:event_jButtonExitKeyTyped

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
            java.util.logging.Logger.getLogger(VentanaColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaColores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBlack;
    private javax.swing.JButton jButtonBlue;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonGreen;
    private javax.swing.JButton jButtonOrange;
    private javax.swing.JButton jButtonPink;
    private javax.swing.JButton jButtonPurple;
    private javax.swing.JButton jButtonRed;
    private javax.swing.JButton jButtonYellow;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelSeleccionColor;
    // End of variables declaration//GEN-END:variables
}
