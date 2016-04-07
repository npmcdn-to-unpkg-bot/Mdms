package com.madams.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pregnancy database table.
 * 
 */
@Embeddable
public class PregnancyPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="pregnancy_id")
	private int pregnancyId;

	@Column(insertable=false, updatable=false)
	private int MOTHER_mother_id;

	public PregnancyPK() {
	}
	public int getPregnancyId() {
		return this.pregnancyId;
	}
	public void setPregnancyId(int pregnancyId) {
		this.pregnancyId = pregnancyId;
	}
	public int getMOTHER_mother_id() {
		return this.MOTHER_mother_id;
	}
	public void setMOTHER_mother_id(int MOTHER_mother_id) {
		this.MOTHER_mother_id = MOTHER_mother_id;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PregnancyPK)) {
			return false;
		}
		PregnancyPK castOther = (PregnancyPK)other;
		return 
			(this.pregnancyId == castOther.pregnancyId)
			&& (this.MOTHER_mother_id == castOther.MOTHER_mother_id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.pregnancyId;
		hash = hash * prime + this.MOTHER_mother_id;
		
		return hash;
	}
}