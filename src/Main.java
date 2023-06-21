public class Main {
    public static void main(String[] args) {


        Honorario h1 = new Honorario(
                "Juan Felipe" ,"Etchegoyen Parra" , "18369785-K",
                "985545555" , 31 , "INFORMÁTICA" , 1995
        );

        Contratado c1 = new Contratado(
                "Laura Paola" ,"Valdes Gonzalez" , "20554458-8",
                "958641234" , 23 , "05/12/2010" , 970000
        );

        Eventual e1 = new Eventual(
                "Mario Alfredo" ,"Vergara Tapia" , "17554668-8",
                "865554555" , 33 , "Inmediata" , "malvert@gmail.com"
        );

        System.out.println("Honorario 1:");
        h1.mostrarDatos();
        System.out.println(h1.toString());

        System.out.println("\nContratado 1:");
        c1.mostrarDatos();
        System.out.println(c1.toString());

        System.out.println("\nEventual 1:");
        e1.mostrarDatos();
        System.out.println(e1.toString());

    }
}
