/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package red.social;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.nio.file.StandardCopyOption;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.regex.Pattern;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static red.social.RedSocial.IMAGES;
import static red.social.RedSocial.DIRECTORY;
import static red.social.RedSocial.USER_FILE;
import static red.social.RedSocial.BINNACLE;
import static red.social.RedSocial.Length;
import static red.social.Register.UserLength;
import static red.social.Register.PasswordLength;
import static red.social.Register.EmailLength;
import static red.social.Register.PhoneNumberLength;
import static red.social.RedSocial.SEPARADOR;
import static red.social.RedSocial.Background;

public class InformationEdit extends javax.swing.JFrame
{

   /**
    * Creates new form InformationEdit
    */
   public static String PicturePath="";
   public boolean isManager=false;
   static int frameType;
    String userToEdit;
    String userToEditArray[];
    
    
   public InformationEdit()
   {
      initComponents();
      this.getContentPane().setBackground(Background);
      InvisibleComponents();
      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
      this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);   
   }
   
   public void ShowInformation(String userToEdit_){
      userToEdit = userToEdit_;
      userToEditArray = FileManager.Search(userToEdit).split(Pattern.quote(SEPARADOR));
      InitializeComponents();
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

      buttonGroup1 = new javax.swing.ButtonGroup();
      buttonGroup2 = new javax.swing.ButtonGroup();
      lbl_UserError = new javax.swing.JLabel();
      jLabel1 = new javax.swing.JLabel();
      txt_User = new javax.swing.JTextField();
      lbl_Level = new javax.swing.JLabel();
      lbl_PasswordCheckedError = new javax.swing.JLabel();
      txt_Password = new javax.swing.JPasswordField();
      txt_CheckPassword = new javax.swing.JPasswordField();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jLabel7 = new javax.swing.JLabel();
      txt_Mail = new javax.swing.JTextField();
      lbl_MailError = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      txt_PhoneNumber = new javax.swing.JTextField();
      lbl_NumberPhoneError = new javax.swing.JLabel();
      jLabel9 = new javax.swing.JLabel();
      jLabel10 = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      txt_Description = new javax.swing.JTextArea();
      jLabel8 = new javax.swing.JLabel();
      btn_FindPicture = new javax.swing.JButton();
      lbl_PictureError = new javax.swing.JLabel();
      lbl_PicturePath = new javax.swing.JLabel();
      btn_Edit = new javax.swing.JButton();
      jButton1 = new javax.swing.JButton();
      Rb_Admin = new javax.swing.JRadioButton();
      Rb_User = new javax.swing.JRadioButton();
      Dp_Birthday = new org.jdesktop.swingx.JXDatePicker();
      lbl_BirthdayError = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

      lbl_UserError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      lbl_UserError.setForeground(new java.awt.Color(204, 0, 0));
      lbl_UserError.setText("El usuario ya existe");

      jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      jLabel1.setText("Usuario");

      txt_User.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
      txt_User.addKeyListener(new java.awt.event.KeyAdapter()
      {
         public void keyTyped(java.awt.event.KeyEvent evt)
         {
            txt_UserKeyTyped(evt);
         }
      });

      lbl_Level.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      lbl_Level.setForeground(new java.awt.Color(204, 0, 0));
      lbl_Level.setText("jLabel9");

      lbl_PasswordCheckedError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      lbl_PasswordCheckedError.setForeground(new java.awt.Color(204, 0, 0));
      lbl_PasswordCheckedError.setText("Inválida");

      txt_Password.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
      txt_Password.addKeyListener(new java.awt.event.KeyAdapter()
      {
         public void keyReleased(java.awt.event.KeyEvent evt)
         {
            txt_PasswordKeyReleased(evt);
         }
         public void keyTyped(java.awt.event.KeyEvent evt)
         {
            txt_PasswordKeyTyped(evt);
         }
      });

      txt_CheckPassword.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
      txt_CheckPassword.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            txt_CheckPasswordActionPerformed(evt);
         }
      });
      txt_CheckPassword.addKeyListener(new java.awt.event.KeyAdapter()
      {
         public void keyTyped(java.awt.event.KeyEvent evt)
         {
            txt_CheckPasswordKeyTyped(evt);
         }
      });

      jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      jLabel4.setText("Confirmar contraseña");

      jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      jLabel5.setText("Contraseña");

      jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      jLabel7.setText("Correo");

      txt_Mail.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
      txt_Mail.addKeyListener(new java.awt.event.KeyAdapter()
      {
         public void keyTyped(java.awt.event.KeyEvent evt)
         {
            txt_MailKeyTyped(evt);
         }
      });

      lbl_MailError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      lbl_MailError.setForeground(new java.awt.Color(204, 0, 0));
      lbl_MailError.setText("Es necesario un correo");

      jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      jLabel6.setText("Teléfono");

      txt_PhoneNumber.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
      txt_PhoneNumber.addKeyListener(new java.awt.event.KeyAdapter()
      {
         public void keyTyped(java.awt.event.KeyEvent evt)
         {
            txt_PhoneNumberKeyTyped(evt);
         }
      });

      lbl_NumberPhoneError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      lbl_NumberPhoneError.setForeground(new java.awt.Color(204, 0, 0));
      lbl_NumberPhoneError.setText("Es necesario un teléfono correcto");

      jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      jLabel9.setText("Fecha de nacimiento");

      jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      jLabel10.setText("Descripción");

      txt_Description.setColumns(20);
      txt_Description.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
      txt_Description.setRows(5);
      txt_Description.addKeyListener(new java.awt.event.KeyAdapter()
      {
         public void keyPressed(java.awt.event.KeyEvent evt)
         {
            txt_DescriptionKeyPressed(evt);
         }
         public void keyTyped(java.awt.event.KeyEvent evt)
         {
            txt_DescriptionKeyTyped(evt);
         }
      });
      jScrollPane1.setViewportView(txt_Description);

      jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      jLabel8.setText("Seleccionar foto");

      btn_FindPicture.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      btn_FindPicture.setText("Buscar");
      btn_FindPicture.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            btn_FindPictureActionPerformed(evt);
         }
      });

      lbl_PictureError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      lbl_PictureError.setForeground(new java.awt.Color(204, 0, 0));
      lbl_PictureError.setText("Es necesaria una imagen de perfil");

      lbl_PicturePath.setBackground(new java.awt.Color(255, 255, 255));
      lbl_PicturePath.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      lbl_PicturePath.setText("Foto");

      btn_Edit.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      btn_Edit.setText("Editar");
      btn_Edit.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            btn_EditMouseClicked(evt);
         }
      });
      btn_Edit.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            btn_EditActionPerformed(evt);
         }
      });

      jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      jButton1.setText("Cancelar");
      jButton1.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            jButton1ActionPerformed(evt);
         }
      });

      Rb_Admin.setText("Administrador");
      Rb_Admin.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            Rb_AdminActionPerformed(evt);
         }
      });

      Rb_User.setText("Usuario");
      Rb_User.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            Rb_UserActionPerformed(evt);
         }
      });

      lbl_BirthdayError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
      lbl_BirthdayError.setForeground(new java.awt.Color(204, 0, 0));
      lbl_BirthdayError.setText("Escoja una fecha");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(0, 0, Short.MAX_VALUE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(btn_Edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel5)
                           .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel4)
                           .addComponent(jLabel7)
                           .addComponent(jLabel6))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(txt_User, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                              .addComponent(txt_Password)
                              .addComponent(txt_CheckPassword))
                           .addComponent(txt_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(txt_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(lbl_PasswordCheckedError)
                           .addComponent(lbl_Level, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(lbl_UserError)
                           .addComponent(lbl_MailError)
                           .addComponent(lbl_NumberPhoneError)))
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(Dp_Birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_BirthdayError, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(lbl_PicturePath, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGroup(layout.createSequentialGroup()
                              .addComponent(jLabel8)
                              .addGap(29, 29, 29)
                              .addComponent(btn_FindPicture)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(lbl_PictureError))
                           .addGroup(layout.createSequentialGroup()
                              .addGap(2, 2, 2)
                              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                           .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                              .addComponent(Rb_User, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(Rb_Admin, javax.swing.GroupLayout.Alignment.LEADING)))))
                  .addGap(0, 69, Short.MAX_VALUE)))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel1)
               .addComponent(txt_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(lbl_UserError))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel5)
               .addComponent(lbl_Level))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(txt_CheckPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(lbl_PasswordCheckedError))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txt_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel7)
               .addComponent(lbl_MailError))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txt_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel6)
               .addComponent(lbl_NumberPhoneError))
            .addGap(27, 27, 27)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(Dp_Birthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(lbl_BirthdayError))
            .addGap(29, 29, 29)
            .addComponent(Rb_Admin)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Rb_User)
            .addGap(32, 32, 32)
            .addComponent(jLabel10)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel8)
               .addComponent(btn_FindPicture)
               .addComponent(lbl_PictureError))
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addComponent(btn_Edit)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(jButton1)
                  .addGap(28, 28, 28))
               .addComponent(lbl_PicturePath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(57, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void txt_UserKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_UserKeyTyped
   {//GEN-HEADEREND:event_txt_UserKeyTyped
      // TODO add your handling code here:
      if(txt_User.getText().length()>= UserLength)
      {
         evt.consume();
      }
   }//GEN-LAST:event_txt_UserKeyTyped

   private void txt_PasswordKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_PasswordKeyReleased
   {//GEN-HEADEREND:event_txt_PasswordKeyReleased
      // TODO add your handling code here:
      if(txt_Password.getText().isEmpty())
      {
         lbl_Level.setVisible(false);

      }

      if(txt_Password.getText().length()>0 && txt_Password.getText().length()<6)
      {
         lbl_Level.setForeground(Color.ORANGE);
         lbl_Level.setText("Tiene que ser mayor de 6 caracteres");
         lbl_Level.setVisible(true);
      }else
      {
         // txt_Password.setEnabled(false);
         int puntuation=0;
         int Letters = Letters(txt_Password.getText());
         int Numbers = Numbers(txt_Password.getText());

         if(txt_Password.getText().length() == Letters)
         {
            puntuation=6;
         }else
         {
            if(txt_Password.getText().length() == Numbers)
            {
               puntuation=3;
            }else
            {
               puntuation = 3*txt_Password.getText().length();
               puntuation+=2*PowerLetters(txt_Password.getText());
               puntuation+= 1+ Letters;
               puntuation+= Numbers + 2;
               puntuation+=(txt_Password.getText().length()-Letters-Numbers)+ 4;
            }
         }
         PasswordLevel(puntuation);
         txt_Password.setEnabled(true);
      }
   }//GEN-LAST:event_txt_PasswordKeyReleased

   private void txt_PasswordKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_PasswordKeyTyped
   {//GEN-HEADEREND:event_txt_PasswordKeyTyped
      // TODO add your handling code here:
      if(txt_Password.getText().length()>= PasswordLength)
      {
         evt.consume();
      }
   }//GEN-LAST:event_txt_PasswordKeyTyped

   private void txt_CheckPasswordKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_CheckPasswordKeyTyped
   {//GEN-HEADEREND:event_txt_CheckPasswordKeyTyped
      // TODO add your handling code here:
      if(txt_CheckPassword.getText().length()>= PasswordLength)
      {
         evt.consume();
      }
   }//GEN-LAST:event_txt_CheckPasswordKeyTyped

   private void txt_MailKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_MailKeyTyped
   {//GEN-HEADEREND:event_txt_MailKeyTyped
      // TODO add your handling code here:
      if(txt_Mail.getText().length()>= EmailLength)
      {
         evt.consume();
      }
   }//GEN-LAST:event_txt_MailKeyTyped

   private void txt_PhoneNumberKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_PhoneNumberKeyTyped
   {//GEN-HEADEREND:event_txt_PhoneNumberKeyTyped
      // TODO add your handling code here:
      if(txt_PhoneNumber.getText().length()>= PhoneNumberLength)
      {
         evt.consume();
      }
   }//GEN-LAST:event_txt_PhoneNumberKeyTyped

   private void txt_DescriptionKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_DescriptionKeyPressed
   {//GEN-HEADEREND:event_txt_DescriptionKeyPressed
      // TODO add your handling code here:
      if(evt.getKeyCode()== java.awt.event.KeyEvent.VK_ENTER )
      {
         evt.consume();
      }
   }//GEN-LAST:event_txt_DescriptionKeyPressed

   private void txt_DescriptionKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_DescriptionKeyTyped
   {//GEN-HEADEREND:event_txt_DescriptionKeyTyped
      // TODO add your handling code here:
      if(txt_Description.getText().length()>=100)
      {
         evt.consume();
      }
   }//GEN-LAST:event_txt_DescriptionKeyTyped

   private void btn_FindPictureActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_FindPictureActionPerformed
   {//GEN-HEADEREND:event_btn_FindPictureActionPerformed
      // TODO add your handling code here:
      try
      {
         JFileChooser Images = new JFileChooser();
         Images.setFileFilter(new FileNameExtensionFilter("Image Files", "gif","jpg","jpeg","png"));
         Images.setAcceptAllFileFilterUsed(false);
         Images.showOpenDialog(Images);
         String Path = Images.getSelectedFile().getAbsolutePath();
         String Name = Path.split(Pattern.quote("\\"))[Path.split(Pattern.quote("\\")).length-1];
            ImageExistInMEIA(Name); //It returns a booleean about If exist a image with the same name
            CopyImagesToMEIA(Path, DIRECTORY+IMAGES+"\\"+Name);
               lbl_PicturePath.setText("");
               lbl_PicturePath.setIcon(new ImageIcon((new ImageIcon(PicturePath)).getImage().getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH)));

            }catch(Exception e)
            {
            }
   }//GEN-LAST:event_btn_FindPictureActionPerformed

   private void btn_EditMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_EditMouseClicked
   {//GEN-HEADEREND:event_btn_EditMouseClicked
      // TODO add your handling code here:
      if(IsDataValid())
      {
         String Data = CreateUser();
         if(!(txt_User.getText().equals(userToEditArray[0]))){
            userToEditArray[10] = "0";
            FileManager.Update(RedSocial.Fill(joinArray(userToEditArray), Length)); //it is logic erasered.
            FileManager.WriteFile(USER_FILE, RedSocial.Fill(Data, Length));
         }else{
            FileManager.Update(RedSocial.Fill(Data, Length));
         }
         this.setVisible(false);
      }
   }//GEN-LAST:event_btn_EditMouseClicked

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
   {//GEN-HEADEREND:event_jButton1ActionPerformed
      // TODO add your handling code here:
      this.setVisible(false);
   }//GEN-LAST:event_jButton1ActionPerformed

   private void txt_CheckPasswordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txt_CheckPasswordActionPerformed
   {//GEN-HEADEREND:event_txt_CheckPasswordActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txt_CheckPasswordActionPerformed

   private void Rb_UserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Rb_UserActionPerformed
   {//GEN-HEADEREND:event_Rb_UserActionPerformed
      // TODO add your handling code here:
      Rb_Admin.setSelected(false);
      Rb_User.setSelected(true);
   }//GEN-LAST:event_Rb_UserActionPerformed

   private void btn_EditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_EditActionPerformed
   {//GEN-HEADEREND:event_btn_EditActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_btn_EditActionPerformed

   private void Rb_AdminActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Rb_AdminActionPerformed
   {//GEN-HEADEREND:event_Rb_AdminActionPerformed
      // TODO add your handling code here:
      Rb_Admin.setSelected(true);
      Rb_User.setSelected(false);
   }//GEN-LAST:event_Rb_AdminActionPerformed

   private boolean ImageExistInMEIA(String Name){
        File ImageDir = new File(DIRECTORY+IMAGES);
        if(!ImageDir.exists()){
            ImageDir.getAbsoluteFile().mkdir();
            return false;
        }else{
            File Image = new File(DIRECTORY+""+IMAGES+"\\"+Name);
            if(Image.exists()){
                return true;
            }
            return false;
        }
    }
    
    private void CopyImagesToMEIA (String Origin, String Destiny)    {
        try {
                Path origenPath = Paths.get(Origin);
                Path destinoPath = Paths.get(Destiny);
                Files.copy(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
                //This rename the picture
                File Picture = new File(Destiny);
                File Last = new File(PicturePath);
                Last.delete();
                File NewName = new File(PicturePath);
                Picture.renameTo(NewName);
                //PicturePath = NewName.getAbsolutePath();
        } catch(Exception e){
                
            }
    }
    
    private int PowerLetters(String sequence){
        int count=0;
        for (int i = 0; i < sequence.length(); i++) {
            if("QWERTYUIOPASDFGHJKLÑZXCVBNM".indexOf(sequence.charAt(i))!=-1){
                count++;
            }
        }
        return count;
    }
    
    private int Letters(String sequence){
        int count =0;
         for (int i = 0; i < sequence.length(); i++) {
            if("QWERTYUIOPASDFGHJKLÑZXCVBNMqwertyuiopasdfghjklñzxcvbnm".indexOf(sequence.charAt(i))!=-1){
                count++;
            }
        }
        return count;
    }
    
    private int Numbers(String sequence){
        int count =0;
         for (int i = 0; i < sequence.length(); i++) {
            if("1234567890".indexOf(sequence.charAt(i))!=-1){
                count++;
            }
        }
        return count;
    }
    
    private void PasswordLevel(int puntuation){
        if(puntuation<=25){
            //insegura
            lbl_Level.setForeground(Color.RED);
            lbl_Level.setText("Contraseña insegura");
        }else{
            if(puntuation<=35){
                //poco segura
                lbl_Level.setForeground(Color.ORANGE);
                lbl_Level.setText("Contraseña poco segura");
            }else{
                if(puntuation<=50){
                    //segura
                    lbl_Level.setForeground(Color.BLUE);
                    lbl_Level.setText("Contraseña segura");
                }else{
                    if(puntuation<=100){
                        //muy segura
                        lbl_Level.setForeground(Color.GREEN);
                        lbl_Level.setText("Contraseña muy segura");
                    }
                }
            }
        }
    }
    
     private String CreateUser(){
       try{
        return (txt_User.getText()+SEPARADOR+ userToEditArray[1]+SEPARADOR+ userToEditArray[2]+SEPARADOR+ ValidPassword()+SEPARADOR+ ReturnRol()+SEPARADOR+Dp_Birthday.getDate().toString()+SEPARADOR+ txt_Mail.getText()+SEPARADOR+ txt_PhoneNumber.getText()+SEPARADOR+ PicturePath+SEPARADOR+ txt_Description.getText() +SEPARADOR+"1");   
       }catch(Exception e){
          return "";
       }
      }
     
     private String ValidPassword(){
        if(txt_Password.getText().isEmpty()){
           return userToEditArray[3];
        }else{
           try{
              return RedSocial.MD5(txt_Password.getText());
           }catch(Exception e){
              return "";
           }
        }
     }
   
    private String joinArray(String Array[]){
       String newData ="";
       for (int i = 0; i < Array.length-1; i++)
       {
          newData += Array[i]+SEPARADOR;
       }
       return newData.substring(0, newData.length()-1);
    }
    private boolean IsDataValid(){
       
       if(!(txt_User.getText().equals(userToEditArray[0]))){
          if(FileManager.FileExists(BINNACLE +USER_FILE)){
            if(FileManager.Search(txt_User.getText())!=null){
              lbl_UserError.setVisible(true);
              return false; 
            }
          }
       }
       
        if(lbl_Level.getText().equals("Contraseña insegura") || lbl_Level.getText().equals("Tiene que ser mayor de 6 caracteres")){
            txt_Password.setBackground(Color.RED);
            return false;}
        if(!(txt_CheckPassword.getText().equals(txt_Password.getText()))){
            lbl_PasswordCheckedError.setVisible(true);
            return false;
        }
        if(txt_Mail.getText().isEmpty()){
            lbl_MailError.setVisible(true);
            return false;
        }else{
           try{
              if(txt_Mail.getText().split(Pattern.quote("@")).length !=2 || txt_Mail.getText().split(Pattern.quote("@"))[0].isEmpty() || txt_Mail.getText().split(Pattern.quote("@"))[1].isEmpty()){
                 lbl_MailError.setText("Es necesario un correo válido");
                 lbl_MailError.setVisible(true);
                 return false;
              }
           }catch(Exception e){
              
           }
        }
        if(txt_PhoneNumber.getText().isEmpty()){
            lbl_NumberPhoneError.setVisible(true);
            lbl_NumberPhoneError.setText("Es necesario un número telefónico");
            return false;
        }
        try{
            if(txt_PhoneNumber.getText().length()<8){
                lbl_NumberPhoneError.setVisible(true);
                return false;
            }
            Integer.parseInt(txt_PhoneNumber.getText());
        }catch(Exception e){
            lbl_NumberPhoneError.setVisible(true);
            return false;
        }
        if(Dp_Birthday.getDate().toString().isEmpty()){
           lbl_BirthdayError.setVisible(true);
           return false;
        }
        if(PicturePath.equals("")){
            lbl_PictureError.setVisible(true);
            return false;
        }
        return true;
    }
   
     private void InvisibleComponents(){
        lbl_Level.setVisible(false);
        lbl_UserError.setVisible(false);
        lbl_PasswordCheckedError.setVisible(false);
        lbl_MailError.setVisible(false);
        lbl_NumberPhoneError.setVisible(false);
        lbl_PictureError.setVisible(false);
        txt_Password.setBackground(Color.WHITE);
        lbl_BirthdayError.setVisible(false);
    }
     
     private void InitializeComponents(){
        
           txt_User.setText(userToEditArray[0]);
        txt_Mail.setText(userToEditArray[6]);
        txt_PhoneNumber.setText(userToEditArray[7]);
        txt_Description.setText(userToEditArray[9]);
        PicturePath = userToEditArray[8];
        lbl_PicturePath.setText("");
        lbl_PicturePath.setIcon(new ImageIcon((new ImageIcon(PicturePath)).getImage().getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH)));
      
        if(userToEditArray[4].equals("0")){
           Rb_User.setSelected(true);
           Rb_Admin.setSelected(false);
        }else{
           Rb_User.setSelected(false);
           Rb_Admin.setSelected(true);
        }
        
        if(!isManager || userToEditArray[4].equals("1")){
              Rb_Admin.setEnabled(false);
              Rb_User.setEnabled(false);
        }
        try{
           Dp_Birthday.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(userToEditArray[5]));
        
        }catch(Exception e){
           
        }
    }
     
     private String ReturnRol(){
        return Rb_Admin.isSelected() ? "1":"0";
     }
     
     public void isManager(boolean is){
        isManager = is;
     }
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
         java.util.logging.Logger.getLogger(InformationEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (InstantiationException ex)
      {
         java.util.logging.Logger.getLogger(InformationEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (IllegalAccessException ex)
      {
         java.util.logging.Logger.getLogger(InformationEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (javax.swing.UnsupportedLookAndFeelException ex)
      {
         java.util.logging.Logger.getLogger(InformationEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            new InformationEdit().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private org.jdesktop.swingx.JXDatePicker Dp_Birthday;
   private javax.swing.JRadioButton Rb_Admin;
   private javax.swing.JRadioButton Rb_User;
   private javax.swing.JButton btn_Edit;
   private javax.swing.JButton btn_FindPicture;
   private javax.swing.ButtonGroup buttonGroup1;
   private javax.swing.ButtonGroup buttonGroup2;
   private javax.swing.JButton jButton1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JLabel lbl_BirthdayError;
   private javax.swing.JLabel lbl_Level;
   private javax.swing.JLabel lbl_MailError;
   private javax.swing.JLabel lbl_NumberPhoneError;
   private javax.swing.JLabel lbl_PasswordCheckedError;
   private javax.swing.JLabel lbl_PictureError;
   private javax.swing.JLabel lbl_PicturePath;
   private javax.swing.JLabel lbl_UserError;
   private javax.swing.JPasswordField txt_CheckPassword;
   private javax.swing.JTextArea txt_Description;
   private javax.swing.JTextField txt_Mail;
   private javax.swing.JPasswordField txt_Password;
   private javax.swing.JTextField txt_PhoneNumber;
   private javax.swing.JTextField txt_User;
   // End of variables declaration//GEN-END:variables
}
