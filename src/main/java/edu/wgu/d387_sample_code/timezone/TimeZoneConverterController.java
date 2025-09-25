package edu.wgu.d387_sample_code.timezone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TimeZoneConverterController {

    @GetMapping("/timezones")
    public String[] getTimeZones() {
        return TimeZoneConverter.convertTimeZones();
    }
}
