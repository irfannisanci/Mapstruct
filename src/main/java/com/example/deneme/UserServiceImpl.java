package com.example.deneme;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDTO findUserByFirstName(String firstName) {
        User user = userRepository.findUserByFirstName(firstName);
        return userMapper.toDto(user);
    }
}
