package springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springcloud.entities.Dept;


/**
 * 
 * @Description: 修改microservicecloud-api工程，根据已经有的DeptClientService接口

新建

一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory
 * @author wuguang
 * @date 2018年4月21日
 */

@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService
{
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    Dept get(@PathVariable("id") long id);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    List<Dept> list();

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    boolean add(Dept dept);
}
