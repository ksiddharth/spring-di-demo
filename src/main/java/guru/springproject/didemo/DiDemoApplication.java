package guru.springproject.didemo;

import guru.springproject.didemo.config.FakeDataSourceModel;
import guru.springproject.didemo.config.FakeJMSModel;
import guru.springproject.didemo.controller.ConstructorInjectedController;
import guru.springproject.didemo.controller.MyController;
import guru.springproject.didemo.controller.PropertyInjectedController;
import guru.springproject.didemo.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springproject.didemo","guru.springproject.service"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController ctrlr = (MyController)ctx.getBean("myController");

        System.out.println(ctrlr.printHello());
        System.out.println(((PropertyInjectedController)ctx.getBean("propertyInjectedController")).sayHello());
        System.out.println(((SetterInjectedController)ctx.getBean("setterInjectedController")).sayHello());
        System.out.println(((ConstructorInjectedController)ctx.getBean("constructorInjectedController")).sayHello());
        System.out.println(((FakeDataSourceModel)ctx.getBean("fakeDataSourceModel")));
        System.out.println(((FakeJMSModel)ctx.getBean("fakeJMSModel")));
    }

}
