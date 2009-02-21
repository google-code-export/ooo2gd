package org.openoffice.gdocs.ui.dialogs;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import org.openoffice.gdocs.ui.LoginPanel;
import org.openoffice.gdocs.util.Creditionals;
import org.openoffice.gdocs.util.Wrapper;
import org.openoffice.gdocs.util.WrapperFactory;

public class ServersManager extends javax.swing.JFrame {

    private Wrapper wrapper;           
    /** Creates new form ServersManager */
    public ServersManager(Wrapper wrapper) throws Exception {
        this.wrapper = wrapper;        
        initComponents();
        fillListOfServers();
        jButton3.setVisible(false);
    }
    
    private void fillListOfServers() {
        final List<String> list = wrapper.getListOfServersForSelection();
        serversList.setModel(new ListModel() {
            public int getSize() {
                return list.size();
            }
            public Object getElementAt(int index) {
                return list.get(index);
            }
            public void addListDataListener(ListDataListener l) {
                //
            }
            public void removeListDataListener(ListDataListener l) {
                //
            }
        });
        serversList.setSelectedIndex(0);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        serversList = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(serversList);

        jButton1.setText("Modify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    dispose();
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    String str = (String)serversList.getSelectedValue();
    int ret = JOptionPane.showConfirmDialog(this, "Do you want to delete settings for "+str);
    if (ret == JOptionPane.YES_OPTION) {
        wrapper.setServerPath(str);
        wrapper.storeCredentials(null);
        fillListOfServers();
    }
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String serverPath = (String)serversList.getSelectedValue();    
    MyLoginDialog dialog = getDialog(serverPath, wrapper.getCreditionalsForServer(serverPath));
    dialog.setModal(false);
    dialog.setVisible(true); 
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String serverPath = "";
    Creditionals creditionals = new Creditionals("","");
    MyLoginDialog dialog = getDialog(serverPath, creditionals);
    dialog.setModal(false);
    dialog.setVisible(true);     
}//GEN-LAST:event_jButton3ActionPerformed

    private MyLoginDialog getDialog(final String serverPath, final Creditionals creditionals) {
        final MyLoginDialog dialog = new MyLoginDialog(this);
        final LoginPanel loginPanel = new LoginPanel() {            
            @Override
            public void storeCredentials(Creditionals creditionals) {
                wrapper.setServerPath(serverPath);
                wrapper.storeCredentials(creditionals);
            }

            @Override
            public void readCreditionals() {
                creditionals.setWasCreditionalReadFromDisk(!creditionals.isEmpty());
                fillCredentials(creditionals);
            }
            
        };
        loginPanel.setSystem(wrapper.getSystem());
        final JTextArea serverEditor = new JTextArea(serverPath);
        if (serverPath!=null && !"".equals(serverPath)) {
            serverEditor.setEditable(false);
            serverEditor.setEnabled(false);
        }
        JPanel serverLinePanel = new JPanel();
        serverLinePanel.setLayout(new BorderLayout());
        serverLinePanel.add(new JLabel("Server path:"),BorderLayout.WEST);
        serverLinePanel.add(serverEditor,BorderLayout.CENTER);
        //serverEditor.setPreferredSize(serverEditor.getSize());
        dialog.setLayout(new BorderLayout());
        dialog.getContentPane().add(serverLinePanel,BorderLayout.NORTH);
        dialog.getContentPane().add(loginPanel);
        JPanel buttonsPanel = new JPanel();
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                loginPanel.getCreditionals();
                dialog.setReturnValue(serverEditor.getText());
                dialog.handleOK();
            }
        });
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dialog.handleCancel();
            }
        });
        buttonsPanel.add(okButton);
        buttonsPanel.add(cancelButton);
        dialog.getContentPane().add(buttonsPanel,BorderLayout.SOUTH);
        dialog.pack();
        return dialog;
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ServersManager(WrapperFactory.getWrapperForCredentials("WebDAV")).setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList serversList;
    // End of variables declaration//GEN-END:variables

}