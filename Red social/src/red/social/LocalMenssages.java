/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package red.social;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import static red.social.FileManager.FRIENDS_FILE;
import static red.social.FileManager.SEPARADOR;
import static red.social.FileManager.pSEPARADOR;
import static red.social.FileManager.MESSAGE_FILE;
import red.social.Icons.ListIcon;

/**
 *
 * @author Krle__000
 */
public class LocalMenssages extends javax.swing.JFrame
{

   /**
    * Creates new form Menssages
    */
   public Profile myProfile;
   public String myUser;
   
   public LocalMenssages()
   {
      initComponents();
   }
   
   public void showFriends(){
      //show all the friends
      String[] friend;
      try{
         String myFriendsAB[] = FileManager.SearchByKey(FRIENDS_FILE, "0,2", myUser+",1").split(Pattern.quote(pSEPARADOR));
         for (int i = 0; i < myFriendsAB.length; i++)
         {
            friend = FileManager.SearchUser(myFriendsAB[i].split(Pattern.quote(SEPARADOR))[1]).split(Pattern.quote(SEPARADOR));
            Cb_friends.addItem(friend[0]);
         }
      }catch(Exception e){

      }
      
      try{
         String[] myFriendsBA = FileManager.SearchByKey(FRIENDS_FILE, "1,2", myUser+",1").split(Pattern.quote(pSEPARADOR));
         for (int i = 0; i < myFriendsBA.length; i++)
         {
            friend = FileManager.SearchUser(myFriendsBA[i].split(Pattern.quote(SEPARADOR))[0]).split(Pattern.quote(SEPARADOR));
            Cb_friends.addItem(friend[0]);
         }
      }catch(Exception e){
         
      }
      
      if(Cb_friends.getItemCount()==0){
         btn_Enviar.setEnabled(false);
      }
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jScrollPane5 = new javax.swing.JScrollPane();
      txt_message = new javax.swing.JTextArea();
      lbl_Galery1 = new javax.swing.JLabel();
      Cb_friends = new javax.swing.JComboBox<>();
      Cb_Private = new javax.swing.JComboBox<>();
      btn_Enviar = new javax.swing.JButton();
      jScrollPane6 = new javax.swing.JScrollPane();
      jList1 = new javax.swing.JList<>();
      lbl_Galery2 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      lbl_Return = new javax.swing.JLabel();
      lbl_Galery4 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jPanel1.setBackground(new java.awt.Color(55, 160, 166));

      jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/social/Icons/printRight.png"))); // NOI18N

      jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/social/Icons/printLeft.png"))); // NOI18N

      txt_message.setBackground(new java.awt.Color(204, 204, 255));
      txt_message.setColumns(20);
      txt_message.setFont(new java.awt.Font("Century Schoolbook", 0, 10)); // NOI18N
      txt_message.setRows(5);
      txt_message.addKeyListener(new java.awt.event.KeyAdapter()
      {
         public void keyTyped(java.awt.event.KeyEvent evt)
         {
            txt_messageKeyTyped(evt);
         }
      });
      jScrollPane5.setViewportView(txt_message);

      lbl_Galery1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
      lbl_Galery1.setForeground(new java.awt.Color(255, 255, 255));
      lbl_Galery1.setText("Escríbele a un amigo");

      Cb_friends.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N

      Cb_Private.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
      Cb_Private.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Público", "Privado" }));

      btn_Enviar.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
      btn_Enviar.setText("Enviar");
      btn_Enviar.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            btn_EnviarActionPerformed(evt);
         }
      });

      jList1.setBackground(new java.awt.Color(253, 211, 92));
      jList1.setFont(new java.awt.Font("Century Schoolbook", 0, 10)); // NOI18N
      jScrollPane6.setViewportView(jList1);

      lbl_Galery2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
      lbl_Galery2.setForeground(new java.awt.Color(255, 255, 255));
      lbl_Galery2.setText("Mensajes recibidos");

      jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(1, 74, 117));
      jLabel2.setText("Comparte con tus amigos Lynx!");

      lbl_Return.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
      lbl_Return.setForeground(new java.awt.Color(255, 255, 255));
      lbl_Return.setText("Regresar");
      lbl_Return.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            lbl_ReturnMouseClicked(evt);
         }
      });

      lbl_Galery4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
      lbl_Galery4.setForeground(new java.awt.Color(255, 255, 255));

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel1)
               .addComponent(jLabel4))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(lbl_Galery4)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                     .addComponent(lbl_Galery1)
                     .addGap(18, 18, 18)
                     .addComponent(Cb_friends, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addComponent(jScrollPane5)
                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                     .addComponent(Cb_Private, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(btn_Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(lbl_Galery2))
            .addGap(36, 36, 36))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(32, 32, 32)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_Return, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(lbl_Return))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(21, 21, 21)
                  .addComponent(jLabel2)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(50, 50, 50)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGap(1, 1, 1)
                              .addComponent(lbl_Galery1))
                           .addComponent(Cb_friends, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                           .addComponent(Cb_Private, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(btn_Enviar))))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(lbl_Galery4))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(lbl_Galery2)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(78, 78, 78))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void lbl_ReturnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_ReturnMouseClicked
   {//GEN-HEADEREND:event_lbl_ReturnMouseClicked
      // TODO add your handling code here:
      myProfile.setVisible(true);
      this.dispose();
   }//GEN-LAST:event_lbl_ReturnMouseClicked

   private void btn_EnviarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_EnviarActionPerformed
   {//GEN-HEADEREND:event_btn_EnviarActionPerformed
      // TODO add your handling code here:
      String isPublic;
      if (Cb_Private.getSelectedItem().equals("Privado"))
         isPublic = "1";
      else
          isPublic = "0";
      
      String register = myUser+SEPARADOR+Cb_friends.getSelectedItem() + SEPARADOR + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())+ SEPARADOR + txt_message.getText() + SEPARADOR + isPublic + SEPARADOR + "1"; 
      
      // Agregar al archivo el nuevo registro
      //FileManager.WriteFile(MESSAGE_FILE, register);
   }//GEN-LAST:event_btn_EnviarActionPerformed

   private void txt_messageKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_messageKeyTyped
   {//GEN-HEADEREND:event_txt_messageKeyTyped
      // TODO add your handling code here:
        if(txt_message.getText().length()>= 140){
            evt.consume();
        }
   }//GEN-LAST:event_txt_messageKeyTyped

   /**
    * @param args the command line arguments
    */
   public static void main(String args[])
   {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try
      {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
         {
            if ("Nimbus".equals(info.getName()))
            {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      }
      catch (ClassNotFoundException ex)
      {
         java.util.logging.Logger.getLogger(LocalMenssages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (InstantiationException ex)
      {
         java.util.logging.Logger.getLogger(LocalMenssages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (IllegalAccessException ex)
      {
         java.util.logging.Logger.getLogger(LocalMenssages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (javax.swing.UnsupportedLookAndFeelException ex)
      {
         java.util.logging.Logger.getLogger(LocalMenssages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            new LocalMenssages().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JComboBox<String> Cb_Private;
   private javax.swing.JComboBox<String> Cb_friends;
   private javax.swing.JButton btn_Enviar;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JList<String> jList1;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane5;
   private javax.swing.JScrollPane jScrollPane6;
   private javax.swing.JLabel lbl_Galery1;
   private javax.swing.JLabel lbl_Galery2;
   private javax.swing.JLabel lbl_Galery4;
   private javax.swing.JLabel lbl_Return;
   private javax.swing.JTextArea txt_message;
   // End of variables declaration//GEN-END:variables
}
