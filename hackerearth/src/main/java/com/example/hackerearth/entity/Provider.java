package com.example.hackerearth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name="provider")
public class Provider {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @NotNull
    private long id;
	
	
	@Size(min=2, message="Name should have atleast 2 characters")
	private String name;
	
	
	private int lowest_price ;
	private float rating;
	private String max_speed ;
	private String description ;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLowest_price() {
		return lowest_price;
	}
	public void setLowest_price(int lowest_price) {
		this.lowest_price = lowest_price;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getMax_speed() {
		return max_speed;
	}
	public void setMax_speed(String max_speed) {
		this.max_speed = max_speed;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	private String contact_no ;
	private String email ;
	private String image ;
	private String url;

	
	public Provider() {
		super();
	}
	public Provider(@Size(min = 2, message = "Name should have atleast 2 characters") String name,
			int lowest_price, float rating, String max_speed, String description, String contact_no, String email,
			String image, String url) {
		super();
		
		this.name = name;
		this.lowest_price = lowest_price;
		this.rating = rating;
		this.max_speed = max_speed;
		this.description = description;
		this.contact_no = contact_no;
		this.email = email;
		this.image = image;
		this.url = url;
	}

	public Provider(long id, @Size(min = 2, message = "Name should have atleast 2 characters") String name,
			int lowest_price, float rating, String max_speed, String description, String contact_no, String email,
			String image, String url) {
		super();
		this.id = id;
		this.name = name;
		this.lowest_price = lowest_price;
		this.rating = rating;
		this.max_speed = max_speed;
		this.description = description;
		this.contact_no = contact_no;
		this.email = email;
		this.image = image;
		this.url = url;
	}
	

	
	@Override
	public String toString() {
		return "Provider [name=" + name + ", lowest_price=" + lowest_price + ", rating=" + rating + ", max_speed="
				+ max_speed + ", description=" + description + ", contact_no=" + contact_no + ", email=" + email
				+ ", image=" + image + ", url=" + url + "]";
	}
	

}
