package kodzik.UdemyCourse;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //load the spring configuration file
        SpringApplication.run(HelloSpringApp.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloSpringApp.class);

        //retrieve bean from spring container
        Coach theCoach=context.getBean("myCoach", Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        //context.close();
    }
}
