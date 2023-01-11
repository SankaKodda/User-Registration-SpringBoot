package services;

import dto.UserDto;
import entity.User;

import java.util.List;

public interface UserService {
    void saveUsser(UserDto userDto);
    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
