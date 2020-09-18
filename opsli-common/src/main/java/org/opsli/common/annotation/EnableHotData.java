package org.opsli.common.annotation;

import org.opsli.common.constants.CacheConstants;

import java.lang.annotation.*;

/**
 * @BelongsProject: opsli-boot
 * @BelongsPackage: org.opsli.common.annotation
 * @Author: Parker
 * @CreateTime: 2020-09-16 16:36
 * @Description: 热数据 - Get
 *
 * 添加在 Service get 方法上 ， 默认获得 传入对象 key为id的数据
 *
 * 调用 热点数据 不论增加缓存 还是 删除缓存
 *  返回值 必须为 集成了 BaseEntity 的 类
 *
 * 注意：不论是什么缓存，只要是缓存 就多少会有一致性的问题，针对不是那么重要的数据 且高频访问的数据可以缓存起来
 *
 * 主动式 推送热点数据
 *
 * 用于 注解类 - 直接按照类开启 增 删 经过缓存
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface EnableHotData {



}
