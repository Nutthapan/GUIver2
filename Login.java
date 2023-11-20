import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        LoginBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(246, 255, 222));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(229, 90, 97));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e3498096aff0c947e3695f1dc634d0bf.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Flower MarKet ");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel6))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(255, 197, 71));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 90, 97));
        jLabel1.setText("LOGIN");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel2.setText("Email");

        email.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel3.setText("Password");

        LoginBtn.setBackground(new java.awt.Color(229, 90, 97));
        LoginBtn.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setText("I don't have an account");

        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setText("I don't have an account");

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 102, 102));
        jButton3.setText("Sign Up");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginBtn)
                    .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(password)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(123, 123, 123))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(428, 428, 428)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(400, -10, 400, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
        //System.out.println("Sign up btn clicked");
        String Email, Password , query, fname = null, passDb = null;
        String SUrl, SUser, Spass;
        SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
        SUser = "root";
        Spass = "";
        int notFound = 0;
        
        try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(SUrl, SUser, Spass);
    Statement st = con.createStatement();
    if ("".equals(email.getText())) {
        JOptionPane.showMessageDialog(new JFrame(), "Full Name is required", "Error", 
                JOptionPane.ERROR_MESSAGE);
    }else if ("".equals(password.getText())){
        JOptionPane.showMessageDialog(new JFrame(), "Email Name is required", "Error", 
                JOptionPane.ERROR_MESSAGE);
    }else{
        Email = email.getText();
        Password = password.getText();
        
        query = "SELECT * FROM user WHERE email = '"+Email+"'";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            passDb = rs.getString("password");
            fname = rs.getString("full_name");
            notFound = 1;
            
        }
        if(notFound == 1 && Password.equals(passDb)){
            Home HomeFrame = new Home();
            HomeFrame.setUser(fname);
            HomeFrame.setVisible(true);
            HomeFrame.pack();
            HomeFrame.setLocationRelativeTo(null);
            this.dispose();
        
        }else {
            JOptionPane.showMessageDialog(new JFrame(), "Incorrect email or password", "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
        password.setText("");  
    }
} catch (HeadlessException | ClassNotFoundException | SQLException e) {
    System.out.println("Error: " + e.getMessage());
}

    }//GEN-LAST:event_LoginBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPanel Right;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
