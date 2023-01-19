package autoescuela;

public class TestAutoescuela {
    public static void main(String[] args) {
        Profesor p1= new Profesor("Pablo","8532832L",20000);
        Alumno a1= new Alumno("Hola","98595289E", "coche");
        Coche c1= new Coche("9583 JFL", "Toyota", "Corolla");
        Ficha f1= new Ficha(p1,a1,c1);
        System.out.println(f1.alumno.DNI);
        System.out.println(f1.coche.matricula);
    }
}
