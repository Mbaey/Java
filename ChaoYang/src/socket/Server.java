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
 
            System.out.println("监听在端口号:8888");
            Socket s = ss.accept();
 
            //打开输入流
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String readUTF = dis.readUTF();
            
            //读取客户端发送的数据
//            int msg = is.read();
            //打印出来
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