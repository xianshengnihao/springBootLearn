package hwg.springbootlearn.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hwg
 * @Date: Create in 2019/12/24
 */
@RestController
public class SecurityController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Security!";
    }


}
