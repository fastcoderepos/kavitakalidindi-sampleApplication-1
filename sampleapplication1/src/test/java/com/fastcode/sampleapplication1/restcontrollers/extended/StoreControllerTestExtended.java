package com.fastcode.sampleapplication1.restcontrollers.extended;

import com.fastcode.sampleapplication1.restcontrollers.core.StoreControllerTest;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = "spring.profiles.active=test")
public class StoreControllerTestExtended extends StoreControllerTest {
    //Add your custom code here
}
