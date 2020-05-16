package com.bizzdesk.group.tax.payer.management.entities;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Accessors(chain = true)
@Entity
public class TaxPayerInformation {

    @Id
    private String tin;
    private String bvn;
    private String nin;
    private String title;
    private String sBIRTName;
    private String middleName;
    private String lastName;
    private String genderName;
    private String stateOfOrigin;
    private String dateOfBirth;
    private String maritalStatus;
    private String occupation;
    private String nationalityName;
    private String phoneNumber1;
    private String phoneNumber2;
    private String taxpayerPhoto;
    private String emailAddress;
    private String dateOfRegistration;
    private String houseNumber;
    private String streetName;
    private String city;
    private String lgaName;
    private String stateName;
    private String countryName;
    private String taxAuthorityCode;
    private String taxAuthorityName;
    private String taxpayerStatus;
    private String registeredName;
    private String mainTradeName;
    private String orgName;
    private String registrationNumber;
    private String lineOfBusinessCode;
    private String lobName;
    private String commencementDate;
    private String dateOfIncorporation;
    private String finYrBegin;
    private String finYrEnd;
    private String directorName;
    private String directorPhone;
    private String directorEmail;
}
