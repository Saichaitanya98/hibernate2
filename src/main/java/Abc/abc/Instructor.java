package Abc.abc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="youtubechannel")
	private String youtubechannel;
	@Column(name="hobbies")
	private String hobbies;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getYoutubechannel() {
		return youtubechannel;
	}
	public void setYoutubechannel(String youtubechannel) {
		this.youtubechannel = youtubechannel;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public Instructor(String youtubechannel, String hobbies) {
		super();
		this.youtubechannel = youtubechannel;
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", youtubechannel=" + youtubechannel + ", hobbies=" + hobbies + "]";
	}
	

}