package socket;
 
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
 
public class Server {
 
    public static void main(String[] args) {
        try {
 
            ServerSocket ss = new ServerSocket(8888);
 
            System.out.println("�����ڶ˿ں�:8888");
            Socket s = ss.accept();
 
            //��������
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String readUTF = dis.readUTF();
            
            //��ȡ�ͻ��˷��͵�����
//            int msg = is.read();
            //��ӡ����
//            System.out.println(msg);
            System.out.println(readUTF);
            is.close();
            dis.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
}