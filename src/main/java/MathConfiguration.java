import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"power", "sqrt", "logarithm.levelone.leveltwo"})
public class MathConfiguration {
}