import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private UserRepository userRepository = Mockito.mock(UserRepository.class);


    @Test
    public void sprawdzWiekEmerytalnyTest(){

        UserManagment userManagmet = new UserManagment();
        User user = userManagmet.getUserById(1);

        assertEquals(67, user.getWiekEmerytalny);


    }
}
