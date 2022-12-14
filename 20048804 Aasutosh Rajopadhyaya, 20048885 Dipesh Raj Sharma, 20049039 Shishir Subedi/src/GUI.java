
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sumerath
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        TextPassword.setEchoChar('\u25CF');
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelAdmin = new javax.swing.JPanel();
        LabelPappuConstruction = new javax.swing.JLabel();
        PanelLogin = new javax.swing.JPanel();
        LabelUsername = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        TextUsername = new javax.swing.JTextField();
        ButtonLogin = new javax.swing.JButton();
        TextPassword = new javax.swing.JPasswordField();
        LabelAdminPhoto = new javax.swing.JLabel();
        PanelSecondary = new javax.swing.JPanel();
        GoRegisterPanel = new javax.swing.JButton();
        LabelLookingForAWorker = new javax.swing.JLabel();
        ButtonSearchWorker = new javax.swing.JButton();
        LabelRegisterAsNewWorker = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        MenuExit = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LabelAdmin.setBackground(new java.awt.Color(135, 206, 235));

        LabelPappuConstruction.setFont(new java.awt.Font("Verdana", 1, 42)); // NOI18N
        LabelPappuConstruction.setText("Pappu Construction");

        PanelLogin.setBackground(new java.awt.Color(135, 206, 235));
        PanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Malgun Gothic", 1, 24))); // NOI18N

        LabelUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelUsername.setText("Username");

        LabelPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelPassword.setText("Password");

        ButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonLogin.setText("Login");
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelUsername)
                            .addComponent(LabelPassword))
                        .addGap(18, 18, 18)
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(TextPassword))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUsername)
                    .addComponent(TextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        LabelAdminPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled-1.png"))); // NOI18N
        LabelAdminPhoto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LabelAdminPhoto.setPreferredSize(new java.awt.Dimension(405, 582));

        PanelSecondary.setBackground(new java.awt.Color(135, 206, 235));
        PanelSecondary.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelSecondary.setToolTipText("");

        GoRegisterPanel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GoRegisterPanel.setText("Register");
        GoRegisterPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoRegisterPanelActionPerformed(evt);
            }
        });

        LabelLookingForAWorker.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        LabelLookingForAWorker.setText("Looking For A Worker?");

        ButtonSearchWorker.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonSearchWorker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search icon.jpg"))); // NOI18N
        ButtonSearchWorker.setText(" Search Worker");
        ButtonSearchWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchWorkerActionPerformed(evt);
            }
        });

        LabelRegisterAsNewWorker.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        LabelRegisterAsNewWorker.setText("Register as new worker");

        javax.swing.GroupLayout PanelSecondaryLayout = new javax.swing.GroupLayout(PanelSecondary);
        PanelSecondary.setLayout(PanelSecondaryLayout);
        PanelSecondaryLayout.setHorizontalGroup(
            PanelSecondaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSecondaryLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelSecondaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonSearchWorker)
                    .addComponent(LabelLookingForAWorker)
                    .addComponent(LabelRegisterAsNewWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        PanelSecondaryLayout.setVerticalGroup(
            PanelSecondaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSecondaryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelLookingForAWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonSearchWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelRegisterAsNewWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GoRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LabelAdminLayout = new javax.swing.GroupLayout(LabelAdmin);
        LabelAdmin.setLayout(LabelAdminLayout);
        LabelAdminLayout.setHorizontalGroup(
            LabelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelAdminLayout.createSequentialGroup()
                .addComponent(LabelAdminPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(LabelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LabelAdminLayout.createSequentialGroup()
                        .addComponent(LabelPappuConstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LabelAdminLayout.createSequentialGroup()
                        .addGroup(LabelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PanelSecondary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61))))
        );
        LabelAdminLayout.setVerticalGroup(
            LabelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelAdminLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(LabelPappuConstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelSecondary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(LabelAdminPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );

        MenuBar.setToolTipText("");

        jMenu3.setText("File");

        MenuExit.setText("Exit");
        MenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExitActionPerformed(evt);
            }
        });
        jMenu3.add(MenuExit);

        MenuBar.add(jMenu3);

        jMenu4.setText("Help");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Help? Read Manual");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        MenuBar.add(jMenu4);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        // TODO add your handling code here:
        String Username = TextUsername.getText();
        String Password = TextPassword.getText();
        
        if(Username.equals("admin") && Password.equals("admin"))
        {
            this.setVisible(false);
            try {
                new AdminPanel().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        else if(Username.equals(""))
        {
            JOptionPane.showMessageDialog(this,
                        "Please enter your Username",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
        }
        else if(Password.equals(""))
        {
            JOptionPane.showMessageDialog(this,
                        "Please enter your Password",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(this,
                        "Username or Password is Incorrect",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void GoRegisterPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoRegisterPanelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try { 
            new RegisterPanel().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GoRegisterPanelActionPerformed

    private void ButtonSearchWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchWorkerActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try { 
            new WorkerPanel().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonSearchWorkerActionPerformed

    private void MenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExitActionPerformed
        // TODO add your handling code here:
        System.exit(0); 
    }//GEN-LAST:event_MenuExitActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if(Desktop.isDesktopSupported()){
            try{
                File file=new File("src\\User Manual\\User Manual.PDF");
                Desktop.getDesktop().open(file);
                
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "File not found!!");
            }
            
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JButton ButtonSearchWorker;
    private javax.swing.JButton GoRegisterPanel;
    private javax.swing.JPanel LabelAdmin;
    private javax.swing.JLabel LabelAdminPhoto;
    private javax.swing.JLabel LabelLookingForAWorker;
    private javax.swing.JLabel LabelPappuConstruction;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelRegisterAsNewWorker;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem MenuExit;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JPanel PanelSecondary;
    private javax.swing.JPasswordField TextPassword;
    private javax.swing.JTextField TextUsername;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
