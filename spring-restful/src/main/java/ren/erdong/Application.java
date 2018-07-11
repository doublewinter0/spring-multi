/*
 * This line is for God!
 * Created by erdong on 2018/6/30 15:08
 * One is Gauss, and another is Évariste Galois.
 */

package ren.erdong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("ren.erdong.dao")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Spring 初始化完成！");
			System.out.println("本次初始化 Bean 的个数：" + ctx.getBeanDefinitionCount());
		};
	}
}
