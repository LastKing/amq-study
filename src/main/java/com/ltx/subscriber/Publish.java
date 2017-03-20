package com.ltx.subscriber;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTextMessage;

import javax.jms.*;
import java.util.Date;


/**
 * 发布者
 * Created by Rain on 2017/3/17.
 */
public class Publish {

    public static void main(String[] args) {
        ConnectionFactory factory = new ActiveMQConnectionFactory(
                ActiveMQConnection.DEFAULT_USER, ActiveMQConnection.DEFAULT_PASSWORD,
                "tcp://localhost:61616");

        try {
            Connection connection = factory.createConnection();
            connection.start();

            Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);

            Destination topic = session.createTopic("firstTopic");

            MessageProducer producer = session.createProducer(topic);

            TextMessage textMessage = new ActiveMQTextMessage();
            textMessage.setText("我发怂的信息" + new Date().toString());

            producer.send(textMessage);
//            session.commit(); //因为开启session的 ，选择了 false ，这里不能使用commit

            session.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
