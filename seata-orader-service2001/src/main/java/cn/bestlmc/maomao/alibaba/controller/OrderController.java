package cn.bestlmc.maomao.alibaba.controller;

import cn.bestlmc.maomao.alibaba.domain.CommonResult;
import cn.bestlmc.maomao.alibaba.domain.Order;
import cn.bestlmc.maomao.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author bestlmc
 * @Date 2021/1/20 14:07
 */
@RestController
public class OrderController
{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}