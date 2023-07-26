package JAVAMultithreading;

public class ThreadState extends Thread {
public void run() {
	try {System.out.println("hello I am Thread !!"+Thread.currentThread().getName()+"I am in "+Thread.currentThread().getState()+"State");}
	catch(Exception e)
	{System.out.println("Exception");}
}
public static void main(String...ar) throws Exception
{ThreadState tm1=new ThreadState();

ThreadState tm2=new ThreadState();

ThreadState tm3=new ThreadState();

ThreadState tm4=new ThreadState();
tm1.setName("first");
tm2.setName("second");
tm3.setName("three");


tm1.start();
tm2.start();
tm3.start();

}
}
