import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(25, "Ali", "Türk");
        Person person2 = new Person(32, "Murat", "Şen");
        Person person3 = new Person(63, "İpek", "Sağlam");
        Person person4 = new Person(60, "Mehmet", "Dogan");

        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);


        //Büyükten küçüğe
        Collections.sort(personArrayList, new SortBigToSmall());
        for (Person p : personArrayList) {
            System.out.println(p);
        }

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        //Küçükten büyüğe
        Collections.sort(personArrayList, new SortSmallToBig());
        for (Person p : personArrayList) {
            System.out.println(p);
        }

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        //Alfebetik sıralama
        Collections.sort(personArrayList, new SortAlfanum());
        for (Person p : personArrayList) {
            System.out.println(p);
        }
    }
}


