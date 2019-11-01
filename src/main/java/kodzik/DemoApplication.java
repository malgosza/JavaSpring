package kodzik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

          //Udemy Course
//        Coach theCoach=new TrackCoach();
//        System.out.println(theCoach.getDailyWorkout());



        //--------------------------------------------------------------------------
        // rzeczy robione z Kamilem

//        ApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);

//        Podworko podworko =(Podworko) ctx.getBean("podworko"); //==ctx.getBean(Podworko.class);
//        podworko.spacer();
//
//        Piesek bean = ctx.getBean(Piesek.class);
//        bean.Szczekaj();
    }

}
