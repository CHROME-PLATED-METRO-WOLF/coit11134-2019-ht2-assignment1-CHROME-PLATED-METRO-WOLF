
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
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
public class ModifyInstallations extends javax.swing.JFrame {
//ArrayList<Technician> technicians;

    /**
     * Creates new form ModifyTechnician
     */
    public ModifyInstallations() {
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
        horsePowerField = new JTextField();
        numZonesField = new JTextField();
        numOutletsField = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        editSelectedBtn = new JButton();
        updateSelectedBtn = new JButton();
        removeSelectedBtn = new JButton();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        startDateField = new JTextField();
        endDateField = new JTextField();
        technicianBox = new JComboBox<>();
        buildingBox = new JComboBox<>();

        jList1.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Installation Manager");

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
                "HorsePower", "Num Zones", "Num Outlets", "Technician", "Building", "Start Date", "End Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        technicianViewBox.setEditingColumn(1);
        technicianViewBox.setEditingRow(1);
        jScrollPane2.setViewportView(technicianViewBox);

        jLabel2.setText("HorsePower");

        jLabel3.setText("NumZones");

        jLabel4.setText("Num Outlets");

        jLabel5.setText("Technician");

        jLabel6.setText("Building");

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

        jLabel7.setText("Start Date");

        jLabel8.setText("End Date");

        startDateField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                startDateFieldActionPerformed(evt);
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
                                .addGap(32, 32, 32)
                                .addComponent(addBtn, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editSelectedBtn)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateSelectedBtn)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeSelectedBtn))
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
                                            .addComponent(horsePowerField, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(numZonesField, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(startDateField, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                            .addComponent(endDateField)))
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(buildingBox, GroupLayout.Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(technicianBox, GroupLayout.Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(numOutletsField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(horsePowerField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(startDateField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(numZonesField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(endDateField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(numOutletsField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(technicianBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn)
                            .addComponent(editSelectedBtn)
                            .addComponent(updateSelectedBtn)
                            .addComponent(removeSelectedBtn)))
                    .addComponent(buildingBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        if (horsePowerField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ERROR: Please enter at least a first name", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            if (horsePowerField.getText().equals("")) {
                horsePowerField.setText(Integer.toString(0));

            }
            MenuForm.installations.add(new Installation());
            try {
                MenuForm.installations.get(MenuForm.installations.size() - 1).setHorsePower(Integer.parseInt(horsePowerField.getText()));
                MenuForm.installations.get(MenuForm.installations.size() - 1).setNumZones(Integer.parseInt(numZonesField.getText()));
                MenuForm.installations.get(MenuForm.installations.size() - 1).setOutlets(Integer.parseInt(numOutletsField.getText()));
                MenuForm.installations.get(MenuForm.installations.size() - 1).setStartDate(startDateField.getText());
                MenuForm.installations.get(MenuForm.installations.size() - 1).setEnddate(endDateField.getText());
                MenuForm.installations.get(MenuForm.installations.size() - 1).setTechnitian(MenuForm.technicians.get(technicianBox.getSelectedIndex()));
                MenuForm.installations.get(MenuForm.installations.size() - 1).setBuilding(MenuForm.buildings.get(buildingBox.getSelectedIndex()));

                //MenuForm.technicians.get(technicianBox.getSelectedIndex()), MenuForm.buildings.get(buildingBox.getSelectedIndex()))
            } catch (java.lang.NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "ERROR: Please enter a number for age", "Error", JOptionPane.ERROR_MESSAGE);
                //remove the last one since it errors
                MenuForm.installations.remove(MenuForm.installations.size() - 1);
            }
        }
        UpdateTable();

    }//GEN-LAST:event_addBtnActionPerformed

    private void editSelectedBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_editSelectedBtnActionPerformed
        try {
            int selectedRow = technicianViewBox.getSelectedRow();

            horsePowerField.setText(Integer.toString(MenuForm.installations.get(selectedRow).getHorsePower()));
            numZonesField.setText(Integer.toString(MenuForm.installations.get(selectedRow).getNumZones()));
            numOutletsField.setText(Integer.toString(MenuForm.installations.get(selectedRow).getOutlets()));
            technicianBox.setSelectedIndex(selectedRow);
            buildingBox.setSelectedIndex(selectedRow);

        } catch (java.lang.IndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(null, "ERROR: Nothing is selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editSelectedBtnActionPerformed

    private void updateSelectedBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_updateSelectedBtnActionPerformed
        try {
            int selectedRow = technicianViewBox.getSelectedRow();
            if (horsePowerField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR: Please enter at least a first name", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                if (horsePowerField.getText().equals("")) {
                    horsePowerField.setText(Integer.toString(0));

                }

                try {
                    MenuForm.installations.get(selectedRow).setHorsePower(Integer.parseInt(horsePowerField.getText()));
                    MenuForm.installations.get(selectedRow).setNumZones(Integer.parseInt(numZonesField.getText()));
                    MenuForm.installations.get(selectedRow).setOutlets(Integer.parseInt(numOutletsField.getText()));
                    MenuForm.installations.get(selectedRow).setTechnitian(MenuForm.technicians.get(technicianBox.getSelectedIndex()));
                    MenuForm.installations.get(selectedRow).setBuilding(MenuForm.buildings.get(buildingBox.getSelectedIndex()));
                    MenuForm.installations.get(selectedRow).setStartDate(startDateField.getText());
                    MenuForm.installations.get(selectedRow).setEnddate(endDateField.getText());
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
            MenuForm.installations.remove(selectedRow);
        } catch (java.lang.IndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(null, "ERROR: Nothing is selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
        UpdateTable();
    }//GEN-LAST:event_removeSelectedBtnActionPerformed

    private void startDateFieldActionPerformed(ActionEvent evt) {//GEN-FIRST:event_startDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateFieldActionPerformed

    public void UpdateTable() {
        System.out.println("Running UpdateTable");
        clearRows();
        UpdateTechnicians();
        UpdateBuildings();
        int i = 0;

        while (i < MenuForm.installations.size()) {
            AddRow(Integer.toString(MenuForm.installations.get(i).getHorsePower()), Integer.toString(MenuForm.installations.get(i).getNumZones()),
                    Integer.toString(MenuForm.installations.get(i).getOutlets()),
                    MenuForm.installations.get(i).technician.getFirstName() + " " + MenuForm.installations.get(i).technician.getLastName(),
                    MenuForm.installations.get(i).building.getAddress(), MenuForm.installations.get(i).getStartDate(), MenuForm.installations.get(i).getEnddate());

            i++;
        }
    }

    private void UpdateTechnicians() {
        System.out.println("Running UpdateTechnicians");
        technicianBox.removeAllItems();
        int i = 0;
        while (i < MenuForm.technicians.size()) {

            technicianBox.addItem(MenuForm.technicians.get(i).getFirstName() + " " + MenuForm.technicians.get(i).getLastName());
            i++;
        }
    }

    private void UpdateBuildings() {
        System.out.println("Running UpdateBuildings");
        buildingBox.removeAllItems();
        int i = 0;
        while (i < MenuForm.buildings.size()) {
            buildingBox.addItem(MenuForm.buildings.get(i).getAddress());
            i++;
        }
    }

    private void RemoveRows(int index) {
        DefaultTableModel yourModel = (DefaultTableModel) technicianViewBox.getModel();
        yourModel.removeRow(index);
    }

    private void AddRow(String horsePower, String numZones, String numOutlets, String technician, String building, String startDate, String endDate) {
        DefaultTableModel yourModel = (DefaultTableModel) technicianViewBox.getModel();
        yourModel.addRow(new Object[]{horsePower, numZones, numOutlets, technician, building, startDate, endDate});
    }

    private void clearRows() {
        DefaultTableModel Model = (DefaultTableModel) technicianViewBox.getModel();
        Model.setRowCount(0);
    }

    /**
     * @param args the command line arguments
     */
    public void main() {
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
        UpdateTable();
        System.out.println("List Size" + MenuForm.installations.size());

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
    private JComboBox<String> buildingBox;
    private JButton editSelectedBtn;
    private JTextField endDateField;
    private JTextField horsePowerField;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JList<String> jList1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextField numOutletsField;
    private JTextField numZonesField;
    private JButton removeSelectedBtn;
    private JTextField startDateField;
    private JComboBox<String> technicianBox;
    private JTable technicianViewBox;
    private JButton updateSelectedBtn;
    // End of variables declaration//GEN-END:variables
}
