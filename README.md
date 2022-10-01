# SpringBootIMPAnnotaion

1. @SpringBootApplication : this annotation equivalent of three annotation

   * @Configuration  
   * @EnableAutoConfiguration
   * @ComponentScan

2. @Configuration :

       @Configuration annotation part of  Spring Core FrameWork. @Configuration indicate that the class has @Bean Defination Methods 
        so spring containor the class and generate bean use in application.	   

   this return the bean

   basically bean object return


3. @Autowired : it used for injecting for dependency

    1. Setters
    2. Constructors
    3. using literals



4. @Component: @Component is an annotation that allows Spring to automatically detect our custom beans.
   In other words, without having to write any explicit code, Spring will: Scan our application for classes annotated with @Component.

    1. @Controller(Presentation Layer)
    2. @Service Layer (service layer this user for business logic)
    3. @Repository (Data Layer((Data Access Object))

5. @ComponentScan:

Using @ComponentScan in a Spring Application. With Spring, we use the @ComponentScan annotation along with the
@Configuration annotation to specify the packages that we want to be scanned.
@ComponentScan without arguments tells Spring to scan the current package and all of its sub-packages.



6. @Qualifier : it used for differentiate same been type of object

