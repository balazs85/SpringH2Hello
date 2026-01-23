package hu.nbt.SpringH2Hello.dto;

public record PostDto(
        Long id,
        String title,
        String text
) {
}

