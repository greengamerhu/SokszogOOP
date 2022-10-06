package hu.petrik.sokszogoop;

public class Haromszog extends Sokszog {
    private double b;
    private double c;



    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
        if (!this.isSzerkeztheto()) {
            throw new IllegalArgumentException(("A háromszög nem Szerkethető"));
        }
    }
    public Haromszog() {
        super(VeletlenOldalGeneralas());
        this.b = VeletlenOldalGeneralas();
        this.c = VeletlenOldalGeneralas();
        while (!this.isSzerkeztheto()) {
            super.setA(VeletlenOldalGeneralas());
            this.b = VeletlenOldalGeneralas();
            this.c = VeletlenOldalGeneralas();
        }
    }

    private static double VeletlenOldalGeneralas() {
        return Math.random() * 10 + 5;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        if (!this.isSzerkeztheto()) {
            throw new IllegalArgumentException(("A háromszög nem Szerkethető"));
        }
    }

    public double getC() {
        return c;

    }

    public void setC(double c) {
        this.c = c;
        if (!this.isSzerkeztheto()) {
            throw new IllegalArgumentException(("A háromszög nem Szerkethető"));
        }
    }
    @Override
    public double getKerulet() {
        return this.getA() + this.b + this.c;
    }
    private double getS() {
        return  this.getKerulet() / 2;
    }
    private boolean isSzerkeztheto() {
        return this.getA() + this.getB() > this.getC() &&
                this.getB() + this.getC() > this.getA() &&
                this.getA() + this.getC() > this.getB();
    }
    @Override
    public double getTerulet() {
        return Math.sqrt(this.getS() * (this.getS() - this.getA()) * (this.getS() - this.getB()) * (this.getS() - this.getC()));
    }

    public void setA(double a) {
        super.setA(a);
        if (!this.isSzerkeztheto()) {
            throw new IllegalArgumentException(("A háromszög nem Szerkethető"));
        }
    }
    @Override
    public String toString() {
        return String.format("Háromszög: a = %-10.3f b = %-10.3f c = %-10.3f %S",
                this.getA(),
                this.getB(),
                this.getC(),
                super.toString());
    }
}
