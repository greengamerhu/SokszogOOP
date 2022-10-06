package hu.petrik.sokszogoop;

public class HatSzog  extends Sokszog{
    public HatSzog(double a) {
        super(a);
    }
    public HatSzog() { super( Math.random() * 5 +10 );};
    @Override
    public double getA() {
        return super.getA();
    }

    @Override
    public void setA(double a) {
        super.setA(a);
    }

    @Override
    public double getKerulet() {
        return this.getA() * 6;
    }

    @Override
    public double getTerulet() {
        return (3/2) * (Math.pow(this.getA(), 2) * Math.sqrt(3)) ;
    }

    @Override
    public String toString() {
        return String.format("HatSzög: a = %-10.3f %s",
                this.getA(),
                super.toString()
                );
    }
}
