package com.snhu.sslserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.util.Base64;

@RestController
public class ChecksumController {

    @GetMapping("/hash")
    public String getChecksum() {
        try {
            // Unique data string
            String data = "Hello World Check Sum! - Ivan Isip";
            
            // Generate SHA-256 checksum
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(data.getBytes());
            
            // Encode checksum in Base64 for readability
            String checksum = Base64.getEncoder().encodeToString(hashBytes);
            return "Checksum: " + checksum + " for data: " + data;
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
