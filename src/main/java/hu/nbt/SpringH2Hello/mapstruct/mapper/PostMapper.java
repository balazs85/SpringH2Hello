package hu.nbt.SpringH2Hello.mapstruct.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import hu.nbt.SpringH2Hello.mapstruct.dto.PostDto;
import hu.nbt.SpringH2Hello.mapstruct.entity.MapstructPost;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface PostMapper {
    @Mapping(target = "creator", source = "user", qualifiedByName = "userWithoutPosts")
    PostDto toDto(MapstructPost post);
    List<PostDto> toDto(List<MapstructPost> posts);
}
