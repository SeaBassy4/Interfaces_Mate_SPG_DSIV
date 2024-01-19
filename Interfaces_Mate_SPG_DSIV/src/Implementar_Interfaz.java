public class Implementar_Interfaz implements Interfaz_MATH{

    @Override
    public double suma(double a, double b) {
        double c = a + b;
        return c;
    }
    @Override
    public double resta(double a, double b) {
        double c = a - b;
        return c;
    }
    @Override
    public double multipplicacion(double a, double b) {
        double c = a * b;
        return c;
    }
    @Override
    public double division(double a, double b) {
        double c = a / b;
        return c;
    }

    public static void main(String[] args) {
        double x = 8.0;
        double y = 6.0;
        Implementar_Interfaz m = new Implementar_Interfaz();
        System.out.println(m.suma(x,y));
        System.out.println(m.resta(x,y));
        System.out.println(m.multipplicacion(x,y));
        System.out.println(m.division(x,y));
    }
}
