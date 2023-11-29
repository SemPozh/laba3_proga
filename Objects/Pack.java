package Objects;

import Interfaces.Fillable;

public class Pack extends Thing implements Fillable {
    private String name;
    private int countThings;

    public Pack(String name) {
        super(name);
        this.name = name;
    }

    public Pack(String name, int countThings){
        super(name);
        this.name = name;
        this.countThings = countThings;
    }

    public String getName(){
        return this.name;
    }

    public  int getCountThings(){
        return this.countThings;
    }


    @Override
    public void fill(Obj[] objects) {

    }
}
