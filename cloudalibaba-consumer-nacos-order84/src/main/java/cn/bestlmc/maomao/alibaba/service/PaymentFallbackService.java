package cn.bestlmc.maomao.alibaba.service;

import cn.bestlmc.maomao.entities.CommonResult;
import cn.bestlmc.maomao.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author bestlmc
 * @Date 2021/1/19 16:53
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
