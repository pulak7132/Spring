package com.pulak.springframework.n3didemo;

import com.pulak.springframework.n3didemo.controllers.ConstructorInjectedController;
import com.pulak.springframework.n3didemo.controllers.MyController;
import com.pulak.springframework.n3didemo.controllers.PropertyInjectedController;
import com.pulak.springframework.n3didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
//@PropertySources({
//        @PropertySource("classpath:datasource.properties"),
//        @PropertySource("classpath:jms.properties")
//})
public class N3DiDemoApplication {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("xml path");

        ApplicationContext context = SpringApplication.run(N3DiDemoApplication.class, args);
//        AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext("....xml")
        MyController myController = context.getBean("myController", MyController.class);
        System.out.println(myController.hello());
        ConstructorInjectedController constructorInjectedController =
                context.getBean("constructorInjectedController", ConstructorInjectedController.class);
        System.out.println(constructorInjectedController.sayHello("Constructor"));
        SetterInjectedController setterInjectedController =
                context.getBean("setterInjectedController", SetterInjectedController.class);
        System.out.println(setterInjectedController.sayHello("Setter"));
        PropertyInjectedController propertyInjectedController =
                context.getBean("propertyInjectedController", PropertyInjectedController.class);
        System.out.println(propertyInjectedController.sayHello("Property"));


    }

}
