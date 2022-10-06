package hu.petrik.sokszogoop;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            double a = Math.random() * 5 +10;
            double b = Math.random() * 5 +10;
            Teglalap t = new Teglalap(a, b);
            System.out.println(t);
        }
        Haromszog h = new Haromszog(10,5,7);
        System.out.println(h);
        for (int i = 0; i < 100; i++) {
            Haromszog h1 = new Haromszog();
            System.out.println(h1);
        }



    }
}
