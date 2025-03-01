/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.minioasis.library.jooq.Indexes;
import org.minioasis.library.jooq.Keys;
import org.minioasis.library.jooq.Public;
import org.minioasis.library.jooq.tables.records.ReservationRecord;


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
public class Reservation extends TableImpl<ReservationRecord> {

    private static final long serialVersionUID = -1211701427;

    /**
     * The reference instance of <code>PUBLIC.RESERVATION</code>
     */
    public static final Reservation RESERVATION = new Reservation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationRecord> getRecordType() {
        return ReservationRecord.class;
    }

    /**
     * The column <code>PUBLIC.RESERVATION.ID</code>.
     */
    public final TableField<ReservationRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.RESERVATION.AVAILABLE_DATE</code>.
     */
    public final TableField<ReservationRecord, Date> AVAILABLE_DATE = createField("AVAILABLE_DATE", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>PUBLIC.RESERVATION.CANCEL_DATE</code>.
     */
    public final TableField<ReservationRecord, Date> CANCEL_DATE = createField("CANCEL_DATE", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>PUBLIC.RESERVATION.COLLECTED_DATE</code>.
     */
    public final TableField<ReservationRecord, Date> COLLECTED_DATE = createField("COLLECTED_DATE", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>PUBLIC.RESERVATION.EXPIRY_DATE</code>.
     */
    public final TableField<ReservationRecord, Date> EXPIRY_DATE = createField("EXPIRY_DATE", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.RESERVATION.NOTIFICATION_DATE</code>.
     */
    public final TableField<ReservationRecord, Date> NOTIFICATION_DATE = createField("NOTIFICATION_DATE", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>PUBLIC.RESERVATION.RESERVATION_DATE</code>.
     */
    public final TableField<ReservationRecord, Timestamp> RESERVATION_DATE = createField("RESERVATION_DATE", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.RESERVATION.STATE</code>.
     */
    public final TableField<ReservationRecord, String> STATE = createField("STATE", org.jooq.impl.SQLDataType.CHAR(20).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.RESERVATION.UNCOLLECTED_DATE</code>.
     */
    public final TableField<ReservationRecord, Date> UNCOLLECTED_DATE = createField("UNCOLLECTED_DATE", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>PUBLIC.RESERVATION.BIBLIO_ID</code>.
     */
    public final TableField<ReservationRecord, Long> BIBLIO_ID = createField("BIBLIO_ID", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>PUBLIC.RESERVATION.PATRON_ID</code>.
     */
    public final TableField<ReservationRecord, Long> PATRON_ID = createField("PATRON_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.RESERVATION</code> table reference
     */
    public Reservation() {
        this(DSL.name("RESERVATION"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.RESERVATION</code> table reference
     */
    public Reservation(String alias) {
        this(DSL.name(alias), RESERVATION);
    }

    /**
     * Create an aliased <code>PUBLIC.RESERVATION</code> table reference
     */
    public Reservation(Name alias) {
        this(alias, RESERVATION);
    }

    private Reservation(Name alias, Table<ReservationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Reservation(Name alias, Table<ReservationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FK_RESERVATION_BIBLIO_INDEX_2, Indexes.FK_RESERVATION_PATRON_INDEX_2, Indexes.PRIMARY_KEY_23);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationRecord, Long> getIdentity() {
        return Keys.IDENTITY_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_23;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationRecord>>asList(Keys.CONSTRAINT_23);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ReservationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ReservationRecord, ?>>asList(Keys.FK_RESERVATION_BIBLIO, Keys.FK_RESERVATION_PATRON);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Reservation as(String alias) {
        return new Reservation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Reservation as(Name alias) {
        return new Reservation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Reservation rename(String name) {
        return new Reservation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Reservation rename(Name name) {
        return new Reservation(name, null);
    }
}
