package com.syx.coupon.template.api.beans.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Discount
 * @Description 折扣策略
 * @Author SiYiXiong
 * @Date 2022/3/20 23:59
 * @Version v0.1
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Discount {

    //使用 Long 来表示“金额”。对于境内电商行业来说，
    //金额往往是以分为单位的，这样我们可以直接使用 Long 类型参与金额的计算，
    //比如 100 就代表 100 分，也就是一块钱。
    //这比使用 Double 到处转换 BigDecimal 省了很多事儿

    // 对于满减券 - quota是减掉的钱数，单位是分
    // 对于打折券 - quota是折扣(以100表示原价)，90就是打9折, 95就是95折
    // 对于随机立减券 - quota是最高的随机立减额
    // 对于晚间特别优惠券 - quota是日间优惠额，晚间优惠翻倍
    private Long quota;

    // 订单最低要达到多少钱才能用优惠券，单位为分
    private Long threshold;
}
