import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class principal {
        public static void main(String[] args){
            Scanner ingreso = new Scanner(System.in);
            Queue<String> cola = new LinkedList<>();
            String avionPista =null;

            while(true){
                mostrarOpciones();
                int opcion = ingreso.nextInt();
                switch(opcion){
                        case 1:
                            llenarHangar(cola);
                            avionPista= cola.peek();
                            cola.remove(cola.peek());
                            break;
                        case 2:
                            System.out.println("Los aviones que quedan en el hangar son:");
                            System.out.println(cola);
                            break;
                        case 3:
                            System.out.println("Los aviones pendientes en despegar son:");
                            System.out.println(cola);
                            break;
                        case 4:
                            System.out.println("Avion listo para despegar:"+avionPista);
                            break;
                        case 5:
                            System.out.println("El avion ha despegado");
                            avionPista =cola.peek();
                            cola.remove(cola.peek());
                            break;
                        case 6:
                            System.out.println("Ha salido correctamente");
                            break;
                        default:
                            break;
                }
                if(opcion==6){break;}
            }


        }
    public static Queue llenarHangar(Queue cola_2){
        Scanner ingreso2 = new Scanner(System.in);

        while(true){
            System.out.println("Ingrese la matricula del avion o ingrese 0 para salir");
            String auxiliar = ingreso2.next();

            if(auxiliar.toLowerCase().equals("0")){
                break;
            }
            cola_2.add(auxiliar);
        }
        return cola_2;
    }
    public static void mostrarOpciones(){
        System.out.println("Estas son las opciones a elegir:");
        System.out.println("1. Llenar hangar");
        System.out.println("2. Mostrar aviones en hangar ");
        System.out.println("3. Mostrar aviones pendientes a despegar");
        System.out.println("4. Anunciar avion proximo a despegar");
        System.out.println("5. Despegar avion");
        System.out.println("6. Salir");
    }
}
