
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author caleb
 */
public class user {
//private variables for user class
    private String userName;
    private byte[] hashedPassword;

    //checks a string if it matches the password for the particular user
    boolean checkPassword(String password)
    {
        byte[] pwdHash = hashPassword(password);
        //if the entered password matches the objects hashedPassword it will return true
        if(pwdHash == hashedPassword)
        {
            return true;
            
        }else
        {
            //else it will return false
        return false;
        }
    }
    
    byte[] hashPassword(String password) {
        try {
            // create a new SecureRandom object
            SecureRandom random = new SecureRandom();
            //Create a new random salt
            byte[] salt = new byte[16];
            random.nextBytes(salt);
            //Specify the key and strength of the hash
            KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
            //Specify the algoryth to be used
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            //Try hashing the password
            try {
                byte[] hash = factory.generateSecret(spec).getEncoded();
                return hash;
            } catch (InvalidKeySpecException ex) {
                //Catch key errors
                Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "ERROR: invalid key used for hash algorythm", "Error Box: " + "Key algorythm exception", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NoSuchAlgorithmException ex) {
            //Catch Algorithm errors
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR: invalid algorithm used for passowrd hash", "Error Box: " + "hash algorythm exception", JOptionPane.ERROR_MESSAGE);

        }
        //if hashing fails return null
        return null;
    }

    user() {
        userName = "Default";
        String password = "Default";
        hashedPassword = hashPassword(password);

    }

    user(String usersName, String password) {
        userName = usersName;
        hashedPassword = hashPassword(password);
    }
    
    //Gets the username of the object
    String getUsername()
    {
        return userName;
    }
    
    //Sets a new password for the user
    void setPassword(String password)
    {
        hashedPassword = hashPassword(password);
    }

}
