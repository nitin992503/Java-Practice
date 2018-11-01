public class fun {
    
    int a = 10;
    
    void airthmetic(int c,String b){
        System.out.println("adding 10 with "+c +" = "+(a+c));
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(b);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("subtracting "+ c +" from 10 = "+(a-c));
    }
}