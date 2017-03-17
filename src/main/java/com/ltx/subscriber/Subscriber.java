package com.ltx.subscriber;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.util.Date;

/**
 * 发布者
 * Created by Rain on 2017/3/17.
 */
public class Subscriber {

    public static void main(String[] args) {
        ConnectionFactory factory = new ActiveMQConnectionFactory(
                ActiveMQConnectionFactory.DEFAULT_USER, ActiveMQConnectionFactory.DEFAULT_PASSWORD,
                "tcp://localhost:61616");

        try {
            Connection connection = factory.createConnection();
            connection.start();

            Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);

            Destination topic = session.createTopic("firstTopic");

            MessageConsumer consumer = session.createConsumer(topic);

            consumer.setMessageListener(new MessageListener() {
                @Override
                public void onMessage(Message message) {
                    TextMessage textMessage = (TextMessage) message;
                    try {
                        String msg = textMessage.getText();

                        System.out.println("收到的消息是 : " + msg + "---- 受到时间" + new Date().toString());

//                        Thread.sleep(30000);
//                        session.close();
//                        connection.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });


        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}
