/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;

/**
 *
 * @author Disney
 * @author Ernesto
 * @author Raiana
 */
public class PaintBrushFrame extends javax.swing.JFrame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public static int opcaoAlgoritmo = 0;
    
    /**
     * Creates new form PaintBrushFrame
     */
    public PaintBrushFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        PontosJMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        retaDDAJMenuItem = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        jMenu1.setText("Ações");

        PontosJMenuItem.setText("Rasterização de Pontos");
        PontosJMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PontosJMenuItemMouseClicked(evt);
            }
        });
        PontosJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PontosJMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(PontosJMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Retas");

        retaDDAJMenuItem.setText("Algoritmo DDA");
        retaDDAJMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                retaDDAJMenuItemMousePressed(evt);
            }
        });
        jMenu2.add(retaDDAJMenuItem);

        jMenuItem3.setText("Algoritmo Bresenham");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Polígonos");
        jMenu3.setToolTipText("");

        jMenuItem4.setText("Retângulo");
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Circunferência");

        jMenuItem5.setText("Algoritmo de Bresenham");
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Transformações");

        jMenuItem6.setText("Translação");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        jMenuItem7.setText("Rotação");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuItem8.setText("Escala");
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Reflexão X");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem10.setText("Reflexão Y");
        jMenu6.add(jMenuItem10);

        jMenuItem11.setText("Reflexão XY");
        jMenu6.add(jMenuItem11);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PontosJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PontosJMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PontosJMenuItemActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void PontosJMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PontosJMenuItemMouseClicked
        opcaoAlgoritmo = 1;
    }//GEN-LAST:event_PontosJMenuItemMouseClicked

    private void retaDDAJMenuItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retaDDAJMenuItemMousePressed
        opcaoAlgoritmo = 2;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
    }//GEN-LAST:event_retaDDAJMenuItemMousePressed

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
            java.util.logging.Logger.getLogger(PaintBrushFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaintBrushFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaintBrushFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaintBrushFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PaintBrushFrame paintBrushFrame = new PaintBrushFrame();
                paintBrushFrame.setVisible(true);
                paintBrushFrame.jPanel1.addMouseListener(new MouseAdapter() {
                    
                @Override
                public void mousePressed(MouseEvent e) {
                    opcoes(new Point(e.getX(), e.getY(), e.getComponent().getGraphics()));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    //setBackground(background);background
                }
            });
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem PontosJMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem retaDDAJMenuItem;
    // End of variables declaration//GEN-END:variables

    public static void drawPoint(Graphics2D g2d, int x, int y)
    {
        g2d.setStroke(new BasicStroke(0.1f));
        g2d.setColor(Color.red);

        g2d.draw(new Line2D.Double(x, y, x, y));
    }
    
    public static void opcoes(Point p)
    {
        System.out.println("Opção de desenho: " + opcaoAlgoritmo);
        if(opcaoAlgoritmo == 0){
            System.out.println(" NADA ");
        }
        else if(opcaoAlgoritmo == 1){
            System.out.println(" Pontos ");
        }
        else if(opcaoAlgoritmo == 2){
            System.out.println(" Reta DDA ");
            Reta.dda(p);
        }
        else if(opcaoAlgoritmo == 3){
            System.out.println(" Reta Bresenham ");
        }
        else if(opcaoAlgoritmo == 4){
            System.out.println(" Poligonos - retângulo ");
        }
        else if(opcaoAlgoritmo == 5){
            System.out.println(" Circunferencia - Bresenham ");
        }
        else if(opcaoAlgoritmo == 6){
            System.out.println(" - Transformações Geométricas 2D: translação");
        }
        else if(opcaoAlgoritmo == 7){
            System.out.println(" - Transformações Geométricas 2D: rotação");
        }
        else if(opcaoAlgoritmo == 8){
            System.out.println(" - Transformações Geométricas 2D: escala");
        }
        else if(opcaoAlgoritmo == 9){
            System.out.println(" - Transformações Geométricas 2D: reflexões X");
        }
        else if(opcaoAlgoritmo == 10){
            System.out.println(" - Transformações Geométricas 2D: reflexões Y");
        }
        else if(opcaoAlgoritmo == 11){
            System.out.println(" - Transformações Geométricas 2D: reflexões XY");
        }
        else if(opcaoAlgoritmo == 12){
            System.out.println("Recorte de Regiões: Algoritmo de Cohen-Sutherland");
        }
        else if(opcaoAlgoritmo == 13){
            System.out.println("Recorte de Regiões: Algoritmo de Liang Barsky");
        }
    }
}