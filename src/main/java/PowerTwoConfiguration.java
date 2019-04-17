import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PowerTwoConfiguration {
    @Bean
    public PowerTwo getPowerTwoImpl() {
        return new PowerTwoImpl();
    }
}