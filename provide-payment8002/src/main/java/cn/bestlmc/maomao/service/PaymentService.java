package cn.bestlmc.maomao.service;

import cn.bestlmc.maomao.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author bestlmc
 * @Date 2020/4/12 12:27
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
