/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq;


import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;
import org.minioasis.library.jooq.tables.Account;
import org.minioasis.library.jooq.tables.Attachment;
import org.minioasis.library.jooq.tables.AttachmentCheckout;
import org.minioasis.library.jooq.tables.Biblio;
import org.minioasis.library.jooq.tables.BiblioTag;
import org.minioasis.library.jooq.tables.Checkout;
import org.minioasis.library.jooq.tables.FormData;
import org.minioasis.library.jooq.tables.Groups;
import org.minioasis.library.jooq.tables.Holiday;
import org.minioasis.library.jooq.tables.Image;
import org.minioasis.library.jooq.tables.Item;
import org.minioasis.library.jooq.tables.ItemStatus;
import org.minioasis.library.jooq.tables.JournalEntry;
import org.minioasis.library.jooq.tables.JournalEntryLine;
import org.minioasis.library.jooq.tables.Location;
import org.minioasis.library.jooq.tables.Patron;
import org.minioasis.library.jooq.tables.PatronType;
import org.minioasis.library.jooq.tables.Publisher;
import org.minioasis.library.jooq.tables.Reservation;
import org.minioasis.library.jooq.tables.Role;
import org.minioasis.library.jooq.tables.Series;
import org.minioasis.library.jooq.tables.Tag;
import org.minioasis.library.jooq.tables.TelegramUser;
import org.minioasis.library.jooq.tables.User;
import org.minioasis.library.jooq.tables.UserRole;


