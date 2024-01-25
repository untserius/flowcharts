package arrays;
public class BookTheatreSeat {

    int total_seats = 10;

    synchronized public void bookSeat(int seats) {

        if (total_seats >= seats) {

            System.out.println("seats booked!");
            total_seats = total_seats-seats;
            System.out.println("seats left.." +total_seats);

        } else {

            System.out.println("seats can't be booked");
            System.out.println("seats left: " +total_seats);

        }


    }
}
class MovieBokApp extends Thread{

    static BookTheatreSeat b;
    int seats;
    public void run() {

        b.bookSeat(seats);
    }

    public static void main(String[] args) {

        b = new BookTheatreSeat();

        MovieBokApp deepak = new MovieBokApp();
        deepak.seats = 7;
        deepak.start();

        MovieBokApp amit = new MovieBokApp();
        amit.seats = 6;
        amit.start();
    }

}
