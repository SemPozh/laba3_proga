package Objects;

import Enums.Action;
import Enums.FamilyMember;
import Enums.Gender;
import java.util.Objects;

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
                break;
            case write:
                System.out.print(this.name + " написал" + this.ending);
                break;
            case takeСare:
                System.out.print(this.name + " берег" + this.ending);
                break;
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
                break;
        }
    }

    public Gender getGender(){
        return this.sex;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Entity entity = (Entity) o;
        return Objects.equals(ending, entity.ending) && Objects.equals(name.toLowerCase(), entity.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(ending);
    }
}