# JMS 消息队列学习


1. [深入浅出JMS(-)JMS 概念](http://blog.csdn.net/jiuqiyuliang/article/details/46701559)
2. [ActiveMQ API 详解(很详细请认真阅读，在实现了下面3.的简单实例后)](http://blog.csdn.net/u011216417/article/details/51470004)
3. [JMS的实现者ActiveMQ的queue和topic的基本实例](http://blog.csdn.net/qq383264679/article/details/51163144)
    需要注意，这里面事物开关，以及 connection和session的开关。
4. [JMS中消息的两种消费方式](#两种消费方式-与-queue-和-topic-无关)
5. [Spring 整合，单纯的spring 整合](http://blog.csdn.net/yuguiyang1990/article/details/12714291)
6. Spring-jms
    1. [Spring-jms 模块详解 JMSTemplate](http://www.cnblogs.com/davidwang456/p/4451757.html)
    2. [用Spring JMS使异步消息变得简单](http://www.51cto.com/specbook/223/33335.htm)
7. JMS集成 spring的问题
    1. xml配置的问题，中amq 和 jms有问题
    2. jms 模版的学习也欠缺



## 两种消费方式 (与 queue 和 topic 无关)
1. 同步
>订阅者或者接受者调用receive来接受信息，receive方法在能够接收到消息之前（或超时之前）将一直阻塞 。
`consumer.receive(100000);`，这句代码会阻塞代码的结束。
2. 异步
>订阅者或接收者可以注册为一个消息监听器。当消息到达之后，系统自动调用监听器的onMessage方法。
 这个就和node里面的回调函数很像。
 





