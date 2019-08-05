/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.records;


import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.minioasis.library.jooq.tables.Patron;


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
public class PatronRecord extends UpdatableRecordImpl<PatronRecord> {

    private static final long serialVersionUID = -1376461134;

    /**
     * Setter for <code>PUBLIC.PATRON.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.ACTIVE</code>.
     */
    public void setActive(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.ACTIVE</code>.
     */
    public String getActive() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.CARD_KEY</code>.
     */
    public void setCardKey(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.CARD_KEY</code>.
     */
    public String getCardKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.ADDRESS1</code>.
     */
    public void setAddress1(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.ADDRESS1</code>.
     */
    public String getAddress1() {
        return (String) get(3);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.ADDRESS2</code>.
     */
    public void setAddress2(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.ADDRESS2</code>.
     */
    public String getAddress2() {
        return (String) get(4);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.ADDRESS3</code>.
     */
    public void setAddress3(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.ADDRESS3</code>.
     */
    public String getAddress3() {
        return (String) get(5);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.CITY</code>.
     */
    public void setCity(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.CITY</code>.
     */
    public String getCity() {
        return (String) get(6);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.COUNTRY</code>.
     */
    public void setCountry(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.COUNTRY</code>.
     */
    public String getCountry() {
        return (String) get(7);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.POSTCODE</code>.
     */
    public void setPostcode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.POSTCODE</code>.
     */
    public String getPostcode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.STATE</code>.
     */
    public void setState(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.STATE</code>.
     */
    public String getState() {
        return (String) get(9);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.EMAIL</code>.
     */
    public void setEmail(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.EMAIL</code>.
     */
    public String getEmail() {
        return (String) get(10);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.MOBILE</code>.
     */
    public void setMobile(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.MOBILE</code>.
     */
    public String getMobile() {
        return (String) get(11);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.TEL</code>.
     */
    public void setTel(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.TEL</code>.
     */
    public String getTel() {
        return (String) get(12);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.CREATED</code>.
     */
    public void setCreated(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.CREATED</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.END_DATE</code>.
     */
    public void setEndDate(Date value) {
        set(14, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.END_DATE</code>.
     */
    public Date getEndDate() {
        return (Date) get(14);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.ENTANGLED</code>.
     */
    public void setEntangled(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.ENTANGLED</code>.
     */
    public String getEntangled() {
        return (String) get(15);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.GENDER</code>.
     */
    public void setGender(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.GENDER</code>.
     */
    public String getGender() {
        return (String) get(16);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.IC</code>.
     */
    public void setIc(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.IC</code>.
     */
    public String getIc() {
        return (String) get(17);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.NAME</code>.
     */
    public void setName(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.NAME</code>.
     */
    public String getName() {
        return (String) get(18);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.NAME2</code>.
     */
    public void setName2(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.NAME2</code>.
     */
    public String getName2() {
        return (String) get(19);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.NOTE</code>.
     */
    public void setNote(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.NOTE</code>.
     */
    public String getNote() {
        return (String) get(20);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.ORDER_NO</code>.
     */
    public void setOrderNo(Short value) {
        set(21, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.ORDER_NO</code>.
     */
    public Short getOrderNo() {
        return (Short) get(21);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.RESERVABLE_DATE</code>.
     */
    public void setReservableDate(Date value) {
        set(22, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.RESERVABLE_DATE</code>.
     */
    public Date getReservableDate() {
        return (Date) get(22);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.START_DATE</code>.
     */
    public void setStartDate(Date value) {
        set(23, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.START_DATE</code>.
     */
    public Date getStartDate() {
        return (Date) get(23);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.UNCOLLECTED_NO</code>.
     */
    public void setUncollectedNo(Short value) {
        set(24, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.UNCOLLECTED_NO</code>.
     */
    public Short getUncollectedNo() {
        return (Short) get(24);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.UPDATED</code>.
     */
    public void setUpdated(Timestamp value) {
        set(25, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.UPDATED</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(25);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.GROUP_ID</code>.
     */
    public void setGroupId(Long value) {
        set(26, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.GROUP_ID</code>.
     */
    public Long getGroupId() {
        return (Long) get(26);
    }

    /**
     * Setter for <code>PUBLIC.PATRON.PATRONTYPE_ID</code>.
     */
    public void setPatrontypeId(Long value) {
        set(27, value);
    }

    /**
     * Getter for <code>PUBLIC.PATRON.PATRONTYPE_ID</code>.
     */
    public Long getPatrontypeId() {
        return (Long) get(27);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PatronRecord
     */
    public PatronRecord() {
        super(Patron.PATRON);
    }

    /**
     * Create a detached, initialised PatronRecord
     */
    public PatronRecord(Long id, String active, String cardKey, String address1, String address2, String address3, String city, String country, String postcode, String state, String email, String mobile, String tel, Timestamp created, Date endDate, String entangled, String gender, String ic, String name, String name2, String note, Short orderNo, Date reservableDate, Date startDate, Short uncollectedNo, Timestamp updated, Long groupId, Long patrontypeId) {
        super(Patron.PATRON);

        set(0, id);
        set(1, active);
        set(2, cardKey);
        set(3, address1);
        set(4, address2);
        set(5, address3);
        set(6, city);
        set(7, country);
        set(8, postcode);
        set(9, state);
        set(10, email);
        set(11, mobile);
        set(12, tel);
        set(13, created);
        set(14, endDate);
        set(15, entangled);
        set(16, gender);
        set(17, ic);
        set(18, name);
        set(19, name2);
        set(20, note);
        set(21, orderNo);
        set(22, reservableDate);
        set(23, startDate);
        set(24, uncollectedNo);
        set(25, updated);
        set(26, groupId);
        set(27, patrontypeId);
    }
}
