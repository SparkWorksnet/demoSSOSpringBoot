# demoSSOSpringBoot
Spring Boot Demo Application for Accessing SparkWorks SSO

### Requirements

+ Java 1.8+
+ Maven 3+
+ Sparks [Account](https://sso.sparkworks.net/aa/registration) with Developer access
+ Sparks Client from [Sparks Accounts](https://accounts.sparkworks.net/dev/client/create)

### Steps

+ Clone code from Github
+ Update application.yml by adding your ClientId (`security.oauth2.client.clientId`) and ClientSecret (`security.oauth2.client.clientSecret`)
+ Run the example using `mvn clean spring-boot:run`
+ Visit [https://localhost:8080/](https://localhost:8080/)
+ You will be redirected to the SparkWorks SSO. Login using your credentials.
+ You will now be redirected back to the demo application and you can see your username in the navbar and a `Logout` button

