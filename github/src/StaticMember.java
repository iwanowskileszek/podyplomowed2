public class StaticMember {
    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember();
        dad.name = "Piotr";
        dad.age = 32;

        FamilyMember mam = new FamilyMember();
        mam.name = "Anna";
        mam.age = 31;

        FamilyMember kid = new FamilyMember();
        kid.name = "Zosia";
        kid.age = 3;

        show(dad);
        show(mam);
        show(kid);


    }

    static void show(FamilyMember familyMember){
        System.out.print(familyMember.name);
        System.out.print("\t" + familyMember.surname);
        System.out.print("\t" + familyMember.age +"\tlat/a\n");
    }

}

class FamilyMember {
    static String surname = "Nowak";
    String name;
    int age;
}