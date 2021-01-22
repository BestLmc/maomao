package cn.bestlmc.maomao.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author bestlmc
 * @Date 2020/12/1 14:28
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
