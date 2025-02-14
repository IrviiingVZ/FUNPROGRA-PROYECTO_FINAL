
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
                System.out.println("El pueblo es bastante grande por lo que resulta difícil decidir por donde empezar, ya que esto te sumerge como si estuvieras atrapado en un acuario sin fin. Pero finalmente decidiste dar una vuelta por los locales. ");
        System.out.println("¿Por cuál lugar quieres entrar?");
        op1 = captu.nextInt ();
        if (op1 == 1) {
            System.out.println("La Plaza Principal: Este lugar podría representar un sentido de comunidad y conexión.");
            System.out.println("Es un punto de encuentro donde la gente se reúne para socializar, compartir historias y disfrutar de la vida en el pueblo. ");
            System.out.println("Entrar aquí podría simbolizar un deseo de pertenencia y conexión con los demás habitantes del pueblo.");
            //
            System.out.println("Nuestro intrépido explorador, que llamaremos Irving, se encuentra ante la encrucijada de elegir por dónde comenzar su aventura en el pueblo de Tulipán. ");
            System.out.println("Su espíritu aventurero y curioso lo lleva a inclinarse por la opción que promete una experiencia más social y vibrante: la Plaza Principal.");
            System.out.println("Con paso decidido y una sonrisa juguetona en el rostro, Irving se adentra en la bulliciosa plaza, donde los colores, sonidos y aromas se entrelazan en una danza encantadora. ");
            System.out.println("Observa a su alrededor con ojos ávidos de descubrimientos, preguntándose qué historias y secretos aguardan entre los habitantes del pueblo.");
            //
            System.out.println("Los usuarios se reconoce a sí mismos como uno viajeros guiados tanto por la cabeza como por el corazón.");
            System.out.println("Sus decisiones suelen ser una amalgama de lógica y emoción, una danza equilibrada entre la razón y la pasión que les permite enfrentarse a los desafíos con una mente clara y un corazón valiente.");
            System.out.println("Entonces, pregunta Irving al enfrentarse a una decisión importante, ");
            System.out.println("¿Qué aspecto priorizan la lógica y los hechos o los valores y sentimientos personales? ");
            
            System.out.println("1.-La logica y los hechos");
            System.out.println("2.- Valores y sentimientos personales");
            System.out.println("3.- Ambos aspectos por igual");
            System.out.println("4.- Depende del contexto específico y la naturaleza de la decisión que esté enfrentando. ");
            
            op1 = captu.nextInt();
            if(op1 == 1){
                System.out.println("Valorar la importancia de tomar decisiones informadas y basadas en datos concretos. Esto les permite abordar los desafíos de manera objetiva y resolver problemas de manera eficiente.");
                
            }
            else if (op1 == 2){
                System.out.println("Para ustedes, la autenticidad y la integridad son pilares fundamentales en sus vidas. ");
                System.out.println("Consideran cómo sus decisiones afectarán no solo a ustedes, sino también a los demás y a su entorno. ");
                System.out.println("Sus emociones y principios guían sus elecciones, asegurándose de que estén alineadas con lo que realmente valoran en la vida.");
            }
            else if (op1 == 3){
                System.out.println("Ustedes busca un equilibrio entre la lógica y la consideración de sus valores y sentimientos.");
                System.out.println("Reconocen la importancia de mantener una mente abierta y flexible, capaz de adaptarse a diferentes situaciones y desafíos. ");
                System.out.println("Este  enfoque te permite tomar decisiones informadas sin perder de vista su brújula moral y emocional.");
            }    
            else if (op1 == 4){
                System.out.println("Ustedes entiende que cada situación es única y requiere un enfoque diferente.");
                System.out.println("Evalúan cuidadosamente el contexto y las circunstancias antes de tomar una decisión, adaptando su enfoque según sea necesario para lograr el mejor resultado posible.");
            }
            System.out.println("Con su mente ágil y su corazon valiente, estan listos para sumegirse en las maravillas que aguardan en la Plaza Principal de Tulipán");
            System.out.println("Está aventura apenas comienza, y me imagino que todos están ansiosos por descrubir qué sorpresas le depara el destino");
            
            System.out.println("ustedes exploradores, se encuentran ahora en la inmersa bulliciosa Plaza Principal de Tulipán. ");
            System.out.println("Sus ojos curiosos se iluminan con cada detalle que captura su atención, mientras se mezclan con la multitud animada que llena el lugar con risas y conversaciones animadas.");
            
            System.out.println("De repente, mientras observan una colorida exhibición de artesanías locales, escucha un susurro de angustia proveniente de un rincón cercano. ");
            System.out.println("Intrigados, se dirigen hacia el origen del sonido y encuentra a una anciana sentada en un banco, con lágrimas en los ojos y un gesto de preocupación en su rostro arrugado.");
            System.out.println("¿Cómo abordar esta situación delicada? Considerando los sentimientos de la anciana.");
            
            System.out.println("1.- Principalmente mis propios sentimientos y necesidades.");
            System.out.println("2.- Tanto mis propios sentimientos como los de los demás, tratando de equilibrar ambas perspectivas");
            System.out.println("3.- Principalmente los sentimientos de los demás, priorizando su bienestar emocional. ");
            System.out.println("4.- Depende del contexto y la relevancia de los sentimientos involucrados en la situación específica. ");
            
            op1 = captu.nextInt();
            if (op1 == 1){
                System.out.println("Podrían optar por priorizar sus propias emociones y necesidades en esta situación. ");
                System.out.println("Quizás se sienta incómodos al intervenir en la vida personal de un extraño y prefierir mantenerse al margen.");
            }
            else if (op1 == 2){
                System.out.println("Reconociendo la importancia de la empatía y la compasión, eligen adoptar un enfoque equilibrado.");
                System.out.println("Considerando sus propias emociones y necesidades, pero también se esfuerza por comprender y atender los sentimientos de la anciana.");
            }
            else if (op1 == 3){
                System.out.println("Deciden centrarse en los sentimientos de la anciana, colocando su bienestar emocional en primer plano.");
                System.out.println("Están dispuesto a sacrificar sus propias comodidades y preocupaciones para ayudarla en su momento de necesidad.");
            }
            else if (op1 == 2){
                System.out.println("Reconociendo la complejidad de la situación, eligen evaluar cada elemento con cuidado antes de tomar una decisión.");
                System.out.println("Considerando tanto sus propios sentimientos como los de la anciana, así como el contexto general de la situación.");
            }
            System.out.println("Con su corazon compasivo y su mente perspicaz, ustedes se nfrentan a un dilema moral en la Plaza Principal de Tulipán. ");
            System.out.println("¿Cómo decidirán actuar y qué impacto tendrá su elección en la anciana y en su propia aventura? ");
                        
            op1 = captu.nextInt();
            if (op1 == 1){
                System.out.println("Decide acercarse con delicadeza a la anciana ofreciendole una sonrisa amable y unas palabras reconfortantes.");
                System.out.println("Le ofrece su ayuda sin imponerse, permitiendo que la anciana decida si desea compartir su carga emocional. ");
                System.out.println(" Su acto de compasión genera un vínculo humano genuino, trayendo consuelo tanto a la anciana como a ustedes mismos.");
            }
            else if (op1 == 2){
                System.out.println("Al observar la angustia de la anciana,  Eligen actuar con empatía y solidaridad. ");
                System.out.println("Se sientan a su lado y le ofrecen su apoyo incondicional, escuchando atentamente sus preocupaciones y ofreciendo palabras de aliento. ");
                System.out.println("Sus intervenciones no solo alivian el sufrimiento de la anciana, sino que también fortalece su conexión con la comunidad de Tulipán.");
            }
            else if (op1 == 3){
                System.out.println("Con su corazón compasivo y mente ágil, perciben la necesidad de la anciana y deciden actuar con rapidez y eficacia. ");
                System.out.println("Identifican recursos y servicios disponibles en el pueblo que puedan ayudar a la anciana a superar sus dificultades. ");
                System.out.println("Con determinación, guían a la anciana hacia el apoyo que necesita, asegurándose de que no esté sola en su lucha.");
            }
            else if (op1 == 4){
                System.out.println("Con sensibilidad y respeto, Eligen dar espacio a la anciana para que procese sus emociones a su propio ritmo. ");
                System.out.println("Reconociendo la importancia de la autonomía y la dignidad, se mantienen cerca para brindar apoyo si es necesario, pero respetan los límites de la anciana. ");
                System.out.println("Sus enfoques permiten que la anciana recupere el control de su situación, fortaleciendo su sentido de empoderamiento y autoestima.");
            }
            System.out.println("Irving, el aventurero intrépido, les plantea otra situación un poco mas extrema, donde se lanzan desdeun avión sobre el exuberante paisaje de Tulipán,");
            System.out.println("con el viento rugiendo en sus oídos y la adrenalina bombeando por sus venas.");
            System.out.println("El cielo se extiende infinitamente ante ustedes, y su corazón late con emoción mientras se preparan para abrir sus  paracaídas y aterrizar en tierra firme.");
            
            System.out.println("Sin embargo, justo cuando ustedes se disponen a desplegar sus paracaídas, una ráfaga de viento inesperada los desvía de su curso planeado.");
            System.out.println("Sienten el corazón en la garganta mientras luchan por mantener el control de su descenso, sus mentes divididas entre el instinto de supervivencia y la necesidad de mantener la calma.");
            
            System.out.println("En medio de la crisis, Irving les plantea una pregunta crucial:");
            System.out.println("¿Qué le resulta más difícil: ser objetivo y analítico o tener en cuenta las emociones y relaciones interpersonales?");
            
            System.out.println("1.- Ser objetivo y analítico, separando mis emociones de la situación.");
            System.out.println("2.- Tener en cuenta las emociones y relaciones interpersonales, especialmente 	al tomar decisiones. ");
            System.out.println("3.- Ambos aspectos pueden presentar desafíos en diferentes situaciones. ");
            System.out.println("4.- Depende del contexto específico y las circunstancias involucradas. ");
            
            op1 = captu.nextInt();
            if (op1 == 1){
                System.out.println("Mantener la objetividad y el análisis en  momentos de crisis puede ser un desafio");
                System.out.println("Sus mentes están inundadas de emociones y adrenalina, lo que les dificulta mantener la calma y tomar decisiones racionales.");
                System.out.println("A pesar del desafío que representa mantener la objetividad en medio de la crisis, se aferran a su entrenamiento y experiencia");
                System.out.println("Conscientes de que las emociones pueden nublar su juicio, hacen un esfuerzo consciente por separar sus sntimientos de la situación.");
                System.out.println("Pero saben que solo tomando decisiones racionales podrán encontrar una solución segura");
            }
            else if (op1 == 2){
                System.out.println("A pesar de la gravedad de la situacion, reconocen la importancia de mantenerse conectados con sus emociones y considerar cómo sus acciones afectarán a los demás.");
                System.out.println("La seguridada y el bienestar de todos son sus prioridades principales");
                System.out.println("Mientras la adrenalina bombea por sus venas, no pueden evitar sentir empatía por aquellos que podrían verse afectados por sus acciones.");
                System.out.println("Reconoce que, en momentos de crisis, las relaciones interpersonales son fundamentales.");
                System.out.println("Su prioridad es asegurarse de que todos estén a salvo, inclusivo si eso significa ponerse en riesgo.");
            }
            else if (op1 == 3){
                System.out.println("Ustedes pueden comprende que tanto la objetividad como la consideración de las emociones son habilidades vitales en momentos de crisis.");
                System.out.println("Adaptarse a las circunstancias cambiantes y equilibrar estos dos aspectos pueden ser un desafío, pero están dispuestos a enfrentarlo con valentía.");
                System.out.println("El equilibrio entre la objetividad y las emociones es como caminar por una cuerda floja.");
                System.out.println("Con cada paso, se esfuerzan por mantenerse firme y centrados, sabiendo que un solo desliz puede llevarlos al abismo. ");
                System.out.println(" Aunque la tarea es desafiante, están decididos a enfrentarla con valentía y determinación.");
            }
            else if (op1 == 4){
                System.out.println("Reconociendo la complejidad de la situación, entienden que no hay una respuesta única para cada situación.");
                System.out.println("Evalúan cuidadosamente el contexto y las circunstancias antes de determinar cómo abordar la crisis, priorizando la seguridad y el bienestar de todos los involucrados.");
                System.out.println("Reconociendo la complejidad del panorama frente a él, comprenden que no existe una solución fácil.");
                System.out.println("Se sumergen en una reflexión profunda, evaluando meticulosamente cada aspecto de la situación.");
                System.out.println("Conscientes de que cada decisión tiene consecuencias, se toman su tiempo para considerar todas las opciones antes de actuar.");
            }
            System.out.println("Irving les dice que la mejor opción para enfrentar esta situación es mantener la objetividad y el análisis, separando sus emociones de la situación.");
            System.out.println("¡Qué valentía! A pesar de la avalancha de emociones que lo embarga, Ustedes se sumerge en una mentalidad de concentración y calma, listos para abordar cada desafío con una mente clara y racional.");
            System.out.println("Con una sonrisa en el rostro y una mirada determinada, se enfrentan al desafío con entusiasmo y determinación. ");
            System.out.println("¡Nadie los detendrá en su camino hacia la seguridad y el éxito! En medio del caos, su espíritu aventurero brilla con una luz inquebrantable, inspirando a todos a su alrededor con su energía contagiosa y su valentía sin límites. ");
            
            System.out.println("Después de aterrizar con éxito en el pueblo de Tulipán, Son recibidos con celebración y elogios.");
            System.out.println("Los habitantes lo consideran unos héroes por su valentía y habilidad para mantener la calma en la crisis.");
            System.out.println("Se unen a la fiesta en la plaza principal, compartiendo risas y alegría con la comunidad.");
            System.out.println("Al final del día, se sienten en paz y felices por haber dejado una marca positiva en el pueblo.");
            System.out.println("Con una sonrisa en el rostro, saben que ha llegado a un final feliz en esta emocionante aventura.");
            
            System.out.println("Durante la bulliciosa fiesta en el pueblo Tulipán, se encuantran en medio de la alegría y la algarabíq, disfrutando del ambiente festivo.");
            System.out.println("Sin embargo, en un momento dado, surge una situación insesperada que requiere de su atención.");
            System.out.println("Un desacuerdo entre dos gripos de vecinos estalla repentinamente, amenazando con ensombrecer la celebración");
           
            System.out.println("Ante este nuevo desafío, Irving les pregunta:¿Cómo reaccionas cuando tus decisiones pueden afectar a los demás emocionalmente?");
            
            System.out.println("1.- Considerando cuidadosamente cómo comunicar mi decisión y tratando de minimizar cualquier impacto negativo. ");
            System.out.println("2.- Sintiendo empatía por las posibles emociones de los demás, pero priorizando lo que considero mejor en términos objetivos.");
            System.out.println("3.- Preocupándome por las emociones de los demás y tratando de encontrar una solución que satisfaga a todas las partes involucradas. ");
            System.out.println("4.- Tomando en cuenta las emociones de los demás, pero manteniendo mi enfoque en lo que creo que es lo correcto o necesario en la situación. ");
            
            op1 = captu.nextInt();
            if (op1 == 1){
                System.out.println("Tratan de calmar los ánimos y encontrar un terreno común entre las partes en conflicto, utilizando un tono comprensivo y tranquilizador.");
            }
            else if (op1 == 2){
                System.out.println("Intentan separar las emociones del problema en sí, buscando una resolución basada en hechos y necesidades prácticas más que en sentimientos personales.");
            }
            else if (op1 == 3){
                System.out.println("Busca un compromiso que tenga en cuenta los puntos de vista y preocupaciones de cada grupo, con la esperanza de restaurar la armonía en la comunidad.");
            }
            else if (op1 == 4){
                System.out.println("Mantiene su postura firme en sus convicciones y valores, tomando decisiones basadas en lo que consideran necesario para resolver el conflicto, incluso si esto implica decepcionar a algunos.");
            }
            System.out.println("Ustedes proponen una solución que no solo reconcilia a las partes en conflicto, ¡sino que también las une en un espíritu de cooperación y armonía! ");
            System.out.println("Con palabras llenas de pasión y convicción, transmite su visión de un futuro donde todos puedan vivir en paz y prosperidad.");
            System.out.println("El pueblo estalla en aplausas mientras ustedes, los héroes de Tulipán, celebran su victoria con una alegría contagiosa.");
            System.out.println("Irving dice:  ¡Qué emocionante es ver cómo una comunidad se une en momentos de adversidad, y qué maravilloso es saber que el espíritu de ustedes ha iluminado el camino hacia un futuro más brillante para todos en Tulipán!");
            
        } // opcion 2 del diagrama
        else if (op1 == 2){
            System.out.println(" El Mirador: En el corazón de Villa Esperanza, se alzaba imponente \"El Mirador\". Era mucho más que una estructura; era el punto de encuentro de la comunidad.");
            System.out.println("Desde sus alturas, se podía contemplar el paisaje y compartir risas y sueños.");
            System.out.println("Para Muchos, el mirador es inspirador, se iluminaba con luces y música, celebrando la vida en la comunidad.");
            System.out.println("Con el tiempo, se convirtió en el símbolo de unidad y hogar entre amigos.");
            
            System.out.println("Irving, un joven del pueblo, se encontraba en El Mirador, disfrutando de la vista y la brisa fresca que acariciaba su rostro.");
            System.out.println("Mientras contemplaba el horizonte, mientras unos amigos se acrecan a el y entre la platica les preguntaba sobre ");
            System.out.println("¿Qué papel juegan las opiniones y expectativas de los demás en tus decisiones personales? ");
            
            System.out.println("1.- Significativo");
            System.out.println("2.- Algún papel");
            System.out.println("3.- Mínimo");
            System.out.println("4.- Variable");
            
            op1 = captu.nextInt();
            if (op1 == 1){
                System.out.println("Consideran cuidadosamente las opiniones de los demás antes de decidir, especialmente si afectan a la comunidad.");
                System.out.println("Valoran el sentido de pertenecia y conexión con sus vecinos en Villa Esperanza");
            }
            else if (op1 == 2){
                System.out.println("Tienen en cuenta las opiniones de los demás, pero no son determinates en sus decisiones finales.");
                System.out.println("Confín en su propia intuición y en lo que consideran mejor para ustedes mismos.");
            }
            else if (op1 == 3){
                System.out.println("Valorn más su propia opinión y lo que consideran mejor para ustedes, regalando las opiniones de los demás a un papel secundario.");
                System.out.println("Confían en su propio citerio y en lo que le dicta su corazón.");
            }
            else if (op1 == 4){
                System.out.println("Reconocenn que la influencia de las opiniones externas en sus decisiones varían dependiendo del contexto y la importancia de la situación específica.");
                System.out.println("Esta flexibilidad les permite tomar decisiones de manera más consciente y equilibrada.");
            }
            System.out.println("Con esta conversación, Irving y sus amigos continuaron disfrutando de la vista desde El Mirador, compartiendo perspectivas y fortaleciendo los lazos de comunidad que tanto valoraban.");
            System.out.println("Irving, un joven del pueblo decide plantear una situación que pasa si tienen en cita en El Mirador, mientras disfrutan de la vista panorámica surgue una pregunta:");
            System.out.println("¿Cómo manejan los desacuerdos o diferencias de opinión con tu cita?.");
            
            System.out.println("1.- Buscan comprender sus perspectivas y tratando de encontrar un punto medio o una solución que nos satisfaga a ambos.");
            System.out.println("2.- Expresando respetuosamente mi opinión y escuchando activamente su punto de vista para llegar a un entendimiento mutuo.");
            System.out.println("3.- Manteniendo la calma y abordando los desacuerdos de manera constructiva, evitando confrontaciones innecesarias.");
            System.out.println("4.- Adaptándome al estilo de comunicación de mi cita y tratando de encontrar un terreno comun para resolver los desacuerdos de manera positiva.");
            
             op1 = captu.nextInt();
           if (op1 == 1){
               System.out.println("Expresas tu punto de vista con firmeza, mientras que tu pareja, en un intento por comprender tu perspectiva, busca encontrar un punto medio que satisfaciera a ambos.");
               System.out.println("Valorando la importancia de llegar a un concenso que fortalezca su conexión");
           }
           else if (op1 == 2){
               System.out.println("Cuando expresas tu opinión, te aseguras de hacerlo de manera respetuosa y escuchando atentamente el punto de vista de tu pareja.");
               System.out.println("Trabajan juntos para llegar a un entendimiento mutuo, reconociendo la validez de ambas perspectivas.");
           }
           else if (op1 == 3){
               System.out.println("Frente al desacuerdo, ambos mantienen la calma y abordan la situación de manera constructiva.");
               System.out.println("Evitando confrontaciones innecesarias y enfocandose en encontrar soluciones para que fortalecieran su relación.");
           }
           else if (op1 == 4){
               System.out.println("Están, conscientes de las diferencias en el estilo de comunicación de ambos, se adaptan al enfoque de su pareja y buscan un terreno común para resolver el desacuerdo de manera positiva.");
               System.out.println("Valorando la armonía en su relación y estar dispuestos a trabajar en equipo para superar cualquier obstáculo.");
           }
           System.out.println("Después Irving se reunió con sus amigas en el acogedor café del pueblo. Mientras campartían risas y anécdotas, surgió una pregunta que le intrigaba:");
           System.out.println("¿Qué tan importante es para cada uno que su cita sea honesta y directa?");
           
           System.out.println("1.- Valoro la transparencia y la sinceridad en las relaciones. ");
           System.out.println("2.- Creo que la comunicación abierta es esencial para construir confianza mutua. ");
           System.out.println("3.- Prefiero saber dónde estamos parados y qué piensa realmente mi cita.");
           System.out.println("4.- Todas las anteriores.");
           
           op1 = captu.nextInt();
           if (op1 == 1){
               System.out.println("Para mí, la transparencia y la sinceridad son fundamentales en una relación. No puedo imaginar estar con alguien que no sea honesto conmigo.");
           }
           else if (op1 == 2){
               System.out.println("Totalmente de acuerdo, la comunicación abierta es clave. Solo a través de esa honestidad podemos construir confianza mutua y comprendernos realmente.");
           }
           else if (op1 == 3){
               System.out.println("Personalmente, prefiero saber dónde estamos parados y qué piensa realmente mi cita. La honestidad directa puede ser dura a veces, pero es mejor que la incertidumbre.");
           }
           else if (op1 == 4){
               System.out.println("Creo que todas las anteriores son importantes. La transparencia, la comunicación abierta y la sinceridad son pilares de una relación sólida. Sin ellas, ¿cómo podríamos realmente conectarnos con nuestra pareja?.");
           }
            System.out.println("En el cálido atardecer en Villa Esperanza, Irving reflexionaba sobre lo que más valoraba en una cita mientras paseaba por las pintorescas calles del pueblo. ");
            System.out.println("Se encontró con sus amigos en la plaza principal, donde decidieron sentarse en un banco y disfrutar de la serenidad del lugar antes de que el sol se ocultara por completo.");
            System.out.println("Irving pregunta: ¿qué opinan sobre los gestos de cortesía en una cita? ¿Prefieren aquellos basados en la razón o en la empatía y consideración?"); 
            
            System.out.println("1.- La razón, como ser puntual y respetar los acuerdos previos.");
            System.out.println("2.- La empatía y consideración, como mostrar interés genuino por mis experiencias y sentimientos.");
            System.out.println("3.- Ambos aspectos son importantes para mí, pero valoro especialmente la empatía y la consideración.");
            System.out.println("4.- Depende del contexto específico y la naturaleza de la situación.");
            
            op1 = captu.nextInt();
            if (op1 == 1) {
                System.out.println("Para mí, los gestos de cortesía basados en la razón son esenciales.");
                System.out.println("Cosas simples como ser puntual y respetar los acuerdos previos que muestran respeto por el tiempo y los compromisos de ambos.");
            }
            else if (op1 == 2){
                System.out.println("Creo que la empatía y la consideración son igualmente importantes.");
                System.out.println("Mostrar interés genuino por las experiencias y sentimientos del otro crea una conexión más profunda y significativa en una cita.");
            }
            else if (op1 == 3){
                System.out.println("Ambos aspectos son importantes, pero personalmente valoro especialmente la empatía y la consideración.");
                System.out.println("Es lo que realmente hace que una cita sea memorable y especial.");
            }
            else if (op1 == 4){
                System.out.println("Depende del contexto específico y la naturaleza de la situación.");
                System.out.println("En algunas ocasiones, la razón puede ser más relevante, mientras que en otras, la empatía y la consideración son fundamentales para crear una conexión significativa.");
            }
            System.out.println("Concluyeron su conversación con una sensación de gratitud por las experiencias compartidas en Villa Esperanza y el profundo vínculo que habían construido juntos.");
            System.out.println("A medida que el sol se ponía en el horizonte, se despidieron con la promesa de más momentos memorables en el futuro.");
        }
        
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
                System.out.println("Axel: A eso mismos quería llegar, hasta me arrepiento de elegir este tema como exposició.");
        System.out.println("¿que te parecería cambiar de tema?");
        
        System.out.println("1.- Soy muy flexible y estoy dispuesto/a a cambiar de dirección.");
        System.out.println("2.- Soy flexible, pero prefiero seguir el plan original.");
        System.out.println("3.- Prefiero seguir el plan, pero puedo adaptarme si es necesario.");
        System.out.println("4.- No me gusta cambiar de dirección y prefiero mantener el plan original.");
        
        op1 = captu.nextInt();
        if (op1 == 1){
            System.out.println(nombre + "No encuentro problema en cambiar de proyecto, paro aun así no tendriamos mucho tiempo para elaborar.");
        }
        else if (op1 == 2){
            System.out.println(nombre + "Prefiero seguir el plan original, después de todo este proyecto es para esta semana.");
        }
        else if (op1 == 3){
        System.out.println(nombre + "Sigamos el plan original, podemos adaptarnos si es necesario, pero este trabajo es para esta semana.");
        }
        else if (op1 == 4){
            System.out.println(nombre + "¡Para nada! Debemos de seguir este trabajo, debemos de mantenerlos al plan orginal. Este trabajo es para esta semana.");
        }
        System.out.println("Axel la penso por un momento, tenias razon, ya era demasiado tarde para cambiar de proyecto.");
        System.out.println("Sin embargo, tampoco estaba de acuerdo de sacar una historia aburrida del lanzamiento de una flecha.");
        System.out.println("");
        System.out.println("Axel: Tienes razón, tal vez podamos encontara información en el faro.");
        System.out.println("La chica de ahí tiene conocimiento de todo lo que pasa y ha pasado en este pueblo.");
        
        System.out.println("1.- No creo haber escuchado de ella.");
        System.out.println("2,- ¿Chica en un faro..? Te refieres a Elena?");
        
        op1 = captu.nextInt();
        if (op1 == 1){
            System.out.println("Axel: Tiene sentido, despues de todo eres nuevo/a por aquí.");
            System.out.println("Pero tal vez tengas la oportunidad de conocerla.");
            System.out.println("Dice algo pensativo mientras giraba su pluma algo pensativo.");
            
            System.out.println("Axel: El caso es que ella tiene todo tipo de información del pueblo, pero no creo que podamos ir a visitarla por la lluvia...");
            System.out.println("No me llevo mucho con ella, se me hace alguien muy entrometida, pero cuando puedas habla con ella, aprovecha la oportunidad.");
            
            System.out.println("Axel se levanta de la silla, mostrando su atuendo algo informal, ropa holgada.");
            System.out.println("Axel: Muy bien, vamos a investgar por la biblioteca, de seguro encontramos algo por aquells estatuas, tiene toda la pinta de tener algo oculto.");
        }
        else if (op1 == 2){
            System.out.println("Axel: Así es, vaya que haces amigos muy rápido! Entonces ya debes de conocer algunos aspectos de la ciudad.");
            
            System.out.println("Axel: Es alguien bastante observadora, incluso algo entrometida... No muy de mi gusto pero eso es lo que la hace buena en su trabajo.");
            System.out.println("¿Que información pudiste sacarle?");
            
            System.out.println("Te pusiste a pensar sobre los temas que te había dicho Elena, que fueron bastantes, pero entre esos te llamo la atención uno en especial.");
            System.out.println( nombre + "Ahora que lo mencionas, hubo algo que me había dicho.");
            
            System.out.println("1.- Pasaje en la biblioteca.");
            System.out.println("2.- Estatuas.");
            
            op1 = captu.nextInt();
            if (op1 == 1){
                System.out.println(nombre + "Me había comentado sobre un pasaje escondido en la biblioteca, dice que escucho rumores de que se encuentran varios libros ocultos.");
                System.out.println("Axel se queda pensando algo interseado por esta nueva información, para después levantarse del lugar. ");
                System.out.println("Axel:Muy bien, ahora sabemos que vamos a hacer hoy.");
            }
            else if (op1 == 2){
                System.out.println(nombre + "Me había dicho que las estatuas esran parte de una gran historia del pueblo, pero no especifíco mucho.");
                System.out.println("Axel se queda, pensando algo interesado por esta nueva información, para después levantarse del lugar.");
                System.out.println("Axel: Muy bien, ahora sabemos que vamos hacer hoy.");
            }
            System.out.println("Axel: Vamos a empezar buscando por las estatuas de la biblioteca, de sefuro encontraremos una pista ahí");
            System.out.println("Tiene toda la pinta de ocultar de todo.");
        }
        System.out.println("Pudiste notar como te extendía la mano, para que le tomes la mano.");
        System.out.println("Axel: ¿Cómo te sientes acerca de tomar el riesgo querid@ reportera/o? ¿Prefieres mantener la seguridad o estás dispuesto a asumir este desafio?");
        
        System.out.println("1.- Estoy dispuesto/a a asumir riesgos calculados y desfios.");
        System.out.println("2.- Me siento comodo?a con algunos riesgos, pero prefiero no arriesgar demasiado.");
        System.out.println("3.- Prefiero mantener la seguridad, pero tomaré riesgos si es necesario.");
        System.out.println("4.- Prefiero matener la seguridad y evitar riesgos siempre que sea posible.");
        
        op1 = captu.nextInt();
        if (op1 == 1){
            System.out.println("Axel: ¡Me gusta como piensas! Luchemos contra el enigma de esta biblioteca");
        }
        else if (op1 == 2){
            System.out.println("Axel: Eres una persona precavida, me gusta. Pero aveces hay que tomarse unos cuantos riesgos para ver que nos brinda.");
        }
        else if (op1 == 3){
            System.out.println("Axel: ¡Ese es el espíritu! Salte de tu zona de confort, de todos modos, aqui estamos juntos compañero/a.");
        }
        else if (op1 == 4){
            System.out.println("Axel: ¡No seas aburrido/a! No es como si esto fuera algo de vida y muerte.");
        }
        System.out.println("Con este pequeño comienzo de investigación decidieron emprender el camino al fondo de la biblioteca, escondidos entre las repisas lleno de libros,");
        System.out.println("al igual que aquel olor peculiar de libros viejos se estaba haciendo mas presente. Ante este sentimiento de desconexión, te preguntaste..");
        System.out.println("¿Qué me motiva..?  La posibilidad de descubrir algo nuevo y emocionante o la satisfacción de resolver problemas complejos?");
        
        System.out.println("Me motiva más la posibilidad de descubrir algo nuevo y emocionante.");
        System.out.println("Me motiva tanto descubrir cosas nuevas como resolver problemas complejos.");
        System.out.println(" Me motiva más la satisfacción de resolver problemas complejos de manera metódica.");
        
        System.out.println("Así es, era tan claro, cada persona es diferente y tan similar.");
        System.out.println("Que curioso que aproveche esta oportunidad para identificar tal cualidad.");
        System.out.println("Sin mucho aviso, llegaron en cuestión de minutos, dejando a ver que Axel se dirigía a una de las estatuas.");
        
        System.out.println("Esto lo veias como algo sin mucho sentido aun, pero solo te quedaste mirando el rostro esculpido de una de las tastatuas,");
        System.out.println("quien reconociste como uno de los fundadores.");
        
        System.out.println(nombre + "(Suspiro) Vaya... esto se ve complicado.");
        
        System.out.println("Axel: ¿Enserio?¿Como sueles manejar la incertidumbre en el trabajo?");
    }
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

                System.out.println("Al llegar al lugar se te presenta diferentes formar de poder interactuar con ellos,");
                System.out.println("¿Con cuál te sentirías más cómodo?");
                
                 System.out.println("1.- Me siento más seguro/a cuando estoy hablando sobre un tema en el que  tengo experiencia y conocimiento.");
                 System.out.println("2.- Me siento más inseguro/a al interactuar con personas que considero más   autoritarias o dominantes.");
                 System.out.println("3.- Me siento más seguro/a cuando estoy con amigos cercanos o familiares.");
                 System.out.println("4.- Me siento más seguro/a cuando estoy con amigos cercanos o familiares.");
                 
                 if (op2 == 1){
                     System.out.println("Después de tomar la decisión de enfocarte en un tema en el que te sientes cómodo,");
                     System.out.println("te acercas a un grupo más pequeño de personas que parecen estar dicutiendo sobre algo que te interesa profundamente.");
                     System.out.println("Te unes a la conversación y rapidamente te sientes en tu elemento");
                 }
                 else if (op2 == 2){
                     System.out.println("Después de notar la presencia de algunas personas que parecen tener una actitud más autoritaria o dominante en el grupo,");
                     System.out.println("te sientes un poco inseguro/a sobre como interactuar con ellos.");
                     System.out.println("Una de las chicas al notas esto, se acerca a ti sacándote levemente una conversación. ");
                 }
                 else if (op2 == 3){
                     System.out.println("La chica dde antes al notar esto, te sonrió y te invitó a unirte a ella para enfrentar la situación juntos.");
                     System.out.println("Su tono amigable te hizo sentir más a gusto.");
                     System.out.println("Violett: Debes de ser nuevo/a por aquí");
                 }
                 else if (op2 == 4){
                     System.out.println("Agregar Texto");
                 }
                 System.out.println("Gracias a esto llamas la atención de varias personar por esta iniciativa.");
                 System.out.println("Violett se acerca con una sonrisa cálida en el rostro, mostrando interés genuino en lo que estás compartiendo");
                 
                 System.out.println("Violett: \"¡Wow, tienes muchas ideas interesantes! Realmente disfruto tu entusiasmo por este tema, Me encantaría saber más sobre lo que estás diciendo.");
                 System.out.println("¿Qué te motivó a aprender tanto sobre esto?");
                 System.out.println("Dice con entuciasmo, sintiendo inmediatamente una conexion");
                 
                 System.out.println("1.- Una curiosidad natural.");
                 System.out.println("2.- Aumentar tu conocimiento.");
                 System.out.println("3.- Sentir una gran pasión por esta.");
                 
                 op2 = captu.nextInt();
                 if (op2 == 1){
                     System.out.println("Violett: oh, entiendo completamente eso.");
                     System.out.println("A menudo que me encuentro investigando sobre temas que simplemente me intrigan.");
                     System.out.println("Es como si mi mente estuviera constantemente buscando nuevas cosas para descubrir y aprender");
                 }
                 else if (op2 == 2){
                     System.out.println("Violett: Oh, ¡Totalmente! aumentar tu conocimiento es genial, ¿verdad? Siempre me encuentro buscando nuevas cosas para aprender, especialmente sobre temas que me interesan.");
                     System.out.println("¿Qué te llevó a querer saber más sobre esto? ¿Fue como un '¡guau, ¡Esto es increíble!' ¿tipo de momento?");
                 }
                 else if (op2 == 3){
                     System.out.println("Violett: ¡Qué maravilloso! La pasión puede ser un motor increíble para la investigación.");
                     System.out.println("Cuando te apasiona algo, realmente te sumerges en ello, ¿verdad? Personalmente,");
                     System.out.println("experimentó esa sensación al investigar sobre temas que realmente me emocionan");
                 }
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
