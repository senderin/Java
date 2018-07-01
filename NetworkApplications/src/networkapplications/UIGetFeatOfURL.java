package networkapplications;

import java.awt.Dimension;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UIGetFeatOfURL extends javax.swing.JFrame {

    public UIGetFeatOfURL() {
        
        initComponents();
        label.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txfURLResult = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txfGetFeatOfURL = new javax.swing.JTextField();
        btnGetFeatOfURL = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnMore = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txfURLResult.setEditable(false);
        txfURLResult.setColumns(20);
        txfURLResult.setRows(5);
        txfURLResult.setAutoscrolls(false);
        jScrollPane1.setViewportView(txfURLResult);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("GET FEATURES OF URL");

        txfGetFeatOfURL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfGetFeatOfURLKeyTyped(evt);
            }
        });

        btnGetFeatOfURL.setText("Get Features of");
        btnGetFeatOfURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetFeatOfURLActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Result:");

        btnMore.setText("More");
        btnMore.setEnabled(false);
        btnMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoreActionPerformed(evt);
            }
        });

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setForeground(new java.awt.Color(255, 0, 0));
        label.setText("Malformed Url!");
        label.setToolTipText("");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(btnMore)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGetFeatOfURL)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfGetFeatOfURL, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(label))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGetFeatOfURL)
                    .addComponent(txfGetFeatOfURL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMore)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetFeatOfURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetFeatOfURLActionPerformed
        label.setVisible(false);
        try{
            txfURLResult.setText(NetworkApplications.getInstance().getFeaturesOfURL(txfGetFeatOfURL.getText()));
            btnMore.setEnabled(true);
        }catch (MalformedURLException ex) {
            label.setVisible(true);
            Logger.getLogger(UIGetFeatOfURL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGetFeatOfURLActionPerformed

    private void btnMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoreActionPerformed
        label.setVisible(false);
        try{
            String str=NetworkApplications.getInstance().getMore(txfGetFeatOfURL.getText());
            txfURLResult.setText(txfURLResult.getText()+"\n\nMore:\n"+str);
            btnMore.setEnabled(false);
        }catch (MalformedURLException ex) {
            label.setVisible(true);
            Logger.getLogger(UIGetFeatOfURL.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(UIGetFeatOfURL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMoreActionPerformed

    private void txfGetFeatOfURLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfGetFeatOfURLKeyTyped
        label.setVisible(false);
        btnMore.setEnabled(false);
    }//GEN-LAST:event_txfGetFeatOfURLKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void runGetFeatOfURL(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIGetFeatOfURL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetFeatOfURL;
    private javax.swing.JButton btnMore;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JTextField txfGetFeatOfURL;
    private javax.swing.JTextArea txfURLResult;
    // End of variables declaration//GEN-END:variables
}
