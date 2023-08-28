package edu.wctc.dice;

import edu.wctc.dice.Dice.Dice;
import edu.wctc.dice.Dice.GameInput;
import edu.wctc.dice.Dice.GameOutput;
import edu.wctc.dice.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.dice")
public class AppConfig {
    @Bean
    public GameOutput gameOutput(){
        return new ConsoleOutput();
       // return new GUIoutput();
    }
    @Bean
    public GameInput gameInput(){
        return new ConsoleInput();
    }

    @Bean
    public Dice theDice(){
        return new DiceTwenty();
    }

}
