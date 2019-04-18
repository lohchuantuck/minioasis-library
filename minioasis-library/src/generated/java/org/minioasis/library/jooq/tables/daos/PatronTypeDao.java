/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.daos;


import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.minioasis.library.jooq.tables.PatronType;
import org.minioasis.library.jooq.tables.records.PatronTypeRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PatronTypeDao extends DAOImpl<PatronTypeRecord, org.minioasis.library.jooq.tables.pojos.PatronType, Long> {

    /**
     * Create a new PatronTypeDao without any configuration
     */
    public PatronTypeDao() {
        super(PatronType.PATRON_TYPE, org.minioasis.library.jooq.tables.pojos.PatronType.class);
    }

    /**
     * Create a new PatronTypeDao with an attached configuration
     */
    public PatronTypeDao(Configuration configuration) {
        super(PatronType.PATRON_TYPE, org.minioasis.library.jooq.tables.pojos.PatronType.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(org.minioasis.library.jooq.tables.pojos.PatronType object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchById(Long... values) {
        return fetch(PatronType.PATRON_TYPE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.PatronType fetchOneById(Long value) {
        return fetchOne(PatronType.PATRON_TYPE.ID, value);
    }

    /**
     * Fetch records that have <code>BIBLIO_LIMIT IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchByBiblioLimit(Integer... values) {
        return fetch(PatronType.PATRON_TYPE.BIBLIO_LIMIT, values);
    }

    /**
     * Fetch records that have <code>DEPOSIT IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchByDeposit(BigDecimal... values) {
        return fetch(PatronType.PATRON_TYPE.DEPOSIT, values);
    }

    /**
     * Fetch records that have <code>DURATION IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchByDuration(Integer... values) {
        return fetch(PatronType.PATRON_TYPE.DURATION, values);
    }

    /**
     * Fetch records that have <code>EXPIRY_DATE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchByExpiryDate(Date... values) {
        return fetch(PatronType.PATRON_TYPE.EXPIRY_DATE, values);
    }

    /**
     * Fetch records that have <code>FINE_RATE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchByFineRate(BigDecimal... values) {
        return fetch(PatronType.PATRON_TYPE.FINE_RATE, values);
    }

    /**
     * Fetch records that have <code>MAX_CANT_RESERVE_PERIOD IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchByMaxCantReservePeriod(Integer... values) {
        return fetch(PatronType.PATRON_TYPE.MAX_CANT_RESERVE_PERIOD, values);
    }

    /**
     * Fetch records that have <code>MAX_COLLECTABLE_PERIOD IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchByMaxCollectablePeriod(Integer... values) {
        return fetch(PatronType.PATRON_TYPE.MAX_COLLECTABLE_PERIOD, values);
    }

    /**
     * Fetch records that have <code>MAX_NO_OF_RENEW IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchByMaxNoOfRenew(Integer... values) {
        return fetch(PatronType.PATRON_TYPE.MAX_NO_OF_RENEW, values);
    }

    /**
     * Fetch records that have <code>MAX_NO_OF_RESERVATIONS IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchByMaxNoOfReservations(Integer... values) {
        return fetch(PatronType.PATRON_TYPE.MAX_NO_OF_RESERVATIONS, values);
    }

    /**
     * Fetch records that have <code>MAX_UNCOLLECTED_NO IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchByMaxUncollectedNo(Integer... values) {
        return fetch(PatronType.PATRON_TYPE.MAX_UNCOLLECTED_NO, values);
    }

    /**
     * Fetch records that have <code>MEMBER_FEE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchByMemberFee(BigDecimal... values) {
        return fetch(PatronType.PATRON_TYPE.MEMBER_FEE, values);
    }

    /**
     * Fetch records that have <code>MIN_RENEWABLE_PERIOD IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchByMinRenewablePeriod(Integer... values) {
        return fetch(PatronType.PATRON_TYPE.MIN_RENEWABLE_PERIOD, values);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchByName(String... values) {
        return fetch(PatronType.PATRON_TYPE.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>NAME = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.PatronType fetchOneByName(String value) {
        return fetchOne(PatronType.PATRON_TYPE.NAME, value);
    }

    /**
     * Fetch records that have <code>RESUME_BORROWABLE_PERIOD IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchByResumeBorrowablePeriod(Integer... values) {
        return fetch(PatronType.PATRON_TYPE.RESUME_BORROWABLE_PERIOD, values);
    }

    /**
     * Fetch records that have <code>START_DATE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.PatronType> fetchByStartDate(Date... values) {
        return fetch(PatronType.PATRON_TYPE.START_DATE, values);
    }
}
