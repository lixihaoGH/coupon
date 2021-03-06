package cn.com.lixihao.couponapi.core.mybatis;

import java.lang.annotation.*;

/**
 * SqlMapper annotation for MapperScannerConfigurer to scan mapper interfaces.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface SqlMapper {

}