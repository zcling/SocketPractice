import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSocket {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9999);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入发送的字   符串：");
        String str = bufferedReader.readLine();

        //给服务端发送信息
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.write(str + "\r\n");
        printWriter.flush();

        //关闭资源
        bufferedReader.close();
        printWriter.close();
        socket.close();
    }
}
