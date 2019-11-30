package test;

import com.siuuu.controller.SessionController;
import com.siuuu.controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class KenaryTests {

    @Autowired
    UserController userController;

    @Autowired
    SessionController sessionController;

    @Test
    public void contextLoads(){
        assertThat(userController).isNotNull();
        assertThat(sessionController).isNotNull();
    }
}