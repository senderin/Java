package networkapplications;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UIOpenHTTPCon extends javax.swing.JFrame {

    public UIOpenHTTPCon() {
        initComponents();
        label.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelResult = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txfHTTPResult = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txfHTTPURL = new javax.swing.JTextField();
        btnGetHTTPURL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelResult.setText("Result:");

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

        txfHTTPResult.setEditable(false);
        txfHTTPResult.setColumns(20);
        txfHTTPResult.setRows(5);
        txfHTTPResult.setAutoscrolls(false);
        jScrollPane1.setViewportView(txfHTTPResult);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("OPEN HTTP CONNECTION");

        txfHTTPURL.setText("http://");
        txfHTTPURL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfHTTPURLKeyTyped(evt);
            }
        });

        btnGetHTTPURL.setText("HTTP URL");
        btnGetHTTPURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetHTTPURLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGetHTTPURL)
                            .addComponent(labelResult))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfHTTPURL, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(label))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGetHTTPURL)
                    .addComponent(txfHTTPURL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelResult)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txfHTTPURLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfHTTPURLKeyTyped
        label.setVisible(false);
    }//GEN-LAST:event_txfHTTPURLKeyTyped

    private void btnGetHTTPURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetHTTPURLActionPerformed
        label.setVisible(false);
        try{
            txfHTTPResult.setText(NetworkApplications.getInstance().openHTTPCon(txfHTTPURL.getText()));
        } catch (IOException ex) {
            Logger.getLogger(UIOpenHTTPCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGetHTTPURLActionPerformed

    public static void runOpenHTTPCon(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIOpenHTTPCon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetHTTPURL;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labelResult;
    private javax.swing.JTextArea txfHTTPResult;
    private javax.swing.JTextField txfHTTPURL;
    // End of variables declaration//GEN-END:variables
}
