public class Triangle {
    double a, b, c;
    public Triangle(double a1, double b1, double c1){
        this.a = a1;
        this.b = b1;
        this.c = c1;
        if (a>0 && b>0 && c>0){
            System.out.println("Периметер равен" +perimeter());
        }
        try {
            perimeter();
        } catch (Exception unnaturalLength) {
            throw new IllegalArgumentException(unnaturalLength);
        }
    }

    public double perimeter (){
        return (this.a+this.b+this.c);
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
