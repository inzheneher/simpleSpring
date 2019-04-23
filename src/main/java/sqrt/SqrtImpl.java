package sqrt;

import org.springframework.stereotype.Component;

@Component
public class SqrtImpl implements Sqrt {
    @Override
    public <T extends Number> double getSqrt(T number) {
        return Math.sqrt((Double) number);
    }
}
