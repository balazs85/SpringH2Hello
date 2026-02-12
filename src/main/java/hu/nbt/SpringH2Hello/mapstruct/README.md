# 🛎 Elements of the service

## 🎮 Controllers 
Controllers are responsible for handling incoming HTTP requests and returning responses. They are typically annotated with `@RestController` or `@Controller` in Spring. 

[More about controllers](./controller/README.md)

## ⚙️ Services 
Services contain the business logic of the application. They are typically annotated with `@Service` and are used by controllers to perform operations. 

## 🗄️️ Repositories 
Repositories are responsible for data access and manipulation. They are typically annotated with `@Repository` and interact with the database. 

## 🏗️ Models 
Models represent the data structure of the application. They are typically annotated with `@Entity` and correspond to database tables.

[More about models (entities)](./entity/README.md)

## 📦 DTOs (Data Transfer Objects) 
DTOs are used to transfer data between different layers of the application, such as between controllers and services. They help to decouple the internal data structure from the external representation. 

[More about DTOs](./dto/README.md)

## 🔄 Mappers 
Mappers are responsible for converting between different object types, such as between entities and DTOs. They can be implemented using libraries like MapStruct for automatic code generation.

[More about mappers](./mapper/README.md)