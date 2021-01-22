package cn.bestlmc.maomao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author bestlmc
 * @Date 2020/12/8 13:32
 */
@SpringBootApplication
@EnableEurekaClient
public class Gateway9527Main {
    public static void main(String[] args) {
        SpringApplication.run(Gateway9527Main.class, args);
    }
}
