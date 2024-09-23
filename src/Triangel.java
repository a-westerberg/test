public class Triangel implements AreaCalc{
    private double bas, höjd;
    private double triangelArea;

    public Triangel() {
    }
    public Triangel(double bas, double höjd) {
        this.bas = bas;
        this.höjd = höjd;
    }

    @Override
    public double calcArea() {
        return 0.5 * bas * höjd;
    }


    @Override
    public void areaResult() {
        System.out.println("Arean av triangeln är: " + calcArea());
    }
    public double getBas() {
        return bas;
    }

    public void setBas(double bas) {
        this.bas = bas;
    }

    public double getHöjd() {
        return höjd;
    }

    public void setHöjd(double höjd) {
        this.höjd = höjd;
    }

    public double getTriangelArea() {
        return triangelArea;
    }

    public void setTriangelArea(double triangelArea) {
        this.triangelArea = triangelArea;
    }
}
