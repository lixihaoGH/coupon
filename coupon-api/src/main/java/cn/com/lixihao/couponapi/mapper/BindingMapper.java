package cn.com.lixihao.couponapi.mapper;

import cn.com.lixihao.couponapi.core.mybatis.SqlMapper;
import cn.com.lixihao.couponapi.entity.condition.BindingCondition;
import org.springframework.stereotype.Repository;

/**
 * create by lixihao on 2017/12/25.
 **/
@SqlMapper
public interface BindingMapper {

    BindingCondition get(BindingCondition bindingCondition);

    Integer add(BindingCondition bindingCondition);

    Integer update(BindingCondition bindingCondition);
}
