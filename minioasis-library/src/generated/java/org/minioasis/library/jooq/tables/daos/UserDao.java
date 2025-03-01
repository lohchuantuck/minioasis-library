/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.minioasis.library.jooq.tables.User;
import org.minioasis.library.jooq.tables.records.UserRecord;


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
public class UserDao extends DAOImpl<UserRecord, org.minioasis.library.jooq.tables.pojos.User, Long> {

    /**
     * Create a new UserDao without any configuration
     */
    public UserDao() {
        super(User.USER, org.minioasis.library.jooq.tables.pojos.User.class);
    }

    /**
     * Create a new UserDao with an attached configuration
     */
    public UserDao(Configuration configuration) {
        super(User.USER, org.minioasis.library.jooq.tables.pojos.User.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(org.minioasis.library.jooq.tables.pojos.User object) {
        return object.getUserId();
    }

    /**
     * Fetch records that have <code>USER_ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.User> fetchByUserId(Long... values) {
        return fetch(User.USER.USER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>USER_ID = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.User fetchOneByUserId(Long value) {
        return fetchOne(User.USER.USER_ID, value);
    }

    /**
     * Fetch records that have <code>ENABLED IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.User> fetchByEnabled(Boolean... values) {
        return fetch(User.USER.ENABLED, values);
    }

    /**
     * Fetch records that have <code>LAST_LOGIN IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.User> fetchByLastLogin(Timestamp... values) {
        return fetch(User.USER.LAST_LOGIN, values);
    }

    /**
     * Fetch records that have <code>PASSWORD IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.User> fetchByPassword(String... values) {
        return fetch(User.USER.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>USERNAME IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.User> fetchByUsername(String... values) {
        return fetch(User.USER.USERNAME, values);
    }

    /**
     * Fetch a unique record that has <code>USERNAME = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.User fetchOneByUsername(String value) {
        return fetchOne(User.USER.USERNAME, value);
    }
}
