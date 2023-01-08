package dat3.example.players.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hus {

    @Id
    int husnummer;

    public void tester(){
        System.out.println("ingen ting");
    }
}
