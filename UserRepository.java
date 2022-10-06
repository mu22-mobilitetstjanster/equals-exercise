import java.util.ArrayList;
import java.util.List;

public class UserRepository {

  // Namn för user är unika
  private List<User> users;

  public UserRepository() {
    this.users = new ArrayList<>();
  }

  // Vi ska implementera CRUD för UserRepository

  public void add(User user) {
    // Implementera logik för att lägga till användare i listan
    this.users.add(user);
  }

  public List<User> findAll() {
    return this.users;
  }

  public User find(String name) {
    //I listan users, hitta en user med namnet in parameter "name"
    //När användaren är hittad, returnera användaren
    boolean hasFoundUser = false;
    int index = 0;
    User user = null;

    // && - logisk och (om första stämmer, då kollas alltid andra)
    // || - logisk eller (om första stämmer, kolla aldrig andra)
    while(!hasFoundUser && index != this.users.size()) {
      user = this.users.get(index);

      if(user.getUsername().equals(name)) {
        hasFoundUser = true;
      } else {
        index++;
      }
    }

    if(hasFoundUser) {
      return user;
    } else {
      return null; // null <-- något som helt saknar egenskaper
    }
  }

  public User update(User user) {
    String username = user.getUsername();
    User oldUser = this.find(username);

    List<User> users = this.findAll();
    int oldUserIndex = users.indexOf(oldUser);

    user = this.users.set(oldUserIndex, user);


    return user;
  }

  public void delete(User user) {

    // Obs, dessa två steg behövs inte efter equals avsnittet
    String username = user.getUsername();
    user = this.find(username);

    List<User> users = this.findAll();
    users.remove(user);
  }

}
