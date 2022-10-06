# Equals exercise

Kopiera från discord eller hämta java filerna [User.java](User.java) och [UserRepository.java](UserRepository.java) från detta github repo.

1. Implementera metoden equals i User.java så att användare med samma namn "är lika"
2. I UserRepository i metoden add(User user), använd metoden "contains" för att hindra flera användare med samma namn från att läggas till i UserRepository

```java
UserRepository userRepository = new UserRepository();
User user = new User("AwesomeTomatoe", "awesomePass");

userRepository.add(user);
userRepository.add(new User("AwesomeTomatoe", "pass123"); // Denna ska inte gå att lägga till då den har samma namn som förgående user

System.out.println(userRepository.findAll().size()); // ska printa "1"

```

## Level up
1. Implementera hashcode för User
2. Ändra listan i UserRepository till ett set
3. Ta bort contains från add och prova så att olika användare men samma namn fortfarande *inte* kan ingå i samma UserRepository

