package foo.bar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ServiceImpl {

    @Resource
    private Person param1;

    public Person getParam1() {
        return param1;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        ServiceImpl service = ctx.getBean("myService", ServiceImpl.class);

        System.out.println(service.getParam1());
    }
}