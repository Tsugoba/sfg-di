package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"}) //you can use {"ES", default} for don't put in application.properties the property spring.default.active
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGrreting() {
        return "Hola mundo - ES";
    }
}
