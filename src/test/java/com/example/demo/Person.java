package com.example.demo;

import lombok.Data;
import lombok.experimental.Accessors;
import top.xiajibagao.crane.core.annotation.Assemble;
import top.xiajibagao.crane.core.annotation.Prop;

/**
 * @author huangchengxing
 * @date 2022/05/23 16:00
 */
@Data // 使用Lombok简化getter和setter方法
@Accessors(chain = true)
public class Person {
    @Assemble(namespace = "sex", props = @Prop("sexName"))
    Integer sex;
    String sexName;
}
