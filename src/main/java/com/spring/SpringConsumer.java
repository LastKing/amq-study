package com.spring;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.TextMessage;

/**
 * 创建消费者
 * Created by Rain on 2017/3/20.
 */
@Service
public class SpringConsumer {
    @Resource
    private JmsTemplate jmsTemplate;

    //xml用
//    public void setJmsTemplate(JmsTemplate jmsTemplate) {
//        this.jmsTemplate = jmsTemplate;
//    }

    //接收消息
    public void receive() {
        while (true) {
            try {
                jmsTemplate.setReceiveTimeout(3000);
                //使用JMSTemplate接收消息
                TextMessage txtmsg = (TextMessage) jmsTemplate.receive();
                if (null != txtmsg) {
                    System.out.println("--- 收到消息内容为: " + txtmsg.getText());
                } else {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
