package Aula07.ProtectedPass;

/*
Validate User Password Code Example in Java
 */
public class VerifyProvidedPassword {
    public static void main(String[] args)
    {
        // User provided password to validate
        String providedPassword = "myPassword124";

        // Encrypted and Base64 encoded password read from database
        String securePassword = "8USOoHAOFF37uvl2X4YTo4/1j8jYFFkwI0vMqDzolTg=";

        // Salt value stored in database
        String salt = "VmSwRb2YJcue9Zl5hEaaxlE64V1ukE";

        boolean passwordMatch = PasswordUtils.verifyUserPassword(providedPassword, securePassword, salt);

        if(passwordMatch)
        {
            System.out.println("Provided user password " + providedPassword + " is correct.");
        } else {
            System.out.println("Provided password is incorrect");
        }
    }
}