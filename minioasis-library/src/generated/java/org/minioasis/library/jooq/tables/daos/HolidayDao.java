/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.daos;


import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.minioasis.library.jooq.tables.Holiday;
import org.minioasis.library.jooq.tables.records.HolidayRecord;


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
public class HolidayDao extends DAOImpl<HolidayRecord, org.minioasis.library.jooq.tables.pojos.Holiday, Long> {

    /**
     * Create a new HolidayDao without any configuration
     */
    public HolidayDao() {
        super(Holiday.HOLIDAY, org.minioasis.library.jooq.tables.pojos.Holiday.class);
    }

    /**
     * Create a new HolidayDao with an attached configuration
     */
    public HolidayDao(Configuration configuration) {
        super(Holiday.HOLIDAY, org.minioasis.library.jooq.tables.pojos.Holiday.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(org.minioasis.library.jooq.tables.pojos.Holiday object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Holiday> fetchById(Long... values) {
        return fetch(Holiday.HOLIDAY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.Holiday fetchOneById(Long value) {
        return fetchOne(Holiday.HOLIDAY.ID, value);
    }

    /**
     * Fetch records that have <code>END_DATE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Holiday> fetchByEndDate(Date... values) {
        return fetch(Holiday.HOLIDAY.END_DATE, values);
    }

    /**
     * Fetch records that have <code>FINE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Holiday> fetchByFine(Boolean... values) {
        return fetch(Holiday.HOLIDAY.FINE, values);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Holiday> fetchByName(String... values) {
        return fetch(Holiday.HOLIDAY.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>NAME = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.Holiday fetchOneByName(String value) {
        return fetchOne(Holiday.HOLIDAY.NAME, value);
    }

    /**
     * Fetch records that have <code>START_DATE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Holiday> fetchByStartDate(Date... values) {
        return fetch(Holiday.HOLIDAY.START_DATE, values);
    }
}
