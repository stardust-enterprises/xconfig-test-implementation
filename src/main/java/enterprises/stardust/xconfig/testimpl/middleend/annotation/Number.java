package enterprises.stardust.xconfig.testimpl.middleend.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Number {
    int min() default Integer.MIN_VALUE;
    int max() default Integer.MAX_VALUE;
    int step() default 1;
}
