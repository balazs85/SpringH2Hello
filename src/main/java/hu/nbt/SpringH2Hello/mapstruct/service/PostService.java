package hu.nbt.SpringH2Hello.mapstruct.service;

import hu.nbt.SpringH2Hello.mapstruct.dto.PostDto;
import hu.nbt.SpringH2Hello.mapstruct.mapper.PostMapper;
import hu.nbt.SpringH2Hello.mapstruct.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mapstructPostService")
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
