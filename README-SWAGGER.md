# Swagger Integration for Student Management Application

## Required Dependencies

Add the following dependency to your `pom.xml` file inside the `<dependencies>` section:

```xml
<!-- SpringDoc OpenAPI UI -->
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.0.2</version>
</dependency>
```

## Configuration Files

The following configuration files have been created/modified:

1. **SwaggerConfig.java**: Configuration class for OpenAPI documentation
2. **application.properties**: Added Swagger-specific properties

## How to Access Swagger UI

1. Start your Spring Boot application
2. Open your browser and navigate to: http://localhost:8080/swagger-ui.html

## Available Endpoints

The Swagger UI will display all available endpoints from your application:

- **POST /students/save**: Create a new student
- **DELETE /students/delete/{id}**: Delete a student by ID
- **GET /students/all**: Get all students
- **GET /students/count**: Count students
- **GET /students/byYear**: Get students grouped by year

## Using Swagger UI for Frontend Integration

1. **API Documentation**: Swagger provides complete documentation of your API, including request/response models, parameters, and status codes.

2. **Testing Endpoints**: Use the "Try it out" feature to test endpoints directly from the browser.

3. **Frontend Integration**:
   - Use the Swagger-generated documentation to understand the API structure
   - Copy request/response examples for frontend development
   - Use the API URL patterns shown in Swagger for your frontend API calls

4. **OpenAPI Specification**: You can also access the raw OpenAPI specification at http://localhost:8080/api-docs, which can be used with code generation tools.

## Troubleshooting

If you encounter any issues:

1. Make sure the dependency is correctly added to pom.xml
2. Ensure the application is running
3. Check the console for any error messages
4. Verify that the SwaggerConfig.java file is in the correct package