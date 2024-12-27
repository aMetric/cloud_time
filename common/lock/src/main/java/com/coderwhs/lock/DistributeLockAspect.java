package com.coderwhs.lock;

import org.aspectj.lang.annotation.Aspect;
import org.redisson.api.RedissonClient;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author whs
 * @Date 2024/12/27 22:54
 * @description:
 */
@Aspect
@Component
@Order(Integer.MIN_VALUE)
public class DistributeLockAspect {

  private RedissonClient redissonClient;

  public DistributeLockAspect(RedissonClient redissonClient) {
    this.redissonClient = redissonClient;
  }


}
