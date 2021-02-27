package ma.tecmind.TP1boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Tp01Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp01Application.class, args);
	}

}
