package com.timsoft.deviceregistrar.controller;

import com.timsoft.deviceregistrar.model.DeviceRegistration;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/device-registrar/v1")
@AllArgsConstructor
public class DeviceRegistrationController {

    @GetMapping(value = "/isregistered/{deviceId}", produces = "application/json")
    public ResponseEntity<DeviceRegistration> getConnection(@PathVariable String deviceId){
       log.info("Device registrar Get API invoked for device id: {}", deviceId);
       return ResponseEntity.ok(new DeviceRegistration());
    }

}
