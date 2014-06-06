package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;
@Entity
@Table(name="food_nutrient")
public class FoodNutrient extends Model{

	@Id
	public Integer id;
	public Integer food_id;
	public Integer nutrient_id;
	public Float value;
	public Integer derivation_code_id; 
	public Integer source_code_id;

}
