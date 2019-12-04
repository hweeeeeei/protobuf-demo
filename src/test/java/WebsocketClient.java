
import com.google.protobuf.ByteString;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.example.protobufdemo.model.SingleTextRequestModel;
import org.java_websocket.WebSocket;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.logging.Logger;

/**
 * @Description null
 * @Author hewei hwei1233@163.com
 * @Date 2019-12-03
 */

public class WebsocketClient {

    private static Logger logger = Logger.getLogger(String.valueOf(WebsocketClient.class));
    public static WebSocketClient client;

    public static void main(String[] args) {
        try {
            String str = "ws://127.0.0.1:8002/appws?token=eyJhbGciOiJIUzI1NiJ9.eyJ0eXBlIjoicmVmcmVzaFRva2VuIiwidXNlcklkIjo2NDYzMDY2Mzk0NjAxNzE4OTIsImlzcyI6InRlbXBsZSIsImF1ZCI6IjY0NjMwNjYzOTQ2MDE3MTg5MiIsInN1YiI6IjY0NjMwNjYzOTQ2MDE3MTg5MiIsImV4cCI6MTU3NTcwOTY1MCwibmJmIjoxNTc0NDEzNjUwfQ.DwlRsj2SmSp0wdx2bGSrKFMxIZBIlzxrDIYHkpQE8J8";
            client = new WebSocketClient(new URI(str), new Draft_6455()) {
                @Override
                public void onOpen(ServerHandshake serverHandshake) {
                    logger.info("握手成功");
                }

                @Override
                public void onMessage(String msg) {
                    logger.info("收到消息==========" + msg);
                    if (msg.equals("over")) {
                        client.close();
                    }
                }

                @Override
                public void onClose(int i, String s, boolean b) {
                    logger.info("链接已关闭");
                }
                @Override
                public void onError(Exception e) {
                    e.printStackTrace();
                    logger.info("发生错误已关闭");
                }
            };
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        client.connect();
        logger.info(String.valueOf(client.getDraft()));
        while (!client.getReadyState().equals(WebSocket.READYSTATE.OPEN)) {
            logger.info("正在连接...");
        }
        //连接成功,发送信息
//        client.send("{'content':'sddsafasd123123f'}");

        SingleTextRequestModel.SingleTextRequest.Builder builder = SingleTextRequestModel.SingleTextRequest.newBuilder();
        builder.setReceiver("63109]79");
        builder.setRoomId("6310]4289");
        builder.setBackId("id12]42");
        builder.setContent("qwe哈]哈哈");
        byte[] reqbytes = builder.build().toByteArray();

//        String text = Arrays.toString(reqbytes);
        client.send(reqbytes);
    }

}
