
package View;

import Controller.LoginController;
import Model.DAO.Banco;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends javax.swing.JFrame {
    private final LoginController controller;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        controller = new LoginController(this);
        Banco.inicia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTituloLogin = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        TextUsuario = new javax.swing.JTextField();
        LabelSenha = new javax.swing.JLabel();
        TextSenha = new javax.swing.JPasswordField();
        ButtonEntrar = new javax.swing.JButton();
        LabelLoginFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTituloLogin.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        LabelTituloLogin.setText("Login");
        getContentPane().add(LabelTituloLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 250, 40));

        LabelUsuario.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        LabelUsuario.setText("Usuario");
        getContentPane().add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 250, 40));

        TextUsuario.setBackground(new java.awt.Color(204, 204, 255));
        TextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 250, 30));

        LabelSenha.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        LabelSenha.setText("Senha");
        getContentPane().add(LabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 250, 40));

        TextSenha.setBackground(new java.awt.Color(204, 204, 255));
        TextSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 250, 30));

        ButtonEntrar.setBackground(new java.awt.Color(204, 204, 255));
        ButtonEntrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ButtonEntrar.setText("Entrar");
        ButtonEntrar.setToolTipText("");
        ButtonEntrar.setActionCommand("ButtonEntrar");
        ButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 310, 50));

        LabelLoginFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Logo.jpeg"))); // NOI18N
        getContentPane().add(LabelLoginFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUsuarioActionPerformed

    private void ButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrarActionPerformed
        //executa quando clico no botão
        //controller.fizTarefa();
        this.controller.entrarNoSistema();
    }//GEN-LAST:event_ButtonEntrarActionPerformed

    private void TextSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEntrar;
    private javax.swing.JLabel LabelLoginFundo;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LabelTituloLogin;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JTextField TextUsuario;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public JPasswordField getTextSenha() {
        return TextSenha;
    }

    public void setTextSenha(JPasswordField TextSenha) {
        this.TextSenha = TextSenha;
    }

    public JTextField getTextUsuario() {
        return TextUsuario;
    }

    public void setTextUsuario(JTextField TextUsuario) {
        this.TextUsuario = TextUsuario;
    }
    
    
    
}
