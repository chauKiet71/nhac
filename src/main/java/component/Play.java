/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package component;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author TRONG NGHIA
 */
public class Play extends javax.swing.JPanel {

    /**
     * Creates new form Play
     */
    public Play() {
        initComponents();
        this.lbStop.setVisible(false);
    }
    Clip clip;
    long pausedPosition;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbPlay = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbStop = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(30, 30, 30));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 31, 54));

        lbPlay.setBackground(new java.awt.Color(30, 30, 30));
        lbPlay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/playing.png"))); // NOI18N
        lbPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPlay.setOpaque(true);
        lbPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPlayMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbPlayMousePressed(evt);
            }
        });
        add(lbPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 0, 31, 50));

        jLabel3.setBackground(new java.awt.Color(30, 30, 30));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 0, 31, 54));

        jLabel4.setBackground(new java.awt.Color(30, 30, 30));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/play.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setOpaque(true);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 0, 34, 54));

        lbStop.setBackground(new java.awt.Color(30, 30, 30));
        lbStop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        lbStop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbStop.setOpaque(true);
        lbStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbStopMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbStopMousePressed(evt);
            }
        });
        add(lbStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 31, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void lbPlayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPlayMousePressed
        lbPlay.setVisible(false);
        lbStop.setVisible(true);
    }//GEN-LAST:event_lbPlayMousePressed

    private void lbStopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbStopMousePressed
        lbPlay.setVisible(true);
        lbStop.setVisible(false);
    }//GEN-LAST:event_lbStopMousePressed

    private void lbPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPlayMouseClicked
        if (clip != null && !clip.isRunning()) {
            clip.setMicrosecondPosition(pausedPosition);
            clip.start();
        }
    }//GEN-LAST:event_lbPlayMouseClicked

    private void lbStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbStopMouseClicked
        if (clip != null && clip.isRunning()) {
            pausedPosition = clip.getMicrosecondPosition();
            clip.stop();
        }
    }//GEN-LAST:event_lbStopMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbPlay;
    private javax.swing.JLabel lbStop;
    // End of variables declaration//GEN-END:variables
}
