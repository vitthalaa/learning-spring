package com.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String args[]) {
        // load application context from spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container  which is defined in config xml file
        Coach cricketCoach = context.getBean("cricketCoach", Coach.class);

        // call methods on bean
        System.out.println(cricketCoach.getCoachingLesson());
        System.out.println(cricketCoach.getFortune());

        Coach hockeyCoach = context.getBean("hockeyCoach", Coach.class);
        System.out.println(hockeyCoach.getCoachingLesson());
        System.out.println(hockeyCoach.getFortune());

        context.close();
    }
}
