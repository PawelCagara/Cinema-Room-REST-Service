package cinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        Seat seat = new Seat(4,5);



        //System.out.println(stats.getNumber_of_purchased_tickets());
        //System.out.println(stats.getNumber_of_avaiable_seats());
        //RoomController rC = new RoomController();
        //rC.purchase(seat);
        //System.out.println(stats.getNumber_of_purchased_tickets());
        //System.out.println(stats.getNumber_of_avaiable_seats());

    }
}
