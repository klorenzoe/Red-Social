/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package red.social;
import java.awt.Dimension;
import java.awt.Toolkit;
import static red.social.RedSocial.Background;
import static red.social.RedSocial.SEPARADOR;

import java.util.regex.Pattern;

/**
 *
 * @author Krle__000
 */
public class Login extends javax.swing.JFrame {

    /** Creates new form Login */
    public Login() {
        initComponents();
        this.getContentPane().setBackground(Background);
        this.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        lbl_LoginError.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jLabel3 = new javax.swing.JLabel();
      txt_user = new javax.swing.JTextField();
      jLabel4 = new javax.swing.JLabel();
      txt_password = new javax.swing.JPasswordField();
      btn_SingUp = new javax.swing.JLabel();
      btn_SignIn = new javax.swing.JButton();
      lbl_LoginError = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setBackground(new java.awt.Color(9, 33, 64));
      setMaximumSize(new java.awt.Dimension(314, 300));

      jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
      jLabel3.setText("Usuario");

      txt_user.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

      jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
      jLabel4.setText("Contraseña");

      txt_password.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

      btn_SingUp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
      btn_SingUp.setText("Registrarse");
      btn_SingUp.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            btn_SingUpMouseClicked(evt);
         }
      });

      btn_SignIn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
      btn_SignIn.setText("Iniciar sesión");
      btn_SignIn.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            btn_SignInActionPerformed(evt);
         }
      });

      lbl_LoginError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
      lbl_LoginError.setForeground(new java.awt.Color(204, 0, 0));
      lbl_LoginError.setText("El usuario o contraseña son inválidos");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_SingUp)
            .addGap(28, 28, 28))
         .addGroup(layout.createSequentialGroup()
            .addGap(69, 69, 69)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(btn_SignIn)
                     .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel4)
                     .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(120, 120, 120))
               .addComponent(lbl_LoginError))
            .addGap(0, 156, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btn_SingUp)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(35, 35, 35)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(27, 27, 27)
            .addComponent(btn_SignIn)
            .addGap(22, 22, 22)
            .addComponent(lbl_LoginError)
            .addGap(93, 93, 93))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void btn_SingUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SingUpMouseClicked
        // TODO add your handling code here:
        RedSocial.RegisterController().Login(this);
    }//GEN-LAST:event_btn_SingUpMouseClicked

    private void btn_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignInActionPerformed
        // TODO add your handling code here:
        String User = FileManager.Search(txt_user.getText());
        RedSocial.ACTUALUSER = txt_user.getText(); // Guardo usuario actual a variable, esta debera de vaciarse cuando usuario cambie nombre de usuario o cuando cierre sesion
        try{
         if(User!=null){
           if(RedSocial.MD5(txt_password.getText()).equals(User.split(Pattern.quote(SEPARADOR))[3])){
              RedSocial.ProfileController(User);
              this.setVisible(false);
              this.dispose();
           }
        }
        }catch(Exception e){
           
        }
        lbl_LoginError.setVisible(true);
    }//GEN-LAST:event_btn_SignInActionPerformed

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
   private javax.swing.JButton btn_SignIn;
   private javax.swing.JLabel btn_SingUp;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel lbl_LoginError;
   private javax.swing.JPasswordField txt_password;
   private javax.swing.JTextField txt_user;
   // End of variables declaration//GEN-END:variables

}
