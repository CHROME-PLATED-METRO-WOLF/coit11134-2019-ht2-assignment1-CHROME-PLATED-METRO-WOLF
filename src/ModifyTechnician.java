/*
 Created by Caleb Davidson for assignment 2 of Object Oriented Programming
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class ModifyTechnician extends javax.swing.JFrame {
    public Thread watchDogThread;
    private ArrayList<Technician> technicians = new ArrayList<Technician>();

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

        jLabel1.setText("Technician Manager");

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
                                    .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameField, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneNumberField, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageField, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(notesField, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel1)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    //code for the add button
    private void addBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        //if the first name is blank through error. There must be at least a first name.
        if (nameField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ERROR: Please enter at least a first name", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            //If age is empty default to 0
            if (ageField.getText().equals("")) {
                ageField.setText("0");

            }
            //Access array for MenuForm and add a new default technician
            technicians.add(new Technician());
            try {
                //setting the created objects variables to the ones entered in the gui components
                technicians.get(technicians.size() - 1).setAge(Integer.parseInt(ageField.getText()));
                technicians.get(technicians.size() - 1).setFirstName(nameField.getText());
                technicians.get(technicians.size() - 1).setLastName(lastNameField.getText());
                technicians.get(technicians.size() - 1).setPhoneNumber(phoneNumberField.getText());
                technicians.get(technicians.size() - 1).setNotes(notesField.getText());
            } catch (java.lang.NumberFormatException exception) {
                //eror message if numbers are not entered
                JOptionPane.showMessageDialog(null, "ERROR: Please enter a number for age", "Error", JOptionPane.ERROR_MESSAGE);
                //remove the last installation record since it errors
                //otherwise there will be a blank one in the list
                technicians.remove(technicians.size() - 1);
            }
        }
        //update the table with new informatio
        

    }//GEN-LAST:event_addBtnActionPerformed
    //button used to edit the selected item in the table of records
    private void editSelectedBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_editSelectedBtnActionPerformed
        try {
            //store the currently selected row
            int selectedRow = technicianViewBox.getSelectedRow();
            //Set all the gui components to the variables of the selected record
            ageField.setText(Integer.toString(technicians.get(selectedRow).getAge()));
            nameField.setText(technicians.get(selectedRow).getFirstName());
            lastNameField.setText(technicians.get(selectedRow).getLastName());
            phoneNumberField.setText(technicians.get(selectedRow).getPhoneNumber());
            notesField.setText(technicians.get(selectedRow).getNotes());
        } catch (java.lang.IndexOutOfBoundsException exception) {
            //if nothing is selected then through this error
            JOptionPane.showMessageDialog(null, "ERROR: Nothing is selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editSelectedBtnActionPerformed

    //Button used to apply the updated information to the records
    private void updateSelectedBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_updateSelectedBtnActionPerformed
        try {
            //store the currently selected row
            int selectedRow = technicianViewBox.getSelectedRow();
            // if name field is blank throug an eror
            if (nameField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR: Please enter at least a first name", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                //if age field is blank set to default value of zero
                if (ageField.getText().equals("")) {
                    ageField.setText("0");

                }
                //set all the variables of the selected record to the new ones entered into the fields.
                try {
                    technicians.get(selectedRow).setAge(Integer.parseInt(ageField.getText()));
                    technicians.get(selectedRow).setFirstName(nameField.getText());
                    technicians.get(selectedRow).setLastName(lastNameField.getText());
                    technicians.get(selectedRow).setPhoneNumber(phoneNumberField.getText());
                    technicians.get(selectedRow).setNotes(notesField.getText());
                } catch (java.lang.NumberFormatException exception) {
                    JOptionPane.showMessageDialog(null, "ERROR: Please enter a number for age", "Error", JOptionPane.ERROR_MESSAGE);

                }
            }
        } catch (java.lang.IndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(null, "ERROR: Nothing is selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_updateSelectedBtnActionPerformed

    //remove button code
    private void removeSelectedBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_removeSelectedBtnActionPerformed
        try {
            //stores the selected row
            int selectedRow = technicianViewBox.getSelectedRow();
            //removes the selected row from the records arraylist
            technicians.remove(selectedRow);
        } catch (java.lang.IndexOutOfBoundsException exception) {
            //Spit this error if nothing is selected in the table of records
            JOptionPane.showMessageDialog(null, "ERROR: Nothing is selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_removeSelectedBtnActionPerformed

    private void UpdateTable() {
        System.out.println("Running UpdateTable");
        clearRows();
        int i = 0;
        //loop through the array of technicians
        while (i < technicians.size()) {
            //Adds a new row in the table of records for every technician
            AddRow(technicians.get(i).getFirstName(), technicians.get(i).getLastName(),
                    technicians.get(i).getPhoneNumber(), technicians.get(i).getAge(),
                    technicians.get(i).getNotes());
            i++;
        }
    }

    private void RemoveRows(int index) {
        DefaultTableModel yourModel = (DefaultTableModel) technicianViewBox.getModel();
        yourModel.removeRow(index);
    }

    private void AddRow(String firstName, String lastName, String phoneNumber, int age, String notes) {
        //changes the table to a default tablemodel
        DefaultTableModel yourModel = (DefaultTableModel) technicianViewBox.getModel();
        //adds a row to the table with the information for each column
        yourModel.addRow(new Object[]{firstName, lastName, phoneNumber, age, notes});
    }

    //clears rows
    private void clearRows() {
        DefaultTableModel Model = (DefaultTableModel) technicianViewBox.getModel();
        Model.setRowCount(0);
    }
    
    public Thread getThread(String threadName) {
        //gets the curent thred (gui thread)
        Thread currentThread = Thread.currentThread();
        //gets the group the gui belongs to which should be the main group
        ThreadGroup threadGroup = getRootThreadGroup(currentThread);
        //gets number of active threads
        int allActiveThreads = threadGroup.activeCount();
        //creats an array of all the threads in the thread group
        Thread[] allThreads = new Thread[allActiveThreads];
        //enumerate through all thread groups and add the threads to the list
        threadGroup.enumerate(allThreads);
        //loop through this list
        for (int i = 0; i < allThreads.length; i++) {
            //if the threads name matches then
            if (allThreads[i].getName().equals(threadName)) {
                System.out.println("Thread found");
                //return that thread
                return allThreads[i];
            }
        }
        System.out.println("Thread not found");
        //if thread is not found return null
        return null;
    }

    public Thread getThread(long threadID) {
        //gets the curent thred (gui thread)
        Thread currentThread = Thread.currentThread();
        //gets the group the gui belongs to which should be the main group
        ThreadGroup threadGroup = getRootThreadGroup(currentThread);
        //gets number of active threads
        int allActiveThreads = threadGroup.activeCount();
        //creats an array of all the threads in the thread group
        Thread[] allThreads = new Thread[allActiveThreads];
        //enumerate through all thread groups and add the threads to the list
        threadGroup.enumerate(allThreads);
        //loop through this list
        for (int i = 0; i < allThreads.length; i++) {
            //if the threads id matches then
            if (allThreads[i].getId() == threadID) {
                System.out.println("Thread found");
                //return that thread
                return allThreads[i];
            }
        }
        System.out.println("Thread not found");
        //if thread is not found return null
        return null;
    }

    private static ThreadGroup getRootThreadGroup(Thread thread) {
        ThreadGroup rootGroup = thread.getThreadGroup();
        while (true) {
            ThreadGroup parentGroup = rootGroup.getParent();
            if (parentGroup == null) {
                break;
            }
            rootGroup = parentGroup;
        }
        return rootGroup;
    }
    

    /**
     * @param args the command line arguments
     */
    public void main(ArrayList<Technician> technicianList) {
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
        technicians = technicianList;
        // technicians = technicianArray;
        //inital update of table
        UpdateTable();

        // create a new watchdog object
        WatchDog object = new WatchDog();
        //check if a thread is allready running for the watch dog object
        //This was so difficult to figure out took me ages
        if (watchDogThread == null && getThread("Technicians Watch Dog") == null) {
            System.out.println("Starting watchdog");
            //Making sure the thread exis when the class is destroyed (form is destroyed)
            //otherwise JVM will never exit and error will occure when the program is closed
            object.setDaemon(false);
            //setting its name
            object.setName("Technicians Watch Dog");

            //start the thread
            object.start();

        } else {
            System.out.println("Watchdog is running");

        }

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

class WatchDog extends Thread {

        //run method which is called when the thread is started
        public void run() {
            try {
                // Displaying the thread that is running 
                // prints out the thread status
                System.out.println("technicians array watch dog is running on thread:  " + Thread.currentThread().getId());
                //set the thread number so we can check its status elsewhere
                watchDogThread = Thread.currentThread();
                //get the current (first) hash code of the array and all of its objects
                int currentHash = technicians.hashCode();
                //Control loop will keep checking if any objects are changed inside the array and if any change
                //then it will run UpdateTable() to update the table
                while (true) {
                    //sleep for 400ms so it doesnt consume too much cpu time (so it doesnt 100% cpu all the time)
                    sleep(400);
                    //calculate a new hash code
                    int newHash = technicians.hashCode();
                    //compare if it is different to the old hash code
                    if (currentHash != newHash) {
                        //set the old hash to the new one (to avoid looping updateTable()
                        currentHash = newHash;
                        //update the table
                        UpdateTable();
                        //saves it to file
                        //Doing it this was has a small issue if the hard drive is really slow or the program has trouble accessing the file
                        //If the arrays are modified really quickly the table wont update untill the file is saved
                        //At least it doesnt block the gui. I used this threading method cause my usb stick has really long file seek times
                        //it take like 5-10 secs to access a file so the gui was constantly blocked whenever i made a change which was so anoying
                        //If these were being saved over the netwok similar issues could happen. Ive done a lot of testing trying to break this
                        //saving mechanism and i havent found any ways of corrupting, crashing or causing malfunctions when using the multi threaded
                        //method
                        MenuForm.saveTechniciansText();
                    }
                    //System.out.println(Thread.currentThread().getId());
                }
                //Catch all exceptions
            } catch (Exception e) {
                //Should be unlikely that this will crash
                System.out.println("Critical: technicians array watchdog has just crashed");
            }
        }
    }

}
