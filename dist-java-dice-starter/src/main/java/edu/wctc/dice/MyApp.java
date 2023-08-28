package edu.wctc.dice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        ((DiceGame)context.getBean("diceGame")).play();

        int a = 5;


       // Object o = context.getBean("diceGame");
       // DiceGame d = (DiceGame)o;
       // d.play();
    }
}
