import java.io.BufferedReader;// 수신용 버퍼
import java.io.PrintWriter; // 송신용 버퍼
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket; // 클라이언트용 소켓
import java.net.InetAddress; // IP 어드레스 획득
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args){
		System.out.println("에코 클라이언트 시작!");
try{		
		InetAddress localAddress = InetAddress.getLocalHost(); //IP 주소 획득

			try(
				Socket cSocket = new Socket(localAddress, 9999); // 서버 호스트 정보, 포트번호
				BufferedReader br = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));
				PrintWriter out = new PrintWriter(cSocket.getOutputStream(), true);
					){
						System.out.println("서버 연결됨!");
						Scanner scv = new Scanner(System.in);
						while(true) {
							System.out.println("메세지 입력 : ");
							String line = scv.nextLine();
							if("quit".equalsIgnoreCase(line)){
								break;
							}
							out.println(line);
							System.out.println("서버 응답 : " + br.readLine());
						}
						scv.close();
					}
					}catch(IOException e){
						e.printStackTrace();
					}
	}
}




