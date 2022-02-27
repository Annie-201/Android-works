package sample;

class ThreadDemos extends Thread{
	String work;

	public ThreadDemos(String work) {
		super();
		this.work = work;
	}
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println(work);
			try {
				Thread.sleep(800);
				
			} catch (Exception e) {
				// TODO: handle exception
			}		
		}
	}
	
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemos td=new ThreadDemos("I am depositing money");
		ThreadDemos td1=new ThreadDemos("I am withdrawing money");
		Thread t1=new Thread(td);
		Thread t2=new Thread(td1);
		t1.start();t2.start();
		
	}

}