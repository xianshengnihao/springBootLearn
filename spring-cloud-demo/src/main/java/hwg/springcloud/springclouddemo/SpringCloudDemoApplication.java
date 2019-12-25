package hwg.springcloud.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudDemoApplication {

    @GetMapping("/hello")
    public String HelloController(){
        return "hello";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoApplication.class, args);
    }



}
