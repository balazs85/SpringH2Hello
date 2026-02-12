package hu.nbt.SpringH2Hello.mapstruct.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import hu.nbt.SpringH2Hello.mapstruct.dto.PostDto;
import hu.nbt.SpringH2Hello.mapstruct.entity.MapstructPost;

@Mapper(componentModel = "spring")
public interface PostMapper {
    PostDto toDto(MapstructPost post);
    List<PostDto> toDto(List<MapstructPost> posts);
}
