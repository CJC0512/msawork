package com.ohgiraffers.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

/* 설명. 유라케 서버의 클라이언트로 등록할 프로젝트로 기동 */
@EnableDiscoveryClient
public class Chap0102EurekaClientLectureServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap0102EurekaClientLectureServerApplication.class, args);
    }

}
