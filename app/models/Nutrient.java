package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;

@Entity
@Table(name="nutrient")
public class Nutrient extends Model {
	@Id
	public Integer id;
	
	public String units;
	public String tagname;
	public String description;
	public Integer num_decimal;
	public Integer sort_order;
	
}
