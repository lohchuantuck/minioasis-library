/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.minioasis.library.jooq.tables.Series;
import org.minioasis.library.jooq.tables.records.SeriesRecord;


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
public class SeriesDao extends DAOImpl<SeriesRecord, org.minioasis.library.jooq.tables.pojos.Series, Long> {

    /**
     * Create a new SeriesDao without any configuration
     */
    public SeriesDao() {
        super(Series.SERIES, org.minioasis.library.jooq.tables.pojos.Series.class);
    }

    /**
     * Create a new SeriesDao with an attached configuration
     */
    public SeriesDao(Configuration configuration) {
        super(Series.SERIES, org.minioasis.library.jooq.tables.pojos.Series.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(org.minioasis.library.jooq.tables.pojos.Series object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Series> fetchById(Long... values) {
        return fetch(Series.SERIES.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.Series fetchOneById(Long value) {
        return fetchOne(Series.SERIES.ID, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Series> fetchByName(String... values) {
        return fetch(Series.SERIES.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>NAME = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.Series fetchOneByName(String value) {
        return fetchOne(Series.SERIES.NAME, value);
    }
}
