package org.example.ExceptionHandling;
import java.util.HashMap;

class UsernameExistsException extends RuntimeException {
    public UsernameExistsException(String message) {
        super(message);
    }
}

class UserCredentialMap extends HashMap<String, String> {

    @Override
    public String put(String username, String password) {
        if (this.containsKey(username)) {
            throw new UsernameExistsException("Username already exists: " + username);
        }
        return super.put(username, password);
    }
}
public class User {
    public static void main(String[] args) {

        UserCredentialMap users = new UserCredentialMap();

        users.put("Shreya", "1234");
        users.put("John", "abcd");

        // This will throw exception
        users.put("Shreya", "newpass");
    }
}
