package com.example.protobufdemo;

import com.example.protobufdemo.model.UsersModel;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

@SpringBootApplication
@RestController
public class ProtobufDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProtobufDemoApplication.class, args);
    }


//  编译命令
//    heweide:resources hewei$ protoc  --java_out=$PWD static/single_text_request.proto
//    heweide:resources hewei$ protoc  --objc_out=$PWD static/single_text_request.proto
//    heweide:resources hewei$ protoc  --java_out=$PWD static/single_text_response.proto
//    heweide:resources hewei$ protoc  --java_out=$PWD static/protobuf_response.proto
//    heweide:resources hewei$ protoc  --objc_out=$PWD static/single_text_response.proto
//    heweide:resources hewei$ protoc  --objc_out=$PWD static/protobuf_response.proto


}
