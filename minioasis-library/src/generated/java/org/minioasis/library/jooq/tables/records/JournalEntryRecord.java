/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.minioasis.library.jooq.tables.JournalEntry;


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
public class JournalEntryRecord extends UpdatableRecordImpl<JournalEntryRecord> implements Record9<Long, Timestamp, String, BigDecimal, BigDecimal, String, Date, Timestamp, String> {

    private static final long serialVersionUID = -57653402;

    /**
     * Setter for <code>PUBLIC.JOURNAL_ENTRY.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.JOURNAL_ENTRY.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.JOURNAL_ENTRY.CREATED</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.JOURNAL_ENTRY.CREATED</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>PUBLIC.JOURNAL_ENTRY.CREATED_BY</code>.
     */
    public void setCreatedBy(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.JOURNAL_ENTRY.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.JOURNAL_ENTRY.CREDIT</code>.
     */
    public void setCredit(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.JOURNAL_ENTRY.CREDIT</code>.
     */
    public BigDecimal getCredit() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>PUBLIC.JOURNAL_ENTRY.DEBIT</code>.
     */
    public void setDebit(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.JOURNAL_ENTRY.DEBIT</code>.
     */
    public BigDecimal getDebit() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>PUBLIC.JOURNAL_ENTRY.DESCRIPTION</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.JOURNAL_ENTRY.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>PUBLIC.JOURNAL_ENTRY.TXN_DATE</code>.
     */
    public void setTxnDate(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>PUBLIC.JOURNAL_ENTRY.TXN_DATE</code>.
     */
    public Date getTxnDate() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>PUBLIC.JOURNAL_ENTRY.UPDATED</code>.
     */
    public void setUpdated(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>PUBLIC.JOURNAL_ENTRY.UPDATED</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>PUBLIC.JOURNAL_ENTRY.UPDATED_BY</code>.
     */
    public void setUpdatedBy(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>PUBLIC.JOURNAL_ENTRY.UPDATED_BY</code>.
     */
    public String getUpdatedBy() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Timestamp, String, BigDecimal, BigDecimal, String, Date, Timestamp, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Timestamp, String, BigDecimal, BigDecimal, String, Date, Timestamp, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JournalEntry.JOURNAL_ENTRY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return JournalEntry.JOURNAL_ENTRY.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JournalEntry.JOURNAL_ENTRY.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return JournalEntry.JOURNAL_ENTRY.CREDIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return JournalEntry.JOURNAL_ENTRY.DEBIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return JournalEntry.JOURNAL_ENTRY.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return JournalEntry.JOURNAL_ENTRY.TXN_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return JournalEntry.JOURNAL_ENTRY.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return JournalEntry.JOURNAL_ENTRY.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getCredit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getDebit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component7() {
        return getTxnDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getCredit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getDebit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getTxnDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JournalEntryRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JournalEntryRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JournalEntryRecord value3(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JournalEntryRecord value4(BigDecimal value) {
        setCredit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JournalEntryRecord value5(BigDecimal value) {
        setDebit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JournalEntryRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JournalEntryRecord value7(Date value) {
        setTxnDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JournalEntryRecord value8(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JournalEntryRecord value9(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JournalEntryRecord values(Long value1, Timestamp value2, String value3, BigDecimal value4, BigDecimal value5, String value6, Date value7, Timestamp value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JournalEntryRecord
     */
    public JournalEntryRecord() {
        super(JournalEntry.JOURNAL_ENTRY);
    }

    /**
     * Create a detached, initialised JournalEntryRecord
     */
    public JournalEntryRecord(Long id, Timestamp created, String createdBy, BigDecimal credit, BigDecimal debit, String description, Date txnDate, Timestamp updated, String updatedBy) {
        super(JournalEntry.JOURNAL_ENTRY);

        set(0, id);
        set(1, created);
        set(2, createdBy);
        set(3, credit);
        set(4, debit);
        set(5, description);
        set(6, txnDate);
        set(7, updated);
        set(8, updatedBy);
    }
}
