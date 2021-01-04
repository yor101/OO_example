package Lo4.example.Lo4exampleOO;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int aid;
    private String name;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Hallo... im a Alien from...");
    }
}
