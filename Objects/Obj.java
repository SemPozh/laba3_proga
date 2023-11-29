package Objects;

import Interfaces.Property;

public abstract class Obj implements Property {
    protected String name;

    public Obj(String name){
        this.name = name;
    }

    @Override
    public void addProperties(String property) {
        this.name = " " + property + " " + this.name;
    }

    @Override
    public void removeAllProperties() {
        String[] words = this.name.split(" ");
        this.name = words[words.length -1];
    }
}
