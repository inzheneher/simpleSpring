package power.impl;

import org.springframework.stereotype.Component;
import power.api.PowerTwo;

@Component
public class PowerTwoImpl implements PowerTwo {
    public int getPowerTwo(int a) {
        return a * a;
    }
}