import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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

        jLabel1.setText("CQAC Installation Manager Login");

        logInBtn.setText("Log IN");
        logInBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });

        passwordField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        userNameField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                userNameFieldKeyPressed(evt);
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
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordField)
                            .addComponent(logInBtn, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameField))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitBtn)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
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

    public void debugMessage(String message) {
        System.out.println(message);
    }

    // Login button event
    private void logInBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        // loop tracking variable
        int i;
        //this boolean value keeps track of the login status
        Boolean loggedin = false;
        //loop to check the array of users
        for (i = 0; i < userArray.length; i++) {

            //if the name and pasword match a user in the array of users
            if (userNameField.getText().compareTo(userArray[i].getUsername()) == 0 && userArray[i].checkPassword(new String(passwordField.getPassword()))) {
                //Let them in
                //message box and debug message of a successful login.
                JOptionPane.showMessageDialog(null, "User and password matches", "InfoBox:", JOptionPane.INFORMATION_MESSAGE);
                debugMessage("Password and Username Matches");
                //creates a new logged in form
                MenuForm menuForm = new MenuForm();
                //makes it visible
                menuForm.setVisible(true);
                //gets rid of the current window
                this.setVisible(false);
                //disposes of the current form (release memory and system resources)
                this.dispose();
                //set the loggedin value to true so the error message box doesnt display.
                loggedin = true;
            }
        }
        //if login fails display error mesage and send debug message
        if (loggedin == false) {
            JOptionPane.showMessageDialog(null, "ERROR: Username or password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
            debugMessage("Wrong username or password");
        }
    }//GEN-LAST:event_logInBtnActionPerformed

    private void exitBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        //exits the program on click

        //Creates a yes no dialog
        debugMessage("Exit was clicked dialog displayed");
        int dialogButton = JOptionPane.YES_NO_OPTION;
        //Saves the result of the dialog in a variable
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you would like to exit?", "Exit?", dialogButton);
        //if yes was clicked
        if (dialogResult == JOptionPane.YES_OPTION) {
            debugMessage("Yes was clicked exiting");
            //exits the program without error
            System.exit(0);
        }
        debugMessage("The dialog was closed or no was selected. NOT exiting.");

    }//GEN-LAST:event_exitBtnActionPerformed

    private void userNameFieldKeyPressed(KeyEvent evt) {//GEN-FIRST:event_userNameFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            debugMessage("ENTER key pressed on username field");
            logInBtn.doClick();            
        }
    }//GEN-LAST:event_userNameFieldKeyPressed

    private void passwordFieldKeyPressed(KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            debugMessage("ENTER key pressed on password field");
            logInBtn.doClick();
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

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
