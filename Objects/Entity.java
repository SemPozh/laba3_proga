package Objects;

import Enums.Action;
import Enums.FamilyMember;
import Enums.Gender;
import Interfaces.Property;

// Класс со всеми объектами, которые смогут двигаться
public class Entity extends Obj {

    private String name;
    final private Gender sex;
    final private String ending;

    public Entity(String name, Gender sex){
        super(name);
        this.name = name;
        this.sex = sex;
        this.ending = sex.getName();
    }

    public void setName(String name){
        this.name = name;
    }

    public void doSomething(Action act){
        switch (act){
            case fold:
                System.out.println(this.name + " сложил" + this.ending);
                break;
            case see:
                System.out.println(this.name + " увидел" + this.ending);
                break;
            case makeWrites:
                if ((this.getClass() == MumiTroll.class) & ((MumiTroll) this).getFamilyMember()== FamilyMember.mother){
                    System.out.print("их сделал" + ending +  "мама");
                }
            case write:
                System.out.print(this.name + " написал" + this.ending);
            case takeСare:
                System.out.print(this.name + " берег" + this.ending);
        }
    }

    public void doSomething(Action act, Obj obj){
        switch (act){
            case fold:
                System.out.print(this.name + " сложил"+ ending + obj.name);
                break;
            case see:
                System.out.print(this.name + " увидел"+ ending + obj.name);
                break;
            case write:
                System.out.print(this.name + " написал" + this.ending + ": " + '"' + obj.name + '"');
        }
    }

    public Gender getGender(){
        return this.sex;
    }

    @Override
    public String toString(){
        return name;
    }
}