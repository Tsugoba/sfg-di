package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

    @Override
    public String sayGrreting() {
        return "Hello World - Property";
    }
}
