package Lo4.example.Lo4exampleOO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lo4exampleOoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Lo4exampleOoApplication.class, args);

		Alien a = context.getBean(Alien.class);

		a.show();


	}

}
