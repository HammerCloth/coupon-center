package com.syx.coupon.template.api.beans.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName TemplateRule
 * @Description TemplateRule 包含了两个规则，一是领券规则，包括每个用户可领取的数量和券模板的过期时间；二是券模板的计算规则。
 * @Author SiYiXiong
 * @Date 2022/3/20 23:58
 * @Version v0.1
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateRule {
    // 可以享受的折扣
    private Discount discount;
    // 每个人最多可以领券数量
    private Integer limitation;
    // 过期时间
    private Long deadline;
}
