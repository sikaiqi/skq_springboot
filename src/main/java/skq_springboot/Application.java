package skq_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("skq_springboot.dao")
public class Application {
	
	public static void main(String[] args) {
		//程序启动入口
		//调用内嵌的tomcat 初始化spring环境和各种spring组件
		SpringApplication.run(Application.class, args);
	}
	
}
