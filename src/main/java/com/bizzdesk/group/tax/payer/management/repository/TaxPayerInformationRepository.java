package com.bizzdesk.group.tax.payer.management.repository;

import com.bizzdesk.group.tax.payer.management.entities.TaxPayerInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxPayerInformationRepository extends JpaRepository<TaxPayerInformation, String> {
}
