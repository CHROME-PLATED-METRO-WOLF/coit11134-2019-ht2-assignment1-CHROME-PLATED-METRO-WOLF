
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author caleb
 */
public class ModifyTechnician extends javax.swing.JFrame {
//ArrayList<Technician> technicians;

    /**
     * Creates new form ModifyTechnician
     */
    public ModifyTechnician() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jList1 = new JList<>();
        jLabel1 = new JLabel();
        addBtn = new JToggleButton();
        jScrollPane2 = new JScrollPane();
        technicianViewBox = new JTable();
        nameField = new JTextField();
        lastNameField = new JTextField();
        phoneNumberField = new JTextField();
        ageField = new JTextField();
        notesField = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        editSelectedBtn = new JButton();
        updateSelectedBtn = new JButton();
        removeSelectedBtn = new JButton();

        jList1.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Technician Editor");

        addBtn.setText("Add");
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        technicianViewBox.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Phone Number", "Age", "Notes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        technicianViewBox.setEditingColumn(1);
        technicianViewBox.setEditingRow(1);
        jScrollPane2.setViewportView(technicianViewBox);

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Phone Number");

        jLabel5.setText("Age");

        jLabel6.setText("Notes");

        editSelectedBtn.setText("Edit Selected");
        editSelectedBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                editSelectedBtnActionPerformed(evt);
            }
        });

        updateSelectedBtn.setText("Update Selected");
        updateSelectedBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                updateSelectedBtnActionPerformed(evt);
            }
        });

        removeSelectedBtn.setText("Remove Selected");
        removeSelectedBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                removeSelectedBtnActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(addBtn, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editSelectedBtn)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateSelectedBtn)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeSelectedBtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameField, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNumberField, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageField, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                            .addComponent(notesField, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ageField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(notesField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(editSelectedBtn)
                    .addComponent(updateSelectedBtn)
                    .addComponent(removeSelectedBtn))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        if (nameField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ERROR: Please enter at least a first name", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            if (ageField.getText().equals("")) {
                ageField.setText(Integer.toString(0));

            }
            MenuForm.technicians.add(new Technician());
            try {
                MenuForm.technicians.get(MenuForm.technicians.size() - 1).setAge(Integer.parseInt(ageField.getText()));
                MenuForm.technicians.get(MenuForm.technicians.size() - 1).setFirstName(nameField.getText());
                MenuForm.technicians.get(MenuForm.technicians.size() - 1).setLastName(lastNameField.getText());
                MenuForm.technicians.get(MenuForm.technicians.size() - 1).setPhoneNumber(phoneNumberField.getText());
                MenuForm.technicians.get(MenuForm.technicians.size() - 1).setNotes(notesField.getText());
            } catch (java.lang.NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "ERROR: Please enter a number for age", "Error", JOptionPane.ERROR_MESSAGE);
                //remove the last one since it errors
                MenuForm.technicians.remove(MenuForm.technicians.size() - 1);
            }
        }
        UpdateTable();

    }//GEN-LAST:event_addBtnActionPerformed

    private void editSelectedBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_editSelectedBtnActionPerformed
        try {
            int selectedRow = technicianViewBox.getSelectedRow();

            ageField.setText(Integer.toString(MenuForm.technicians.get(selectedRow).getAge()));
            nameField.setText(MenuForm.technicians.get(selectedRow).getFirstName());
            lastNameField.setText(MenuForm.technicians.get(selectedRow).getLastName());
            phoneNumberField.setText(MenuForm.technicians.get(selectedRow).getPhoneNumber());
            notesField.setText(MenuForm.technicians.get(selectedRow).getNotes());
        } catch (java.lang.IndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(null, "ERROR: Nothing is selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editSelectedBtnActionPerformed

    private void updateSelectedBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_updateSelectedBtnActionPerformed
        try {
            int selectedRow = technicianViewBox.getSelectedRow();
            if (nameField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR: Please enter at least a first name", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                if (ageField.getText().equals("")) {
                    ageField.setText(Integer.toString(0));

                }

                try {
                    MenuForm.technicians.get(selectedRow).setAge(Integer.parseInt(ageField.getText()));
                    MenuForm.technicians.get(selectedRow).setFirstName(nameField.getText());
                    MenuForm.technicians.get(selectedRow).setLastName(lastNameField.getText());
                    MenuForm.technicians.get(selectedRow).setPhoneNumber(phoneNumberField.getText());
                    MenuForm.technicians.get(selectedRow).setNotes(notesField.getText());
                } catch (java.lang.NumberFormatException exception) {
                    JOptionPane.showMessageDialog(null, "ERROR: Please enter a number for age", "Error", JOptionPane.ERROR_MESSAGE);
                    
                }
            }
        } catch (java.lang.IndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(null, "ERROR: Nothing is selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
        UpdateTable();
    }//GEN-LAST:event_updateSelectedBtnActionPerformed

    private void removeSelectedBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_removeSelectedBtnActionPerformed
        try {
            int selectedRow = technicianViewBox.getSelectedRow();
            MenuForm.technicians.remove(selectedRow);
        } catch (java.lang.IndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(null, "ERROR: Nothing is selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
        UpdateTable();
    }//GEN-LAST:event_removeSelectedBtnActionPerformed

    private void UpdateTable() {
        clearRows();
        int i = 0;
        while (i < MenuForm.technicians.size()) {
            AddRow(MenuForm.technicians.get(i).getFirstName(), MenuForm.technicians.get(i).getLastName(),
                    MenuForm.technicians.get(i).getPhoneNumber(), MenuForm.technicians.get(i).getAge(),
                    MenuForm.technicians.get(i).getNotes());
            i++;
        }
    }

    private void RemoveRows(int index) {
        DefaultTableModel yourModel = (DefaultTableModel) technicianViewBox.getModel();
        yourModel.removeRow(index);
    }

    private void AddRow(String firstName, String lastName, String phoneNumber, int age, String notes) {
        DefaultTableModel yourModel = (DefaultTableModel) technicianViewBox.getModel();
        yourModel.addRow(new Object[]{firstName, lastName, phoneNumber, age, notes});
    }

    private void clearRows() {
        DefaultTableModel Model = (DefaultTableModel) technicianViewBox.getModel();
        Model.setRowCount(0);
    }

    /**
     * @param args the command line arguments
     */
    public void main(ArrayList<Technician> technicianArray) {
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
            java.util.logging.Logger.getLogger(ModifyTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */

        // technicians = technicianArray;
        System.out.println("List Size" + MenuForm.technicians.size());

        //technicianViewBox.removeAll();
        System.out.println("row count:" + technicianViewBox.getRowCount());
        System.out.println("colum count:" + technicianViewBox.getColumnCount());

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JToggleButton addBtn;
    private JTextField ageField;
    private JButton editSelectedBtn;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JList<String> jList1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextField lastNameField;
    private JTextField nameField;
    private JTextField notesField;
    private JTextField phoneNumberField;
    private JButton removeSelectedBtn;
    private JTable technicianViewBox;
    private JButton updateSelectedBtn;
    // End of variables declaration//GEN-END:variables
}
