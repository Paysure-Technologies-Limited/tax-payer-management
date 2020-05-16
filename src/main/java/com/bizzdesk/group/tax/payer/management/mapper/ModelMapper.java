package com.bizzdesk.group.tax.payer.management.mapper;

import com.bizzdesk.group.tax.payer.management.entities.TaxPayerInformation;
import com.gotax.framework.library.entity.helpers.TaxPayerInformationHelper;
import com.gotax.framework.library.sbirs.helpers.IndividualTaxPayerInformation;
import com.gotax.framework.library.sbirs.helpers.IndividualTaxPayerPagedInformation;
import com.gotax.framework.library.sbirs.helpers.NonIndividualTaxPayerInformation;
import com.gotax.framework.library.sbirs.helpers.NonIndividualTaxPayerPagedInformation;

public class ModelMapper {

    public static TaxPayerInformationHelper mapTaxPayerInformation(TaxPayerInformation taxPayerInformation) {
        return new TaxPayerInformationHelper().setTaxAuthorityCode(taxPayerInformation.getTaxAuthorityCode())
                .setTaxAuthorityName(taxPayerInformation.getTaxAuthorityName())
                .setBvn(taxPayerInformation.getBvn())
                .setCity(taxPayerInformation.getCity())
                .setCommencementDate(taxPayerInformation.getCommencementDate())
                .setCountryName(taxPayerInformation.getCountryName())
                .setDateOfBirth(taxPayerInformation.getDateOfBirth())
                .setDateOfIncorporation(taxPayerInformation.getDateOfIncorporation())
                .setDateOfRegistration(taxPayerInformation.getDateOfRegistration())
                .setDirectorEmail(taxPayerInformation.getDirectorEmail())
                .setDirectorName(taxPayerInformation.getDirectorName())
                .setDirectorPhone(taxPayerInformation.getDirectorPhone())
                .setEmailAddress(taxPayerInformation.getEmailAddress())
                .setFinYrBegin(taxPayerInformation.getFinYrBegin())
                .setFinYrEnd(taxPayerInformation.getFinYrEnd())
                .setGenderName(taxPayerInformation.getGenderName())
                .setHouseNumber(taxPayerInformation.getHouseNumber())
                .setLastName(taxPayerInformation.getLastName())
                .setLgaName(taxPayerInformation.getLgaName())
                .setLineOfBusinessCode(taxPayerInformation.getLineOfBusinessCode())
                .setLobName(taxPayerInformation.getLobName())
                .setMainTradeName(taxPayerInformation.getMainTradeName())
                .setMaritalStatus(taxPayerInformation.getMaritalStatus())
                .setMiddleName(taxPayerInformation.getMiddleName())
                .setNationalityName(taxPayerInformation.getNationalityName())
                .setNin(taxPayerInformation.getNin())
                .setOccupation(taxPayerInformation.getOccupation())
                .setOrgName(taxPayerInformation.getOrgName())
                .setPhoneNumber1(taxPayerInformation.getPhoneNumber1())
                .setPhoneNumber2(taxPayerInformation.getPhoneNumber2())
                .setRegisteredName(taxPayerInformation.getRegisteredName())
                .setRegistrationNumber(taxPayerInformation.getRegistrationNumber())
                .setSBIRTName(taxPayerInformation.getSBIRTName())
                .setStateName(taxPayerInformation.getStateName())
                .setStateOfOrigin(taxPayerInformation.getStateOfOrigin())
                .setStreetName(taxPayerInformation.getStreetName())
                .setTaxpayerPhoto(taxPayerInformation.getTaxpayerPhoto())
                .setTaxpayerStatus(taxPayerInformation.getTaxpayerStatus())
                .setTin(taxPayerInformation.getTin())
                .setTitle(taxPayerInformation.getTitle());
    }

