import conf.MathConfiguration;
import logarithm.levelone.leveltwo.api.Logarithm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import power.api.PowerTwo;
import sqrt.api.Sqrt;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MathConfiguration.class)
public class PowerTwoImplTest {

    private Sqrt sqrt;
    private PowerTwo powerTwo;
    private Logarithm logarithm;

    @Autowired
    public void setSqrt(Sqrt sqrt) {
        this.sqrt = sqrt;
    }

    @Autowired
    public void setPowerTwo(PowerTwo powerTwo) {
        this.powerTwo = powerTwo;
    }

    @Autowired
    public void setLogarithm(Logarithm logarithm) {
        this.logarithm = logarithm;
    }

    @Test
    public void shouldReturnPowerTwo() {
        assertEquals(4, powerTwo.getPowerTwo(2));
    }

    @Test
    public void shouldReturnSqrt() {
        assertEquals(2, sqrt.getSqrt(4D), 0);
    }

    @Test
    public void shouldReturnLogarithm() {
        assertEquals(2, logarithm.getLogarithm(100D), 0);
    }
}