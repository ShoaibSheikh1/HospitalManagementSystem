import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class homepage extends javax.swing.JFrame {

   Connection con;
   Statement st;
   ResultSet rs;
    public homepage() { 
        initComponents();
        connect();
        ImageIcon img=new ImageIcon("admin.jfif");
        Image i=img.getImage();
        Image pos=i.getScaledInstance(adminlabel.getHeight(),adminlabel.getWidth(),Image.SCALE_SMOOTH);
        ImageIcon i1=new ImageIcon(pos);
        adminlabel.setIcon(i1);
        
         ImageIcon img1=new ImageIcon("receptionist.jfif");
        Image obj=img1.getImage();
        Image pos1=obj.getScaledInstance(reception.getHeight(),reception.getWidth(),Image.SCALE_SMOOTH);
        ImageIcon i2=new ImageIcon(pos1);
        reception.setIcon(i2);
        
         ImageIcon img2=new ImageIcon("doctor.jfif");
        Image obj1=img2.getImage();
        Image pos2=obj1.getScaledInstance(doctor.getHeight(),doctor.getWidth(),Image.SCALE_SMOOTH);
        ImageIcon i3=new ImageIcon(pos2);
        doctor.setIcon(i3);
        
        ImageIcon img3=new ImageIcon("appointment.png");
        Image obj2=img3.getImage();
        Image pos3=obj2.getScaledInstance(appointment.getHeight(),appointment.getWidth(),Image.SCALE_SMOOTH);
        ImageIcon i4=new ImageIcon(pos3);
        appointment.setIcon(i4);
        
         ImageIcon img4=new ImageIcon("hospital charges.jfif");
        Image obj3=img4.getImage();
        Image pos4=obj3.getScaledInstance(charges.getHeight(),charges.getWidth(),Image.SCALE_SMOOTH);
        ImageIcon i5=new ImageIcon(pos4);
        charges.setIcon(i5);
       
          ImageIcon img6=new ImageIcon("plus.png");
        Image obj5=img6.getImage();
        Image pos6=obj5.getScaledInstance(plus.getHeight(),plus.getWidth(),Image.SCALE_SMOOTH);
        ImageIcon i7=new ImageIcon(pos6);
        plus.setIcon(i7);
    }

   void connect()
   {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           JOptionPane.showMessageDialog(null,"Driver loaded");
       }
       catch(ClassNotFoundException cf){
           JOptionPane.showMessageDialog(null,"Driver not loaded");
           
       }
       try{
           con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
           st=con.createStatement();
            JOptionPane.showMessageDialog(null,"Connection done");
           
       }
       catch(SQLException sql)
       {
           JOptionPane.showMessageDialog(null,"Connection not done");
           
       }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        plus = new javax.swing.JLabel();
        adminlabel = new javax.swing.JLabel();
        reception = new javax.swing.JLabel();
        doctor = new javax.swing.JLabel();
        appointment = new javax.swing.JLabel();
        charges = new javax.swing.JLabel();
        btnadmin = new javax.swing.JButton();
        btnreceptionist = new javax.swing.JButton();
        btndoctor = new javax.swing.JButton();
        btnappointment = new javax.swing.JButton();
        btnhospitalcharges = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setForeground(new java.awt.Color(0, 102, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    HOSPITAL MANAGEMENT SYSTEM");

        plus.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(plus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnadmin.setBackground(new java.awt.Color(255, 255, 255));
        btnadmin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnadmin.setForeground(new java.awt.Color(255, 0, 0));
        btnadmin.setText("ADMIN");
        btnadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminActionPerformed(evt);
            }
        });

        btnreceptionist.setBackground(new java.awt.Color(255, 255, 255));
        btnreceptionist.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnreceptionist.setForeground(new java.awt.Color(255, 0, 0));
        btnreceptionist.setText("RECEPTIONIST");
        btnreceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreceptionistActionPerformed(evt);
            }
        });

        btndoctor.setBackground(new java.awt.Color(255, 255, 255));
        btndoctor.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btndoctor.setForeground(new java.awt.Color(255, 0, 0));
        btndoctor.setText("DOCTOR");
        btndoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoctorActionPerformed(evt);
            }
        });

        btnappointment.setBackground(new java.awt.Color(255, 255, 255));
        btnappointment.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnappointment.setForeground(new java.awt.Color(255, 0, 0));
        btnappointment.setText("APPOINTMENT");
        btnappointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnappointmentActionPerformed(evt);
            }
        });

        btnhospitalcharges.setBackground(new java.awt.Color(255, 255, 255));
        btnhospitalcharges.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnhospitalcharges.setForeground(new java.awt.Color(255, 0, 0));
        btnhospitalcharges.setText("Generate Bill");
        btnhospitalcharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhospitalchargesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reception, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnreceptionist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnappointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(charges, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btnhospitalcharges, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(charges, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reception, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(appointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnreceptionist, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnappointment, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnhospitalcharges, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(240, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminActionPerformed
    Admin a=new Admin();
    this.dispose();
    a.setVisible(true);
    
    
    }//GEN-LAST:event_btnadminActionPerformed

    private void btnreceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreceptionistActionPerformed
     ReceptionistLogin rl=new ReceptionistLogin();
      this.dispose();
     rl.setVisible(true);
    
    }//GEN-LAST:event_btnreceptionistActionPerformed

    private void btndoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoctorActionPerformed
    Doctor d=new Doctor();
    this.dispose();
    d.setVisible(true);
    }//GEN-LAST:event_btndoctorActionPerformed

    private void btnappointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnappointmentActionPerformed
    Appointment ap=new Appointment();
    this.dispose();
    ap.setVisible(true);
    }//GEN-LAST:event_btnappointmentActionPerformed

    private void btnhospitalchargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospitalchargesActionPerformed
    GenerateBill gb=new GenerateBill();
    this.dispose();
    gb.setVisible(true);
    }//GEN-LAST:event_btnhospitalchargesActionPerformed

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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminlabel;
    private javax.swing.JLabel appointment;
    private javax.swing.JButton btnadmin;
    private javax.swing.JButton btnappointment;
    private javax.swing.JButton btndoctor;
    private javax.swing.JButton btnhospitalcharges;
    private javax.swing.JButton btnreceptionist;
    private javax.swing.JLabel charges;
    private javax.swing.JLabel doctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel plus;
    private javax.swing.JLabel reception;
    // End of variables declaration//GEN-END:variables
}
