package Objects;

import Enums.Action;
import Enums.Gender;
import Interfaces.Property;

// Класс со всеми объектами, которые смогут двигаться
public class Entity extends Obj implements Property {

    final private String name;
    final private Gender sex;
    final private String ending;

    public Entity(String name, Gender sex){
        super(name);
        this.name = name;
        this.sex = sex;
        this.ending = sex.getName();
    }

    public void doSomething(Action act){
        if (act == Action.fold){
            System.out.println(this.name + " положил" + this.ending);
        }
    }

    public void doSomething(Action act, Obj o){
        doSomething(act);
        System.out.println( o);
    }

    @Override
    public void addProperties(String property) {
        super.name = " " + property + " " + this.name;

    }

    @Override
    public String toString(){
        return name;
    }



}
