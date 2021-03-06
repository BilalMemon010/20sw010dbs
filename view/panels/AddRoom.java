/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gdse41.sem1project.view.panels;

import edu.gdse41.sem1project.controller.ControllerFactory;
import edu.gdse41.sem1project.controller.custom.RoomController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import edu.gdse41.sem1project.dto.RoomDTO;
import edu.gdse41.sem1project.view.Admin;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Hansani Kariyawasam
 */
public class AddRoom extends javax.swing.JPanel {
    
    private edu.gdse41.sem1project.controller.custom.RoomController ctrlRoom;

    /**
     * Creates new form AddRoom
     */
    public AddRoom() {
        initComponents();
        ctrlRoom =(RoomController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.ROOM);
        loadTable();
//        roomTable.getTableHeader().setFont(new Font("Times New Roman", 1, 22));
//        roomTable.getTableHeader().setBackground(new Color(51, 51, 51));
//        roomTable.getTableHeader().setOpaque(true);
//        roomTable.getTableHeader().setForeground(Color.WHITE);
        
    }
    
    private void loadTable(){
        try {
            ArrayList<RoomDTO> roomList=ctrlRoom.view();
            DefaultTableModel dtm=(DefaultTableModel)roomTable.getModel();
            dtm.setRowCount(0);
            for(RoomDTO r1:roomList){
                Object [] rowData={r1.getRoomID(),r1.getRoomType(),r1.getStatus(),r1.getRoomPrice()};
                dtm.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRoomID = new javax.swing.JTextField();
        txtType1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtPrice1 = new javax.swing.JTextField();
        lblUpdate = new javax.swing.JLabel();
        lblDelete = new javax.swing.JLabel();
        lblAdd = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 620));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        roomTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        roomTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        roomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room ID", "Room Type", "Status", "Room Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roomTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        roomTable.setGridColor(new java.awt.Color(51, 51, 51));
        roomTable.setRowHeight(22);
        roomTable.getTableHeader().setReorderingAllowed(false);
        roomTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(roomTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 770, 320));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Room ID :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Room Type :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 120, 30));
        add(txtRoomID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 180, 30));
        add(txtType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 180, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Status :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 120, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Room Price :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 120, 30));
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 180, 30));
        add(txtPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 180, 30));

        lblUpdate.setBackground(new java.awt.Color(221, 188, 9));
        lblUpdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdate.setText("Save Changes");
        lblUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblUpdate.setName("lblMain"); // NOI18N
        lblUpdate.setOpaque(true);
        lblUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUpdateMouseExited(evt);
            }
        });
        add(lblUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 150, 50));

        lblDelete.setBackground(new java.awt.Color(221, 188, 9));
        lblDelete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDelete.setText("Remove Room");
        lblDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDelete.setName("lblMain"); // NOI18N
        lblDelete.setOpaque(true);
        lblDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDeleteMouseExited(evt);
            }
        });
        add(lblDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 160, 50));

        lblAdd.setBackground(new java.awt.Color(221, 188, 9));
        lblAdd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdd.setText("Add a Room");
        lblAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAdd.setName("lblMain"); // NOI18N
        lblAdd.setOpaque(true);
        lblAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddMouseExited(evt);
            }
        });
        add(lblAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 150, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void lblUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateMouseClicked
        RoomDTO r1=new RoomDTO(txtRoomID.getText(),txtType1.getText(),txtStatus.getText(),Double.parseDouble(txtPrice1.getText()));
        try {
            boolean res=ctrlRoom.update(r1);
            if(res){
                DefaultTableModel dtm=(DefaultTableModel) roomTable.getModel();
                for(int i=0;i<roomTable.getRowCount();i++){    
                    if(r1.getRoomID()==dtm.getValueAt(i, 0)){
                        System.out.println("Enter");
                        dtm.setValueAt(txtType1.getText(), i, 1);
                        dtm.setValueAt(txtStatus.getText(), i, 2);
                        dtm.setValueAt(txtPrice1.getText(), i, 3);
                    }
                }
                JOptionPane.showMessageDialog(this,"Update Success....");
            }else{
                JOptionPane.showMessageDialog(this,"Update fail....");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblUpdateMouseClicked

    private void lblDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteMouseClicked
        DefaultTableModel dtm=(DefaultTableModel) roomTable.getModel();
        if(roomTable.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this, "Please select a room");
        }else{
           String id=txtRoomID.getText();
            try {
                boolean res=ctrlRoom.delete(id);
                if(res){
                    dtm.removeRow(roomTable.getSelectedRow());
                    txtRoomID.setText("");
                    txtType1.setText("");
                    txtStatus.setText("");
                    txtPrice1.setText("");
                    JOptionPane.showMessageDialog(this,"Room is Removed");
                }else{
                    JOptionPane.showMessageDialog(this,"Try Again!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_lblDeleteMouseClicked

    private void lblAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMouseClicked
        RoomDTO r1=new RoomDTO(txtRoomID.getText(),txtType1.getText(),txtStatus.getText(),Double.parseDouble(txtPrice1.getText()));
        try {
            boolean res=ctrlRoom.add(r1);
            if(res){
                DefaultTableModel dtm=(DefaultTableModel) roomTable.getModel();
                Object [] rowData={r1.getRoomID(),r1.getRoomType(),r1.getStatus(),r1.getRoomPrice()};
                dtm.addRow(rowData);
                JOptionPane.showMessageDialog(this,"Room is added");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblAddMouseClicked

    private void roomTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomTableMouseClicked
        Admin.pnlViewReports.setVisible(false);
        DefaultTableModel dtm=(DefaultTableModel) roomTable.getModel();
        txtRoomID.setText(dtm.getValueAt(roomTable.getSelectedRow(), 0).toString());
        txtType1.setText(dtm.getValueAt(roomTable.getSelectedRow(), 1).toString());
        txtStatus.setText(dtm.getValueAt(roomTable.getSelectedRow(), 2).toString());
        txtPrice1.setText(dtm.getValueAt(roomTable.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_roomTableMouseClicked

    private void lblAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMouseEntered
        lblAdd.setBackground(new Color(255,162,0));
        lblAdd.setOpaque(true);
    }//GEN-LAST:event_lblAddMouseEntered

    private void lblAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMouseExited
        lblAdd.setBackground(new Color(221,188,9));
        lblAdd.setOpaque(true);
    }//GEN-LAST:event_lblAddMouseExited

    private void lblDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteMouseEntered
        lblDelete.setBackground(new Color(255,162,0));
        lblDelete.setOpaque(true);
    }//GEN-LAST:event_lblDeleteMouseEntered

    private void lblDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteMouseExited
        lblDelete.setBackground(new Color(221,188,9));
        lblDelete.setOpaque(true);
    }//GEN-LAST:event_lblDeleteMouseExited

    private void lblUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateMouseEntered
        lblUpdate.setBackground(new Color(255,162,0));
        lblUpdate.setOpaque(true);
    }//GEN-LAST:event_lblUpdateMouseEntered

    private void lblUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateMouseExited
        lblUpdate.setBackground(new Color(221,188,9));
        lblUpdate.setOpaque(true);
    }//GEN-LAST:event_lblUpdateMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        Admin.pnlViewReports.setVisible(false);
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblUpdate;
    private javax.swing.JTable roomTable;
    private javax.swing.JTextField txtPrice1;
    private javax.swing.JTextField txtRoomID;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtType1;
    // End of variables declaration//GEN-END:variables
}
