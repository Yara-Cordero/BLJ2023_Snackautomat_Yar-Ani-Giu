package Snackautomat;


public class Main {

    private static final String purple = "\u001B[35m";
    private static final String cyan = "\u001B[36m";
    private static final String reset = "\u001B[0m";


    public static void printLogo(){

        System.out.println(purple +"██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ████████╗ ██████╗      ██████╗ ██╗   ██╗██████╗     ███████╗███╗   ██╗ █████╗  ██████╗██╗  ██╗    ███╗   ███╗ █████╗  ██████╗██╗  ██╗██╗███╗   ██╗███████╗\n" +
                cyan +"██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ╚══██╔══╝██╔═══██╗    ██╔═══██╗██║   ██║██╔══██╗    ██╔════╝████╗  ██║██╔══██╗██╔════╝██║ ██╔╝    ████╗ ████║██╔══██╗██╔════╝██║  ██║██║████╗  ██║██╔════╝\n" +
                purple +"██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗         ██║   ██║   ██║    ██║   ██║██║   ██║██████╔╝    ███████╗██╔██╗ ██║███████║██║     █████╔╝     ██╔████╔██║███████║██║     ███████║██║██╔██╗ ██║█████╗  \n" +
                cyan +"██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝         ██║   ██║   ██║    ██║   ██║██║   ██║██╔══██╗    ╚════██║██║╚██╗██║██╔══██║██║     ██╔═██╗     ██║╚██╔╝██║██╔══██║██║     ██╔══██║██║██║╚██╗██║██╔══╝  \n" +
                purple +"╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗       ██║   ╚██████╔╝    ╚██████╔╝╚██████╔╝██║  ██║    ███████║██║ ╚████║██║  ██║╚██████╗██║  ██╗    ██║ ╚═╝ ██║██║  ██║╚██████╗██║  ██║██║██║ ╚████║███████╗\n" +
                cyan +" ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝       ╚═╝    ╚═════╝      ╚═════╝  ╚═════╝ ╚═╝  ╚═╝    ╚══════╝╚═╝  ╚═══╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝    ╚═╝     ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝╚═╝╚═╝  ╚═══╝╚══════╝\n" +
                "                                                                                                                                                                                                                            " + reset);
    }

    public static void main(String[] args) {
        printLogo();


    }
}