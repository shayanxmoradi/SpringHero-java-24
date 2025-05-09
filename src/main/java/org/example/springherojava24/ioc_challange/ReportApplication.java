package org.example.springherojava24.ioc_challange;

import org.example.springherojava24.ioc.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReportApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigC.class);
        String httmlReporterBean = "httmlReporterBean";
        String plainTextBean = "plaintext";
        ReportGenerator plainGenerator = context.getBean(plainTextBean, ReportGenerator.class);
        ReportGenerator htmlGenerator = context.getBean(httmlReporterBean, ReportGenerator.class);
       System.out.println(plainGenerator.generateReport("asghar baghal hastam"));
        System.out.println(htmlGenerator.generateReport("asghar baghal hastam"));
        ((AnnotationConfigApplicationContext) context).close();

    }
}
