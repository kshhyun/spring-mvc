package Hello.hello_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		// main method에 위의 class를 넣어서 실행해주면 springboot app 실행 됨
		// 그 과정에서 내장된 톰켓이라는 웹서버를 자체적으로 띄우면서 springboot가 같이 올라옴.
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
