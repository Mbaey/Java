package socket;
 
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
 
public class Client {
 
    public static void main(String[] args) {
 
        try {
            Socket s = new Socket("127.0.0.1", 8888);
 
            // �������
            OutputStream os = s.getOutputStream();
 
//            // ��������110�������
//            os.write(110);
//            
//            os.close();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF("��Ҫ������");
            dos.flush();
            dos.close();
            s.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}