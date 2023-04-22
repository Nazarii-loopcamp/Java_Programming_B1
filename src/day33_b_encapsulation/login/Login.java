package day33_b_encapsulation.login;

public class Login {

    private String username;
    private String password;

    public void setUsername (String username) {
        this.username = username;
    }

    public void setPassword (String password) {
        if (password.length() >= 8) {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "Login: " +
                "\nUsername: " + username +
                "\nPassword: " + password;
    }

    public String getUsername () {
        return username;
    }

    public String getPassword (String username) {
        if (this.username.equals(username)) {
            return password;
        }
        return "Not correct username";
    }

}
