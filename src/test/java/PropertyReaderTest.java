import conf.PropertyConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import reading.PropertyReader;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PropertyConfiguration.class)
public class PropertyReaderTest {
    private PropertyReader propertyReader;

    @Autowired
    public void setPropertyReader(PropertyReader propertyReader) {
        this.propertyReader = propertyReader;
    }

    @Test
    public void shouldReturnValueFromApplicationProperty() {
        assertEquals("me", propertyReader.getUserName());
    }
}
