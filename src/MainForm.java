
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    //Array to store users
    static user[] userArray = new user[4];

    public MainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new JLabel();
        logInBtn = new JButton();
        passwordField = new JPasswordField();
        userNameField = new JTextField();
        exitBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CQAC Installation Manager");

        logInBtn.setText("Log IN");
        logInBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordField)
                                    .addComponent(logInBtn, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userNameField))))
                        .addGap(0, 118, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(userNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logInBtn)
                .addGap(44, 44, 44)
                .addComponent(exitBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void debugMessage(String message)
    {
        System.out.println(message);
    }
    
    
    
    // Login button event
    private void logInBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        int i;
        for (i = 0; i < userArray.length; i++) {

            // accessing each element of array
            if (userNameField.getText().compareTo(userArray[i].getUsername()) == 0 && userArray[i].checkPassword(new String(passwordField.getPassword()))) {
                //Let them in

                JOptionPane.showMessageDialog(null, "User and password matches", "InfoBox: " + "Nice", JOptionPane.INFORMATION_MESSAGE);
                debugMessage("Password and Username Matches");
                
                MenuForm menuForm = new MenuForm();
                menuForm.setVisible(true);
                this.setVisible(false);

            }

        }
    }//GEN-LAST:event_logInBtnActionPerformed

    private void exitBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        //exits the program on click
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    public static void main(String args[]) {
        
        try {
            // since there is no database or permenant storage of users some defaults will be created here.
            // Would be a vector instead of an array to allow expanding the list of users however in this case there is no point
            //since its not being saved anywhere
            userArray[0] = new user("CEO", "BestBossEver");
            userArray[1] = new user("Technician", "BestAcInstallerEver");
            userArray[2] = new user("Admin", "Admin123");
            userArray[3] = new user("Caleb", "I Made This Program");
            // prints out all the users
            int i;
            for (i = 0; i < userArray.length; i++) {
                System.out.println("Created User: " + userArray[i].getUsername());
            }

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton exitBtn;
    private JLabel jLabel1;
    private JButton logInBtn;
    private JPasswordField passwordField;
    private JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
