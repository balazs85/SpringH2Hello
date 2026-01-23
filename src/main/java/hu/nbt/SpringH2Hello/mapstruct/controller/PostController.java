package hu.nbt.SpringH2Hello.mapstruct.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.nbt.SpringH2Hello.mapstruct.dto.PostDto;
import hu.nbt.SpringH2Hello.mapstruct.service.PostService;

@RestController("mapstructPostController")
@RequestMapping("/api/mapstruct/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<PostDto> getAllPosts() {
        return postService.getAllPosts();
    }
}
