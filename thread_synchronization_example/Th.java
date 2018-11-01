public class Th implements Runnable{
    Thread t;
    int k;
    String str;
    fun f;
    Th(fun a){
        str = "Hello";
        f=a;
        k=10;
        t = new Thread(this,"thread 1");
        t.start();
    }

    Th(int a,fun b ,String l){
        str = l;
        f=b;
        k=a;
        t = new Thread(this,"thread 1");
        t.start();
    }

    public void run(){
        synchronized(f){ 
            f.airthmetic(k,str);
        }
    }
}