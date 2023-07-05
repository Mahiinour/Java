
package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Statement;
import static test.DBconnection.ss;



public class BloodDonation extends javax.swing.JFrame {
 String ID,Name,Number,Age,Address,Gender;
    private String query;
    public BloodDonation() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tname = new javax.swing.JLabel();
        Tnum = new javax.swing.JLabel();
        Tage = new javax.swing.JLabel();
        Tadd = new javax.swing.JLabel();
        tn = new javax.swing.JTextField();
        tno = new javax.swing.JTextField();
        tage = new javax.swing.JTextField();
        tadd = new javax.swing.JTextField();
        jm = new javax.swing.JRadioButton();
        jf = new javax.swing.JRadioButton();
        Rreg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tid = new javax.swing.JTextPane();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel1)
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        Tname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tname.setText("Name:");

        Tnum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tnum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tnum.setText("Number:");

        Tage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tage.setText("Age:");

        Tadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tadd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tadd.setText("Address:");

        buttonGroup.add(jm);
        jm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jm.setText("Male");

        buttonGroup.add(jf);
        jf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jf.setText("Female");

        Rreg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Rreg.setText("Register");
        Rreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RregActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("ID");

        jScrollPane2.setViewportView(tid);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tnum)
                            .addComponent(Tage)
                            .addComponent(Tadd))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tn)
                            .addComponent(tno)
                            .addComponent(tage)
                            .addComponent(tadd, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jm)
                        .addGap(128, 128, 128)
                        .addComponent(jf))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(Rreg, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tname)
                    .addComponent(tn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tnum)
                    .addComponent(tno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tage)
                    .addComponent(tage, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tadd)
                    .addComponent(tadd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jm)
                    .addComponent(jf))
                .addGap(18, 18, 18)
                .addComponent(Rreg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RregActionPerformed
        ID =tid.getText().toString();
        Name= tn.getText().toString();
        Number=tno.getText().toString();
        Age=tage.getText().toString();
        Address=tadd.getText().toString();
        if(jm.isSelected()){
            Gender="male";
        }
        else if (jf.isSelected()){
            Gender="Female";
        }
        
         DBconnection cc=new DBconnection();
    
         Connection c = null;
     try {
         c = cc.Connect();
     } catch (SQLException ex) {
         Logger.getLogger(BloodDonation.class.getName()).log(Level.SEVERE, null, ex);
     }
   
         query ="insert into blood_donation values('"+ID+"','"+Name+"','"+ Number + "','"+ Age+"','"+Address+"','"+Gender+"')";
     try {
         ss =c.prepareStatement(query);
     } catch (SQLException ex) {
         Logger.getLogger(BloodDonation.class.getName()).log(Level.SEVERE, null, ex);
     }
     try {
         ss.execute(query);
     } catch (SQLException ex) {
         Logger.getLogger(BloodDonation.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_RregActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new BloodDonation().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Rreg;
    private javax.swing.JLabel Tadd;
    private javax.swing.JLabel Tage;
    private javax.swing.JLabel Tname;
    private javax.swing.JLabel Tnum;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JRadioButton jf;
    private javax.swing.JRadioButton jm;
    private javax.swing.JTextField tadd;
    private javax.swing.JTextField tage;
    private javax.swing.JTextPane tid;
    private javax.swing.JTextField tn;
    private javax.swing.JTextField tno;
    // End of variables declaration//GEN-END:variables
}
