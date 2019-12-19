# Spring cloud metrics

## Create test Spring Cloud REST project

Follow guide from [initializr](https://github.com/spring-io/initializr), create test project by: 

```sh
curl https://start.spring.io/starter.tgz -d dependencies=web -d language=java -d type=maven-project -d name=spring-metrics -d groupId=com.example.spring.metrics -d artifactId=spring-metrics -o demo.tgz
```


## Create simple REST

## [Run spring cloud services in develop environment](https://cloud.spring.io/spring-cloud-cli/reference/html/#_running_spring_cloud_services_in_development)

```sh
brew tap pivotal/tap
brew install springboot
spring cloud eureka configserver 
```
