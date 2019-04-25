package reading;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyReader {
    @Value("${user.last.name}")
    private String userName;

    public String getUserName() {
        return userName;
    }
}
