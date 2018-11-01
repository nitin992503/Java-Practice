public class Exp {

    public static void main(String args[]){
        fun a = new fun();
        Th obj1 = new Th(20,a,"Hello");
        Th obj2 = new Th(30,a,"World");
        
        try{
            obj1.t.join();
            obj2.t.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
