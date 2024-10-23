package regis.login;

import regis.login.User;
import regis.login.UserDto;

@SuppressWarnings("unused")
public interface UserService {
 User findByUsername(String username);

 User save(UserDto userDto);

}