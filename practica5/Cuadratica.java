package practica5;

public class Cuadratica{
    int a, b, c;
    double x1, x2;
    float vx, vy;
    public Cuadratica(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void Solve(){
        if(discriminante() && validaDenominador()){
            x1 = (-(b) + Math.sqrt(Disc()))/(2*a);
            x2 = (-(b) - Math.sqrt(Disc()))/(2*a);
            System.out.println(Disc());
            System.out.println("La soluciones son:\nx1 = "+x1+"\nx2="+x2);
        }else  
            System.out.println("La solucion es imaginaria");
    }
    private boolean discriminante(){
        return  Disc() >= 0? true: false;
    }
    private boolean validaDenominador(){
        return a != 0;
    }
    private double Disc(){
        return (Math.pow(b, 2) - 4*a*c);
    }
    public void vertice(){
        if(a != 0){
            vx = (float)(-b)/(2*a);
            vy = (float)(a*(float)Math.pow(vx, 2) + b*(vx) + c);
            System.out.println("Los vertices son: ("+vx+", "+ vy+ ")");
        }else{
            System.out.println("El coeficiente a es 0");
        }
    }
    public void apertura(){
        if(vy < a*Math.pow(x1, 2)+b*x1+c && a != 0 && Disc() >= 0){
            System.out.println("Abre hacia arriba");
        }else{
            if(a !=0 && Disc() >= 0)
            System.out.println("Abre hacia abajo");
        }
    }
}