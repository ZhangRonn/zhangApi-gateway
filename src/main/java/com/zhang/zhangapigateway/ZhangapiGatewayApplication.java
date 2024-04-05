package com.zhang.zhangapigateway;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import com.zhang.service.InnerInterfaceInfoService;
import com.zhang.service.InnerUserInterfaceInfoService;
import com.zhang.service.InnerUserService;
import com.zhang.zhangapigateway.provider.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;


@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
@EnableDubbo
public class ZhangapiGatewayApplication {

    public static void main(String[] args) {
         SpringApplication.run(ZhangapiGatewayApplication.class, args);
        System.out.println("gateway项目启动成功啦！！！！");
    }

}

