package loginandsignup;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1_Name_ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2_Email_ = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1_Pswrd_ = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jButton1_SignUp_ = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\RASHIKA GUPTA\\Documents\\NetBeansProjects\\LoginAndSignUp\\src\\Icon\\logo3.png")); // NOI18N

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digital Diary");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("SIGN UP");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Full Name");

        jTextField1_Name_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1_Name_.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1_Name_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_Name_ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Email");

        jTextField2_Email_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2_Email_.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2_Email_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_Email_ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Password");

        jPasswordField1_Pswrd_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField1_Pswrd_.setForeground(new java.awt.Color(102, 102, 102));

        jLabel7.setText("I've an account");

        jButton1_SignUp_.setBackground(new java.awt.Color(0, 102, 102));
        jButton1_SignUp_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1_SignUp_.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_SignUp_.setText("Sign Up");
        jButton1_SignUp_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_SignUp_ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(156, 156, 156))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jTextField1_Name_)
                        .addComponent(jLabel5)
                        .addComponent(jTextField2_Email_, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addComponent(jPasswordField1_Pswrd_))
                    .addComponent(jButton1_SignUp_, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(11, 11, 11)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1_Name_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2_Email_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1_Pswrd_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1_SignUp_, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jLabel7)))
                .addGap(117, 117, 117))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_Name_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_Name_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_Name_ActionPerformed

    private void jTextField2_Email_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_Email_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_Email_ActionPerformed

    private void jButton1_SignUp_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SignUp_ActionPerformed
        
            // TODO add your handling code here:
            String Name = jTextField1_Name_.getText();
            String Email = jTextField2_Email_.getText();
            String Pswrd = String.valueOf(jPasswordField1_Pswrd_.getPassword());
             
            if(Name.equals(""))
            {
               JOptionPane.showMessageDialog(null,"Add a user name");
            }
             else if(Email.equals(""))
            {
               JOptionPane.showMessageDialog(null,"Add a Email");
            }
             else if(Pswrd.equals(""))
            {
               JOptionPane.showMessageDialog(null,"Add a password");
            }
             else if(checkUsername(Email))
             {
                  JOptionPane.showMessageDialog(null,"This Email Already Exists");
             }
             else{
            PreparedStatement ps;
            String query = "INSERT INTO `users`( `u_name`, `u_email`, `u_pswrd`) VALUES (?,?,?)";
           
          try{ 

              ps = MyConnection.getConnection().prepareStatement(query); 
              
            ps.setString(1,Name );
            ps.setString(2,Email );
            ps.setString(3,Pswrd );
            
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null,"new user add");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } 
      }    
    }//GEN-LAST:event_jButton1_SignUp_ActionPerformed
      // function to check if the username already exists
    public boolean checkUsername(String Email)
    {
        
            PreparedStatement ps;
            ResultSet rs;
            boolean checkUser = false;
            String query = "SELECT * FROM `users` WHERE `u_email` = ?";
            
            
          try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1,Email);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
               checkUser = true; 
            }
          }
         catch (SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
          return checkUser;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          Login  LoginFrame = new  Login();
          LoginFrame.setVisible(true);
          LoginFrame.pack();
          LoginFrame.setLocationRelativeTo(null);
          this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_SignUp_;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1_Pswrd_;
    private javax.swing.JTextField jTextField1_Name_;
    private javax.swing.JTextField jTextField2_Email_;
    // End of variables declaration//GEN-END:variables
}
