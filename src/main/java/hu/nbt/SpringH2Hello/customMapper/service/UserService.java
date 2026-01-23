package hu.nbt.SpringH2Hello.customMapper.service;

import hu.nbt.SpringH2Hello.customMapper.dto.UserDto;
import hu.nbt.SpringH2Hello.customMapper.mapper.UserMapper;
import hu.nbt.SpringH2Hello.customMapper.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customUserService")
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(
            UserRepository userRepository,
            UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserDto> getAllUsers() {
        return userMapper.toDto(userRepository.findAll());
    }

    public UserDto getUserById(long id) {
        return userRepository.findById(id)
                .map(userMapper::toDto)
                .orElse(null);
    }

}
