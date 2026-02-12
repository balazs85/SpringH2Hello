package hu.nbt.SpringH2Hello.customMapper.mapper;

import hu.nbt.SpringH2Hello.customMapper.dto.PostDto;
import hu.nbt.SpringH2Hello.customMapper.entity.CustomPost;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostMapper {

    private final UserSimpleMapper userSimpleMapper;
    
    public PostMapper(
            UserSimpleMapper userSimpleMapper) {
        this.userSimpleMapper = userSimpleMapper;
    }

    public PostDto toDto(CustomPost post) {
        if (post == null) {
            return null;
        }

        return new PostDto(
                post.getId(),
                post.getTitle(),
                post.getText(),
                userSimpleMapper.toSimpleDto(post.getCreator())
        );
    }

    public List<PostDto> toDto(List<CustomPost> all) {
        if (all == null) {
            return null;
        }

        return all.stream()
                .map(this::toDto)
                .toList();
    }
}
