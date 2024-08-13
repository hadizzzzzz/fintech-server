package demo.demo.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
   ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

   // 빈에 등록된 객체 디버그
//    String[] icoNames = context.getBeanDefinitionNames();
//    for (String icoName : icoNames) {
//        System.out.println(icoName);
//    }
    }

}
