package hello.thymeleafbasic.basic;


import org.springframework.stereotype.Component;

@Component
public class HelloBean {
    public String hello(String data) {
        return "hello " + data;
    }
}
