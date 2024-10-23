package regis.login;


import org.springframework.data.jpa.repository.JpaRepository;

import regis.login.User;
import regis.login.UserDto;

@SuppressWarnings("unused")
public interface UserRepository extends JpaRepository<User, Long> {

 User findByUsername(String username);

 User save(UserDto userDto);
}
