package hu.nbt.SpringH2Hello.dto;

public record UserSimpleDto(
        Long id,
        String name,
        String email
) {
}
