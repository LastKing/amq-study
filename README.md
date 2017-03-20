# JMS 消息队列学习


1. [深入浅出JMS(-)JMS 概念](http://blog.csdn.net/jiuqiyuliang/article/details/46701559)
2. [JMS的实现者ActiveMQ的queue和topic的基本实例](http://blog.csdn.net/qq383264679/article/details/51163144)
    需要注意，这里面事物开关，以及 connection和session的开关。
3. [JMS中消息的两种消费方式]
4. [Spring 整合，单纯的spring 整合](http://blog.csdn.net/yuguiyang1990/article/details/12714291)
5. [Spring-jms 模块详解 JMSTemplate](http://www.cnblogs.com/davidwang456/p/4451757.html)

6. JMS集成 spring的问题
    1. xml配置的问题，中amq 和 jms有问题
    2. jms 模版的学习也欠缺



## 两种消费方式 (与 queue 和 topic 无关)
1. 同步
>订阅者或者接受者调用receive来接受信息，receive方法在能够接收到消息之前（或超时之前）将一直阻塞 。
`consumer.receive(100000);`，这句代码会阻塞代码的结束。
2. 异步
>订阅者或接收者可以注册为一个消息监听器。当消息到达之后，系统自动调用监听器的onMessage方法。
 这个就和node里面的回调函数很像。
 





