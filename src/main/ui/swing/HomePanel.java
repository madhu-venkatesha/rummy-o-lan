/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.swing;

import javax.swing.JFrame;

import util.ThreadUtil;

/**
 *
 * @author Dr. Vijaya
 */
public class HomePanel extends javax.swing.JPanel {

    private JFrame rummyOLan;

    /**
     * Creates new form HomePanel
     */
    public HomePanel() {//TODO make private?
        initComponents();
    }

    public HomePanel(JFrame rummyOLan) {
        this();
        this.rummyOLan = rummyOLan;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hostGameButton = new javax.swing.JButton();

        hostGameButton.setText("Host Game");
        hostGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostGameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(hostGameButton)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(hostGameButton)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hostGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostGameButtonActionPerformed
//    	rummyOLan.setContentPane(new GameSettingsPanel(rummyOLan));
        ThreadUtil.startNewThread(() -> rummyOLan.setContentPane(new GameSettingsPanel(rummyOLan)));        
    }//GEN-LAST:event_hostGameButtonActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hostGameButton;
    // End of variables declaration//GEN-END:variables
}
