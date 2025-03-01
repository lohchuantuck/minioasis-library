/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.daos;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.minioasis.library.jooq.tables.Patron;
import org.minioasis.library.jooq.tables.records.PatronRecord;


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
public class PatronDao extends DAOImpl<PatronRecord, org.minioasis.library.jooq.tables.pojos.Patron, Long> {

    /**
     * Create a new PatronDao without any configuration
     */
    public PatronDao() {
        super(Patron.PATRON, org.minioasis.library.jooq.tables.pojos.Patron.class);
    }

    /**
     * Create a new PatronDao with an attached configuration
     */
    public PatronDao(Configuration configuration) {
        super(Patron.PATRON, org.minioasis.library.jooq.tables.pojos.Patron.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(org.minioasis.library.jooq.tables.pojos.Patron object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchById(Long... values) {
        return fetch(Patron.PATRON.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.Patron fetchOneById(Long value) {
        return fetchOne(Patron.PATRON.ID, value);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByActive(String... values) {
        return fetch(Patron.PATRON.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>CARD_KEY IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByCardKey(String... values) {
        return fetch(Patron.PATRON.CARD_KEY, values);
    }

    /**
     * Fetch a unique record that has <code>CARD_KEY = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.Patron fetchOneByCardKey(String value) {
        return fetchOne(Patron.PATRON.CARD_KEY, value);
    }

    /**
     * Fetch records that have <code>ADDRESS1 IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByAddress1(String... values) {
        return fetch(Patron.PATRON.ADDRESS1, values);
    }

    /**
     * Fetch records that have <code>ADDRESS2 IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByAddress2(String... values) {
        return fetch(Patron.PATRON.ADDRESS2, values);
    }

    /**
     * Fetch records that have <code>ADDRESS3 IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByAddress3(String... values) {
        return fetch(Patron.PATRON.ADDRESS3, values);
    }

    /**
     * Fetch records that have <code>CITY IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByCity(String... values) {
        return fetch(Patron.PATRON.CITY, values);
    }

    /**
     * Fetch records that have <code>COUNTRY IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByCountry(String... values) {
        return fetch(Patron.PATRON.COUNTRY, values);
    }

    /**
     * Fetch records that have <code>POSTCODE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByPostcode(String... values) {
        return fetch(Patron.PATRON.POSTCODE, values);
    }

    /**
     * Fetch records that have <code>STATE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByState(String... values) {
        return fetch(Patron.PATRON.STATE, values);
    }

    /**
     * Fetch records that have <code>EMAIL IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByEmail(String... values) {
        return fetch(Patron.PATRON.EMAIL, values);
    }

    /**
     * Fetch records that have <code>MOBILE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByMobile(String... values) {
        return fetch(Patron.PATRON.MOBILE, values);
    }

    /**
     * Fetch records that have <code>TEL IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByTel(String... values) {
        return fetch(Patron.PATRON.TEL, values);
    }

    /**
     * Fetch records that have <code>CREATED IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByCreated(Timestamp... values) {
        return fetch(Patron.PATRON.CREATED, values);
    }

    /**
     * Fetch records that have <code>END_DATE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByEndDate(Date... values) {
        return fetch(Patron.PATRON.END_DATE, values);
    }

    /**
     * Fetch records that have <code>ENTANGLED IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByEntangled(String... values) {
        return fetch(Patron.PATRON.ENTANGLED, values);
    }

    /**
     * Fetch a unique record that has <code>ENTANGLED = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.Patron fetchOneByEntangled(String value) {
        return fetchOne(Patron.PATRON.ENTANGLED, value);
    }

    /**
     * Fetch records that have <code>GENDER IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByGender(String... values) {
        return fetch(Patron.PATRON.GENDER, values);
    }

    /**
     * Fetch records that have <code>IC IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByIc(String... values) {
        return fetch(Patron.PATRON.IC, values);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByName(String... values) {
        return fetch(Patron.PATRON.NAME, values);
    }

    /**
     * Fetch records that have <code>NAME2 IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByName2(String... values) {
        return fetch(Patron.PATRON.NAME2, values);
    }

    /**
     * Fetch records that have <code>NOTE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByNote(String... values) {
        return fetch(Patron.PATRON.NOTE, values);
    }

    /**
     * Fetch records that have <code>ORDER_NO IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByOrderNo(Short... values) {
        return fetch(Patron.PATRON.ORDER_NO, values);
    }

    /**
     * Fetch records that have <code>RESERVABLE_DATE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByReservableDate(Date... values) {
        return fetch(Patron.PATRON.RESERVABLE_DATE, values);
    }

    /**
     * Fetch records that have <code>START_DATE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByStartDate(Date... values) {
        return fetch(Patron.PATRON.START_DATE, values);
    }

    /**
     * Fetch records that have <code>UNCOLLECTED_NO IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByUncollectedNo(Short... values) {
        return fetch(Patron.PATRON.UNCOLLECTED_NO, values);
    }

    /**
     * Fetch records that have <code>UPDATED IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByUpdated(Timestamp... values) {
        return fetch(Patron.PATRON.UPDATED, values);
    }

    /**
     * Fetch records that have <code>GROUP_ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByGroupId(Long... values) {
        return fetch(Patron.PATRON.GROUP_ID, values);
    }

    /**
     * Fetch records that have <code>PATRONTYPE_ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Patron> fetchByPatrontypeId(Long... values) {
        return fetch(Patron.PATRON.PATRONTYPE_ID, values);
    }
}
