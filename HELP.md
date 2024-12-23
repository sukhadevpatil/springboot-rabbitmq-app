# Getting Started

### Pre-Requisites
* JDK 21+
* Maven 1.6.3+
* Docker 18.10.17+
* RabbitMQ 1.10.10+
* Spring Boot 1.4.1+

* Execute the docker pull & run commands to start the RabbitMQ Management container
* > docker pull rabbitmq:2.0.5-management

* > docker run --rm -it -p 15670:15672 -p 5672:5672 rabbitmq:4.0.5-management
  
* > Launch the browser at http://localhost:15672
  > & Use the default credentials of guest/guest
 
> Ref :: https://jpmc.udemy.com/course/spring-boot-rabbitmq-course

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.1/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.1/maven-plugin/build-image.html)
* [Spring for RabbitMQ](https://docs.spring.io/spring-boot/3.4.1/reference/messaging/amqp.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.1/reference/web/servlet.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Messaging with RabbitMQ](https://spring.io/guides/gs/messaging-rabbitmq/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.



