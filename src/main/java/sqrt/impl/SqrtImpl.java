package sqrt.impl;

import org.springframework.stereotype.Component;
import sqrt.api.Sqrt;

@Component
public class SqrtImpl implements Sqrt {
    @Override
    public <T extends Number> double getSqrt(T number) {
        return Math.sqrt((Double) number);
    }
}
