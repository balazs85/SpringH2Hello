package hu.nbt.SpringH2Hello.mapstruct.dto;

public record UserWithoutPostsDto(
        Long id,
        String name,
        String email
) {
}
