package org.minioasis.library.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

import org.minioasis.library.domain.Account;
import org.minioasis.library.domain.Attachment;
import org.minioasis.library.domain.AttachmentCheckout;
import org.minioasis.library.domain.AttachmentCheckoutState;
import org.minioasis.library.domain.Biblio;
import org.minioasis.library.domain.Checkout;
import org.minioasis.library.domain.CheckoutResult;
import org.minioasis.library.domain.CheckoutState;
import org.minioasis.library.domain.DataType;
import org.minioasis.library.domain.FormData;
import org.minioasis.library.domain.Group;
import org.minioasis.library.domain.Holiday;
import org.minioasis.library.domain.Item;
import org.minioasis.library.domain.ItemStatus;
import org.minioasis.library.domain.JournalEntry;
import org.minioasis.library.domain.JournalEntryLine;
import org.minioasis.library.domain.Patron;
import org.minioasis.library.domain.PatronType;
import org.minioasis.library.domain.Location;
import org.minioasis.library.domain.Publisher;
import org.minioasis.library.domain.Reservation;
import org.minioasis.library.domain.ReservationResult;
import org.minioasis.library.domain.ReservationState;
import org.minioasis.library.domain.Series;
import org.minioasis.library.domain.search.AccountCriteria;
import org.minioasis.library.domain.search.AttachmentCheckoutCriteria;
import org.minioasis.library.domain.search.AttachmentCriteria;
import org.minioasis.library.domain.search.BiblioCriteria;
import org.minioasis.library.domain.search.CheckoutCriteria;
import org.minioasis.library.domain.search.HolidayCriteria;
import org.minioasis.library.domain.search.ItemCriteria;
import org.minioasis.library.domain.search.JournalEntryCriteria;
import org.minioasis.library.domain.search.JournalEntryLineCriteria;
import org.minioasis.library.domain.search.PatronCriteria;
import org.minioasis.library.domain.search.ReservationCriteria;
import org.minioasis.library.exception.LibraryException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface LibraryService {

	// Business Logic
	// Checkout
	void checkout(Patron patron, Item item, LocalDate given) throws LibraryException;
	void checkoutAttachment(Patron patron, Attachment attachment, LocalDate given) throws LibraryException;
	
	// Checkin
	CheckoutResult checkin(Patron patron, Item item, LocalDate given, boolean damage, boolean renew) throws LibraryException;
	void checkinAttachment(Patron patron, Attachment attachment, LocalDate given, boolean damageBadly) throws LibraryException;
	
	// Renew
	void renew(Patron patron, Item item, LocalDate given) throws LibraryException;
	void renewAll(Patron patron, LocalDate given) throws LibraryException;
	
	// ReportLost
	void reportlost(Patron patron, Item item, LocalDate given) throws LibraryException;
	void reportlost(Patron patron, Attachment attachment, LocalDate given) throws LibraryException;
	
	// PayFine
	void payFine(Patron patron, Long[] ids, BigDecimal payAmount, LocalDate given) throws LibraryException;
	
	// Return
	CheckoutResult returnItem(Item item, LocalDate given, boolean damage) throws LibraryException;
	CheckoutResult returnAttachment(Attachment attachment, LocalDate given, boolean damage) throws LibraryException;
	
	// Reserve
	ReservationResult reserve(Patron patron, Biblio biblio, LocalDateTime given, LocalDate expiryDate) throws LibraryException;
	void cancelReservation(Patron patron, long reservationId, LocalDate cancelDate) throws LibraryException;
	void extendReservation(Patron patron, long reservationId, long extendDays) throws LibraryException;
	
	// Account
	void save(Account entity);
	void edit(Account entity);	
	void delete(Account entity);
	void deleteAccount(long id);
	Account getAccount(long id);
	Account findByCode(String code);
	List<Account> findByCodeContaining(String code);
	List<Account> findAllAccount(Sort sort);
	Page<Account> findAllAccount(Pageable pageable);
	Page<Account> findByCriteria(AccountCriteria criteria, Pageable pageable);
	
	// Attachment
	void save(Attachment entity);
	void edit(Attachment entity);	
	void delete(Attachment entity);
	void deleteAttachment(long id);
	Attachment getAttachment(long id);
	Attachment getAttachment(String barcode);
	Attachment getAttachmentForCheckout(String barcode);
	Attachment getAttachmentForCheckin(String barcode);
	List<Attachment> findAllAttachments(Sort sort);
	Page<Attachment> findAllAttachments(Pageable pageable);
	Page<Attachment> findByBarcode(String barcode, Pageable pageable);
	Page<Attachment> findByDescriptionContaining(String desp, Pageable pageable);
	Page<Attachment> findByCriteria(AttachmentCriteria criteria, Pageable pageable);

	// AttachmentCheckout
	void save(AttachmentCheckout entity);
	void delete(AttachmentCheckout entity);
	void deleteAttachmentCheckout(long id);
	AttachmentCheckout getAttachmentCheckout(long id);
	List<AttachmentCheckout> findAllAttachmentCheckouts(Sort sort);
	Page<AttachmentCheckout> findAllAttachmentCheckouts(Pageable pageable);
	Page<AttachmentCheckout> findByCriteria(AttachmentCheckoutCriteria criteria, Pageable pageable);
	
	// Biblio	
	void save(Biblio entity);
	void delete(Biblio entity);
	void deleteBiblio(long id);
	Biblio getBiblio(long id);
	Biblio getBiblioDetails(long id);
	Biblio getBiblioFetchItems(long id);
	Biblio findByIsbn(String isbn);
	List<Biblio> findAllBiblios(Sort sort);
	Page<Biblio> findAllBiblios(Pageable pageable);
	Page<Biblio> findAllUncompleteBiblios(Pageable pageable);
	Page<Biblio> findByTitleAndIsbnAndNoteContaining(String title, Pageable pageable);
	Page<Biblio> findByCriteria(BiblioCriteria criteria, Pageable pageable);
	
	// Checkout
	void save(Checkout entity);
	void update(Checkout entity);
	void delete(Checkout entity);
	void deleteCheckout(long id);
	Checkout getCheckout(long id);
	List<Checkout> findAllCheckouts(Sort sort);
	List<Checkout> findByCardKeyFetchItemBiblio(String cardKey);
	List<Checkout> findByBarcodeAndFilterByStates(String barcode, List<CheckoutState> cStates, List<AttachmentCheckoutState> acStates);
	List<Checkout> findAllActiveCheckoutsByCardKey(String cardKey);
	Page<Checkout> findAllCheckouts(Pageable pageable);
	Page<Checkout> findAllCheckouts(String username, List<CheckoutState> cStates, Pageable pageable);
	Page<Checkout> findByCriteria(CheckoutCriteria criteria, Pageable pageable);
	List<String> allOverDuePatrons(LocalDate given);
	List<Checkout> patronOverDues(String cardKey, LocalDate given);

	// FormData
	void save(FormData entity);
	void delete(FormData entity);
	void deleteFormData(long id);
	FormData getFormData(long id);
	List<FormData> findAllFormDatas();
	List<FormData> findAllFormDatas(Sort sort);
	Page<FormData> findAllFormDatas(Pageable pageable);
	Page<FormData> findByDataContainingAndType(String keyword, DataType type, Pageable pageable);
	
	// Group
	void save(Group entity);
	void delete(Group entity);
	void deleteGroup(long id);
	Group getGroup(long id);
	List<Group> findAllGroups();
	List<Group> findAllGroups(Sort sort);
	Page<Group> findAllGroups(Pageable pageable);
	Page<Group> findByCodeOrNameContaining(String keyword, Pageable pageable);
	
	// Holiday
	void save(Holiday entity);
	void delete(Holiday entity);
	void deleteHoliday(long id);
	Holiday getHoliday(long id);
	Holiday getHolidayByDueDate(LocalDate dueDate);
	Holiday getHolidayByStartAndEndDate(LocalDate start, LocalDate end);
	List<Holiday> findByInBetween(LocalDate start , LocalDate end);
	List<Holiday> findByInBetweenAndFine(LocalDate start, LocalDate end, Boolean fine);
	List<Holiday> findByStartDateAfterAndFine(LocalDate dueDate, Boolean fine);
	List<Holiday> findByExcluded(LocalDate start , LocalDate end);
	List<Holiday> findAllHolidays(Sort sort);
	Page<Holiday> findAllHolidays(Pageable pageable);
	Page<Holiday> findByCriteria(HolidayCriteria criteria, Pageable pageable);
	
	// Item	
	void save(Item entity);
	void edit(Item entity);
	void delete(Item entity);
	void deleteItem(long id);
	Item getItem(long id);
	Item getItemFetchBiblio(String barcode);
	Item getItemFetchItemRelated(long id);
	Item getItemFetchItemStatus(String barcode);
	Item getItemFetchRelatedBiblio(String barcode);
	Item findByBarcode(String barcode);
	List<Item> findItemsByIsbn(String isbn);
	List<Item> findItemsByIsbnAndStates(String isbn, String[] states);
	List<Item> findAllItems(Sort sort);
	List<Item> findAllItemsOrderByBarcode(long id);
	Page<Item> findAllItems(Pageable pageable);
	Page<Item> findAllItemsByKeyword(String keyword, Pageable pageable);
	Page<Item> findByCriteria(ItemCriteria criteria, Pageable pageable);
	
	Item getItemForCheckout(String barcode);
	Item getItemForCheckin(String barcode);
	
	void stockCheck();
	
	//Map findStockCheckItemsByCriteria(ItemCmd command);
	
	// ItemStatus
	void save(ItemStatus entity);
	void delete(ItemStatus entity);
	void deleteItemStatus(long id);
	ItemStatus getItemStatus(long id);
	List<ItemStatus> findAllItemStatus();
	List<ItemStatus> findAllItemStatus(Sort sort);
	Page<ItemStatus> findAllItemStatusByName(String name, Pageable pageable);

	// JournalEntry
	void save(JournalEntry entity);
	void delete(JournalEntry entity);
	void deleteJournalEntry(long id);
	JournalEntry getJournalEntry(long id);
	List<JournalEntry> findAllJournalEntries();
	List<JournalEntry> findAllJournalEntries(Sort sort);
	Page<JournalEntry> findAllJournalEntries(Pageable pageable);
	Page<JournalEntry> findByCriteria(JournalEntryCriteria criteria, Pageable pageable);
	
	// JournalEntryLine
	void save(JournalEntryLine entity);
	void delete(JournalEntryLine entity);
	void deleteJournalEntryLine(long id);
	JournalEntryLine getJournalEntryLine(long id);
	List<JournalEntryLine> findAllJournalEntryLines();
	List<JournalEntryLine> findAllJournalEntryLines(Sort sort);
	Page<JournalEntryLine> findAllJournalEntryLines(Pageable pageable);
	Page<JournalEntryLine> findByCriteria(JournalEntryLineCriteria criteria, Pageable pageable);
	
	// Location
	void save(Location entity);
	void delete(Location entity);
	void deleteLocation(long id);
	Location getLocation(long id);
	List<Location> findAllLocations();
	List<Location> findAllLocations(Sort sort);
	Page<Location> findAllLocationsByName(String name, Pageable pageable);

	// Patron
	void save(Patron entity);
	void edit(Patron entity);
	int bulkUpdateGroup(List<Long> ids, Group group, LocalDateTime now);
	void delete(Patron entity);
	void deletePatron(long id);
	Patron getPatron(long id);
	Patron findByCardKey(String name);
	Patron findByEntangled(String name);
	List<Patron> findAllPatrons(Sort sort);
	List<Patron> findByCardKeyContaining(String name);
	List<Patron> findByEntangledContaining(String name);
	List<Patron> findByCardKeyAndEntangledContaining(String keyword);
	List<Patron> findByNameOrCardKeyContaining(String key,Pageable pageable);
	List<Patron> findByIdIn(Collection<Long> ids);
	List<Patron> findByGroupAndUpdatedOrderByUpdatedDesc(Group group, LocalDateTime updated);
	Page<Patron> findAllPatrons(Pageable pageable);
	Page<Patron> findByCriteria(PatronCriteria criteria, Pageable pageable);
	boolean match(String cardKey, String mobile);
	
	Patron preparingPatronForCirculation(String cardKey,LocalDate given);
	
	// PatronType	
	void save(PatronType entity);
	void delete(PatronType entity);
	void deletePatronType(long id);
	PatronType getPatronType(long id);
	List<PatronType> findAllPatronTypes(Sort sort);
	List<PatronType> findByNameContaining(String name);
	
	// Publisher
	void save(Publisher entity);
	void deletePublisher(long id);
	void delete(Publisher entity);
	Publisher getPublisher(long id);
	Publisher findPublisherByName(String name);
	List<Publisher> findAllPublishers(Sort sort);
	Page<Publisher> findAllPublishers(Pageable pageable);
	Page<Publisher> findPublishersByNameContaining(String name, Pageable pageable);

	// Reservation
	void save(Reservation entity);
	void delete(Reservation entity);
	void deleteReservation(long id);
	Reservation getReservation(long id);
	List<Reservation> findAllReservations(Sort sort);
	List<Reservation> findReservationsByCardKey(String cardKey);
	List<Reservation> findByCardKeyAndStates(String cardKey, List<ReservationState> states);
	
	List<Reservation> findReservationsByCardKeyFetchBiblioReservations(String cardKey);
	
	List<Reservation> findByBiblioIdAndStates(long id);
	Page<Reservation> findAllReservations(Pageable pageable);
	Page<Reservation> findByCriteria(ReservationCriteria criteria, Pageable pageable);
	
	void refreshReservationStates();
	
	// Series
	void save(Series entity);
	void delete(Series entity);
	void deleteSeries(long id);
	Series getSeries(long id);
	Series findSeriesByName(String name);
	List<Series> findAllSeries(Sort sort);
	List<Series> findSeriesByNameContaining(String name);
	Page<Series> findAllSeries(Pageable pageable);
	Page<Series> findSeriesByNameContaining(String name, Pageable pageable);
	
}