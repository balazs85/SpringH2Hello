package hu.nbt.SpringH2Hello.customMapper.service;

import hu.nbt.SpringH2Hello.customMapper.dto.PostDto;
import hu.nbt.SpringH2Hello.customMapper.mapper.PostMapper;
import hu.nbt.SpringH2Hello.customMapper.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customPostService")
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
