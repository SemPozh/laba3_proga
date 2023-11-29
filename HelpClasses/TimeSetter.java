package HelpClasses;

import Enums.Place;
import Enums.Time;

public class TimeSetter {
    public static void setTime(Time time){
        switch (time){
            case suddenly:
                System.out.print("Вдруг ");
                break;
            case sinceSpring:
                System.out.print("с весны");
                break;
        }
    }
}
