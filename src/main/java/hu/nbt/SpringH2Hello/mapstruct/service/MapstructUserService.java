package hu.nbt.SpringH2Hello.mapstruct.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hu.nbt.SpringH2Hello.mapstruct.dto.UserDto;
import hu.nbt.SpringH2Hello.mapstruct.mapper.UserMapper;
import hu.nbt.SpringH2Hello.mapstruct.repository.MapstructUserRepository;

@Service
public class MapstructUserService {
    private final MapstructUserRepository userRepository;
    private final UserMapper userMapper;

    public MapstructUserService(
            MapstructUserRepository userRepository,
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
