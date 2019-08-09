
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.swing.JOptionPane;

public class user {
//private variables for user class

    private String userName;
    private String hashedPassword;

    private String generatePasswordHash(String password) {
        int iterations = 1000;
        try {
            char[] chars = password.toCharArray();
            byte[] salt = getSalt();

            PBEKeySpec spec = new PBEKeySpec(chars, salt, iterations, 64 * 8);
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            byte[] hash = skf.generateSecret(spec).getEncoded();
            return iterations + ":" + toHex(salt) + ":" + toHex(hash);

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR: The selected algorithm was not found", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR: The keyspec was created wrongly most likley bad hash data was supplied.", "Error", JOptionPane.ERROR_MESSAGE);

        }
        return null;
    }

    private byte[] getSalt() throws NoSuchAlgorithmException {
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[16];
        sr.nextBytes(salt);
        return salt;
    }

    private String toHex(byte[] array) throws NoSuchAlgorithmException {
        //converts a byte array to a haxidecimal string
        BigInteger bi = new BigInteger(1, array);
        String hex = bi.toString(16);
        int paddingLength = (array.length * 2) - hex.length();
        if (paddingLength > 0) {
            return String.format("%0" + paddingLength + "d", 0) + hex;
        } else {
            return hex;
        }
    }

    private boolean validatePassword(String originalPassword, String storedPassword) {
        try {
            // splits string into an array of strings seperated by :
            // this is done because the "hash" isnt really THE hash its a block of data seperated by :
            // The first part is the number of iterations the seccond is the salt and the third is the actual hash data
            String[] parts = storedPassword.split(":");
            //specifies the amount of iterations depending on the first part of the hash
            int iterations = Integer.parseInt(parts[0]);
            //takes the next part of the hash and converts it from hexidecimal
            byte[] salt = fromHex(parts[1]);
            //takes the next part and specifies it as the hash
            byte[] hash = fromHex(parts[2]);

            //Creates PBEKeySpec object using the date above
            PBEKeySpec spec = new PBEKeySpec(originalPassword.toCharArray(), salt, iterations, hash.length * 8);
            //specifies the hash type
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            //creates a new hash using the provided users password
            byte[] testHash = skf.generateSecret(spec).getEncoded();
            //calculates if the stored hash is the same as the passwords hash the user enters
            int diff = hash.length ^ testHash.length;
            for (int i = 0; i < hash.length && i < testHash.length; i++) {
                diff |= hash[i] ^ testHash[i];
            }
            return diff == 0;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR: The selected algorithm was not found", "Error", JOptionPane.ERROR_MESSAGE);

        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR: The keyspec was created wrongly most likley bad hash data was supplied.", "Error", JOptionPane.ERROR_MESSAGE);

        }
        return false;
    }

    private byte[] fromHex(String hex) throws NoSuchAlgorithmException {
        //converts hex into a byte array
        byte[] bytes = new byte[hex.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
        }
        return bytes;
    }

    //checks a string if it matches the password for the particular user
    boolean checkPassword(String password) {

        //Will return true or false for password validation
        return validatePassword(password, hashedPassword);
    }

    //default constructor
    user() {
        userName = "Default";
        String password = "Default";
        hashedPassword = generatePasswordHash(password);

    }

    //constructor with parameters
    user(String usersName, String password) {
        userName = usersName;
        hashedPassword = generatePasswordHash(password);
    }

    //Gets the username of the object
    String getUsername() {
        return userName;
    }

    //can be used to set the username
    void setUsername(String name) {
        userName = name;
    }

    //Sets a new password for the user
    void setPassword(String password) {
        hashedPassword = generatePasswordHash(password);
    }

    //There isnt a getter for password hash because there is no need for anyone to view the hash itself
    //There also isnt any need to get an unhashed password (the password itself) from this class and there isnt any way of doing that.
}
