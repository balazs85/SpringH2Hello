package hu.nbt.SpringH2Hello.mapstruct.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.nbt.SpringH2Hello.mapstruct.dto.PostDto;
import hu.nbt.SpringH2Hello.mapstruct.service.MapstructPostService;

@RestController
@RequestMapping("/api/mapstruct/posts")
public class MapstructPostController {

    private final MapstructPostService postService;

    public MapstructPostController(MapstructPostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<PostDto> getAllPosts() {
        return postService.getAllPosts();
    }
}
