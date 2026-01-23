package hu.nbt.SpringH2Hello.customMapper.controller;

import hu.nbt.SpringH2Hello.customMapper.dto.UserDto;
import hu.nbt.SpringH2Hello.customMapper.service.CustomUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/custom/users")
public class CustomUserController {
    private final CustomUserService userService;

    public CustomUserController(CustomUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

}
