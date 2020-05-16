package com.bizzdesk.group.tax.payer.management.controller;

import com.bizzdesk.group.tax.payer.management.service.TaxPayerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxPayerManagementController {

    private TaxPayerManagementService taxPayerManagementService;

    @Autowired
    public TaxPayerManagementController(TaxPayerManagementService taxPayerManagementService) {
        this.taxPayerManagementService = taxPayerManagementService;
    }

    @GetMapping("/validate/tin")
    public boolean validateTin(@RequestParam("tin") String tin) {
        return taxPayerManagementService.validateTin(tin);
    }
}
