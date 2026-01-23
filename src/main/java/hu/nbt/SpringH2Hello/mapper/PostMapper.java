package hu.nbt.SpringH2Hello.mapper;

import hu.nbt.SpringH2Hello.dto.PostDto;
import hu.nbt.SpringH2Hello.dto.PostResponseDto;
import hu.nbt.SpringH2Hello.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PostMapper {
    @Named("postSummary")
    PostDto toDto(Post post);
    List<PostDto> toDto(List<Post> posts);

    @Mapping(target = "creator", source = "user")
    PostResponseDto toResponseDto(Post post);
    List<PostResponseDto> toResponseDto(List<Post> posts);
}
