package com.madams.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pregnancy database table.
 * 
 */
@Entity
@NamedQuery(name="Pregnancy.findAll", query="SELECT p FROM Pregnancy p")
public class Pregnancy implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PregnancyPK id;

	@Column(name="cardiology_only")
	private byte cardiologyOnly;

	private int EDC_LIST_edc_id;

	@Column(name="edc_other")
	private String edcOther;

	@Column(name="egg_donor")
	private int eggDonor;

	private byte icsi;

	private byte iui;

	private byte ivf;

	@Temporal(TemporalType.DATE)
	private Date lmp;

	@Column(name="nb_babies")
	private int nbBabies;

	private byte pgd;

	private int REFERRAL_referral_id;

	private byte research;

	@Column(name="research_study")
	private String researchStudy;

	@Column(name="sperm_donor")
	private int spermDonor;

	//bi-directional many-to-one association to Father
	@ManyToOne
	private Father father;

	//bi-directional many-to-one association to Mother
	@ManyToOne
	private Mother mother;

	//bi-directional many-to-one association to Status
	@ManyToOne
	private Status status;

	public Pregnancy() {
	}

	public PregnancyPK getId() {
		return this.id;
	}

	public void setId(PregnancyPK id) {
		this.id = id;
	}

	public byte getCardiologyOnly() {
		return this.cardiologyOnly;
	}

	public void setCardiologyOnly(byte cardiologyOnly) {
		this.cardiologyOnly = cardiologyOnly;
	}

	public int getEDC_LIST_edc_id() {
		return this.EDC_LIST_edc_id;
	}

	public void setEDC_LIST_edc_id(int EDC_LIST_edc_id) {
		this.EDC_LIST_edc_id = EDC_LIST_edc_id;
	}

	public String getEdcOther() {
		return this.edcOther;
	}

	public void setEdcOther(String edcOther) {
		this.edcOther = edcOther;
	}

	public int getEggDonor() {
		return this.eggDonor;
	}

	public void setEggDonor(int eggDonor) {
		this.eggDonor = eggDonor;
	}

	public byte getIcsi() {
		return this.icsi;
	}

	public void setIcsi(byte icsi) {
		this.icsi = icsi;
	}

	public byte getIui() {
		return this.iui;
	}

	public void setIui(byte iui) {
		this.iui = iui;
	}

	public byte getIvf() {
		return this.ivf;
	}

	public void setIvf(byte ivf) {
		this.ivf = ivf;
	}

	public Date getLmp() {
		return this.lmp;
	}

	public void setLmp(Date lmp) {
		this.lmp = lmp;
	}

	public int getNbBabies() {
		return this.nbBabies;
	}

	public void setNbBabies(int nbBabies) {
		this.nbBabies = nbBabies;
	}

	public byte getPgd() {
		return this.pgd;
	}

	public void setPgd(byte pgd) {
		this.pgd = pgd;
	}

	public int getREFERRAL_referral_id() {
		return this.REFERRAL_referral_id;
	}

	public void setREFERRAL_referral_id(int REFERRAL_referral_id) {
		this.REFERRAL_referral_id = REFERRAL_referral_id;
	}

	public byte getResearch() {
		return this.research;
	}

	public void setResearch(byte research) {
		this.research = research;
	}

	public String getResearchStudy() {
		return this.researchStudy;
	}

	public void setResearchStudy(String researchStudy) {
		this.researchStudy = researchStudy;
	}

	public int getSpermDonor() {
		return this.spermDonor;
	}

	public void setSpermDonor(int spermDonor) {
		this.spermDonor = spermDonor;
	}

	public Father getFather() {
		return this.father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

	public Mother getMother() {
		return this.mother;
	}

	public void setMother(Mother mother) {
		this.mother = mother;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}