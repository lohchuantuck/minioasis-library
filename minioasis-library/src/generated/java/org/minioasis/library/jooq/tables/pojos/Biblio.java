/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.pojos;


import java.io.Serializable;
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
public class Biblio implements Serializable {

    private static final long serialVersionUID = -1749973994;

    private Long      id;
    private String    active;
    private String    author;
    private String    biblioType;
    private String    binding;
    private String    classMark;
    private String    description;
    private String    edition;
    private String    isbn;
    private String    coden;
    private String    issn;
    private String    language;
    private String    note;
    private Integer   pages;
    private String    publicationPlace;
    private Integer   publishingYear;
    private String    topic;
    private String    title;
    private Timestamp updated;
    private Long      imageId;
    private Long      publisherId;
    private Long      seriesId;

    public Biblio() {}

    public Biblio(Biblio value) {
        this.id = value.id;
        this.active = value.active;
        this.author = value.author;
        this.biblioType = value.biblioType;
        this.binding = value.binding;
        this.classMark = value.classMark;
        this.description = value.description;
        this.edition = value.edition;
        this.isbn = value.isbn;
        this.coden = value.coden;
        this.issn = value.issn;
        this.language = value.language;
        this.note = value.note;
        this.pages = value.pages;
        this.publicationPlace = value.publicationPlace;
        this.publishingYear = value.publishingYear;
        this.topic = value.topic;
        this.title = value.title;
        this.updated = value.updated;
        this.imageId = value.imageId;
        this.publisherId = value.publisherId;
        this.seriesId = value.seriesId;
    }

    public Biblio(
        Long      id,
        String    active,
        String    author,
        String    biblioType,
        String    binding,
        String    classMark,
        String    description,
        String    edition,
        String    isbn,
        String    coden,
        String    issn,
        String    language,
        String    note,
        Integer   pages,
        String    publicationPlace,
        Integer   publishingYear,
        String    topic,
        String    title,
        Timestamp updated,
        Long      imageId,
        Long      publisherId,
        Long      seriesId
    ) {
        this.id = id;
        this.active = active;
        this.author = author;
        this.biblioType = biblioType;
        this.binding = binding;
        this.classMark = classMark;
        this.description = description;
        this.edition = edition;
        this.isbn = isbn;
        this.coden = coden;
        this.issn = issn;
        this.language = language;
        this.note = note;
        this.pages = pages;
        this.publicationPlace = publicationPlace;
        this.publishingYear = publishingYear;
        this.topic = topic;
        this.title = title;
        this.updated = updated;
        this.imageId = imageId;
        this.publisherId = publisherId;
        this.seriesId = seriesId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActive() {
        return this.active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBiblioType() {
        return this.biblioType;
    }

    public void setBiblioType(String biblioType) {
        this.biblioType = biblioType;
    }

    public String getBinding() {
        return this.binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getClassMark() {
        return this.classMark;
    }

    public void setClassMark(String classMark) {
        this.classMark = classMark;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEdition() {
        return this.edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCoden() {
        return this.coden;
    }

    public void setCoden(String coden) {
        this.coden = coden;
    }

    public String getIssn() {
        return this.issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getPages() {
        return this.pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getPublicationPlace() {
        return this.publicationPlace;
    }

    public void setPublicationPlace(String publicationPlace) {
        this.publicationPlace = publicationPlace;
    }

    public Integer getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(Integer publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getUpdated() {
        return this.updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    public Long getImageId() {
        return this.imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Long getPublisherId() {
        return this.publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public Long getSeriesId() {
        return this.seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Biblio (");

        sb.append(id);
        sb.append(", ").append(active);
        sb.append(", ").append(author);
        sb.append(", ").append(biblioType);
        sb.append(", ").append(binding);
        sb.append(", ").append(classMark);
        sb.append(", ").append(description);
        sb.append(", ").append(edition);
        sb.append(", ").append(isbn);
        sb.append(", ").append(coden);
        sb.append(", ").append(issn);
        sb.append(", ").append(language);
        sb.append(", ").append(note);
        sb.append(", ").append(pages);
        sb.append(", ").append(publicationPlace);
        sb.append(", ").append(publishingYear);
        sb.append(", ").append(topic);
        sb.append(", ").append(title);
        sb.append(", ").append(updated);
        sb.append(", ").append(imageId);
        sb.append(", ").append(publisherId);
        sb.append(", ").append(seriesId);

        sb.append(")");
        return sb.toString();
    }
}
