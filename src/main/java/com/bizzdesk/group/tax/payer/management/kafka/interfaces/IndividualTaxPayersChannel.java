package com.bizzdesk.group.tax.payer.management.kafka.interfaces;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface IndividualTaxPayersChannel {

    @Input(value = "individual-tax-payers")
    SubscribableChannel input();
}
