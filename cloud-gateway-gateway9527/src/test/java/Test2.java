import java.time.ZonedDateTime;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author bestlmc
 * @Date 2020/12/8 14:54
 */
public class Test2 {
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

        //2020-02-21T15:51:37.485+08:00[Asia/Shanghai]
    }
}
