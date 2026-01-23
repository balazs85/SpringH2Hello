package hu.nbt.SpringH2Hello.customMapper.service;

import hu.nbt.SpringH2Hello.customMapper.dto.UserDto;
import hu.nbt.SpringH2Hello.customMapper.mapper.UserMapper;
import hu.nbt.SpringH2Hello.customMapper.repository.CustomUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserService {
    private final CustomUserRepository userRepository;
    private final UserMapper userMapper;

    public CustomUserService(
            CustomUserRepository userRepository,
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
