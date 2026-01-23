package hu.nbt.SpringH2Hello.mapstruct.service;

import hu.nbt.SpringH2Hello.mapstruct.dto.PostDto;
import hu.nbt.SpringH2Hello.mapstruct.mapper.PostMapper;
import hu.nbt.SpringH2Hello.mapstruct.repository.MapstructPostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapstructPostService {
    private final MapstructPostRepository postRepository;
    private final PostMapper postMapper;

    public MapstructPostService(MapstructPostRepository postRepository, PostMapper postMapper) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
    }

    public List<PostDto> getAllPosts() {
        return postMapper.toDto(postRepository.findAll());
    }
}
