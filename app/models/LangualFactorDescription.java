package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;

@Entity
@Table(name="food_nutrient")
public class LangualFactorDescription extends Model {
	@Id
	public Integer id;
	public Integer food_id;
	public Integer factor_id;
}
