import java.util.*;

public class Main {

    public static void main(String[] args) {

           int scelta;
        Scanner in=new Scanner(System.in);
        System.out.println("Cosa vuoi aggiungere? 1) Auto   2) Moto   3) Camion");
        scelta=in.nextInt();
        switch (scelta){
            case 1: {
                Auto car = new Auto();
                car.getAuto();
                break;
            }
        }
    }
}