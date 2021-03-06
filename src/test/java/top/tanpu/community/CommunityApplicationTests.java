package top.tanpu.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.tanpu.community.service.TxcService;

@RunWith(SpringRunner.class)
@SpringBootTest
class CommunityApplicationTests {

    @Autowired
    TxcService txcService;

    @Test
    public void contextLoads() {
        txcService.getFeedback();
    }

}
