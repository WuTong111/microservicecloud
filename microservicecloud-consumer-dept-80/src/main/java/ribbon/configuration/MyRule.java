package ribbon.configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * 类作用:
 * 项目名称: microservicecloud
 * 包: ribbon.configuration
 * 类名称: MyRule
 * 类描述: 类功能详细描述
 * 创建人: wuguang
 * 创建时间: 2019/04/01 10:23
 */
@Configuration
public class MyRule {
    @Bean
    IRule mySelfRule(){
        return new MyRoundRule();
    }
}