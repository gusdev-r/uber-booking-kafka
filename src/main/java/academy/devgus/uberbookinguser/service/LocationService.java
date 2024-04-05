package academy.devgus.uberbookinguser.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static academy.devgus.uberbookinguser.utils.Utility.LOGGER;

@Service
public class LocationService {

    @KafkaListener(topics = "uber-location", groupId = "user-group")
    public void cabLocation(String location) {
        LOGGER.info(location);
    }
}
