public class Rektangel implements AreaCalc{
    private double bredd, höjd;

    public Rektangel() {
    }

    public Rektangel(double bredd, double höjd){
       this.bredd = bredd;
       this.höjd = höjd;
    }

    public double calcArea() {
        return bredd * höjd;
    }

    public void areaResult() {
        System.out.println("Area för rektangeln är " + calcArea());
    }

    public void setRektangelArea(double bredd, double höjd) {
        this.bredd = bredd;
        this.höjd = höjd;
    }

}
