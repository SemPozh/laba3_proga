package HelpClasses;

import Enums.Place;

public class PlaceSetter {
    public static void setPlace(Place place){
        switch (place){
            case SideBySide:
                System.out.print(" рядом один к одному");
                break;
            case onBundles:
                System.out.print(" на свертках");
                break;
            case onEachOfThem:
                System.out.print("На каждом из них");
                break;
            case onLast:
                System.out.print("На последнем ");
                break;
            case inBundle:
                System.out.print("В свертке ");
                break;
        }
    }
}
