package Ejemplos_prac2;

public class MiSegundaAplicacionJava {
    
    public static void main (String[] args){
        //se hace el llamado cada uno de los metodods creados
        metodoConVoid();
        metodoConInt();
        metododConDouble();
        metododConString();
    }
    public static void metodoConVoid(){
        System.out.println("Contenido del metodod con void");
    }
    
    public static int metodoConInt(){
        System.out.println("Contenido del metodod con int");
        return 0;
    }
    
    public static double metododConDouble(){
        System.out.println("contenido del metodod con double");
        return 0.0;
    }
    
    public static String metododConString(){
        System.out.println("Contenido del metodod con string");
        return"";
    }    
}
    


