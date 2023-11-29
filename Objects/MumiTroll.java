package Objects;

import Enums.FamilyMember;
import Enums.Gender;

public class MumiTroll extends Entity {

    private FamilyMember familyMember;

    public MumiTroll(String name, Gender sex){
        super(name, sex);
    }

    public MumiTroll(String name, Gender sex, FamilyMember familyMember){
        super(name, sex);
        this.familyMember = familyMember;
    }

    public void setWantToEat(boolean wantToEat){
        if (wantToEat){
            System.out.print(", но есть ему хотелось");
        } else{
            System.out.print(", но есть ему не хотелось");
        }
    }

    public FamilyMember getFamilyMember(){
        return this.familyMember;
    }
}