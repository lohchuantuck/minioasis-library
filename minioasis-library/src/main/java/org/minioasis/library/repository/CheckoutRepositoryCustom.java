package org.minioasis.library.repository;

import java.time.LocalDate;
import java.util.List;

import org.minioasis.library.domain.Checkout;
import org.minioasis.library.domain.search.CheckoutCriteria;
import org.minioasis.library.domain.search.CheckoutPatronCriteria;
import org.minioasis.library.domain.search.TopCheckoutPatronsSummary;
import org.minioasis.library.domain.search.TopPopularBooksCriteria;
import org.minioasis.library.domain.search.TopPopularBooksSummary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CheckoutRepositoryCustom {

	Page<Checkout> findByCriteria(CheckoutCriteria criteria, Pageable pageable);
	
	List<Checkout> findAllActiveCheckoutsByCardKey(String cardKey);
	
	List<TopCheckoutPatronsSummary> topListPatronsForCheckouts(CheckoutPatronCriteria criteria);
	
	List<TopPopularBooksSummary> topPopularBooks(TopPopularBooksCriteria criteria);
	
	String topListPatronsForCheckouts_JSON();
	
	List<String> allOverDuePatrons(LocalDate given);
	
	List<Checkout> patronOverDues(String cardKey, LocalDate given);

}