    public static TaxPayerInformation mapIndividualTaxPayersHelperToEntity(IndividualTaxPayerInformation individualTaxPayerInformation) {
        return new TaxPayerInformation().setBvn(individualTaxPayerInformation.getBvn())
                .setTin(individualTaxPayerInformation.getTin())//        private String tin;
                .setNin(individualTaxPayerInformation.getNin())//        private String nin;
                .setTitle(individualTaxPayerInformation.getTitle())//        private String title;
                .setSBIRTName(individualTaxPayerInformation.getSBIRt_name())//        private String sBIRTName;
                .setMiddleName(individualTaxPayerInformation.getMiddle_name())//        private String middleName;
                .setLastName(individualTaxPayerInformation.getLast_name())//        private String lastName;
                .setGenderName(individualTaxPayerInformation.getGenderName())//        private String genderName;
                .setStateOfOrigin(individualTaxPayerInformation.getStateOfOrigin())//        private String stateOfOrigin;
                .setDateOfBirth(individualTaxPayerInformation.getDate_of_birth())//        private String dateOfBirth;
                .setMaritalStatus(individualTaxPayerInformation.getMaritalStatus())//        private String maritalStatus;
                .setOccupation(individualTaxPayerInformation.getOccupation())//        private String occupation;
                .setNationalityName(individualTaxPayerInformation.getNationality_name())//        private String nationalityName;
                .setPhoneNumber1(individualTaxPayerInformation.getPhone_no_1())//        private String phoneNumber1;
                .setPhoneNumber2(individualTaxPayerInformation.getPhone_no_2())//        private String phoneNumber2;
                .setTaxpayerPhoto(individualTaxPayerInformation.getTaxpayer_photo())//        private String taxpayerPhoto;
                .setEmailAddress(individualTaxPayerInformation.getEmail_address())//        private String emailAddress;
                .setDateOfRegistration(individualTaxPayerInformation.getDate_of_registration())//        private String dateOfRegistration;
                .setHouseNumber(individualTaxPayerInformation.getHouse_number())//        private String houseNumber;
                .setStreetName(individualTaxPayerInformation.getStreet_name())//        private String streetName;
                .setCity(individualTaxPayerInformation.getCity())//        private String city;
                .setLgaName(individualTaxPayerInformation.getLGAName())//        private String lgaName;
                .setStateName(individualTaxPayerInformation.getStateName())//        private String stateName;
                .setCountryName(individualTaxPayerInformation.getCountryName())//        private String countryName;
                .setTaxAuthorityCode(individualTaxPayerInformation.getTaxAuthorityCode())//        private String taxAuthorityCode;
                .setTaxAuthorityName(individualTaxPayerInformation.getTaxAuthorityName())//        private String taxAuthorityName;
                .setTaxpayerStatus(individualTaxPayerInformation.getTaxpayerStatus())//        private String taxpayerStatus;
                .setRegisteredName("")//        private String registeredName;
                .setMainTradeName("")//        private String mainTradeName;
                .setOrgName("")//        private String orgName;
                .setRegistrationNumber("")//        private String registrationNumber;
                .setLineOfBusinessCode("")//        private String lineOfBusinessCode;
                .setLobName("")
                .setCommencementDate("")//        private String commencementDate;
                .setDateOfIncorporation("")//        private String dateOfIncorporation;
                .setFinYrBegin("")//        private String finYrBegin;
                .setFinYrEnd("")//        private String finYrEnd;
                .setDirectorName("")//        private String directorName;
                .setDirectorPhone("")//        private String directorPhone;
                .setDirectorEmail("");//        private String directorEmail;
    }

    public static TaxPayerInformation mapNonIndividualTaxPayersHelperToEntity(NonIndividualTaxPayerInformation nonIndividualTaxPayerInformation) {
        return new TaxPayerInformation().setBvn("")
                .setTin(nonIndividualTaxPayerInformation.getTin())//        private String tin;
                .setBvn("")//        private String bvn;
                .setNin("")//        private String nin;
                .setTitle("")//        private String title;
                .setSBIRTName("")//        private String sBIRTName;
                .setMiddleName("")//        private String middleName;
                .setLastName("")//        private String lastName;
                .setGenderName("")//        private String genderName;
                .setStateOfOrigin("")//        private String stateOfOrigin;
                .setDateOfBirth("")//        private String dateOfBirth;
                .setMaritalStatus("")//        private String maritalStatus;
                .setOccupation("")//        private String occupation;
                .setNationalityName("")//        private String nationalityName;
                .setPhoneNumber1(nonIndividualTaxPayerInformation.getPhone_no_1())//        private String phoneNumber1;
                .setPhoneNumber2(nonIndividualTaxPayerInformation.getPhone_no_2())//        private String phoneNumber2;
                .setTaxpayerPhoto("")//        private String taxpayerPhoto;
                .setEmailAddress(nonIndividualTaxPayerInformation.getEmail_address())//        private String emailAddress;
                .setDateOfRegistration(nonIndividualTaxPayerInformation.getDate_of_registration())//        private String dateOfRegistration;
                .setHouseNumber(nonIndividualTaxPayerInformation.getHouse_number())//        private String houseNumber;
                .setStreetName(nonIndividualTaxPayerInformation.getStreet_name())//        private String streetName;
                .setCity(nonIndividualTaxPayerInformation.getCity())//        private String city;
                .setLgaName(nonIndividualTaxPayerInformation.getLGAName())//        private String lgaName;
                .setStateName(nonIndividualTaxPayerInformation.getStateName())//        private String stateName;
                .setCountryName(nonIndividualTaxPayerInformation.getCountryName())//        private String countryName;
                .setTaxAuthorityCode(nonIndividualTaxPayerInformation.getTaxAuthorityCode())//        private String taxAuthorityCode;
                .setTaxAuthorityName(nonIndividualTaxPayerInformation.getTaxAuthorityName())//        private String taxAuthorityName;
                .setTaxpayerStatus(nonIndividualTaxPayerInformation.getTaxpayerStatus())//        private String taxpayerStatus;
                .setRegisteredName(nonIndividualTaxPayerInformation.getRegistered_name())//        private String registeredName;
                .setMainTradeName(nonIndividualTaxPayerInformation.getMain_trade_name())//        private String mainTradeName;
                .setOrgName(nonIndividualTaxPayerInformation.getOrg_name())//        private String orgName;
                .setRegistrationNumber(nonIndividualTaxPayerInformation.getRegistration_number())//        private String registrationNumber;
                .setLineOfBusinessCode(nonIndividualTaxPayerInformation.getLine_of_business_code())//        private String lineOfBusinessCode;
                .setLobName(nonIndividualTaxPayerInformation.getLob_name())
                .setCommencementDate(nonIndividualTaxPayerInformation.getCommencement_date())//        private String commencementDate;
                .setDateOfIncorporation(nonIndividualTaxPayerInformation.getDate_of_incorporation())//        private String dateOfIncorporation;
                .setFinYrBegin(nonIndividualTaxPayerInformation.getFinYrBegin())//        private String finYrBegin;
                .setFinYrEnd(nonIndividualTaxPayerInformation.getFinYrEnd())//        private String finYrEnd;
                .setDirectorName(nonIndividualTaxPayerInformation.getDirector_name())//        private String directorName;
                .setDirectorPhone(nonIndividualTaxPayerInformation.getDirector_phone())//        private String directorPhone;
                .setDirectorEmail(nonIndividualTaxPayerInformation.getDirector_email());//        private String directorEmail;
    }

