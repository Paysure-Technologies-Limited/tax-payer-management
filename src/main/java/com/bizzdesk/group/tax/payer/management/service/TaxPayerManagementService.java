package com.bizzdesk.group.tax.payer.management.service;

import com.bizzdesk.group.tax.payer.management.entities.TaxPayerInformation;
import com.bizzdesk.group.tax.payer.management.mapper.ModelMapper;
import com.bizzdesk.group.tax.payer.management.repository.TaxPayerInformationRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gotax.framework.library.entity.helpers.AssetResponse;
import com.gotax.framework.library.sbirs.helpers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxPayerManagementService {

    private TaxPayerInformationRepository taxPayerInformationRepository;

    @Autowired
    public TaxPayerManagementService(TaxPayerInformationRepository taxPayerInformationRepository) {
        this.taxPayerInformationRepository = taxPayerInformationRepository;
    }

    public boolean validateTin(String tin) {
        return taxPayerInformationRepository.existsById(tin);
    }

    @ServiceActivator(inputChannel = "individual-tax-payers")
    public void getIndividualTaxPayersMessage(Message<String> individualTaxPayersMessage) {
        try {
            IndividualTaxPayerInformation individualTaxPayerInformation = new ObjectMapper().readValue(individualTaxPayersMessage.getPayload(), IndividualTaxPayerInformation.class);
            TaxPayerInformation taxPayerInformation = ModelMapper.mapIndividualTaxPayersHelperToEntity(individualTaxPayerInformation);
            taxPayerInformationRepository.save(taxPayerInformation);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @ServiceActivator(inputChannel = "non-individual-tax-payers")
    public void getNonIndividualTaxPayersMessage(Message<String> nonIndividualTaxPayersMessage) {
        try {
            NonIndividualTaxPayerInformation nonIndividualTaxPayerInformation = new ObjectMapper().readValue(nonIndividualTaxPayersMessage.getPayload(), NonIndividualTaxPayerInformation.class);
            TaxPayerInformation taxPayerInformation = ModelMapper.mapNonIndividualTaxPayersHelperToEntity(nonIndividualTaxPayerInformation);
            taxPayerInformationRepository.save(taxPayerInformation);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @ServiceActivator(inputChannel = "non-individual-tax-payers-paged")
    public void getNonIndividualTaxPayersPagedMessage(Message<String> nonIndividualTaxPayersPagedMessage) {
        try {
            List<NonIndividualTaxPayerPagedInformation> nonIndividualTaxPayerPagedInformationList = new ObjectMapper().readValue(nonIndividualTaxPayersPagedMessage.getPayload(), new TypeReference<List<NonIndividualTaxPayerPagedInformation>>(){});
            nonIndividualTaxPayerPagedInformationList.forEach(nonIndividualTaxPayerPagedInformation -> {
                TaxPayerInformation taxPayerInformation = ModelMapper.mapNonIndividualTaxPagedPayersHelperToEntity(nonIndividualTaxPayerPagedInformation);
                taxPayerInformationRepository.save(taxPayerInformation);
            });
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @ServiceActivator(inputChannel = "individual-tax-payers-paged")
    public void getIndividualTaxPayersPagedMessage(Message<String> individualTaxPayersPagedMessage) {
        try {
            List<IndividualTaxPayerPagedInformation> individualTaxPayerPagedInformationList  = new ObjectMapper().readValue(individualTaxPayersPagedMessage.getPayload(), new TypeReference<List<IndividualTaxPayerPagedInformation>>(){});
            individualTaxPayerPagedInformationList.forEach(individualTaxPayerPagedInformation -> {
                TaxPayerInformation taxPayerInformation = ModelMapper.mapIndividualTaxPayersPagedHelperToEntity(individualTaxPayerPagedInformation);
                taxPayerInformationRepository.save(taxPayerInformation);
            });
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
