# DTO - Entity mapper
This package contains mappers that convert between DTOs and entities. These mappers are implemented using MapStruct, which generates the **mapping code at compile time**, reducing boilerplate and improving maintainability.

## UserMapper
```
@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(MapstructUser user);
    List<UserDto> toDto(List<MapstructUser> users);
}
```
Annotated with `@Mapper(componentModel = "spring")` so MapStruct generates a Spring-managed bean.

`toDto` methods convert MapstructUser entities to UserDto records. The first method converts a single user, while the second method converts a list of users.


## PostMapper
```
@Mapper(componentModel = "spring")
public interface PostMapper {
    PostDto toDto(MapstructPost post);
    List<PostDto> toDto(List<MapstructPost> posts);
}
```
Also annotated with `@Mapper(componentModel = "spring")` 
