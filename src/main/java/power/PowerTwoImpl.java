package power;

import org.springframework.stereotype.Component;

@Component
public class PowerTwoImpl implements PowerTwo {
    public int getPowerTwo(int a) {
        return a * a;
    }
}