package Aula07.ProtectedPass;

/*
Validate User Password Code Example in Java
 */
public class VerifyProvidedPassword {
    public static void main(String[] args)
    {
        // User provided password to validate
        String providedPassword = "myPassword1234";
//USER;SALT;KEY
        // Encrypted and Base64 encoded password read from database
        String securePassword = "5H9fuLEomHPVT/5y4v1lBC3URqEc4Lror2EcXbp7KkY=";

        // Salt value stored in database
        String salt = "zjZQi3mecN8MiU66QsYFz9rdumbQE1";

        boolean passwordMatch = PasswordUtils.verifyUserPassword(providedPassword, securePassword, salt);

        if(passwordMatch)
        {
            System.out.println("Provided user password " + providedPassword + " is correct.");
        } else {
            System.out.println("Provided password is incorrect");
        }
    }
}