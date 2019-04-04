package springcloud.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import springcloud.entities.Dept;

import java.util.List;

/**
 * 类作用:
 * 项目名称: microservicecloud
 * 包: springcloud.service
 * 类名称: DeptClientServiceFallbackFactory
 * 类描述: 类功能详细描述
 * 创建人: wuguang
 * 创建时间: 2019/04/01 16:07
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService(){

            @Override
            public Dept get(long id) {
                return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}