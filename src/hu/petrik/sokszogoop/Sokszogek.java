package hu.petrik.sokszogoop;

import java.util.ArrayList;
import java.util.List;

public class Sokszogek {
    private List<Sokszog> sokszogLista;

    public Sokszogek() {
        sokszogLista = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            sokszogLista.add(new Haromszog());
            sokszogLista.add(new Paralelogramma());
            sokszogLista.add(new HatSzog());
            sokszogLista.add(new Teglalap(Math.random() * 5 +10, Math.random() * 5 +10));
        }
    }
    public double osszKerulet() {
        double ossz = 0;
        for (Sokszog s : sokszogLista) {
            ossz += s.getKerulet();
        }
        return ossz;
    }
    public double osszTerulet() {
        double ossz = 0;
        for (Sokszog s : sokszogLista) {
            ossz += s.getTerulet();
        }
        return ossz;
    }
    public int maxTerulet() {
        Sokszog max = sokszogLista.get(0);
        for (Sokszog s : sokszogLista) {
            if (s.getKerulet() > max.getKerulet()) {
                max = s;
            }
        }
        return sokszogLista.indexOf(max) + 1;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A listában lévő Sokszögek adatai: \n");
        for (Sokszog s : sokszogLista) {
            stringBuilder.append(s + "\n");
        }
        return stringBuilder.toString();

    }
}
