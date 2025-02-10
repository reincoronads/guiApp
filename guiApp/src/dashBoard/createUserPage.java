/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dashBoard;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class createUserPage extends javax.swing.JFrame {

    /**
     * Creates new form createUserPage
     */
    public createUserPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private boolean validateFields() {
        
        if (usernametxf.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (passField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       
        // 2. Check password length (at least 8 characters)
        if (passField.getText().trim().length() < 8) {
            JOptionPane.showMessageDialog(this, "Password must have at least 8 characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (isDuplicateUsername(usernametxf.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Username already exists. Please choose a different username.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // If all validations pass
        return true;
    }
    
    // Method to check if username is a duplicate
    private boolean isDuplicateUsername(String username) {
        // Replace this with your logic to check for duplicate usernames (e.g., querying a database)
        // For now, this is a placeholder
        return false; // Assume username is unique
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        loginPane1 = new javax.swing.JPanel();
        loginLbl1 = new javax.swing.JLabel();
        joinPane = new javax.swing.JPanel();
        joinLbl = new javax.swing.JLabel();
        explorePane = new javax.swing.JPanel();
        exploreLbl1 = new javax.swing.JLabel();
        registerPane = new javax.swing.JPanel();
        loginPane = new javax.swing.JPanel();
        loginLbl = new javax.swing.JLabel();
        passPane = new javax.swing.JPanel();
        passLbl = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        userPane = new javax.swing.JPanel();
        usernametxf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rememberPane = new javax.swing.JPanel();
        placeholderLbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(27, 27, 27));
        header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPane1.setBackground(new java.awt.Color(27, 27, 27));
        loginPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLbl1.setBackground(new java.awt.Color(27, 27, 27));
        loginLbl1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        loginLbl1.setForeground(new java.awt.Color(255, 255, 255));
        loginLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLbl1.setText("Login");
        loginLbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginLbl1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginLbl1MouseExited(evt);
            }
        });
        loginPane1.add(loginLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        header.add(loginPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 110, 33));

        joinPane.setBackground(new java.awt.Color(25, 25, 25));
        joinPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        joinLbl.setBackground(new java.awt.Color(25, 25, 25));
        joinLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        joinLbl.setForeground(new java.awt.Color(229, 4, 124));
        joinLbl.setText("JOIN NOW");
        joinLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                joinLblMouseClicked(evt);
            }
        });
        joinPane.add(joinLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        header.add(joinPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 110, 40));

        explorePane.setBackground(new java.awt.Color(27, 27, 27));
        explorePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exploreLbl1.setBackground(new java.awt.Color(27, 27, 27));
        exploreLbl1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        exploreLbl1.setForeground(new java.awt.Color(255, 255, 255));
        exploreLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exploreLbl1.setText("Explore");
        exploreLbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exploreLbl1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exploreLbl1MouseExited(evt);
            }
        });
        explorePane.add(exploreLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        header.add(explorePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 110, 33));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 60));

        registerPane.setBackground(new java.awt.Color(25, 25, 25));
        registerPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPane.setBackground(new java.awt.Color(25, 25, 25));
        loginPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLbl.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        loginLbl.setForeground(new java.awt.Color(255, 255, 255));
        loginLbl.setText("REGISTER");
        loginPane.add(loginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        registerPane.add(loginPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 60));

        passPane.setBackground(new java.awt.Color(25, 25, 25));
        passPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passLbl.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        passLbl.setForeground(new java.awt.Color(255, 255, 255));
        passLbl.setText("Password");
        passPane.add(passLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        passPane.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 40));

        registerPane.add(passPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 320, 70));

        userPane.setBackground(new java.awt.Color(25, 25, 25));
        userPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernametxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxfActionPerformed(evt);
            }
        });
        userPane.add(usernametxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        userPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        registerPane.add(userPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 320, 70));

        rememberPane.setBackground(new java.awt.Color(25, 25, 25));
        rememberPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        placeholderLbl.setFont(new java.awt.Font("Century Gothic", 2, 10)); // NOI18N
        placeholderLbl.setForeground(new java.awt.Color(255, 255, 255));
        placeholderLbl.setText("placeholder");
        rememberPane.add(placeholderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        loginBtn.setText("Login");
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        rememberPane.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        registerPane.add(rememberPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 320, 70));

        jPanel1.add(registerPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 460, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginLbl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLbl1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_loginLbl1MouseEntered

    private void loginLbl1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLbl1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_loginLbl1MouseExited

    private void joinLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinLblMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_joinLblMouseClicked

    private void exploreLbl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exploreLbl1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_exploreLbl1MouseEntered

    private void exploreLbl1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exploreLbl1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_exploreLbl1MouseExited

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void usernametxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxfActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:
        if (validateFields()) {
            JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Error messages are displayed in the validateFields method
        }
    }//GEN-LAST:event_loginBtnMouseClicked

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
            java.util.logging.Logger.getLogger(createUserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exploreLbl1;
    private javax.swing.JPanel explorePane;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel joinLbl;
    private javax.swing.JPanel joinPane;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JLabel loginLbl1;
    private javax.swing.JPanel loginPane;
    private javax.swing.JPanel loginPane1;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLbl;
    private javax.swing.JPanel passPane;
    private javax.swing.JLabel placeholderLbl;
    private javax.swing.JPanel registerPane;
    private javax.swing.JPanel rememberPane;
    private javax.swing.JPanel userPane;
    private javax.swing.JTextField usernametxf;
    // End of variables declaration//GEN-END:variables
}
