package hu.nbt.SpringH2Hello.customMapper.mapper;

import hu.nbt.SpringH2Hello.customMapper.dto.PostSimpleDto;
import hu.nbt.SpringH2Hello.customMapper.entity.CustomPost;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostSimpleMapper {

    public PostSimpleDto toSimpleDto(CustomPost post) {
        if (post == null) {
            return null;
        }

        return new PostSimpleDto(
                post.getId(),
                post.getTitle(),
                post.getText()
        );
    }

    public List<PostSimpleDto> toSimpleDto(List<CustomPost> all) {
        if (all == null) {
            return null;
        }

        return all.stream()
                .map(this::toSimpleDto)
                .toList();
    }
}
