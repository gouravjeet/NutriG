package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;

@Entity
@Table(name="source_code")
public class SourceCode extends Model {
	@Id
	public Integer id;
	public String description;

}
