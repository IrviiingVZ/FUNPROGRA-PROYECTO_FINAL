
package javaapplication21;


import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class JavaApplication21 {

    
    public static void main(String[] args) {
        int[] puntos = new int[9]; //Arreglo almacen de las personalidades
        
        int op1, op2, op3; //OPCIONES
        String nombre;
        String clave;
        //Personalidad I = introvertido E = Extrovertido
        int I = 0;
        int E = 0;
        //Personalidad J = Juzgar P = Prospección
        int j = 0;
        int p = 0;
        //personalidad in = Intuitivo O = Observador
        int in = 0;
        int O = 0;
        //Personalidad pe 0 Pensamiento S = Sentimiento
        int pe = 0;
        int S = 0;
        //Personajes relación con el usuario:
        int Violett = 0; //ENFP
        int Elena = 0; //
        int Irving = 0; //ISFP
        int Axel = 0; //ENTP
        
        
        
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
        
        switch (op1) {
            case 1:
        System.out.println("Bienvenido a la fase 3 " + nombre);
        
            case 2:
            System.out.println("Bienvenido a la fase 4:Gotas sin rumbo " + nombre);
                System.out.println("");
            
                System.out.println("Era un día soleado, ninguna nube se veía alrededor del cielo por lo que no ");
                System.out.println("te preocupaste por llevar un paraguas. El mismo clima te había dejado en claro que ");
                System.out.println("iba a ser un día ideal para un picnic.");
            
                System.out.println("");
            
                System.out.println("Al entrar a la biblioteca, te diriges hacia lo que era una mesa algo escondida, enfrente ");
                System.out.println("de una gran ventana mostrando el como las gotas del agua se resbalaban y chocaban ");
                System.out.println("con la ventana, ya estaba empezando a llover.");
                
                System.out.println("");
                
                System.out.println("Axel: ¿Qué tal, compañero/a de estudio? Parece que el clima no nos está favoreciendo ");
                System.out.println("hoy. ¿Estás listo para desafiar a la tormenta y conquistar este proyecto juntos?");
                
                System.out.println("");
                
                System.out.println("Al sentarte en la silla enfrente de él, pudiste notar como ya estaba empezando a estudiar sobre el tema del proyecto.");
                
                System.out.println("1.- Prefiero un plan detallado antes de comenzar. ");//+5 juzgar
                System.out.println("2.- Me gusta tener un plan general, pero puedo improvisar. ");// +3 Juzgar +2 prospeccion
                System.out.println("3.-Prefiero tener una idea básica y adaptarme según sea necesario.");// +3 juzgar y +3 prospección
                System.out.println("4.-Me siento más cómodo improvisando desde el principio."); //+5 prospección
                
                op1 = captu.nextInt();
                
                if (op1 == 1) {
                    System.out.println("Necesitamos tener claras todas las variables para poder improvisar con estilo.");
                    
                    System.out.println("");
                    
                    System.out.println("Al ser Axel una persona que se lleva mejor al momento de improvisar le parece una");
                    System.out.println("perdida de tiempo el ponerse a analizar bien todos los aspectos para concretar un plan.");
                    System.out.println("Pero aun así respeta tu opinión");
                    
                    System.out.println("");
                    j=+5;
                 }    
                else if (op1 == 2){
                    System.out.println("Axel: Algunas veces está bien improvisar, aun teniendo un plan en mente nunca se puede estar");
                    System.out.println("seguro completamente de que vaya a funcionando.");
                    System.out.println("");
                    System.out.println("Le gusto tu respuesta, entiende completamente que muchas veces lo ideal es hacer un plan, pero");
                    System.out.println("aun así le gusta tu iniciativa de estar dispuesto a improvisar.");
                    System.out.println("");
                    j=+3;
                    p=+2;
                }
                else if(op1 == 3){
                
                System.out.println("Axel: Excelente, de igual forma solo investigue lo principal del proyecto. Pero me agrada mas");
                    System.out.println("anzarme a la acción que esperar por un plan bastante detallado.");
                    System.out.println("");
                    System.out.println("Le gusto tu respuesta, Axel prefiere improvisar pero igual respeta que siempre se debe tener una");
                    System.out.println("idea para tomar como base al momento de hacer un plan.");
                    System.out.println("");
                    j=+3;
                    p=+3;
                }
                else if(op1 == 4){
                
                    System.out.println("Axel: Confío en mi capacidad para pensar rápido y actuar aún más rápido. ¿Un plan detallado?");
                    System.out.println("¡Aburrido! Somos capaces de hacer este proyecto con pura intuición y una pizca de locura creativa.");
                    System.out.println("");
                    System.out.println("Alex se siente bastante cómodo de conocer alguien que opine igual que el,");
                    System.out.println("");
                   
                    p=+5;
                }
                
                System.out.println("Axel: Muy bien " + nombre + " como ya sabes tenemos que mostrar información de lo que sabemos de este pueblo...");
                System.out.println("pero honestamente no he encontrado nada interesante. Mas que los fundadores y varias fotografías viejas.");
                System.out.println("");
                System.out.println("Te quedas pensando en ello, y tenia razón, cualquier tipo de información de este pueblo no podía ser relevante. ");
                System.out.println("Aun siendo nuevo/a en este lugar, te has dado cuenta que todo es inusualmente tranquilo y desconocido, como un tipo de vacío.");
                System.out.println("");
                System.out.println(nombre + ": Tienes razón, este pueblo se siente... vacío realmente no creo que vayamos a encontrar algo mas interesante que los fundadores ");
                System.out.println("lanzaron una flecha para decidir su destino. ");
                System.out.println("");
                break;
            
            case 3:
            System.out.println("Bienvenido a la fase 2 " + nombre );
            break;
            
            case 4:
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
                
               
            break;
            }
            default:
                System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 4.");
                break;
        }
        
        mostrarPuntos(puntos);
   
    }
    public static void actualizarAcumuladores(int opcion, int[] puntos) {
    switch (opcion) {
        case 1:
            puntos[6] += 5; // Sumar puntos --> Pensamiento
            puntos[7] += 5; // Sumar puntos --> Sentimiento
            break;
        case 2:
            puntos[2] += 5; // Sumar puntos --> Juzgar
            puntos[3] += 5; // Sumar puntos --> Prospección
            break;
        case 3:
            puntos[4] += 5; // Sumar puntos --> Intuitivo
            puntos[5] += 5; // Sumar puntos --> Observador
            break;
        case 4:
            puntos[0] += 5; // Sumar puntos --> Introvertido
            puntos[1] += 5; // Sumar puntos --> Extrovertido
            break;
        default:
            System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            break;
    }
}
    
    
    public static void mostrarPuntos(int[] puntos){
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Puntos en la categoria " + i + ":" + puntos[i]);
        }
    }
}