    public static TaxPayerInformation mapNonIndividualTaxPagedPayersHelperToEntity(NonIndividualTaxPayerPagedInformation nonIndividualTaxPayerInformation) {
        return new TaxPayerInformation().setBvn("")
                .setTin(nonIndividualTaxPayerInformation.getTin())//        private String tin;
                .setBvn("")//        private String bvn;
                .setNin("")//        private String nin;
                .setTitle("")//        private String title;
                .setSBIRTName("")//        private String sBIRTName;
                .setMiddleName("")//        private String middleName;
                .setLastName("")//        private String lastName;
                .setGenderName("")//        private String genderName;
                .setStateOfOrigin("")//        private String stateOfOrigin;
                .setDateOfBirth("")//        private String dateOfBirth;
                .setMaritalStatus("")//        private String maritalStatus;
                .setOccupation("")//        private String occupation;
                .setNationalityName("")//        private String nationalityName;
                .setPhoneNumber1(nonIndividualTaxPayerInformation.getPhone_no_1())//        private String phoneNumber1;
                .setPhoneNumber2(nonIndividualTaxPayerInformation.getPhone_no_2())//        private String phoneNumber2;
                .setTaxpayerPhoto("")//        private String taxpayerPhoto;
                .setEmailAddress(nonIndividualTaxPayerInformation.getEmail_address())//        private String emailAddress;
                .setDateOfRegistration(nonIndividualTaxPayerInformation.getDate_of_registration())//        private String dateOfRegistration;
                .setHouseNumber(nonIndividualTaxPayerInformation.getHouse_number())//        private String houseNumber;
                .setStreetName(nonIndividualTaxPayerInformation.getStreet_name())//        private String streetName;
                .setCity(nonIndividualTaxPayerInformation.getCity())//        private String city;
                .setLgaName(nonIndividualTaxPayerInformation.getLGAName())//        private String lgaName;
                .setStateName(nonIndividualTaxPayerInformation.getStateName())//        private String stateName;
                .setCountryName(nonIndividualTaxPayerInformation.getCountryName())//        private String countryName;
                .setTaxAuthorityCode(nonIndividualTaxPayerInformation.getTaxAuthorityCode())//        private String taxAuthorityCode;
                .setTaxAuthorityName(nonIndividualTaxPayerInformation.getTaxAuthorityName())//        private String taxAuthorityName;
                .setTaxpayerStatus(nonIndividualTaxPayerInformation.getTaxpayerStatus())//        private String taxpayerStatus;
                .setRegisteredName(nonIndividualTaxPayerInformation.getRegistered_name())//        private String registeredName;
                .setMainTradeName(nonIndividualTaxPayerInformation.getMain_trade_name())//        private String mainTradeName;
                .setOrgName(nonIndividualTaxPayerInformation.getOrg_type_name())//        private String orgName;
                .setRegistrationNumber(nonIndividualTaxPayerInformation.getRegistration_number())//        private String registrationNumber;
                .setLineOfBusinessCode(nonIndividualTaxPayerInformation.getLine_of_business_code())//        private String lineOfBusinessCode;
                .setLobName(nonIndividualTaxPayerInformation.getLob_name())
                .setCommencementDate(nonIndividualTaxPayerInformation.getCommencement_date())//        private String commencementDate;
                .setDateOfIncorporation(nonIndividualTaxPayerInformation.getDate_of_incorporation())//        private String dateOfIncorporation;
                .setFinYrBegin(nonIndividualTaxPayerInformation.getFinYrBegin())//        private String finYrBegin;
                .setFinYrEnd(nonIndividualTaxPayerInformation.getFinYrEnd())//        private String finYrEnd;
                .setDirectorName(nonIndividualTaxPayerInformation.getDirector_name())//        private String directorName;
                .setDirectorPhone(nonIndividualTaxPayerInformation.getDirector_phone())//        private String directorPhone;
                .setDirectorEmail(nonIndividualTaxPayerInformation.getDirector_email());//        private String directorEmail;
    }

