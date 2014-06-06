package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;
import scala.Int;
import scala.math.Numeric;
@Entity
@Table(name="food")
public class Food extends Model {
	@Id
	public Integer id;
	
	public Integer group_id;
	
	public String long_description;
	
	public String short_description;
	
	public String common_names;
	
	public String scientific_name;
	public String manufacturer_name; 
	
	public String survey;
	public String refuse_description;
	public Integer refuse_percent;
	public Float nitrogen_factor;
	public Float protein_factor;
	public Float fat_factor;
	public Float carbohydrate_factor;
	
}
