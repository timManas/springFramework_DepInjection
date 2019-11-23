package timanas.springframework;

import timanas.springframework.controllers.ConstructorInjectedController;
import timanas.springframework.controllers.GetterInjectedController;
import timanas.springframework.controllers.MyController;
import timanas.springframework.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}


/**

 Notice:
 - There is no mention of "new" keyword anywhere
 - No instantiation
 - Bean gets created by Spring framework
 - We asked context which holds reference to the bean to call a method to call hello()
 - Property based and setter based DI requires "@AutoReWired" ...only constructor based doesent
 - Remember that constructor based DI is the most preferred
 - Use @Qualifier - when you create more than one bean of the same type and want to wire only one of them with a property
 - @Qualifier("getterGreetingService") - the argument is the bean name
 - Use the @Qualifier annotation along with @Autowired to remove the confusion by specifying which exact bean will be wired.
-- @Primary - If there is more than one mean then use this one
 Questions
 1. What are the annotations of Spring ?
 2. What is the lifecycle of Spring ?



 */
