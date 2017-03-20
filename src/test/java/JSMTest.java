import com.spring.SpringConsumer;
import com.spring.SpringProducer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * JMS 测试类
 * Created by Rain on 2017/3/20.
 */
public class JSMTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "spring-jms.xml");

        SpringProducer producer = (SpringProducer) applicationContext.getBean("springProducer");
        producer.send();

        SpringConsumer consumer = (SpringConsumer) applicationContext.getBean("springConsumer");
        consumer.receive();
    }

}
