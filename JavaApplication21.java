
package javaapplication21;


import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class JavaApplication21 {

    
    public static void main(String[] args) {
        
        int op1, op2, op3; //OPCIONES
        String nombre;
        String clave;
        //Personalidad I = introvertido E = Extrovertido
        int I, E;
        
        
        System.out.println("Bienvenido a LOTUS, En este emocionante juego, te sumergirás en una historia llena de romance,");
        System.out.println(" intriga y decisiones que marcarán tu destino. Conoce a cuatro personajes únicos, ");
        System.out.println("cada uno con su propia historia y secretos por descubrir. ");
        System.out.println("¿Listo para empezar esta aventura?(true o false)");
  
        System.out.println();
        
        //INTRODUCE NOMBRE
        System.out.println("¿Cual es tu nombre?");
        Scanner captu = new Scanner (System.in);
        nombre = captu.nextLine();
        
        //INTRODUCE CLAVE
        System.out.println(nombre + " Un gusto conocerte, recuerda responder como te va guiando tu propio corazón.");
        System.out.println("Ahora otorganos una palabra clave, para que toda decisión quede");
        System.out.println("entre las estrellas y tú");
        clave = captu.nextLine();
        
        System.out.println("Acabas de llegar a este nuevo pueblo, donde la primavera apenas te da la bienvenida");
        System.out.println("al dar un paso al lugar. Este lugar podría ser un nuevo comienzo para ti, ");
        System.out.println("una oportunidad para explorar nuevas pasiones y conocer a personas fascinantes,");
        System.out.println("¿Qué te intriga más de esta nueva aventura?");
        
        System.out.println();
        
        System.out.println("1.-Explorar y descubrir los secretos que este pueblo oculta. ");
        System.out.println("2.-Analizar cada detalle y desentrañar los misterios que acechan en sus calles. ");
        System.out.println("3.-Proteger y velar por el bienestar de quienes llaman a este lugar su hogar. ");
        System.out.println("4.-Establecer conexiones y relaciones significativas con los habitantes, construyendo puentes entre corazones. ");
             
     
        op1= captu.nextInt();
        
        if (op1 == 1){
        System.out.println("Bienvenido a la fase 3 " + nombre);
        
        }
        else if (op1 == 2){
            System.out.println("Bienvenido a la fase 4 " + nombre);
            System.out.println("");
        }
        else if (op1 == 3)
            System.out.println("Bienvenido a la fase 2 " + nombre );
        else if (op1 == 4){
            System.out.println("Bienvenido a la fase 1: primeros petalos, " + nombre);
        
        System.out.println();
        
            System.out.println("Has llegado al corazón de este encantador pueblo, un crisol de historias esperando ser escritas.");
            System.out.println("Cada callejuela y cada esquina ocultan secretos y oportunidades para aquellos dispuestos a explorar y descubrir.");
            System.out.println("Decides ir a un parque oculto entre el bosque, donde la fresca brisa te da la ");
            System.out.println("bienvenida con una alegría inexplicable, sientes como tu corazón se siente como una ");
            System.out.println("flor en primavera, floreciendo con esperanzas a nuevas experiencias.");
       
            System.out.println();
        
            System.out.println("Por lo que puedes ver en este lugar hay varios lugares donde puedes hacer ");
            System.out.println("varias actividades, uno parece estar repleto de gente, junto con diferentes ");
            System.out.println("tipos de personas nuevas con las que pues interactuar de diferente manera, ");
            System.out.println("mientras que otro esta un poco mas aislado de los demás, donde podrías leer ");
            System.out.println("tu libro en calma y disfrutar de aquella brisa de antes.");
            
            System.out.println();
            
            System.out.println("Empecemos a ver que opción te sienta mejor!");
            System.out.println();
            System.out.println("1.- Interactuar con gente nueva "); //+5 Extrovertido
            System.out.println("2.- Leer un libro debajo del árbol"); //+5 Introvertido
            
            op2 = captu.nextInt();
            if (op2==1) {
                System.out.println("Al acercarte al bullicio de gente, te encuentras rodeado de una variedad de personajes ");
                System.out.println("coloridos. Entre la multitud, pudiste notar como una chica destacaba por su risa.");
                System.out.println("Una chica de pelo cobrizo, rizado y vestida de una forma informal");
                System.out.println(",con una blusa de color morado y un pantalón de mezclilla largo. Ojos cafés y de una tez morena. ");
                
            }
            else if(op2==2){
                System.out.println("Mientras lees tu libro se acerca una chica de pelo cobrizo, rizado y vestida de una ");
                System.out.println("forma informal, con una blusa de color morado y un pantalón de mezclilla largo");
                System.out.println("Ojos cafes y de una tez morena.");
                System.out.println("Volteaste a ver como tu momento de paz ha sido interrumpida, por esta chica.");
              
                System.out.println();
                
                System.out.println("Violett:¿Me puedo sentar aqui?");//Dialogo
                System.out.println();
                System.out.println("1.- Sonreírle de vuelta y asentir por buena onda "); //+2 Extrovertido y +3 Introvertido
                System.out.println("2.- Decirle que sí y hasta darle un espacio "); //+3 Extrovertido y Rela +5
                System.out.println("3.- Decirle que no, quieres estar solo/a"); //+3 Introvertido --> Rela: -5
                op3 = captu.nextInt();
                
               
            
            }
            
        }
        
        
   
    }
}
