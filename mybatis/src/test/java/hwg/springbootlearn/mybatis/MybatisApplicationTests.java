package hwg.springbootlearn.mybatis;

import hwg.springbootlearn.model.User;
import hwg.springbootlearn.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
class MybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
        List<User> allUsers = userMapper.getAllUser();
        System.out.println(allUsers.stream());
    }

}
