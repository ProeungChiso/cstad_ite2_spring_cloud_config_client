package co.istad.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credentials")
public class ClientController {

    @Value("${username}")
    private String serviceInfo;

    @GetMapping
    public String getServiceInfo() {
        return serviceInfo;
    }
}
