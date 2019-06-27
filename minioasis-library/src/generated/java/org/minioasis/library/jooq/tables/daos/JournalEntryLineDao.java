/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.daos;


import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.minioasis.library.jooq.tables.JournalEntryLine;
import org.minioasis.library.jooq.tables.records.JournalEntryLineRecord;


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
public class JournalEntryLineDao extends DAOImpl<JournalEntryLineRecord, org.minioasis.library.jooq.tables.pojos.JournalEntryLine, Long> {

    /**
     * Create a new JournalEntryLineDao without any configuration
     */
    public JournalEntryLineDao() {
        super(JournalEntryLine.JOURNAL_ENTRY_LINE, org.minioasis.library.jooq.tables.pojos.JournalEntryLine.class);
    }

    /**
     * Create a new JournalEntryLineDao with an attached configuration
     */
    public JournalEntryLineDao(Configuration configuration) {
        super(JournalEntryLine.JOURNAL_ENTRY_LINE, org.minioasis.library.jooq.tables.pojos.JournalEntryLine.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(org.minioasis.library.jooq.tables.pojos.JournalEntryLine object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.JournalEntryLine> fetchById(Long... values) {
        return fetch(JournalEntryLine.JOURNAL_ENTRY_LINE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.JournalEntryLine fetchOneById(Long value) {
        return fetchOne(JournalEntryLine.JOURNAL_ENTRY_LINE.ID, value);
    }

    /**
     * Fetch records that have <code>CREDIT IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.JournalEntryLine> fetchByCredit(BigDecimal... values) {
        return fetch(JournalEntryLine.JOURNAL_ENTRY_LINE.CREDIT, values);
    }

    /**
     * Fetch records that have <code>DEBIT IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.JournalEntryLine> fetchByDebit(BigDecimal... values) {
        return fetch(JournalEntryLine.JOURNAL_ENTRY_LINE.DEBIT, values);
    }

    /**
     * Fetch records that have <code>DESCRIPTION IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.JournalEntryLine> fetchByDescription(String... values) {
        return fetch(JournalEntryLine.JOURNAL_ENTRY_LINE.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>REFERENCE IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.JournalEntryLine> fetchByReference(String... values) {
        return fetch(JournalEntryLine.JOURNAL_ENTRY_LINE.REFERENCE, values);
    }

    /**
     * Fetch records that have <code>ACCOUNT_ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.JournalEntryLine> fetchByAccountId(Long... values) {
        return fetch(JournalEntryLine.JOURNAL_ENTRY_LINE.ACCOUNT_ID, values);
    }

    /**
     * Fetch records that have <code>JOURNALENTRY_ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.JournalEntryLine> fetchByJournalentryId(Long... values) {
        return fetch(JournalEntryLine.JOURNAL_ENTRY_LINE.JOURNALENTRY_ID, values);
    }
}
