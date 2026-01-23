package hu.nbt.SpringH2Hello.dto;

public record PostResponseDto(
        Long id,
        String title,
        String text,
        UserDto creator
) {
}

