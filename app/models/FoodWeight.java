package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;

@Entity
@Table(name="food_weight")
public class FoodWeight extends Model {
	@Id
	public Long id;
	
	public Integer food_id;
	public Integer sequence_num;
	public Float amount;
	public String description;
	public Float gram_weight;
	
}
