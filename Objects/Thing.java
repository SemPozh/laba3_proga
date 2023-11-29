package Objects;

import Interfaces.Property;

import java.util.Objects;

// Класс для неживых объектов, которые не смогут дейстовать
public class Thing extends Obj{
    public Thing(String name){
        super(name);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        Thing thing = (Thing) o;
        return Objects.equals(name.toLowerCase(), thing.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void wrapThing(Thing wrapper){
        System.out.print(", завернутыми в " + wrapper + ",");
    }

    public void fare(){
        System.out.print("оказалась " + this);
    }
}
