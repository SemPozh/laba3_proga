package Objects;

import Interfaces.Property;

// Класс для неживых объектов, которые не смогут дейстовать
public class Thing extends Obj implements Property {
    public Thing(String name){
        super(name);
    }

    @Override
    public void addProperties(String property) {
        super.name = property + " " + super.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void wrapThing(Thing wrapper){
        System.out.print(", завернутыми в " + wrapper + ",");
    }
}
