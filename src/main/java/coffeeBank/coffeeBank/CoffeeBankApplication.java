package coffeeBank.coffeeBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@SpringBootApplication
@EnableJpaAuditing
@EnableScheduling
public class CoffeeBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeBankApplication.class, args);
	}

	@Bean
	public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
		return new HiddenHttpMethodFilter();
	}
}
