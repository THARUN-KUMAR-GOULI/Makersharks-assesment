# Makersharks Assessment
***

## Overview
* Makersharks is a full-stack project designed to facilitate the search and retrieval of supplier information based on various criteria such as location, nature of business, and manufacturing process.
* The is a backend project developed using Spring Boot, H2 database for efficient data storage.

***

## Features
* **`Supplier Management`**: Manage supplier information including `company name`, `website`, `location`, `nature of business`, and `manufacturing process`.
* **`Search Functionality`**: Search suppliers based on location, nature of business, and manufacturing process.
* **`Pagination`**: Supports paginated results to handle large datasets efficiently.
* **`Exception Handling`**: Comprehensive error handling to provide meaningful error messages and status codes.
* **`H2 Database`**: In-memory database for development and testing purposes.

***

## API Endpoint
* **`Endpoint`**: /api/supplier/query
* **`Method`**: POST
* **`parameters required`** : page:< page-number >&size:< no.of elements >.

#### Data with No specifications

* Query to retrieve first 10 suppliers data - **`http://localhost:8080/api/supplier/query?page=0&size=10`**
* Query to retrieve next 10 suppliers data - **`http://localhost:8080/api/supplier/query?page=1&size=10`**

#### Data with specifications
* **Example 1** : `location is India` & `nature of business is large_scale`.
* **`http://localhost:8080/api/supplier/query?location=India&natureOfBusiness=large_scale&page=0&size=10`**

* **Example 2** : `nature of business is small_scale` & `manufcturing process is moduling`.
* **`http://localhost:8080/api/supplier/query?&natureOfBusiness=small_scale&manufacturingProcess=moduling&page=0&size=10`**

* In this way, a user can able to get the data according to the specifications provided.

***

## Data Storage
* The **`DataLoaderService`** class is responsible for initializing the database with supplier data.

* The project uses an **`H2 in-memory database`** for storing supplier data. The database is configured with the following properties:
* **`username`** - Tharun
* **`password`** - TharunGouli

***

## Exception Handling
* The project includes **`global exception handling`** to manage various types of errors:

* **`Validation Errors`**: Returns a 400 Bad Request with validation errors.
* **`Entity Not Found`**: Returns a 404 Not Found if an entity is not found.
* **`General Exceptions`**: Returns a 500 Internal Server Error for other exceptions.

***

## Running the application
* ### 1.Clone the Repository
* `git clone https://github.com/THARUN-KUMAR-GOULI/Makersharks-assesment

* ### 2.Navigate to the project directory
* `cd Makersharks-assesment`.

* After successful start of application

* ### 3. Access the H2 console
* `http://localhost:8080/h2-console`.
* JDBC URL - `JDBC URL: jdbc:h2:file:./data/testdb`

***

## Conclusion
The Makersharks-Assessment project showcases the integration of a Spring Boot backend with an H2 database to efficiently handle supplier data queries. By leveraging Spring Data JPA, the application provides flexible and efficient data retrieval capabilities, enabling users to search based on various criteria such as location, nature of business, and manufacturing process. The project also demonstrates best practices in exception handling, pagination, and data serialization to ensure robust and scalable API performance.




