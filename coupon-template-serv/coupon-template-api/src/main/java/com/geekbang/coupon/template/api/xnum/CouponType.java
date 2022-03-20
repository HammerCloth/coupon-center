package com.geekbang.coupon.template.api.xnum;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

/**
 * @ClassName CouponType
 * @Description 优惠卷类型枚举类
 * @Author SiYiXiong
 * @Date 2022/3/20 23:43
 * @Version v0.1
 **/
@Getter
@AllArgsConstructor
public enum CouponType {
    UNKNOWN("unknown", "0"),
    MONEY_OFF("满减券", "1"),
    DISCOUNT("打折", "2"),
    RANDOM_DISCOUNT("随机减", "3"),
    LONELY_NIGHT_MONEY_OFF("晚间双倍优惠券", "4");

    private String description;
    // 存在数据库里的最终code
    private String code;

    /**
     * 根据code返回对应的优惠卷类型
     * @param code 存储在数据库中code
     * @return 对应的优惠卷类型
     */
    public static CouponType convert(String code) {
        return Stream.of(values()) //获取到了所有的类型
                .filter(bean -> bean.code.equalsIgnoreCase(code)) //筛选出code一致的类型
                .findFirst() //如果有返回第一个
                .orElse(UNKNOWN); //如果没有则返回Unknow
    }

}
