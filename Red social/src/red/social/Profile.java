/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package red.social;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import static red.social.FileManager.SEPARADOR;
import static red.social.FileManager.GROUPS_FILE;
import static red.social.FileManager.FRIENDS_FILE;
import red.social.Icons.Renderer;
import javax.swing.SwingUtilities;

/**
 *
 * @author Krle__000
 */
public class Profile extends javax.swing.JFrame {
    
    /**
     * Creates new form Profile
     * @param data
     */
   
   DefaultListModel groupList = new DefaultListModel();
   String RightClickGroup="";
   
    public Profile() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        ShowGroups();
           
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

      jScrollPane3 = new javax.swing.JScrollPane();
      jTextArea2 = new javax.swing.JTextArea();
      pm_Group = new javax.swing.JPopupMenu();
      mI_ShowGroup = new javax.swing.JMenuItem();
      mI_DeleteGroup = new javax.swing.JMenuItem();
      jPanel1 = new javax.swing.JPanel();
      txt_userInfo = new javax.swing.JTextField();
      txt_rolInfo = new javax.swing.JTextField();
      lbl_descripcion = new javax.swing.JLabel();
      jScrollPane2 = new javax.swing.JScrollPane();
      txt_descripcionInfo = new javax.swing.JTextArea();
      lbl_SesionOut = new javax.swing.JLabel();
      lbl_OutAccount = new javax.swing.JLabel();
      btn_settings = new javax.swing.JButton();
      jPanel2 = new javax.swing.JPanel();
      lbl_profilePic = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      List_Friends = new javax.swing.JList<>();
      jLabel2 = new javax.swing.JLabel();
      lbl_CreateGroup = new javax.swing.JLabel();
      lbl_SearchFriends = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jScrollPane4 = new javax.swing.JScrollPane();
      List_Groups = new javax.swing.JList<>();
      jLabel1 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      lbl_FriendRequest = new javax.swing.JLabel();

      jTextArea2.setColumns(20);
      jTextArea2.setRows(5);
      jScrollPane3.setViewportView(jTextArea2);

      pm_Group.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
      pm_Group.setForeground(new java.awt.Color(186, 100, 56));

