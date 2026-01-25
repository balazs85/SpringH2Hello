package hu.nbt.SpringH2Hello.service;

import hu.nbt.SpringH2Hello.dto.PostDto;
import hu.nbt.SpringH2Hello.mapper.PostMapper;
import hu.nbt.SpringH2Hello.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public PostService(PostRepository postRepository, PostMapper postMapper) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
    }

    public List<PostDto> getAllPosts() {
        return postMapper.toDto(postRepository.findAll());
    }
}
