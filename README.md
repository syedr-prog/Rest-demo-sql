# Springboot Restful api with SQL
## Configurations
### Dependencies
- Update all dependencies in pom.xml
  - We need mysql, web, spring data jpa dependencies
![img.png](img.png)

### Installing Dependencies
- open project in command prompt or terminal
  ```cmd 
  mvn install
  ```

### Errors
- There will be a datasource error
  - ![img_1.png](img_1.png)
  - Jdbc is how connection is established.
  - You could resolve it by adding database information in resources/application.properties file or adding a application.yaml file. Name the database cloud_vendor
    ```yaml
    spring: 
      datasource:
        url: jdbc:mysql://localhost:3306/cloud_vendor?useSSL=false 
        username: 
        password:
    
    #JPA Settings
    jpa.hibernate.ddl_auto: create
    ```
    - Not having a bean for openapi will also result in error
    - ![img_2.png](img_2.png)
    - to solve this add bean in the spring start page

### Testing
- Run the spring application first before running tests
