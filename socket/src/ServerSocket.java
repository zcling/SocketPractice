import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by zcl on 2018/8/24.
 */
public class ServerSocket {
    public static void main(String[] args)throws IOException{
        java.net.ServerSocket serverSocket=new java.net.ServerSocket(9999);
        Socket socket=serverSocket.accept();

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String content=null;
        StringBuffer sb=new StringBuffer();
        while ((content=bufferedReader.readLine())!=null){
            sb.append(content);
        }
        System.out.println(sb);

        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
