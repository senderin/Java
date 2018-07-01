package networkapplications;

import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UIGetIP extends javax.swing.JFrame {

    public UIGetIP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLocalHost = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txfByName = new javax.swing.JTextField();
        btnByName = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        results = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txfByAllName = new javax.swing.JTextField();
        btnByAllName = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLocalHost.setText("IP of Local Host?");
        btnLocalHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalHostActionPerformed(evt);
            }
        });

        jLabel1.setText("By Address");

        btnByName.setText("Get IP");
        btnByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnByNameActionPerformed(evt);
            }
        });

        results.setEditable(false);
        results.setColumns(20);
        results.setRows(5);
        results.setAutoscrolls(false);
        jScrollPane1.setViewportView(results);

        jLabel2.setText("By Addresses");

        btnByAllName.setText("Get IP");
        btnByAllName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnByAllNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Results:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GET IP");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnByAllName)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnByName)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel1)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txfByAllName, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(txfByName)))
                        .addComponent(btnLocalHost)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalHost)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnByName))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnByAllName)
                    .addComponent(txfByAllName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jButton1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLocalHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalHostActionPerformed

        try {
            results.setText(NetworkApplications.getInstance().returnLocalHost());
        } catch (UnknownHostException ex) {
            Logger.getLogger(UIGetIP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLocalHostActionPerformed

    private void btnByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnByNameActionPerformed
        try {
            results.setText(NetworkApplications.getInstance().returnAddressByName(txfByName.getText()));
        } catch (UnknownHostException ex) {
            Logger.getLogger(UIGetIP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnByNameActionPerformed

    private void btnByAllNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnByAllNameActionPerformed
        try {
            results.setText(NetworkApplications.getInstance().returnAddressesByName(txfByAllName.getText()));
        } catch (UnknownHostException ex) {
            Logger.getLogger(UIGetIP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnByAllNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void runGetIP(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIGetIP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnByAllName;
    private javax.swing.JButton btnByName;
    private javax.swing.JButton btnLocalHost;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea results;
    private javax.swing.JTextField txfByAllName;
    private javax.swing.JTextField txfByName;
    // End of variables declaration//GEN-END:variables
}
