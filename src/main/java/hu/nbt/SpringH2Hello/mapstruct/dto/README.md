# 📦 DTOs (Data Transfer Objects)

DTOs are used to transfer data between different layers of the application, such as between controllers and service. They help to decouple the internal data structure from the external representation.

Here are the request and response DTOs what are available for the users. With that users can send and receive data in a structured way, without exposing the internal details of the entities.
## User
### UserDto
```java
public record UserDto(
        Long id,
        String name,
        String email,
        List<PostSimpleDto> posts
)  { }
```
The full user DTO, with posts
### UserWithoutPostDto
```java
public record UserWithoutPostsDto(
        Long id,
        String name,
        String email
) { }
```
When a post has a user, there no posts should appear
## Post
### PostDto
```java
public record PostDto(
        Long id,
        String title,
        String text,
        UserSimpleDto creator
) {
}
```
The full post DTO, with creator
### PostWithoutCreatorDto
```java
public record PostWithoutCreatorDto(
        Long id,
        String title,
        String text
) {
}
```
When a user has a post, there is no creator should appear