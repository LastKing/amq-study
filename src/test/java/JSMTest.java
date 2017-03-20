import com.spring.SpringConsumer;
import com.spring.SpringProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * JMS 测试类
 * Created by Rain on 2017/3/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-jms.xml"})
public class JSMTest {
    @Resource
    private SpringConsumer springConsumer;

    @Resource
    private SpringProducer springProducer;

    @Test
    public void test() {

        SpringProducer producer = springProducer;
        producer.send();

        SpringConsumer consumer = springConsumer;
        consumer.receive();
    }

}
