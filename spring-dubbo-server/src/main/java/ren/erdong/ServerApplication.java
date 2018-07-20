package ren.erdong;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Spring Boot 应用启动类
 */
// Spring Boot 应用的标识
@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		// 程序启动入口
		// 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			String[] beans = ctx.getBeanDefinitionNames();
			System.out.println("开始输出。。。");
			for (String bean : beans) {
				if (bean.startsWith("d") || bean.startsWith("D")) {
					System.out.println(bean);
				}
			}
			System.out.println("输出结束。。。");
		};
	}
}