package org.minioasis.library.domain.search;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.minioasis.library.domain.Binding;
import org.minioasis.library.domain.Language;
import org.minioasis.library.domain.YesNo;

public class BiblioCriteria implements Serializable {

	private static final long serialVersionUID = -5122259538801732129L;

	private String keyword1;
	private String keyword2;
	private String publisher;
	private String series;
	private Date updatedFrom;
	private Date updatedTo;
	private String note;
	
	private Set<Language> languages = new HashSet<Language>();
	private Set<Binding> bindings = new HashSet<Binding>();
	private Set<YesNo> actives = new HashSet<YesNo>();
	
	public String getKeyword1() {
		return keyword1;
	}
	public void setKeyword1(String keyword1) {
		this.keyword1 = keyword1;
	}
	public String getKeyword2() {
		return keyword2;
	}
	public void setKeyword2(String keyword2) {
		this.keyword2 = keyword2;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public Date getUpdatedFrom() {
		return updatedFrom;
	}
	public void setUpdatedFrom(Date updatedFrom) {
		this.updatedFrom = updatedFrom;
	}
	public Date getUpdatedTo() {
		return updatedTo;
	}
	public void setUpdatedTo(Date updatedTo) {
		this.updatedTo = updatedTo;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Set<Language> getLanguages() {
		return languages;
	}
	public void setLanguages(Set<Language> languages) {
		this.languages = languages;
	}
	public Set<Binding> getBindings() {
		return bindings;
	}
	public void setBindings(Set<Binding> bindings) {
		this.bindings = bindings;
	}
	public Set<YesNo> getActives() {
		return actives;
	}
	public void setActives(Set<YesNo> actives) {
		this.actives = actives;
	}
	
}
