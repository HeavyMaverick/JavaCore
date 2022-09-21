package source;
import java.util.*;

public class GameLogic<c> {


    public static double getRandomNumber(){
        double x = Math.random()*3;
        int c = 0;
        if (x > 2.5){
            c = 3;
            return c;
        }
        else if (x > 1.5){
            c = 2;
            return c;
        }
        else if (x < 1.5){
            c = 1;
            return c;
        }
        return c;
    }

/*    public static List<String> getPlanetAtmosphere(int seqNumberFromSun) {
        List<String> result = new ArrayList<>();
        switch (c){
            case 1:

        }

        return result;
    }
}
