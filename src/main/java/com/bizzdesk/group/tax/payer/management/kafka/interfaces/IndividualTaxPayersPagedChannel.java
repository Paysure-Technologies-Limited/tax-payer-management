package com.bizzdesk.group.tax.payer.management.kafka.interfaces;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface IndividualTaxPayersPagedChannel {

    @Input(value = "individual-tax-payers-paged")
    SubscribableChannel input();
}
