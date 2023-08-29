package ch16_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.file.attribute.UserPrincipalNotFoundException;

public class ReceiveThread extends Thread{
	private Socket soc;
	public ReceiveThread(Socket soc) {
		super();
		this.soc = soc;
	}
	@Override
	public void run() {
		try {
			BufferedReader reader =
					new BufferedReader(new InputStreamReader(soc.getInputStream(),"UTF-8"));
			while(true) {
				String msg = reader.readLine();
				if(msg == null || msg.isEmpty()) {
					break;
				}
				System.out.println(msg);
			}
		} catch (UserPrincipalNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(soc != null) try {soc.close();} catch (IOException e) {}
		}
	}
	
}
