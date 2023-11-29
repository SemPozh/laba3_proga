package Objects;

public class Bundle extends Pack{
    public Bundle(String name) {
        super(name);
    }

    public Bundle(String name, int countThings) {
        super(name, countThings);
    }

    @Override
    public void fill(Obj[] objects) {
        String bundleName = super.getName();
        int countThings = super.getCountThings();
        System.out.print(" в каждом "+ bundleName.substring(0, bundleName.length()-2)+"ке" + " по " + countThings+", ");
        for (Obj o : objects){
            System.out.print(o);
        }
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
