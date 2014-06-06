package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;
@Entity
@Table(name="food_group")
public class FoodGroup extends Model {
	@Id 
	public Integer id;
	public Integer group_code;
	public String description;
	
}
