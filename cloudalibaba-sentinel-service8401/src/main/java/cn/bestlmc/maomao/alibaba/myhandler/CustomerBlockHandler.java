package cn.bestlmc.maomao.alibaba.myhandler;

import cn.bestlmc.maomao.entities.CommonResult;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author bestlmc
 * @Date 2021/1/18 13:33
 */
public class CustomerBlockHandler
{
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
