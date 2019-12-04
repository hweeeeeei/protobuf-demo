package com.example.protobufdemo.controller;

import com.example.protobufdemo.model.ProtobufResponseModel;
import com.example.protobufdemo.model.SingleTextRequestModel;
import com.example.protobufdemo.model.SingleTextResponseModel;
import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @Description null
 * @Author hewei hwei1233@163.com
 * @Date 2019-11-13
 */
//@SpringBootTest
class SinglereqControllerTest {

    @Test
    void postText2() {

        RestTemplate restTemplate = new RestTemplate();

        String url = "http://192.168.1.101:8002/pushSingleTextV1210";
//        String url = "http://192.168.1.101:8080/test2/t1";

        SingleTextRequestModel.SingleTextRequest.Builder builder = SingleTextRequestModel.SingleTextRequest.newBuilder();
        builder.setReceiver("631090244157964289");
        builder.setRoomId("631090244157964289");
        builder.setBackId("id123-45-3242-34");
        builder.setContent("qwe你好213qwe你好213qwe你好213qw哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
        byte[] reqbytes = builder.build().toByteArray();

        HttpEntity<byte[]> requestEntity = new HttpEntity<>(reqbytes);

        byte[] bytes = restTemplate.postForObject(url, requestEntity, byte[].class);


        // 解码
        try {

            ProtobufResponseModel.ProtobufResponse base =  ProtobufResponseModel.ProtobufResponse.parseFrom(bytes);
            SingleTextResponseModel.SingleTextResponse  singleTextResponse = SingleTextResponseModel.SingleTextResponse.parseFrom(base.getData());

            base.getData();
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }



    }

}