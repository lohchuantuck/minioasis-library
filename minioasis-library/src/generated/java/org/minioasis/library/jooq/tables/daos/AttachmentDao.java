/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.daos;


import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.minioasis.library.jooq.tables.Attachment;
import org.minioasis.library.jooq.tables.records.AttachmentRecord;


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
public class AttachmentDao extends DAOImpl<AttachmentRecord, org.minioasis.library.jooq.tables.pojos.Attachment, Long> {

    /**
     * Create a new AttachmentDao without any configuration
     */
    public AttachmentDao() {
        super(Attachment.ATTACHMENT, org.minioasis.library.jooq.tables.pojos.Attachment.class);
    }

    /**
     * Create a new AttachmentDao with an attached configuration
     */
    public AttachmentDao(Configuration configuration) {
        super(Attachment.ATTACHMENT, org.minioasis.library.jooq.tables.pojos.Attachment.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(org.minioasis.library.jooq.tables.pojos.Attachment object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Attachment> fetchById(Long... values) {
        return fetch(Attachment.ATTACHMENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.Attachment fetchOneById(Long value) {
        return fetchOne(Attachment.ATTACHMENT.ID, value);
    }

    /**
     * Fetch records that have <code>BARCODE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Attachment> fetchByBarcode(String... values) {
        return fetch(Attachment.ATTACHMENT.BARCODE, values);
    }

    /**
     * Fetch a unique record that has <code>BARCODE = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.Attachment fetchOneByBarcode(String value) {
        return fetchOne(Attachment.ATTACHMENT.BARCODE, value);
    }

    /**
     * Fetch records that have <code>BORROWABLE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Attachment> fetchByBorrowable(String... values) {
        return fetch(Attachment.ATTACHMENT.BORROWABLE, values);
    }

    /**
     * Fetch records that have <code>CALL_NO IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Attachment> fetchByCallNo(String... values) {
        return fetch(Attachment.ATTACHMENT.CALL_NO, values);
    }

    /**
     * Fetch records that have <code>DESCRIPTION IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Attachment> fetchByDescription(String... values) {
        return fetch(Attachment.ATTACHMENT.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>FIRST_CHECKIN IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Attachment> fetchByFirstCheckin(Date... values) {
        return fetch(Attachment.ATTACHMENT.FIRST_CHECKIN, values);
    }

    /**
     * Fetch records that have <code>LAST_CHECKIN IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Attachment> fetchByLastCheckin(Date... values) {
        return fetch(Attachment.ATTACHMENT.LAST_CHECKIN, values);
    }

    /**
     * Fetch records that have <code>STATE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Attachment> fetchByState(String... values) {
        return fetch(Attachment.ATTACHMENT.STATE, values);
    }

    /**
     * Fetch records that have <code>ITEM_ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Attachment> fetchByItemId(Long... values) {
        return fetch(Attachment.ATTACHMENT.ITEM_ID, values);
    }
}
