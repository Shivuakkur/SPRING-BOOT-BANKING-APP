# SPRING-BOOT-BANKING-APP

This is a Spring Boot Banking Application that allows users to manage their bank accounts. The application supports basic CRUD operations and is tested using Postman API.

## Project Structure
SPRINGBOOT-BANKING-APP ├── src │ ├── main │ │ ├── java/in/shivu │ │ │ ├── controller │ │ │ │ └── AccountController.java│ │ │ ├── entity │ │ │ │ ├── Account.java│ │ │ │ ├── AccountDto.java│ │ │ │ └── AccountMapper.java│ │ │ ├── repository │ │ │ │ └── AccountRepository.java│ │ │ ├── service │ │ │ │ ├── impl │ │ │ │ │ └── AccountServiceImpl.java│ │ │ │ └── AccountService.java│ │ │ └── SpringbootBankingAppApplication.java│ │ ├── resources │ │ │ └── application.properties│ ├── test │ │ └── java/in/shivu ├── target ├── HELP.md├── mvnw ├── mvnw.cmd├── pom.xml└── README.md


## Technologies Used

- **Java**: Core programming language.
- **Spring Boot**: Framework for building the application.
- **Postman**: Tool for API testing.
- **Maven**: Build and dependency management tool.

## Setting Up the Project

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/SPRING-BOOT-BANKING-APP.git
    cd SPRING-BOOT-BANKING-APP
    ```

2. **Build the project**:
    ```bash
    ./mvnw clean install
    ```

3. **Run the application**:
    ```bash
    ./mvnw spring-boot:run
    ```

## Project Details

### 1. Controllers
- **AccountController.java**: Handles the REST API endpoints for account operations.

### 2. Entities
- **Account.java**: Represents the bank account entity.
- **AccountDto.java**: Data Transfer Object for Account.
- **AccountMapper.java**: Mapper for converting between Account and AccountDto.

### 3. Repositories
- **AccountRepository.java**: Interface for CRUD operations on Account entities.

### 4. Services
- **AccountService.java**: Interface for account-related business logic.
- **AccountServiceImpl.java**: Implementation of the AccountService interface.

### 5. Main Application
- **SpringbootBankingAppApplication.java**: Entry point of the Spring Boot application.

### 6. Configuration
- **application.properties**: Contains application configuration properties.

## Testing the API

You can test the API using Postman by importing the provided Postman collection or creating your own requests. The API endpoints are documented within the project.

## Contributing

Feel free to fork this repository and contribute by submitting a pull request. For any issues or feature requests, please open an issue in the repository.

## License

This project is licensed under the MIT License.

---


