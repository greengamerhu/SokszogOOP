package hu.petrik.sokszogoop;

public class Paralelogramma  extends Sokszog{
    private double alfa;
    private double b;


    public Paralelogramma(double a, double b, double alfa) {
        super(a);
        this.alfa = alfa;
        this.b = b;
    }
    public  Paralelogramma() {
        super(Math.random() * 5 +10);
        this.alfa = Math.random() * (180 - 1 + 1) + 1  ;
        this.b = Math.random() * 5 +10;
    }

    public double getAlfa() {
        return alfa;
    }

    public void setAlfa(double alfa) {
        this.alfa = alfa;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getKerulet() {
        return (this.getA() + this.b) *2;
    }

    @Override
    public double getTerulet() {
        return this.getA() * this.b * Math.sin(Math.toRadians(this.alfa));

    }

    @Override
    public String toString() {
        return String.format("Paralelogramma: a = %-10.3f b = %-10.3f alfa = %-10.3f %S",
                this.getA(),
                this.getB(),
                this.getAlfa(),
                super.toString()
                );
    }
}
