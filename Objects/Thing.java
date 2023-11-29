package Objects;

import Interfaces.Property;

// Класс для неживых объектов, которые не смогут дейстовать
public class Thing extends Obj{
    public Thing(String name){
        super(name);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void wrapThing(Thing wrapper){
        System.out.print(", завернутыми в " + wrapper + ",");
    }

    public void fare(){
        System.out.print("оказалась " + this);
    }
}
