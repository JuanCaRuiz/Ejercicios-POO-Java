public class Ecuacion {
  private double a;
  private double b;
  private double c;

  public Ecuacion(double a,double b, double n){
    //this se utiliza para que el progama logre diferencia de un atributo a un parametro
    this.a = a;
    this.b = b;
    c = n;
  }

  private void obtenerRaices(){
    double x1 = (-b+Math.sqrt(discriminante()))/(2*a);
    double x2 = (-b-Math.sqrt(discriminante()))/(2*a);
    System.out.println("Solucion X1: ");
    System.out.println(x1);
    System.out.println("Solucion X2: ");
    System.out.println(x2);
  }
  private void obtenerRaiz(){
    double x = (-b)/(2*a);
    System.out.println("Unica solucion: ");
    System.out.println(x);
  }
  private double discriminante(){
    return Math.pow(b,2)-(4*a*c);
  }
  private boolean tieneRaices(){
    return discriminante() > 0;
  }
  private boolean tieneRaiz(){
    return discriminante() == 0;
  }

  public void calcular(){
    if (tieneRaices()){
      obtenerRaices();
    }else if (tieneRaiz()){
      this.obtenerRaiz(); //se puede utilizar el this o no para llamar a la funcion
    } else {
      System.out.println("No tiene soluciones.");
    }
  }
}