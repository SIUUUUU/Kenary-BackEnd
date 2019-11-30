package test;

import com.siuuu.domain.Session;
import com.siuuu.domain.User;
import com.siuuu.repository.SessionRepository;
import com.siuuu.service.SessionService;
import com.siuuu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    UserService userService;

    @Autowired
    SessionRepository sessionRepository;

    @Test
    public void createuser(){
        User user = new User();
        user.setuPhoto("TestPhoto");
        user.setuFirstName("Test");
        user.setuLastName("Er");
        user.setuUsername("tester1");
        user.setuPassword("tester123");
        user.setuBirthday("11/11/2011");
        user.setuCountry("TesterLand");
        user.setuInstitution("Tester Uni");
        user.setuGender("Test Male");
        user.setuDegree("Tester");
        user.setuType("Testing");
        user.setuCareer("Testy");
        List<Session> sessions = sessionRepository.findAll();
        userService.save(user);
        User userTest = userService.findSessionsByUser("tester1");
        assertThat(userTest).isNotNull();
        userService.remove(userTest);
    }
}