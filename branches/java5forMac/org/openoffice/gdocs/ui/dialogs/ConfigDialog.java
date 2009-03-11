package org.openoffice.gdocs.ui.dialogs;

//import java.awt.Desktop;
import java.net.URI;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.openoffice.gdocs.configuration.Configuration;


public class ConfigDialog extends javax.swing.JFrame {
    
    /** Creates new form ConfigDialog */
    public ConfigDialog(java.awt.Frame parent, boolean modal) {
        super("Configuration");
        initComponents();
        jComboBox1.setModel(Configuration.getLanguagesModel());
        proxyCheckBox.setSelected(Configuration.isUseProxy());        
        proxyServer.setText(Configuration.getProxyServer());
        proxyPort.setText(Configuration.getProxyPort());
        authProxyLabel.setSelected(Configuration.isProxyAuth());
        authProxyUser.setText(Configuration.getProxyUser());
        authProxyPassword.setText(Configuration.getProxyPassword());
        setEnableForProxy(Configuration.isUseProxy());
        jLabel11.setText("version: "+Configuration.getVersionStr());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        proxyCheckBox = new javax.swing.JCheckBox();
        proxyServerLabel = new javax.swing.JLabel();
        proxyServer = new javax.swing.JTextField();
        proxyPortLabel = new javax.swing.JLabel();
        proxyPort = new javax.swing.JTextField();
        authProxyLabel = new javax.swing.JCheckBox();
        authProxyUserLabel = new javax.swing.JLabel();
        authProxyUser = new javax.swing.JTextField();
        authProxyPasswordLabel = new javax.swing.JLabel();
        authProxyPassword = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuration");
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setText("Language:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Code: Przemyslaw Rumik ");

        jLabel2.setText("<html><font color=\"blue\"><u>My Page</u></font> / ");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel5.setText("<html><font color=\"blue\"><u>My Blog");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel4.setText("Translation:");

        jLabel6.setText("German: Pascal Herbert");

        jLabel7.setText("Bulgarian: Stefan Kolarov");

        jLabel8.setText("Stefan Kolarov");

        jLabel9.setText("Polish: Przemyslaw Rumik");

        jLabel10.setText("Russian: Nikita aka Kolobok");

        jLabel12.setText("Spanish: Enrique Ros Carri�n");

        jLabel13.setText("Icons created by Simone Di Somma");

        jLabel15.setText("Italian: Simone Di Somma");

        jLabel16.setText("Portuguese (Brazilian): leroma");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel12)
                .addContainerGap(284, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel3))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel10))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel7))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel6))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel9))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel4))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(44, 44, 44)
                        .add(jLabel8)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 41, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel5))
                    .add(jLabel13)
                    .add(jLabel15)
                    .add(jLabel16))
                .add(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel5)
                        .add(jLabel2))
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(jLabel13))
                .add(1, 1, 1)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(jLabel15))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jLabel16))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel10)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel12))
        );

        proxyCheckBox.setText("Use proxy");
        proxyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxyCheckBoxActionPerformed(evt);
            }
        });

        proxyServerLabel.setText("Proxy server:");
        proxyServerLabel.setEnabled(false);

        proxyServer.setEnabled(false);

        proxyPortLabel.setText("Proxy port:");
        proxyPortLabel.setEnabled(false);

        proxyPort.setEnabled(false);

        authProxyLabel.setText("Login to proxy server");
        authProxyLabel.setEnabled(false);
        authProxyLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authProxyLabelActionPerformed(evt);
            }
        });

        authProxyUserLabel.setText("User:");
        authProxyUserLabel.setEnabled(false);

        authProxyUser.setEnabled(false);
        authProxyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authProxyUserActionPerformed(evt);
            }
        });

        authProxyPasswordLabel.setText("Password:");
        authProxyPasswordLabel.setEnabled(false);

        authProxyPassword.setEnabled(false);

        jLabel14.setText("About:");

        jButton3.setText("Error Log");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setText("version:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                .add(jLabel1)
                                .add(18, 18, 18)
                                .add(jComboBox1, 0, 453, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, proxyCheckBox)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(layout.createSequentialGroup()
                                        .add(authProxyUserLabel)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(authProxyUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(authProxyPasswordLabel)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(authProxyPassword))
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, proxyServerLabel)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, proxyServer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 374, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, authProxyLabel))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(proxyPort)
                                    .add(proxyPortLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel14)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel11)
                                    .add(jButton3)))))
                    .add(layout.createSequentialGroup()
                        .add(123, 123, 123)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(80, 80, 80)
                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(proxyCheckBox)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(proxyServerLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(proxyPortLabel))
                .add(2, 2, 2)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(proxyServer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(proxyPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(authProxyLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(authProxyUserLabel)
                    .add(authProxyUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(authProxyPasswordLabel)
                    .add(authProxyPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel14)
                .add(5, 5, 5)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jButton3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel11))
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton1)
                    .add(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try {
//            Desktop.getDesktop().browse(new URI("http://przemelek.googlepages.com"));
        } catch (Exception e) {
            // Not crucial, so we may ignore it ;-)
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
//            Desktop.getDesktop().browse(new URI("http://przemelek.blogspot.com"));
        } catch (Exception e) {
            // Not crucial, so we may ignore it ;-)
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Configuration.setLang((String)jComboBox1.getSelectedItem());
        Configuration.setUseProxy(proxyCheckBox.isSelected());
        Configuration.setProxyServer(proxyServer.getText());
        Configuration.setProxyPort(proxyPort.getText());        
        Configuration.setProxyAuth(authProxyLabel.isSelected());
        Configuration.setProxyUser(authProxyUser.getText());
        Configuration.setProxyPassword(new String(authProxyPassword.getPassword()));
        Configuration.store();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setEnableForProxy(boolean enable) {
        JComponent components[] = {proxyServerLabel,proxyServer,proxyPortLabel,proxyPort,authProxyLabel};
        for (JComponent component:components) {
            component.setVisible(enable);
            component.setEnabled(enable);
        }
        boolean authProxyEnable = authProxyLabel.isSelected() && enable;
        JComponent components2[] = {authProxyUserLabel,authProxyUser,authProxyPasswordLabel,authProxyPassword};
        for (JComponent component:components2) {
            component.setVisible(authProxyEnable);
            component.setEnabled(authProxyEnable);
        }
        pack();
    }
    
    private void proxyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxyCheckBoxActionPerformed
        setEnableForProxy(proxyCheckBox.isSelected()); 
}//GEN-LAST:event_proxyCheckBoxActionPerformed

    private void authProxyLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authProxyLabelActionPerformed
         setEnableForProxy(proxyCheckBox.isSelected());
}//GEN-LAST:event_authProxyLabelActionPerformed

    private void authProxyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authProxyUserActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_authProxyUserActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            JFrame logFrame = new JFrame();
            JTextArea textArea = new JTextArea();
            logFrame.add(new JScrollPane(textArea));
            logFrame.setSize(500,500);
            logFrame.setVisible(true);
            List<String> list = Configuration.getLog();
            StringBuilder sb = new StringBuilder();
            for (String str:list) {
                sb.append(str).append("\n");
            }            
            textArea.setText(sb.toString());
}//GEN-LAST:event_jButton3ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigDialog(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox authProxyLabel;
    private javax.swing.JPasswordField authProxyPassword;
    private javax.swing.JLabel authProxyPasswordLabel;
    private javax.swing.JTextField authProxyUser;
    private javax.swing.JLabel authProxyUserLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox proxyCheckBox;
    private javax.swing.JTextField proxyPort;
    private javax.swing.JLabel proxyPortLabel;
    private javax.swing.JTextField proxyServer;
    private javax.swing.JLabel proxyServerLabel;
    // End of variables declaration//GEN-END:variables
    
}
