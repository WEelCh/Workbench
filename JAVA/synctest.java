//import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class synctest extends Thread{
    
    public static void main(String[] args){
        synctest thread = new synctest();
        thread.start();
        int i = 0;
        while (1==1){
            System.out.println("Main operating: "+i);
            i++;
        }

    }

    public void run(){
        int i=0;
        while (1==1){
        System.out.println("Thread operating: "+i);
        i++;
    }
}
}
