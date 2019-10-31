package p16;
public class Launch implements Runnable{
    private int start;
    private String message;
    public Launch(int start, String message){
        this.start = start;
        this.message = message;
    }
    public void run(){
        try{
            //System.out.println(Thread.currentThread().getName());
            Thread.sleep(30000 - start * 1000);
        }catch(InterruptedException e){

        }
        System.out.println(message);
    }
}   