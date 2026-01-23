package hu.nbt.SpringH2Hello.customMapper.controller;

import hu.nbt.SpringH2Hello.customMapper.dto.PostDto;
import hu.nbt.SpringH2Hello.customMapper.service.CustomPostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/custom/posts")
public class CustomPostController {

    private final CustomPostService postService;

    public CustomPostController(CustomPostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<PostDto> getAllPosts() {
        return postService.getAllPosts();
    }
}
