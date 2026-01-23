package hu.nbt.SpringH2Hello.mapstruct.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.nbt.SpringH2Hello.mapstruct.dto.UserDto;
import hu.nbt.SpringH2Hello.mapstruct.service.MapstructUserService;


@RestController
@RequestMapping("/api/mapstruct/users")
public class MapstructUserController {
    private final MapstructUserService userService;

    public MapstructUserController(MapstructUserService userService) {
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
