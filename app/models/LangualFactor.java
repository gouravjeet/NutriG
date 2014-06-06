package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;

@Entity
@Table(name="langual_factor")
public class LangualFactor extends Model {
	
	@Id
	public Integer id;
	public String factor_code;
	public String description;
	
}
