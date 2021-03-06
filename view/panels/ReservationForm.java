/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gdse41.sem1project.view.panels;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import edu.gdse41.sem1project.view.Reception;
import edu.gdse41.sem1project.view.panels.titles.GuestDetlsTitle;
import edu.gdse41.sem1project.view.panels.titles.SettlePaymntTitle;
import java.awt.Color;

/**
 *
 * @author Hansani Kariyawasam
 */
public class ReservationForm extends javax.swing.JPanel {
    
    public static String resID;
    public static int noOfNights;

    /**
     * Creates new form ReservationForm
     */
    public ReservationForm() {
        initComponents();
        loadResDate();
        setGuestDetails();
        txtResID.setText(AddGuest.resId);
        txtNoOfNights1.setText(calculateNights(SearchRooms.checkIn,SearchRooms.checkOut));
        loadTableData();
    }
    
    private void loadTableData(){
        ArrayList<Object[]> rows=Availability.rows;
        for(Object[] row:rows){
            DefaultTableModel dtm=(DefaultTableModel)roomTable.getModel();
            dtm.addRow(row);
        }
    }
    
    private String calculateNights(String checkIn, String checkOut){
        LocalDate cIn=LocalDate.parse(checkIn);
        LocalDate cOut=LocalDate.parse(checkOut);
        int nights=cOut.compareTo(cIn);
        noOfNights=nights;
        return ""+nights;
    } 
    
    
    private void loadResDate(){ 
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String dateFormat=sdf.format(d);
        txtResDate.setText(dateFormat);
    }
    
    private void setGuestDetails(){
        lblGuestID.setText(AddGuest.guestID);
        lblName.setText(AddGuest.guestName);
        lblTel.setText(AddGuest.guestTel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtResID = new javax.swing.JTextField();
        txtResDate = new javax.swing.JTextField();
        txtNoOfNights1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblGuestID = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblPayment = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 620));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Reservation ID :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 170, 30));

        txtResID.setEditable(false);
        txtResID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtResID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResIDActionPerformed(evt);
            }
        });
        add(txtResID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 200, 30));

        txtResDate.setEditable(false);
        txtResDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtResDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResDateActionPerformed(evt);
            }
        });
        add(txtResDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 200, 30));

        txtNoOfNights1.setEditable(false);
        txtNoOfNights1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        add(txtNoOfNights1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 200, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Booking Summary");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 280, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Guest ID :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 160, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Guest Name :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 160, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Mobile Number :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 160, 30));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(153, 153, 153));
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 350, 30));

        lblGuestID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblGuestID.setForeground(new java.awt.Color(153, 153, 153));
        lblGuestID.setName("covers"); // NOI18N
        add(lblGuestID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 200, 30));

        lblTel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTel.setForeground(new java.awt.Color(153, 153, 153));
        add(lblTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 200, 30));

        lblBack.setBackground(new java.awt.Color(221, 188, 9));
        lblBack.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setText("Back");
        lblBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblBack.setName("lblMain"); // NOI18N
        lblBack.setOpaque(true);
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackMouseExited(evt);
            }
        });
        add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, 170, 50));

        lblPayment.setBackground(new java.awt.Color(221, 188, 9));
        lblPayment.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblPayment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPayment.setText("Payment");
        lblPayment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPayment.setName("lblMain"); // NOI18N
        lblPayment.setOpaque(true);
        lblPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPaymentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPaymentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPaymentMouseExited(evt);
            }
        });
        add(lblPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 550, 170, 50));

        roomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room ID", "Room Type", "Status", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roomTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(roomTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, 140));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("No Of Nights :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Reservation Date :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 180, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtResIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResIDActionPerformed

    private void txtResDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResDateActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        Reception frmMain=(Reception) SwingUtilities.getWindowAncestor(this);
        frmMain.pnlMain.removeAll();
        AddGuest guest=new AddGuest();
        frmMain.pnlMain.add(guest);
        frmMain.pnltitle.removeAll();
        GuestDetlsTitle title=new GuestDetlsTitle();
        frmMain.pnltitle.add(title);
        frmMain.pnlMain.updateUI();
        
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPaymentMouseClicked
        resID=txtResID.getText();
        Reception frmMain=(Reception) SwingUtilities.getWindowAncestor(this);
        frmMain.pnlMain.removeAll();
        Payment payment=new Payment();
        frmMain.pnlMain.add(payment);
        frmMain.pnltitle.removeAll();
        SettlePaymntTitle title=new SettlePaymntTitle();
        frmMain.pnltitle.add(title);
        frmMain.pnlMain.updateUI();
    }//GEN-LAST:event_lblPaymentMouseClicked

    private void lblPaymentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPaymentMouseEntered
        lblPayment.setBackground(new Color(255,162,0));
        lblPayment.setOpaque(true);
    }//GEN-LAST:event_lblPaymentMouseEntered

    private void lblPaymentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPaymentMouseExited
        lblPayment.setBackground(new Color(221,188,9));
        lblPayment.setOpaque(true);
    }//GEN-LAST:event_lblPaymentMouseExited

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        lblBack.setBackground(new Color(255,162,0));
        lblBack.setOpaque(true);
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        lblBack.setBackground(new Color(221,188,9));
        lblBack.setOpaque(true);
    }//GEN-LAST:event_lblBackMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        Reception.reserveRoomPanel.setVisible(false);
        Reception.pnlViewReports.setVisible(false);
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblGuestID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPayment;
    private javax.swing.JLabel lblTel;
    private javax.swing.JTable roomTable;
    private javax.swing.JTextField txtNoOfNights1;
    private javax.swing.JTextField txtResDate;
    private javax.swing.JTextField txtResID;
    // End of variables declaration//GEN-END:variables
}
