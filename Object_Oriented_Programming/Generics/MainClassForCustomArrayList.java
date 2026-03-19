package Object_Oriented_Programming.Generics;

public class MainClassForCustomArrayList {
    public static void main(String[] args) {
        CustomArrayList l1 = new CustomArrayList();

        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);
        l1.add(80);
        l1.add(90);
        l1.add(100);
        l1.add(120);
        l1.add(130);
        l1.add(140);
        l1.add(150);
        System.out.println(l1.toString());

        CustomArrayList l2 = new CustomArrayList();
        l2.add(3);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(50);
        l2.add(60);
        l2.add(70);
        l2.add(80);
        l2.add(90);
        l2.add(100);
        l2.add(120);
        l2.add(130);
        l2.add(140);
        l2.add(150);
        System.out.println(l2.toString());

    }
}
