import Enums.*;
import Objects.*;

public class Life {
    public static void main(String[] args){
        // creating objects
        Basket basket = new Basket("Она");
        Thing sandwiches = new Thing("бутербродики");
        Thing wrapper = new Thing("бумагу");
        Bundle bundle = new Bundle("сверток", 2);
        Thing content = new Thing("содержимым");
        MumiTroll mumiTroll = new MumiTroll("Муми-тролль", Gender.Male, FamilyMember.son);
        MumiTroll mother = new MumiTroll("мама", Gender.Female, FamilyMember.mother);
        MumiTroll father = new MumiTroll("папа", Gender.Male, FamilyMember.father);
        Thing writes = new Thing("надписи");
        Sandwich cheeseSandwich = new Sandwich("Сыр", mother);
        Sandwich butterSandwich = new Sandwich("Только с маслом", mother);
        Sandwich expSausageSandwich = new Sandwich("Дороая колбаса", mother);
        Sandwich goodMorningSandwich = new Sandwich("С добрым утром!", mother);
        Sandwich[] allSandwiches = {cheeseSandwich, butterSandwich, expSausageSandwich, goodMorningSandwich};
        Thing fromFatherWrite = new Thing("Это от папы");
        Thing crabJar = new Thing("банка крабов");

        Obj[] basketFill = {sandwiches};
        Obj[] bundleFill = {content};

        // adding properties
        wrapper.addProperties("шелковистую");
        sandwiches.addProperties("аккуратными");
        sandwiches.addProperties(" маленькими");
        content.addProperties("с совершенно разным");

        // showing the result
        System.out.print(basket);
        basket.fill(basketFill);
        sandwiches.wrapThing(wrapper);
        bundle.fill(bundleFill);
        System.out.println(". ");
        sandwiches.removeAllProperties();
        mumiTroll.doSomething(Action.fold, sandwiches);

        PlaceSetter.setPlace(Enums.Place.SideBySide);
        mumiTroll.setWantToEat(false);
        System.out.println(". ");

        TimeSetter.setTime(Time.suddenly);
        mumiTroll.setName(mumiTroll.getGender().getPronoun());
        mumiTroll.doSomething(Action.see, writes);
        System.out.print(": ");
        mother.doSomething(Action.makeWrites);
        System.out.println(".");

        PlaceSetter.setPlace(Place.onEachOfThem);
        Sandwich.showSandwiches(allSandwiches);
        System.out.println();
        PlaceSetter.setPlace(Place.onLast);
        mother.doSomething(Action.write, fromFatherWrite);
        System.out.println(".");

        PlaceSetter.setPlace(Place.inBundle);
        crabJar.fare();
        System.out.print(", которую ");
        father.doSomething(Action.takeСare);
        TimeSetter.setTime(Time.sinceSpring);
        System.out.print(".");



    }
}