package in.techcamp.issueapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("in.techcamp.issueapp")  // この行を追加
public class IssueAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssueAppApplication.class, args);
	}
}
