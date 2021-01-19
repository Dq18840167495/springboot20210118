package cn.kgc;

import cn.kgc.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class DemoApplicationTests {
@Autowired
 private User user;
    @Test
    void contextLoads() {
        System.out.println(user);
    }

}
