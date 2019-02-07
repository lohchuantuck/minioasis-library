package org.minioasis.library.repository;

import java.util.Date;
import java.util.List;

import org.minioasis.library.domain.AttachmentCheckoutState;
import org.minioasis.library.domain.Checkout;
import org.minioasis.library.domain.CheckoutState;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends JpaRepository<Checkout, Long> {
	
	@Query("SELECT c FROM Checkout c"
			+ " LEFT JOIN FETCH c.item i"
			+ " LEFT JOIN FETCH i.biblio"
			+ " LEFT JOIN FETCH i.volume"
			+ " WHERE c.patron.cardKey = ?1 AND c.state in (?2)")
	List<Checkout> findByCardKeyAndFilterByStates(String cardKey, List<CheckoutState> states);
	
	@Query("SELECT c FROM Checkout c"
			+ " LEFT JOIN FETCH c.item i"
			+ " LEFT JOIN FETCH i.biblio"
			+ " WHERE c.patron.cardKey = ?1")
	List<Checkout> findByCardKeyFetchItemBiblio(String cardKey);
	
	@Query("SELECT c FROM Checkout c"
			+ " LEFT JOIN FETCH c.item i"
			+ " LEFT JOIN FETCH i.biblio"
			+ " LEFT JOIN FETCH i.volume"
			+ " LEFT JOIN FETCH c.attachmentCheckouts ac"
			+ " WHERE i.barcode = ?1 AND c.state in (?2) AND (ac.state is null OR ac.state in (?3))")
	List<Checkout> findByBarcodeAndFilterByStates(String barcode, List<CheckoutState> cStates, List<AttachmentCheckoutState> acStates);
	
	@Query("SELECT c FROM Checkout c"
			+ " LEFT JOIN FETCH c.item i"
			+ " LEFT JOIN FETCH i.biblio"
			+ " LEFT JOIN FETCH i.volume"
			+ " WHERE i.barcode = ?1 AND c.state in (?2)")
	List<Checkout> findByBarcodeAndFilterByStates(String barcode, List<CheckoutState> cStates);
	
	@Query("SELECT c FROM Checkout c"
			+ " JOIN c.patron p"
			+ " JOIN c.item i"
			+ " JOIN i.biblio b"
			+ " JOIN i.volume v"
			+ " WHERE c.state in (?1) AND c.dueDate < ?2"
			+ " ORDER BY c.dueDate asc, p.cardKey asc")
	public Page<Checkout> findAllOverDue(List<CheckoutState> cStates, Date given, Pageable pageable); 
	
	@Query("SELECT c FROM Checkout c"
			+ " JOIN c.patron p"
			+ " JOIN c.item i"
			+ " JOIN i.biblio b"
			+ " WHERE p.entangled = ?1 AND c.state NOT IN (?2)"
			+ " ORDER BY c.done desc")
	public Page<Checkout> findAllCheckouts(String username, List<CheckoutState> cStates, Pageable pageable);
	
}
