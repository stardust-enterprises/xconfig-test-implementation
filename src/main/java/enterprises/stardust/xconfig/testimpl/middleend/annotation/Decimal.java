package enterprises.stardust.xconfig.testimpl.middleend.annotation;

import com.sun.org.apache.bcel.internal.generic.FLOAD;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Decimal {
    float min() default Float.MIN_VALUE;
    float max() default Float.MAX_VALUE;
    float step() default 1;
}
