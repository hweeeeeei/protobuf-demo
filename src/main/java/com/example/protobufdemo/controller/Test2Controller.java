package com.example.protobufdemo.controller;

import com.example.protobufdemo.model.ProtobufResponseModel;
import com.example.protobufdemo.model.SingleTextRequestModel;
import com.example.protobufdemo.model.SingleTextResponseModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description null
 * @Author hewei hwei1233@163.com
 * @Date 2019-11-13
 */
@Controller
@RequestMapping("/test2")
public class Test2Controller {


    @RequestMapping(value = "/t1", method = RequestMethod.POST)
    public void t2(HttpServletRequest request, HttpServletResponse response) throws IOException {

        ServletInputStream inputStream = request.getInputStream();
        SingleTextRequestModel.SingleTextRequest res = SingleTextRequestModel.SingleTextRequest.parseFrom(inputStream);

        System.out.println(res.getContent());

        SingleTextResponseModel.SingleTextResponse.Builder singleTextResponse = SingleTextResponseModel.SingleTextResponse.newBuilder();

        singleTextResponse.setMessageId("hhh哈哈哈哈哈你好hhh哈哈哈哈哈你好hhh哈哈哈哈哈你好hhh哈哈哈哈哈你好hhh哈哈哈哈哈你好hhh哈哈哈哈哈你好213123123123123");

        ProtobufResponseModel.ProtobufResponse.Builder base = ProtobufResponseModel.ProtobufResponse.newBuilder();
        base.setCode(200);
        base.setMessage("成功success");
        base.setData(singleTextResponse.build().toByteString());

        response.setContentType("application/x-protobuf");
        byte[] baseByte = base.build().toByteArray();


        // 反解析
        ProtobufResponseModel.ProtobufResponse b2 =  ProtobufResponseModel.ProtobufResponse.parseFrom(baseByte);
        SingleTextResponseModel.SingleTextResponse singleTextResponse2 =SingleTextResponseModel.SingleTextResponse.parseFrom(b2.getData());

        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(baseByte);
        outputStream.flush();
        outputStream.close();
    }


}
