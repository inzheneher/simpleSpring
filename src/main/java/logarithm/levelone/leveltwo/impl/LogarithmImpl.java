package logarithm.levelone.leveltwo.impl;

import logarithm.levelone.leveltwo.api.Logarithm;
import org.springframework.stereotype.Component;

@Component
public class LogarithmImpl implements Logarithm {
    @Override
    public <T extends Number> double getLogarithm(T number) {
        return Math.log10((Double) number);
    }
}
