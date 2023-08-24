package Issac;
//ch13_thread.Issac;
public class Customer extends Thread{
	private Issac issac = Issac.getInstance();
	private String nm;
	private int cnt;
	public  Customer(String nm, int cnt) {
		this.nm=nm;
		this.cnt= cnt;
	}
	@Override        //헷갈리는 부분
	public void run() {
		issac.buyToast(nm, cnt);
	}
	
}
