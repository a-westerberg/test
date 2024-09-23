import java.util.PrimitiveIterator;

public class Cirkel implements AreaCalc{
    private double radie;
    private double cirkelArea;



    /*Math.PI * radie * radie;*/
    public Cirkel(){

    }
    public Cirkel(double radie) {
        this.radie = radie;
    }

    @Override
    public double calcArea() {
        cirkelArea = Math.PI * radie * radie;
        return cirkelArea;
    }

    @Override
    public void areaResult() {
        System.out.println("Arean för cirkeln är: " + calcArea());

    }

    public double getRadie() {
        return radie;
    }

    public void setRadie(double radie) {
        this.radie = radie;
    }

    public double getCirkelArea() {
        return cirkelArea;
    }
}
