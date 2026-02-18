import java.util.Scanner;

public class metodos {
    public ObjFastFood[][] IngresarPedidos(int n, Scanner sc){
        ObjFastFood[][] m = ObjFastFood[n][n];
            metodos M = mew metodos();
            int Tipo = 0;
            int Tamano =0;
            int Cantidad = 0;
            double PrecioUnidad = 0.0 ;
            double TotalPagar = 0.0;
            String Descripcion ="";
           

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("bienvenido al expendio de comidas rapidas para el examen");
                System.out.println("seleccione el tipo de comida");
                System.out.println("1) perro");
                System.out.println("2) perra");
                System.out.println("3) salchipapa");
                System.out.println("4) hamburguesa");
                Tipo = M.Valida

                System.out.println("ingrese tamaño");
                System.out.println("1) tamaño");
                System.out.println("2) mediano");
                System.out.println("3) grande");
                Tamano = M.ValidarEntero(sc);
                System.out.println("ingrese la cantidad");
                Cantidad=sc.nextInt();
                System.out.println("ingrese el precio");
                PrecioUnidad= sc.nextDouble();
                TotalPagar=PrecioUnidad*Cantidad;
                ObjFastFood o= new ObjFastFood(Tipo, Tamano, Cantidad, PrecioUnidad, TotalPagar, Descripcion, Descripcion);
                m[i][j] = o;


                
            }
            
        }
        return m;
    }

    public int ValidarEntero(Scanner sc)
    
}
