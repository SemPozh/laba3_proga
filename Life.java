import Objects.Basket;
import Objects.Obj;
import Objects.Sandwich;
import Objects.Thing;

public class Life {
    public static void main(String[] args){
        Basket basket = new Basket("Она");
        Thing sandwiches = new Thing("бутербродиками");
        Thing wrapper = new Thing("бумагу");
        wrapper.addProperties("шелковистую");
        sandwiches.addProperties("аккуратными");
        sandwiches.addProperties(" маленькими");
        System.out.print(basket);
        Obj[] basketFill = {sandwiches};
        basket.fill(basketFill);
        sandwiches.wrapThing(wrapper);
//        System.out.println("Она была набита маленькими аккуратными бутербродиками, завернутыми в шелковистую бумагу, в каждом свертке по два, с самым разным содержимым. Муми-тролль сложил бутербродики рядом один к одному, но есть ему не хотелось. Вдруг он увидел надписи на свертках: их сделала мама. На каждом из них стояло либо \"Сыр\", либо \"Только с маслом\", либо \"Дорогая колбаса\", либо \"С добрым утром!\". На последнем мама написала: \"Это от папы\". В свертке оказалась банка крабов, которую папа берег с весны.");
    }
}
