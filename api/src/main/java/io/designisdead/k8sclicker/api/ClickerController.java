package io.designisdead.k8sclicker.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

@RestController
@RequestMapping(value = "/api/clicker")
@CrossOrigin(origins = "*")
public class ClickerController {

    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map get() {
        return Collections.singletonMap("count", "200");
    }

    @PostMapping(value = "/click", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map post() {
        long durationMs = spike();
        return Collections.singletonMap("duration", durationMs / 1000);
    }

    private long spike() {
        long start = System.currentTimeMillis();
        for(int i=0;i<5000000;i++) {
            long sleepTime = 500000000L;
            long startTime = System.nanoTime();
            double d = tan(atan(tan(atan(tan(atan(tan(atan(tan(atan(123456789.123456789))))))))));
            while ((System.nanoTime() - startTime) < sleepTime) {
            }
        }
        long end = System.currentTimeMillis();
        return end-start;
    }
}