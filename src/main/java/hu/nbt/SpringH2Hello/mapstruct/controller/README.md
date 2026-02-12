# 🎮 Controllers
Controllers are responsible for handling incoming HTTP requests and returning responses. They are typically annotated with `@RestController` or `@Controller` in Spring. 

## Basic Annotations
- `@RestController`: Indicates that the class is a RESTful controller, and it combines `@Controller` and `@ResponseBody`, meaning that the return values of methods will be automatically serialized to JSON and sent in the HTTP response. 
- `@Controller`: Indicates that the class is a Spring MVC controller, which can return views (like JSPs) or handle RESTful requests. It does not automatically serialize return values to JSON. 

## Example 
```java 
@RestController 
@RequestMapping("/api") 
public class MyController { 
    
    @GetMapping("/hello") 
    public String sayHello() { 
        return "Hello, World!"; 
    } 
} 
``` 
In this example, the `MyController` class is annotated with `@RestController`, and it has a method `sayHello()` that handles GET requests to `/api/hello` and returns a simple greeting message.

## PostController Example 
```java
@RestController
@RequestMapping("/api/mapstruct/posts")
public class MapstructPostController {

    private final MapstructPostService postService;

    public MapstructPostController(MapstructPostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<PostDto> getAllPosts() {
        return postService.getAllPosts();
    }
}
```
In this example, the 
- `MapstructPostController` class is a REST controller that handles requests related to "posts". 
- It has a dependency on `MapstructPostService`, which is injected through the constructor. 
- The `getAllPosts()` method handles GET requests to `/api/mapstruct/posts` and returns a list of `PostDto` objects, which are likely data transfer objects representing posts.

## Common HTTP Methods
- `@GetMapping`: Handles HTTP GET requests, typically used for retrieving data.
- `@PostMapping`: Handles HTTP POST requests, typically used for creating new resources.
- `@PutMapping`: Handles HTTP PUT requests, typically used for updating existing resources.
- `@DeleteMapping`: Handles HTTP DELETE requests, typically used for deleting resources.
- `@PatchMapping`: Handles HTTP PATCH requests, typically used for partially updating resources.

## Common Annotations
- `@RequestMapping`: A more general annotation that can handle any HTTP method, often used at the class level to define a common path for all methods in the controller.
- `@RequestParam`: Used to extract query parameters from the URL.
- `@PathVariable`: Used to extract values from the URI path.
- `@RequestBody`: Used to bind the body of the HTTP request to a Java object, typically for POST and PUT requests.
- `@ResponseBody`: Indicates that the return value of a method should be serialized to the HTTP response body (used in `@Controller` classes).
- `@ExceptionHandler`: Used to define methods that handle specific exceptions thrown by controller methods, allowing for custom error responses.
- `@ControllerAdvice`: Used to define global exception handling for all controllers in the application, allowing for centralized error handling logic.

## Best Practices
- Keep controllers thin: Controllers should delegate business logic to services and focus on handling HTTP requests and responses. 
- Use appropriate HTTP status codes: Return the correct HTTP status codes for different scenarios (e.g., 200 OK for successful requests, 404 Not Found for missing resources, etc.).
- Validate input: Use validation annotations (e.g., `@Valid`) to ensure that incoming data is valid before processing it. 
- Handle exceptions: Use `@ExceptionHandler` or `@ControllerAdvice` to handle exceptions gracefully and return meaningful error responses. 
- Document APIs: Use tools like Swagger/OpenAPI to document your RESTful APIs for better maintainability and usability.           