      mI_ShowGroup.setBackground(new java.awt.Color(255, 255, 255));
      mI_ShowGroup.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
      mI_ShowGroup.setForeground(new java.awt.Color(186, 100, 56));
      mI_ShowGroup.setText("Información del grupo");
      mI_ShowGroup.setToolTipText("");
      mI_ShowGroup.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            mI_ShowGroupActionPerformed(evt);
         }
      });
      pm_Group.add(mI_ShowGroup);
      mI_ShowGroup.getAccessibleContext().setAccessibleName("Información del grupo");
      mI_ShowGroup.getAccessibleContext().setAccessibleDescription("");

      mI_DeleteGroup.setBackground(new java.awt.Color(255, 255, 255));
      mI_DeleteGroup.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
      mI_DeleteGroup.setForeground(new java.awt.Color(186, 100, 56));
      mI_DeleteGroup.setText("Eliminar grupo");
      mI_DeleteGroup.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            mI_DeleteGroupActionPerformed(evt);
         }
      });
      pm_Group.add(mI_DeleteGroup);
      mI_DeleteGroup.getAccessibleContext().setAccessibleName("Eliminar grupo");

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setUndecorated(true);
      setResizable(false);

      jPanel1.setBackground(new java.awt.Color(55, 160, 166));

      txt_userInfo.setEditable(false);
      txt_userInfo.setBackground(new java.awt.Color(255, 255, 255));
      txt_userInfo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
      txt_userInfo.setText("jTextField1");

      txt_rolInfo.setEditable(false);
      txt_rolInfo.setBackground(new java.awt.Color(255, 255, 255));
      txt_rolInfo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
      txt_rolInfo.setText("jTextField1");

      lbl_descripcion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
      lbl_descripcion.setForeground(new java.awt.Color(255, 255, 255));
      lbl_descripcion.setText("Descripción");

      txt_descripcionInfo.setEditable(false);
      txt_descripcionInfo.setColumns(20);
      txt_descripcionInfo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
      txt_descripcionInfo.setRows(5);
      jScrollPane2.setViewportView(txt_descripcionInfo);

      lbl_SesionOut.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
      lbl_SesionOut.setForeground(new java.awt.Color(255, 255, 255));
      lbl_SesionOut.setText("Cerrar Sesión");
      lbl_SesionOut.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            lbl_SesionOutMouseClicked(evt);
         }
      });

      lbl_OutAccount.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
      lbl_OutAccount.setForeground(new java.awt.Color(255, 255, 255));
      lbl_OutAccount.setText("Cerrar cuenta");
      lbl_OutAccount.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            lbl_OutAccountMouseClicked(evt);
         }
      });

      btn_settings.setMaximumSize(new java.awt.Dimension(25, 25));
      btn_settings.setMinimumSize(new java.awt.Dimension(25, 25));
      btn_settings.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            btn_settingsMouseClicked(evt);
         }
      });

      jPanel2.setBackground(new java.awt.Color(234, 104, 0));

      lbl_profilePic.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbl_profilePic, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbl_profilePic, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
            .addContainerGap())
      );

      List_Friends.setBackground(new java.awt.Color(253, 211, 92));
      jScrollPane1.setViewportView(List_Friends);

      jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(255, 255, 255));
      jLabel2.setText("         Mis amigos");

      lbl_CreateGroup.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
      lbl_CreateGroup.setForeground(new java.awt.Color(255, 255, 255));
      lbl_CreateGroup.setText("Crear grupo");
      lbl_CreateGroup.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            lbl_CreateGroupMouseClicked(evt);
         }
      });

      lbl_SearchFriends.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
      lbl_SearchFriends.setForeground(new java.awt.Color(255, 255, 255));
      lbl_SearchFriends.setText("Buscar más amigos");
      lbl_SearchFriends.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            lbl_SearchFriendsMouseClicked(evt);
         }
      });

      jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
      jLabel3.setForeground(new java.awt.Color(255, 255, 255));
      jLabel3.setText("        Mis grupos");

      List_Groups.setBackground(new java.awt.Color(253, 211, 92));
      List_Groups.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
      List_Groups.setForeground(new java.awt.Color(71, 79, 89));
      List_Groups.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            List_GroupsMouseClicked(evt);
         }
      });
      jScrollPane4.setViewportView(List_Groups);

      jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/social/Icons/printRight.png"))); // NOI18N

      jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/social/Icons/printLeft.png"))); // NOI18N

      lbl_FriendRequest.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
      lbl_FriendRequest.setForeground(new java.awt.Color(255, 255, 255));
      lbl_FriendRequest.setText("Solicitudes pendientes");
      lbl_FriendRequest.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            lbl_FriendRequestMouseClicked(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(lbl_FriendRequest)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(lbl_SearchFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(26, 26, 26)
                  .addComponent(lbl_CreateGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(lbl_SesionOut, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btn_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGap(45, 45, 45)
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(jLabel1)
                                 .addComponent(jLabel4))
                              .addGap(36, 36, 36)
                              .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(107, 107, 107))
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                              .addContainerGap()
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addComponent(txt_rolInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addComponent(txt_userInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addComponent(lbl_descripcion))
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_OutAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(20, 20, 20))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(btn_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(lbl_SesionOut, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(lbl_CreateGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(lbl_SearchFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(lbl_FriendRequest)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(28, 28, 28)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(txt_userInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(txt_rolInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(lbl_descripcion)
                  .addGap(20, 20, 20)
                  .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(25, 25, 25)
                  .addComponent(lbl_OutAccount))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(65, 65, 65)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(234, 234, 234)
                        .addComponent(jLabel3))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addContainerGap(22, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents
    
    public void ShowInfo(String data){
       if(data.split(Pattern.quote(SEPARADOR))[4].equals("1")){
          lbl_OutAccount.setVisible(false);
       }
        btn_settings.setIcon(new ImageIcon((new ImageIcon("src\\red\\social\\Icons\\settings.png")).getImage().getScaledInstance(23, 23,  java.awt.Image.SCALE_SMOOTH)));
        String userInformation[] = data.split(Pattern.quote(SEPARADOR));
        txt_userInfo.setText(userInformation[0]);
        lbl_profilePic.setIcon(new ImageIcon((new ImageIcon(userInformation[8])).getImage().getScaledInstance(165, 137,  java.awt.Image.SCALE_SMOOTH)));
        if (userInformation[4].equals("1"))
            txt_rolInfo.setText("Administrador");
        else
            txt_rolInfo.setText("No Administrador");
        txt_descripcionInfo.setText(userInformation[9]);
    }
    
    private void btn_settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_settingsMouseClicked
        // TODO add your handling code here:
        String actualUser[] = FileManager.SearchUser(RedSocial.ACTUALUSER).split(Pattern.quote(SEPARADOR));
        
        // Si el usuario no es administrador le muestra su menu donde se le indica lo que puede hacer 
        if ("0".equals(actualUser[4])){
            InformationEdit editMyInfo = new InformationEdit();
            editMyInfo.ShowInformation(RedSocial.ACTUALUSER);
            editMyInfo.setVisible(true); 
        }
        
        // Si ES administrador se le muestra el menu donde se le muestra lo que puede ha
        else{
            RedSocial.SettingsAdminController();
            this.dispose();
        }
            
        
    }//GEN-LAST:event_btn_settingsMouseClicked

   private void lbl_SesionOutMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_SesionOutMouseClicked
   {//GEN-HEADEREND:event_lbl_SesionOutMouseClicked
      // TODO add your handling code here:
      RedSocial.LoginController();
      this.dispose();
   }//GEN-LAST:event_lbl_SesionOutMouseClicked

   private void lbl_OutAccountMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_OutAccountMouseClicked
   {//GEN-HEADEREND:event_lbl_OutAccountMouseClicked
      // TODO add your handling code here:
       RedSocial.Delete(RedSocial.ACTUALUSER);
        RedSocial.ACTUALUSER = ""; // Vacio la variable de usuario actual porque se elimino cuenta
        this.dispose();
        RedSocial.LoginController();
   }//GEN-LAST:event_lbl_OutAccountMouseClicked

   private void lbl_CreateGroupMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_CreateGroupMouseClicked
   {//GEN-HEADEREND:event_lbl_CreateGroupMouseClicked
      // TODO add your handling code here:
      FriendsGroups myGroups = new FriendsGroups();
      myGroups.setVisible(true);
      myGroups.myProfile = this;
      myGroups.myUser = txt_userInfo.getText();
      this.setVisible(false);  
   }//GEN-LAST:event_lbl_CreateGroupMouseClicked

   private void lbl_SearchFriendsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_SearchFriendsMouseClicked
   {//GEN-HEADEREND:event_lbl_SearchFriendsMouseClicked
      // TODO add your handling code here:
      SearchMoreFriends moreFriends = new SearchMoreFriends();
      moreFriends.setVisible(true);
      moreFriends.myProfile = this;
      this.setVisible(false);  
   }//GEN-LAST:event_lbl_SearchFriendsMouseClicked

   private void lbl_FriendRequestMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_FriendRequestMouseClicked
   {//GEN-HEADEREND:event_lbl_FriendRequestMouseClicked
      // TODO add your handling code here:
      FriendRequest newRequest = new FriendRequest();
      newRequest.setVisible(true);
      newRequest.myProfile = this;
      this.setVisible(false);
   }//GEN-LAST:event_lbl_FriendRequestMouseClicked

   private void mI_ShowGroupActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mI_ShowGroupActionPerformed
   {//GEN-HEADEREND:event_mI_ShowGroupActionPerformed
      // TODO add your handling code here:
      SeeGroupsAdministrator SeeGroup = new SeeGroupsAdministrator();
      SeeGroup.FillComponents(txt_userInfo.getText(), RightClickGroup, this);
      SeeGroup.setVisible(true);
      this.setVisible(false);
      
   }//GEN-LAST:event_mI_ShowGroupActionPerformed

   private void mI_DeleteGroupActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mI_DeleteGroupActionPerformed
   {//GEN-HEADEREND:event_mI_DeleteGroupActionPerformed
      // TODO add your handling code here:
      FileManager.Update(GROUPS_FILE, OldGroupForDelete());
      groupList.removeElement(RightClickGroup);
   }//GEN-LAST:event_mI_DeleteGroupActionPerformed

   private void List_GroupsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_List_GroupsMouseClicked
   {//GEN-HEADEREND:event_List_GroupsMouseClicked
      // TODO add your handling code here://      if(evt.isPopupTrigger()){
         int index = List_Groups.locationToIndex(evt.getPoint());
         if(index!=-1){
            pm_Group.show(List_Groups,evt.getX(), evt.getY());
            RightClickGroup = FileManager.SearchGroup(txt_userInfo.getText(), groupList.elementAt(index).toString()).split(Pattern.quote(SEPARADOR))[1];
         }
   }//GEN-LAST:event_List_GroupsMouseClicked

   private String OldGroupForDelete(){
      String[] old = FileManager.SearchGroup(txt_userInfo.getText(), RightClickGroup).split(Pattern.quote(SEPARADOR));
      return old[0]+SEPARADOR+old[1]+SEPARADOR+old[2]+SEPARADOR+old[3]+SEPARADOR+old[4]+SEPARADOR+"0";
   }
   private void ShowGroups(){
      //Si el archivo de grupos existe agregar en la lista todos los grupos de esta persona
      groupList.addElement("Amigos");
      groupList.addElement("Universidad");
      List_Groups.setModel(groupList);
   }
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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JList<String> List_Friends;
   private javax.swing.JList<String> List_Groups;
   private javax.swing.JButton btn_settings;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JScrollPane jScrollPane4;
   private javax.swing.JTextArea jTextArea2;
   private javax.swing.JLabel lbl_CreateGroup;
   private javax.swing.JLabel lbl_FriendRequest;
   private javax.swing.JLabel lbl_OutAccount;
   private javax.swing.JLabel lbl_SearchFriends;
   private javax.swing.JLabel lbl_SesionOut;
   private javax.swing.JLabel lbl_descripcion;
   private javax.swing.JLabel lbl_profilePic;
   private javax.swing.JMenuItem mI_DeleteGroup;
   private javax.swing.JMenuItem mI_ShowGroup;
   private javax.swing.JPopupMenu pm_Group;
   private javax.swing.JTextArea txt_descripcionInfo;
   private javax.swing.JTextField txt_rolInfo;
   private javax.swing.JTextField txt_userInfo;
   // End of variables declaration//GEN-END:variables
}
