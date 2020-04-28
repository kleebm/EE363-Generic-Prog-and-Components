import java.lang.Math;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;

public class RThread implements Runnable {
	private int low;
	private int high;
	private String name;
	private Thread t;

	public RThread(String nm,int l, int h){
		low = l;
		high = h;
		name = nm;
		t = new Thread(this,name);
		t.start();
	}

	public void run() {
		double sum = 0;
		for(int i = low;i <= high;i++){
			sum = sum + Math.sqrt(i);

		}
		double avg = sum / (high-low);
		try{
			write(avg,Thread.currentThread().getName());
		}catch(Exception e){
			System.out.println("File write error");
		}
	}

	public synchronized void write(double a, String name) throws IOException{
		PrintWriter out = new PrintWriter(new BufferedWriter( new FileWriter("kleebm_parsqrtavg50.txt",true)));
		synchronized(out){
		out.append("[Thread " + name + " }: Average of sqaure roots ( " + low + " to " + high + " ) = " + a + "\n");
		}
		out.close();
	}

}

	


