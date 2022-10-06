public class User {
  private String username;
  private String password;

  private boolean authenticated;

  public User() { //no arg constructor (no parameters)
    this("Username", "Password"); // Overloads the constructor of type (string, string)
  }

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getPassword() {
    return this.password;
  }

  public String getUsername() {
    return this.username;
  }

  public void setAuthenticated(boolean authenticated) {
    this.authenticated = authenticated;
  }

  public boolean isAuthenticated() {
    return authenticated;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
