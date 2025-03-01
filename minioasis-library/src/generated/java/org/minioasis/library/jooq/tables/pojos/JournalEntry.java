/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class JournalEntry implements Serializable {

    private static final long serialVersionUID = -927269556;

    private Long       id;
    private Timestamp  created;
    private String     createdBy;
    private BigDecimal credit;
    private BigDecimal debit;
    private String     description;
    private Date       txnDate;
    private Timestamp  updated;
    private String     updatedBy;

    public JournalEntry() {}

    public JournalEntry(JournalEntry value) {
        this.id = value.id;
        this.created = value.created;
        this.createdBy = value.createdBy;
        this.credit = value.credit;
        this.debit = value.debit;
        this.description = value.description;
        this.txnDate = value.txnDate;
        this.updated = value.updated;
        this.updatedBy = value.updatedBy;
    }

    public JournalEntry(
        Long       id,
        Timestamp  created,
        String     createdBy,
        BigDecimal credit,
        BigDecimal debit,
        String     description,
        Date       txnDate,
        Timestamp  updated,
        String     updatedBy
    ) {
        this.id = id;
        this.created = created;
        this.createdBy = createdBy;
        this.credit = credit;
        this.debit = debit;
        this.description = description;
        this.txnDate = txnDate;
        this.updated = updated;
        this.updatedBy = updatedBy;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreated() {
        return this.created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public BigDecimal getCredit() {
        return this.credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    public BigDecimal getDebit() {
        return this.debit;
    }

    public void setDebit(BigDecimal debit) {
        this.debit = debit;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTxnDate() {
        return this.txnDate;
    }

    public void setTxnDate(Date txnDate) {
        this.txnDate = txnDate;
    }

    public Timestamp getUpdated() {
        return this.updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JournalEntry (");

        sb.append(id);
        sb.append(", ").append(created);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(credit);
        sb.append(", ").append(debit);
        sb.append(", ").append(description);
        sb.append(", ").append(txnDate);
        sb.append(", ").append(updated);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }
}
