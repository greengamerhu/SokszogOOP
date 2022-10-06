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

        Paralelogramma p = new Paralelogramma(3, 5, 30);
        System.out.println(p);
        for (int i = 0; i < 100; i++) {
            p = new Paralelogramma();
            System.out.println(p);
        }
        HatSzog hat = new HatSzog(50);
        System.out.println(hat);

        Sokszogek s = new Sokszogek();
        System.out.println(s);

        System.out.printf("Listában lévő sokszögek össz Kerülte: %f \n", s.osszKerulet());
        System.out.printf("Listában lévő sokszögek össz Terülte: %f \n", s.osszTerulet());
        System.out.printf("Listában lévő legnagyobb területtel rendelkező sokszög sorszáma: %d", s.maxTerulet());
    }
}
