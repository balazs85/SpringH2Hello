package hu.nbt.SpringH2Hello.customMapper.controller;

import hu.nbt.SpringH2Hello.customMapper.dto.PostDto;
import hu.nbt.SpringH2Hello.customMapper.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController("customPostController")
@RequestMapping("/api/custom/posts")
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
