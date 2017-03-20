package com.spring;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by Rain on 2017/3/20.
 */
@Service
public class SpringProducer {

    //Spring的模板，封装了很多功能
    @Resource
    private JmsTemplate jmsTemplate;

    //xml用
//    public void setJmsTemplate(JmsTemplate jmsTemplate) {
//        this.jmsTemplate = jmsTemplate;
//    }

    public void send() {
        //使用JMSTemplate可以很简单的实现发送消息
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage("地瓜！地瓜！");
            }
        });
    }

}