/**
 * A class modelling indexes of tables of the <code>PUBLIC</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index PRIMARY_KEY_E = Indexes0.PRIMARY_KEY_E;
    public static final Index UK_K9QLQIJT38KMRYAFDHHQ04LON_INDEX_E = Indexes0.UK_K9QLQIJT38KMRYAFDHHQ04LON_INDEX_E;
    public static final Index FK_ATTACHMENT_ITEM_INDEX_A = Indexes0.FK_ATTACHMENT_ITEM_INDEX_A;
    public static final Index PRIMARY_KEY_A = Indexes0.PRIMARY_KEY_A;
    public static final Index UK_ODYTD07MTGMJLAEF9T1WGKVPC_INDEX_A = Indexes0.UK_ODYTD07MTGMJLAEF9T1WGKVPC_INDEX_A;
    public static final Index FK_ATTACHMENTCHECKOUT_ATTACHMENT_INDEX_6 = Indexes0.FK_ATTACHMENTCHECKOUT_ATTACHMENT_INDEX_6;
    public static final Index FK_ATTACHMENTCHECKOUT_CHECKOUT_INDEX_6 = Indexes0.FK_ATTACHMENTCHECKOUT_CHECKOUT_INDEX_6;
    public static final Index FK_ATTACHMENTCHECKOUT_PATRON_INDEX_6 = Indexes0.FK_ATTACHMENTCHECKOUT_PATRON_INDEX_6;
    public static final Index PRIMARY_KEY_6 = Indexes0.PRIMARY_KEY_6;
    public static final Index FK5H0N8HTB4IGKJI1C5FCV1HVY9_INDEX_7 = Indexes0.FK5H0N8HTB4IGKJI1C5FCV1HVY9_INDEX_7;
    public static final Index FK_BIBLIO_PUBLISHER_INDEX_7 = Indexes0.FK_BIBLIO_PUBLISHER_INDEX_7;
    public static final Index FK_BIBLIO_SERIES_INDEX_7 = Indexes0.FK_BIBLIO_SERIES_INDEX_7;
    public static final Index PRIMARY_KEY_7 = Indexes0.PRIMARY_KEY_7;
    public static final Index FK2Y040I75GSYULS6MEGB8PEOLK_INDEX_3 = Indexes0.FK2Y040I75GSYULS6MEGB8PEOLK_INDEX_3;
    public static final Index FK6WR2OUSD2B6D5E9EDOYA9C7OI_INDEX_3 = Indexes0.FK6WR2OUSD2B6D5E9EDOYA9C7OI_INDEX_3;
    public static final Index PRIMARY_KEY_3 = Indexes0.PRIMARY_KEY_3;
    public static final Index FK_CHECKOUT_ITEM_INDEX_8 = Indexes0.FK_CHECKOUT_ITEM_INDEX_8;
    public static final Index FK_CHECKOUT_PATRON_INDEX_8 = Indexes0.FK_CHECKOUT_PATRON_INDEX_8;
    public static final Index PRIMARY_KEY_8 = Indexes0.PRIMARY_KEY_8;
    public static final Index PRIMARY_KEY_1 = Indexes0.PRIMARY_KEY_1;
    public static final Index PRIMARY_KEY_7D = Indexes0.PRIMARY_KEY_7D;
    public static final Index UK_16FAME6JE5OYJNCQMBL1N5177_INDEX_7 = Indexes0.UK_16FAME6JE5OYJNCQMBL1N5177_INDEX_7;
    public static final Index PRIMARY_KEY_6B = Indexes0.PRIMARY_KEY_6B;
    public static final Index UK_3JJDI9M362Y965LR542FPEJT_INDEX_6 = Indexes0.UK_3JJDI9M362Y965LR542FPEJT_INDEX_6;
    public static final Index PRIMARY_KEY_4 = Indexes0.PRIMARY_KEY_4;
    public static final Index FK_ITEM_BIBLIO_INDEX_2 = Indexes0.FK_ITEM_BIBLIO_INDEX_2;
    public static final Index FK_ITEM_ITEMSTATUS_INDEX_2 = Indexes0.FK_ITEM_ITEMSTATUS_INDEX_2;
    public static final Index FK_ITEM_LOCATION_INDEX_2 = Indexes0.FK_ITEM_LOCATION_INDEX_2;
    public static final Index PRIMARY_KEY_2 = Indexes0.PRIMARY_KEY_2;
    public static final Index UK_BFO0NHIH8F3JL9M9UBLNXR4UY_INDEX_2 = Indexes0.UK_BFO0NHIH8F3JL9M9UBLNXR4UY_INDEX_2;
    public static final Index PRIMARY_KEY_64 = Indexes0.PRIMARY_KEY_64;
    public static final Index UK_GW69EG5BWDJ2BC6GJ8GYXT9AD_INDEX_6 = Indexes0.UK_GW69EG5BWDJ2BC6GJ8GYXT9AD_INDEX_6;
    public static final Index PRIMARY_KEY_E8 = Indexes0.PRIMARY_KEY_E8;
    public static final Index FK_JOURNALENTRYLINE_ACCOUNT_INDEX_F = Indexes0.FK_JOURNALENTRYLINE_ACCOUNT_INDEX_F;
    public static final Index FK_JOURNALENTRYLINE_JOURNALENTRY_INDEX_F = Indexes0.FK_JOURNALENTRYLINE_JOURNALENTRY_INDEX_F;
    public static final Index PRIMARY_KEY_F = Indexes0.PRIMARY_KEY_F;
    public static final Index PRIMARY_KEY_9 = Indexes0.PRIMARY_KEY_9;
    public static final Index UK_SAHIXF1V7F7XNS19CBG12D946_INDEX_9 = Indexes0.UK_SAHIXF1V7F7XNS19CBG12D946_INDEX_9;
    public static final Index FK_PATRON_GROUP_INDEX_8 = Indexes0.FK_PATRON_GROUP_INDEX_8;
    public static final Index FK_PATRON_PATRONTYPE_INDEX_8 = Indexes0.FK_PATRON_PATRONTYPE_INDEX_8;
    public static final Index PRIMARY_KEY_8C = Indexes0.PRIMARY_KEY_8C;
    public static final Index UK_3CND47DLNMG4XI9OQ6JNI97X3_INDEX_8 = Indexes0.UK_3CND47DLNMG4XI9OQ6JNI97X3_INDEX_8;
    public static final Index UK_E9FRUVR3H2998KELNJ73YM6CY_INDEX_8 = Indexes0.UK_E9FRUVR3H2998KELNJ73YM6CY_INDEX_8;
    public static final Index PRIMARY_KEY_5 = Indexes0.PRIMARY_KEY_5;
    public static final Index UK_T54V4235XB53JP0OYG9QXYBBM_INDEX_5 = Indexes0.UK_T54V4235XB53JP0OYG9QXYBBM_INDEX_5;
    public static final Index PRIMARY_KEY_FC = Indexes0.PRIMARY_KEY_FC;
    public static final Index UK_H9TRV4XHMH6S68VBW9BA6TO70_INDEX_F = Indexes0.UK_H9TRV4XHMH6S68VBW9BA6TO70_INDEX_F;
    public static final Index FK_RESERVATION_BIBLIO_INDEX_2 = Indexes0.FK_RESERVATION_BIBLIO_INDEX_2;
    public static final Index FK_RESERVATION_PATRON_INDEX_2 = Indexes0.FK_RESERVATION_PATRON_INDEX_2;
    public static final Index PRIMARY_KEY_23 = Indexes0.PRIMARY_KEY_23;
    public static final Index PRIMARY_KEY_26 = Indexes0.PRIMARY_KEY_26;
    public static final Index UK8SEWWNPAMNGI6B1DWAA88ASKK_INDEX_2 = Indexes0.UK8SEWWNPAMNGI6B1DWAA88ASKK_INDEX_2;
    public static final Index PRIMARY_KEY_91 = Indexes0.PRIMARY_KEY_91;
    public static final Index UK_S4JD0PRFGED1PUCSTGAOH8QJ4_INDEX_9 = Indexes0.UK_S4JD0PRFGED1PUCSTGAOH8QJ4_INDEX_9;
    public static final Index PRIMARY_KEY_14 = Indexes0.PRIMARY_KEY_14;
    public static final Index UK_1WDPSED5KNA2Y38HNBGRNHI5B_INDEX_1 = Indexes0.UK_1WDPSED5KNA2Y38HNBGRNHI5B_INDEX_1;
    public static final Index PRIMARY_KEY_B = Indexes0.PRIMARY_KEY_B;
    public static final Index UK_8FJRX8Y7KIFVM13XIF72SY5BF_INDEX_B = Indexes0.UK_8FJRX8Y7KIFVM13XIF72SY5BF_INDEX_B;
    public static final Index UK_ABIUVF67GFNDN35NGQDPKQ7DY_INDEX_B = Indexes0.UK_ABIUVF67GFNDN35NGQDPKQ7DY_INDEX_B;
    public static final Index PRIMARY_KEY_27 = Indexes0.PRIMARY_KEY_27;
    public static final Index UK_SB8BBOUER5WAK8VYIIY4PF2BX_INDEX_2 = Indexes0.UK_SB8BBOUER5WAK8VYIIY4PF2BX_INDEX_2;
    public static final Index FK859N2JVI8IVHUI0RL0ESWS6O_INDEX_B = Indexes0.FK859N2JVI8IVHUI0RL0ESWS6O_INDEX_B;
    public static final Index FKA68196081FVOVJHKEK5M97N3Y_INDEX_B = Indexes0.FKA68196081FVOVJHKEK5M97N3Y_INDEX_B;
    public static final Index PRIMARY_KEY_BC = Indexes0.PRIMARY_KEY_BC;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index PRIMARY_KEY_E = Internal.createIndex("PRIMARY_KEY_E", Account.ACCOUNT, new OrderField[] { Account.ACCOUNT.ID }, true);
        public static Index UK_K9QLQIJT38KMRYAFDHHQ04LON_INDEX_E = Internal.createIndex("UK_K9QLQIJT38KMRYAFDHHQ04LON_INDEX_E", Account.ACCOUNT, new OrderField[] { Account.ACCOUNT.CODE }, true);
        public static Index FK_ATTACHMENT_ITEM_INDEX_A = Internal.createIndex("FK_ATTACHMENT_ITEM_INDEX_A", Attachment.ATTACHMENT, new OrderField[] { Attachment.ATTACHMENT.ITEM_ID }, false);
        public static Index PRIMARY_KEY_A = Internal.createIndex("PRIMARY_KEY_A", Attachment.ATTACHMENT, new OrderField[] { Attachment.ATTACHMENT.ID }, true);
        public static Index UK_ODYTD07MTGMJLAEF9T1WGKVPC_INDEX_A = Internal.createIndex("UK_ODYTD07MTGMJLAEF9T1WGKVPC_INDEX_A", Attachment.ATTACHMENT, new OrderField[] { Attachment.ATTACHMENT.BARCODE }, true);
        public static Index FK_ATTACHMENTCHECKOUT_ATTACHMENT_INDEX_6 = Internal.createIndex("FK_ATTACHMENTCHECKOUT_ATTACHMENT_INDEX_6", AttachmentCheckout.ATTACHMENT_CHECKOUT, new OrderField[] { AttachmentCheckout.ATTACHMENT_CHECKOUT.ATTACHMENT_ID }, false);
        public static Index FK_ATTACHMENTCHECKOUT_CHECKOUT_INDEX_6 = Internal.createIndex("FK_ATTACHMENTCHECKOUT_CHECKOUT_INDEX_6", AttachmentCheckout.ATTACHMENT_CHECKOUT, new OrderField[] { AttachmentCheckout.ATTACHMENT_CHECKOUT.CHECKOUT_ID }, false);
        public static Index FK_ATTACHMENTCHECKOUT_PATRON_INDEX_6 = Internal.createIndex("FK_ATTACHMENTCHECKOUT_PATRON_INDEX_6", AttachmentCheckout.ATTACHMENT_CHECKOUT, new OrderField[] { AttachmentCheckout.ATTACHMENT_CHECKOUT.PATRON_ID }, false);
        public static Index PRIMARY_KEY_6 = Internal.createIndex("PRIMARY_KEY_6", AttachmentCheckout.ATTACHMENT_CHECKOUT, new OrderField[] { AttachmentCheckout.ATTACHMENT_CHECKOUT.ID }, true);
        public static Index FK5H0N8HTB4IGKJI1C5FCV1HVY9_INDEX_7 = Internal.createIndex("FK5H0N8HTB4IGKJI1C5FCV1HVY9_INDEX_7", Biblio.BIBLIO, new OrderField[] { Biblio.BIBLIO.IMAGE_ID }, false);
        public static Index FK_BIBLIO_PUBLISHER_INDEX_7 = Internal.createIndex("FK_BIBLIO_PUBLISHER_INDEX_7", Biblio.BIBLIO, new OrderField[] { Biblio.BIBLIO.PUBLISHER_ID }, false);
        public static Index FK_BIBLIO_SERIES_INDEX_7 = Internal.createIndex("FK_BIBLIO_SERIES_INDEX_7", Biblio.BIBLIO, new OrderField[] { Biblio.BIBLIO.SERIES_ID }, false);
        public static Index PRIMARY_KEY_7 = Internal.createIndex("PRIMARY_KEY_7", Biblio.BIBLIO, new OrderField[] { Biblio.BIBLIO.ID }, true);
        public static Index FK2Y040I75GSYULS6MEGB8PEOLK_INDEX_3 = Internal.createIndex("FK2Y040I75GSYULS6MEGB8PEOLK_INDEX_3", BiblioTag.BIBLIO_TAG, new OrderField[] { BiblioTag.BIBLIO_TAG.BIBLIO_ID }, false);
        public static Index FK6WR2OUSD2B6D5E9EDOYA9C7OI_INDEX_3 = Internal.createIndex("FK6WR2OUSD2B6D5E9EDOYA9C7OI_INDEX_3", BiblioTag.BIBLIO_TAG, new OrderField[] { BiblioTag.BIBLIO_TAG.TAG_ID }, false);
        public static Index PRIMARY_KEY_3 = Internal.createIndex("PRIMARY_KEY_3", BiblioTag.BIBLIO_TAG, new OrderField[] { BiblioTag.BIBLIO_TAG.BIBLIO_ID, BiblioTag.BIBLIO_TAG.TAG_ID }, true);
        public static Index FK_CHECKOUT_ITEM_INDEX_8 = Internal.createIndex("FK_CHECKOUT_ITEM_INDEX_8", Checkout.CHECKOUT, new OrderField[] { Checkout.CHECKOUT.ITEM_ID }, false);
        public static Index FK_CHECKOUT_PATRON_INDEX_8 = Internal.createIndex("FK_CHECKOUT_PATRON_INDEX_8", Checkout.CHECKOUT, new OrderField[] { Checkout.CHECKOUT.PATRON_ID }, false);
        public static Index PRIMARY_KEY_8 = Internal.createIndex("PRIMARY_KEY_8", Checkout.CHECKOUT, new OrderField[] { Checkout.CHECKOUT.ID }, true);
        public static Index PRIMARY_KEY_1 = Internal.createIndex("PRIMARY_KEY_1", FormData.FORM_DATA, new OrderField[] { FormData.FORM_DATA.ID }, true);
        public static Index PRIMARY_KEY_7D = Internal.createIndex("PRIMARY_KEY_7D", Groups.GROUPS, new OrderField[] { Groups.GROUPS.ID }, true);
        public static Index UK_16FAME6JE5OYJNCQMBL1N5177_INDEX_7 = Internal.createIndex("UK_16FAME6JE5OYJNCQMBL1N5177_INDEX_7", Groups.GROUPS, new OrderField[] { Groups.GROUPS.CODE }, true);
        public static Index PRIMARY_KEY_6B = Internal.createIndex("PRIMARY_KEY_6B", Holiday.HOLIDAY, new OrderField[] { Holiday.HOLIDAY.ID }, true);
        public static Index UK_3JJDI9M362Y965LR542FPEJT_INDEX_6 = Internal.createIndex("UK_3JJDI9M362Y965LR542FPEJT_INDEX_6", Holiday.HOLIDAY, new OrderField[] { Holiday.HOLIDAY.NAME }, true);
        public static Index PRIMARY_KEY_4 = Internal.createIndex("PRIMARY_KEY_4", Image.IMAGE, new OrderField[] { Image.IMAGE.ID }, true);
        public static Index FK_ITEM_BIBLIO_INDEX_2 = Internal.createIndex("FK_ITEM_BIBLIO_INDEX_2", Item.ITEM, new OrderField[] { Item.ITEM.BIBLIO_ID }, false);
        public static Index FK_ITEM_ITEMSTATUS_INDEX_2 = Internal.createIndex("FK_ITEM_ITEMSTATUS_INDEX_2", Item.ITEM, new OrderField[] { Item.ITEM.ITEM_STATUS_ID }, false);
        public static Index FK_ITEM_LOCATION_INDEX_2 = Internal.createIndex("FK_ITEM_LOCATION_INDEX_2", Item.ITEM, new OrderField[] { Item.ITEM.LOCATION_ID }, false);
        public static Index PRIMARY_KEY_2 = Internal.createIndex("PRIMARY_KEY_2", Item.ITEM, new OrderField[] { Item.ITEM.ID }, true);
        public static Index UK_BFO0NHIH8F3JL9M9UBLNXR4UY_INDEX_2 = Internal.createIndex("UK_BFO0NHIH8F3JL9M9UBLNXR4UY_INDEX_2", Item.ITEM, new OrderField[] { Item.ITEM.BARCODE }, true);
        public static Index PRIMARY_KEY_64 = Internal.createIndex("PRIMARY_KEY_64", ItemStatus.ITEM_STATUS, new OrderField[] { ItemStatus.ITEM_STATUS.ID }, true);
        public static Index UK_GW69EG5BWDJ2BC6GJ8GYXT9AD_INDEX_6 = Internal.createIndex("UK_GW69EG5BWDJ2BC6GJ8GYXT9AD_INDEX_6", ItemStatus.ITEM_STATUS, new OrderField[] { ItemStatus.ITEM_STATUS.NAME }, true);
        public static Index PRIMARY_KEY_E8 = Internal.createIndex("PRIMARY_KEY_E8", JournalEntry.JOURNAL_ENTRY, new OrderField[] { JournalEntry.JOURNAL_ENTRY.ID }, true);
        public static Index FK_JOURNALENTRYLINE_ACCOUNT_INDEX_F = Internal.createIndex("FK_JOURNALENTRYLINE_ACCOUNT_INDEX_F", JournalEntryLine.JOURNAL_ENTRY_LINE, new OrderField[] { JournalEntryLine.JOURNAL_ENTRY_LINE.ACCOUNT_ID }, false);
        public static Index FK_JOURNALENTRYLINE_JOURNALENTRY_INDEX_F = Internal.createIndex("FK_JOURNALENTRYLINE_JOURNALENTRY_INDEX_F", JournalEntryLine.JOURNAL_ENTRY_LINE, new OrderField[] { JournalEntryLine.JOURNAL_ENTRY_LINE.JOURNALENTRY_ID }, false);
        public static Index PRIMARY_KEY_F = Internal.createIndex("PRIMARY_KEY_F", JournalEntryLine.JOURNAL_ENTRY_LINE, new OrderField[] { JournalEntryLine.JOURNAL_ENTRY_LINE.ID }, true);
        public static Index PRIMARY_KEY_9 = Internal.createIndex("PRIMARY_KEY_9", Location.LOCATION, new OrderField[] { Location.LOCATION.ID }, true);
        public static Index UK_SAHIXF1V7F7XNS19CBG12D946_INDEX_9 = Internal.createIndex("UK_SAHIXF1V7F7XNS19CBG12D946_INDEX_9", Location.LOCATION, new OrderField[] { Location.LOCATION.NAME }, true);
        public static Index FK_PATRON_GROUP_INDEX_8 = Internal.createIndex("FK_PATRON_GROUP_INDEX_8", Patron.PATRON, new OrderField[] { Patron.PATRON.GROUP_ID }, false);
        public static Index FK_PATRON_PATRONTYPE_INDEX_8 = Internal.createIndex("FK_PATRON_PATRONTYPE_INDEX_8", Patron.PATRON, new OrderField[] { Patron.PATRON.PATRONTYPE_ID }, false);
        public static Index PRIMARY_KEY_8C = Internal.createIndex("PRIMARY_KEY_8C", Patron.PATRON, new OrderField[] { Patron.PATRON.ID }, true);
        public static Index UK_3CND47DLNMG4XI9OQ6JNI97X3_INDEX_8 = Internal.createIndex("UK_3CND47DLNMG4XI9OQ6JNI97X3_INDEX_8", Patron.PATRON, new OrderField[] { Patron.PATRON.CARD_KEY }, true);
        public static Index UK_E9FRUVR3H2998KELNJ73YM6CY_INDEX_8 = Internal.createIndex("UK_E9FRUVR3H2998KELNJ73YM6CY_INDEX_8", Patron.PATRON, new OrderField[] { Patron.PATRON.ENTANGLED }, true);
        public static Index PRIMARY_KEY_5 = Internal.createIndex("PRIMARY_KEY_5", PatronType.PATRON_TYPE, new OrderField[] { PatronType.PATRON_TYPE.ID }, true);
        public static Index UK_T54V4235XB53JP0OYG9QXYBBM_INDEX_5 = Internal.createIndex("UK_T54V4235XB53JP0OYG9QXYBBM_INDEX_5", PatronType.PATRON_TYPE, new OrderField[] { PatronType.PATRON_TYPE.CODE }, true);
        public static Index PRIMARY_KEY_FC = Internal.createIndex("PRIMARY_KEY_FC", Publisher.PUBLISHER, new OrderField[] { Publisher.PUBLISHER.ID }, true);
        public static Index UK_H9TRV4XHMH6S68VBW9BA6TO70_INDEX_F = Internal.createIndex("UK_H9TRV4XHMH6S68VBW9BA6TO70_INDEX_F", Publisher.PUBLISHER, new OrderField[] { Publisher.PUBLISHER.NAME }, true);
        public static Index FK_RESERVATION_BIBLIO_INDEX_2 = Internal.createIndex("FK_RESERVATION_BIBLIO_INDEX_2", Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.BIBLIO_ID }, false);
        public static Index FK_RESERVATION_PATRON_INDEX_2 = Internal.createIndex("FK_RESERVATION_PATRON_INDEX_2", Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.PATRON_ID }, false);
        public static Index PRIMARY_KEY_23 = Internal.createIndex("PRIMARY_KEY_23", Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.ID }, true);
        public static Index PRIMARY_KEY_26 = Internal.createIndex("PRIMARY_KEY_26", Role.ROLE, new OrderField[] { Role.ROLE.ROLE_ID }, true);
        public static Index UK8SEWWNPAMNGI6B1DWAA88ASKK_INDEX_2 = Internal.createIndex("UK8SEWWNPAMNGI6B1DWAA88ASKK_INDEX_2", Role.ROLE, new OrderField[] { Role.ROLE.NAME }, true);
        public static Index PRIMARY_KEY_91 = Internal.createIndex("PRIMARY_KEY_91", Series.SERIES, new OrderField[] { Series.SERIES.ID }, true);
        public static Index UK_S4JD0PRFGED1PUCSTGAOH8QJ4_INDEX_9 = Internal.createIndex("UK_S4JD0PRFGED1PUCSTGAOH8QJ4_INDEX_9", Series.SERIES, new OrderField[] { Series.SERIES.NAME }, true);
        public static Index PRIMARY_KEY_14 = Internal.createIndex("PRIMARY_KEY_14", Tag.TAG, new OrderField[] { Tag.TAG.ID }, true);
        public static Index UK_1WDPSED5KNA2Y38HNBGRNHI5B_INDEX_1 = Internal.createIndex("UK_1WDPSED5KNA2Y38HNBGRNHI5B_INDEX_1", Tag.TAG, new OrderField[] { Tag.TAG.NAME }, true);
        public static Index PRIMARY_KEY_B = Internal.createIndex("PRIMARY_KEY_B", TelegramUser.TELEGRAM_USER, new OrderField[] { TelegramUser.TELEGRAM_USER.ID }, true);
        public static Index UK_8FJRX8Y7KIFVM13XIF72SY5BF_INDEX_B = Internal.createIndex("UK_8FJRX8Y7KIFVM13XIF72SY5BF_INDEX_B", TelegramUser.TELEGRAM_USER, new OrderField[] { TelegramUser.TELEGRAM_USER.CHAT_ID }, true);
        public static Index UK_ABIUVF67GFNDN35NGQDPKQ7DY_INDEX_B = Internal.createIndex("UK_ABIUVF67GFNDN35NGQDPKQ7DY_INDEX_B", TelegramUser.TELEGRAM_USER, new OrderField[] { TelegramUser.TELEGRAM_USER.CARD_KEY }, true);
        public static Index PRIMARY_KEY_27 = Internal.createIndex("PRIMARY_KEY_27", User.USER, new OrderField[] { User.USER.USER_ID }, true);
        public static Index UK_SB8BBOUER5WAK8VYIIY4PF2BX_INDEX_2 = Internal.createIndex("UK_SB8BBOUER5WAK8VYIIY4PF2BX_INDEX_2", User.USER, new OrderField[] { User.USER.USERNAME }, true);
        public static Index FK859N2JVI8IVHUI0RL0ESWS6O_INDEX_B = Internal.createIndex("FK859N2JVI8IVHUI0RL0ESWS6O_INDEX_B", UserRole.USER_ROLE, new OrderField[] { UserRole.USER_ROLE.USER_ID }, false);
        public static Index FKA68196081FVOVJHKEK5M97N3Y_INDEX_B = Internal.createIndex("FKA68196081FVOVJHKEK5M97N3Y_INDEX_B", UserRole.USER_ROLE, new OrderField[] { UserRole.USER_ROLE.ROLE_ID }, false);
        public static Index PRIMARY_KEY_BC = Internal.createIndex("PRIMARY_KEY_BC", UserRole.USER_ROLE, new OrderField[] { UserRole.USER_ROLE.USER_ID, UserRole.USER_ROLE.ROLE_ID }, true);
    }
}