    public static TaxPayerInformation mapIndividualTaxPayersPagedHelperToEntity(IndividualTaxPayerPagedInformation individualTaxPayerInformation) {
        return new TaxPayerInformation().setBvn("")
                .setTin(individualTaxPayerInformation.getTin())//        private String tin;
                .setNin("")//        private String nin;
                .setTitle(individualTaxPayerInformation.getTitle())//        private String title;
                .setSBIRTName("")//        private String sBIRTName;
                .setMiddleName(individualTaxPayerInformation.getMiddle_name())//        private String middleName;
                .setLastName(individualTaxPayerInformation.getLast_name())//        private String lastName;
                .setGenderName(individualTaxPayerInformation.getGenderName())//        private String genderName;
                .setStateOfOrigin(individualTaxPayerInformation.getStateOfOrigin())//        private String stateOfOrigin;
                .setDateOfBirth(individualTaxPayerInformation.getDate_of_birth())//        private String dateOfBirth;
                .setMaritalStatus(individualTaxPayerInformation.getMaritalStatus())//        private String maritalStatus;
                .setOccupation(individualTaxPayerInformation.getOccupation())//        private String occupation;
                .setNationalityName(individualTaxPayerInformation.getNationality_name())//        private String nationalityName;
                .setPhoneNumber1(individualTaxPayerInformation.getPhone_no_1())//        private String phoneNumber1;
                .setPhoneNumber2(individualTaxPayerInformation.getPhone_no_2())//        private String phoneNumber2;
                .setTaxpayerPhoto(individualTaxPayerInformation.getTaxpayer_photo())//        private String taxpayerPhoto;
                .setEmailAddress(individualTaxPayerInformation.getEmail_address())//        private String emailAddress;
                .setDateOfRegistration(individualTaxPayerInformation.getDate_of_registration())//        private String dateOfRegistration;
                .setHouseNumber(individualTaxPayerInformation.getHouse_number())//        private String houseNumber;
                .setStreetName(individualTaxPayerInformation.getStreet_name())//        private String streetName;
                .setCity(individualTaxPayerInformation.getCity())//        private String city;
                .setLgaName(individualTaxPayerInformation.getLGAName())//        private String lgaName;
                .setStateName(individualTaxPayerInformation.getStateName())//        private String stateName;
                .setCountryName(individualTaxPayerInformation.getCountryName())//        private String countryName;
                .setTaxAuthorityCode(individualTaxPayerInformation.getTaxAuthorityCode())//        private String taxAuthorityCode;
                .setTaxAuthorityName(individualTaxPayerInformation.getTaxAuthorityName())//        private String taxAuthorityName;
                .setTaxpayerStatus(individualTaxPayerInformation.getTaxpayerStatus())//        private String taxpayerStatus;
                .setRegisteredName("")//        private String registeredName;
                .setMainTradeName("")//        private String mainTradeName;
                .setOrgName("")//        private String orgName;
                .setRegistrationNumber("")//        private String registrationNumber;
                .setLineOfBusinessCode("")//        private String lineOfBusinessCode;
                .setLobName("")
                .setCommencementDate("")//        private String commencementDate;
                .setDateOfIncorporation("")//        private String dateOfIncorporation;
                .setFinYrBegin("")//        private String finYrBegin;
                .setFinYrEnd("")//        private String finYrEnd;
                .setDirectorName("")//        private String directorName;
                .setDirectorPhone("")//        private String directorPhone;
                .setDirectorEmail("");//        private String directorEmail;
    }
}
