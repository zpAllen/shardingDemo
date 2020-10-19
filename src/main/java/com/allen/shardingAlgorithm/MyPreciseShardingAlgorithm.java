package com.allen.shardingAlgorithm;


import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @ClassName MyPreciseShardingAlgorithm
 * @Description: 分表策略类 ，自定义分表策略
 * @Author Administrator
 * @Date 2020/6/3 0003
 * @Version V1.0
 **/
public class MyPreciseShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Integer> shardingValue) {
        for (String tableName : availableTargetNames) {
            if (tableName.endsWith(shardingValue.getValue() % 2 + "")) {
                return tableName;
            }
        }
        throw new IllegalArgumentException();
    }
}
