public class Main {
    public static void main(String[] args) {
        Clinik clinik=new Clinik();
        clinik.petAdd(new Pets(1,"Петрушка",2,new Person("Петя", 22,Sex.MAN)));
        clinik.petAdd(new Pets(2,"Ватрушка",3,new Person("Ватя", 23,Sex.WOMAN)));
        clinik.petAdd(new Pets(3,"Хитрушака",100,new Person("Андрей", 20,Sex.MAN)));
        clinik.petAdd(new Pets(4,"Ленюшка",23,new Person("Аня", 22,Sex.WOMAN)));
        clinik.petAdd(new Pets(5,"Мяушка",1,new Person("Гетя", 210,Sex.MAN)));
        clinik.petAdd(new Pets(6,"Клюшка",4,new Person("Тася", 22,Sex.WOMAN)));
        clinik.petAdd(new Pets(7,"Гаврюшка",532,new Person("Ветя", 22,Sex.MAN)));
        clinik.petAdd(new Pets(8,"Варюшка",2,new Person("Танзиля", 22,Sex.WOMAN)));
        System.out.println(clinik.petsSer("Петрушка"));

        clinik.petsChan(1,"Петрушка",3);
        System.out.println(clinik.petsSort());
        clinik.petsSer("Петрушка");

    }
}
