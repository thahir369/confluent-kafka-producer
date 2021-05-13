package com.helloWorld.controller;

import com.helloWorld.avro.CustomerV1;
import com.helloWorld.avro.CustomerV2;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.specific.SpecificRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@Slf4j
public class AvroController {

    @Autowired
    private KafkaTemplate<String, SpecificRecord> kafkaTemplate;

    String topicName="customer-topic";

    @PostMapping("/publish1")
    public String publishCustomerV1(@RequestBody final CustomerV1 data) {

        kafkaTemplate.send(topicName,data);

        log.info("published below customer data");
        log.info(data.toString());

        return "CustomerV1 Data published successfully!!!!";
    }

    @PostMapping("/publish2")
    public String publishCustomerV2(@RequestBody final CustomerV2 data) {

        kafkaTemplate.send(topicName,data);

        log.info("published below customer data");
        log.info(data.toString());

        return "CustomerV2 Data published successfully!!!!";
    }

}
