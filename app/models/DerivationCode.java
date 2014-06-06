package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;
@Entity
@Table(name="derivation_code")
public class DerivationCode extends Model{
	
	@Id
	public Integer id;
	public String code;
	public String description;
}
