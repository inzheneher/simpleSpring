import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PowerTwoConfiguration.class)
public class PowerTwoImplTest {
    @Autowired
    private PowerTwo powerTwo;

    @Before
    public void setUp() {
        System.out.println(powerTwo);
    }

    @Test
    public void shouldReturnPowerTwo() {
        assertEquals(4, powerTwo.getPowerTwo(2));
    }
}