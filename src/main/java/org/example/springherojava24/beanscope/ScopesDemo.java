package org.example.springherojava24.beanscope;

import org.example.springherojava24.beanscope.config.ScopeLifecycleConfig;
import org.example.springherojava24.beanscope.scopes.PrototypeMessageHolder;
import org.example.springherojava24.beanscope.scopes.SingletonMessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopesDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ScopeLifecycleConfig.class);

        System.out.println("\n--- Singleton Scope Demo ---");
        SingletonMessageService s1 = context.getBean(SingletonMessageService.class);
        SingletonMessageService s2 = context.getBean(SingletonMessageService.class);

        s1.showMessage("Hello from s1!");
        s2.showMessage("Hello from s2!");

        System.out.println("s1 == s2 : " + (s1 == s2)); // Should be true
        System.out.println("s1 creation time: " + s1.getCreationTime());
        System.out.println("s2 creation time: " + s2.getCreationTime()); // Should be the same as s1

        System.out.println("\n--- Prototype Scope Demo ---");
        PrototypeMessageHolder p1 = context.getBean(PrototypeMessageHolder.class);
        PrototypeMessageHolder p2 = context.getBean(PrototypeMessageHolder.class);

        p1.setMessage("Message for p1");
        p2.setMessage("Message for p2");

        System.out.println("p1.getMessage(): " + p1.getMessage());
        System.out.println("p2.getMessage(): " + p2.getMessage());

        System.out.println("p1 == p2 : " + (p1 == p2)); // Should be false
        System.out.println("p1 creation time: " + p1.getCreationTime());
        System.out.println("p2 creation time: " + p2.getCreationTime()); // Should be different from p1

        // Closing the context
        ((AnnotationConfigApplicationContext) context).close();
    }

}
