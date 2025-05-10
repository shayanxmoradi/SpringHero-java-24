package org.example.springherojava24.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiConstructorDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigDI.class);
        OrderService orderService = context.getBean(OrderService.class);
        OrderServiceSetter orderServiceSetter = context.getBean(OrderServiceSetter.class);
        OrderServiceFieldInjection orderServiceFieldInjection = context.getBean(OrderServiceFieldInjection.class);
        orderServiceFieldInjection.placeOrder("12",123);

        ((AnnotationConfigApplicationContext) context).close();

    }
}
