package Objects;

import Interfaces.Fillable;

public class Basket extends Thing implements Fillable {
    private String name;

    public Basket(String name){
        super(name);
        this.name = name;
    }

    @Override
    public void fill(Obj[] objects) {
        System.out.print(" была наполнена");
        for (Obj o : objects){
            System.out.print(o);
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}