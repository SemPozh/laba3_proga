package Objects;

import Interfaces.Fillable;

public class Basket extends Pack {

    public Basket(String name){
        super(name);
    }

    @Override
    public void fill(Obj[] objects) {
        System.out.print(" была наполнена");
        for (Obj o : objects){
            String text = o.toString();
            text = text.substring(0, text.length()-1) + "ами";
            System.out.print(text);
        }
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
