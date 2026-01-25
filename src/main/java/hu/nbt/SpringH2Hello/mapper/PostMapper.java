package hu.nbt.SpringH2Hello.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import hu.nbt.SpringH2Hello.dto.PostDto;
import hu.nbt.SpringH2Hello.dto.PostSimpleDto;
import hu.nbt.SpringH2Hello.entity.Post;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface PostMapper {
    @Named("postSummary")
    PostSimpleDto toSimpleDto(Post post);
    List<PostSimpleDto> toSimpleDto(List<Post> posts);

    @Mapping(target = "creator", source = "user", qualifiedByName = "userWithoutPosts")
    PostDto toDto(Post post);
    List<PostDto> toDto(List<Post> posts);
}
