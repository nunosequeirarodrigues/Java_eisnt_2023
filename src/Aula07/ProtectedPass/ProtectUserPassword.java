package Aula07.ProtectedPass;

/*
https://www.appsdeveloperblog.com/encrypt-user-password-example-java/
Encrypt User Password Example in Java
When a user signs up for our mobile app, we require them to create a secure password, which we then store in our database. However, we know that storing passwords as plain text is not secure, as it allows anyone who views the database to access users’ actual passwords. To protect these passwords from being easily read, we need to encrypt them. While we have used the MD5 algorithm in the past to hash passwords, this method is no longer considered secure, so we need to explore alternative encryption options.

The following code example will help you to:

Generate a salt value
Use password-based encryption to encrypt the user’s password
Encode the encrypted password into Base64 format
Once you have an encoded, secure value of the user’s password in Base64, you can save it in the database along with the salt value. Both the salt value and the Base64-encoded password must be stored together, as they are required to validate if the unencrypted user-provided password matches the encrypted password stored in the database.

Table of Contents
PasswordUtils Java class used to encrypt and verify user password.
Protect User Password Code Example in Java
Validate User Password Code Example in Java
PasswordUtils Java class used to encrypt and verify user password.

When I ran the above code in my development environment it generated the following output:

Encrypted and Base64 encoded user password: HhaNvzTsVYwS/x/zbYXlLOE3ETMXQgllqrDaJY9PD/U=

Salt value:
EqdmPh53c9x33EygXpTpcoJvc4VXLK

I can store the above two values in my database and I will use them in the below code
example to verify if provided user password is correct and matches my database record.
*/

public class ProtectUserPassword {
    public static void main(String[] args)
    {
        String myPassword = "myPassword123";

        // Generate Salt. The generated value can be stored in DB.
        String salt = PasswordUtils.getSalt(30);

        // Protect user's password. The generated value can be stored in DB.
        String mySecurePassword = PasswordUtils.generateSecurePassword(myPassword, salt);

        // Print out protected password
        System.out.println("My secure password = " + mySecurePassword);
        System.out.println("Salt value = " + salt);
    }
}