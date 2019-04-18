/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.minioasis.library.jooq.tables.Publisher;
import org.minioasis.library.jooq.tables.records.PublisherRecord;


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
public class PublisherDao extends DAOImpl<PublisherRecord, org.minioasis.library.jooq.tables.pojos.Publisher, Long> {

    /**
     * Create a new PublisherDao without any configuration
     */
    public PublisherDao() {
        super(Publisher.PUBLISHER, org.minioasis.library.jooq.tables.pojos.Publisher.class);
    }

    /**
     * Create a new PublisherDao with an attached configuration
     */
    public PublisherDao(Configuration configuration) {
        super(Publisher.PUBLISHER, org.minioasis.library.jooq.tables.pojos.Publisher.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(org.minioasis.library.jooq.tables.pojos.Publisher object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Publisher> fetchById(Long... values) {
        return fetch(Publisher.PUBLISHER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.Publisher fetchOneById(Long value) {
        return fetchOne(Publisher.PUBLISHER.ID, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Publisher> fetchByName(String... values) {
        return fetch(Publisher.PUBLISHER.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>NAME = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.Publisher fetchOneByName(String value) {
        return fetchOne(Publisher.PUBLISHER.NAME, value);
    }
}
