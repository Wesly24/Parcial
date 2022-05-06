package pe.edu.upc.meetus.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="guests")
public class Guest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer G_id;
	
	@Column (name = "G_name", length = 30, nullable = false)
	private String G_name;
	@Column (name = "G_lastname", length = 30, nullable = false)
	private String G_lastname;
	@Column (name = "G_phone", length = 9, nullable = false)
	private String G_phone;
	@Column (name = "G_dni", length = 8, nullable = false)
	private String G_dni;
	@Column (name = "G_address", length = 30, nullable = false)
	private String G_address;
	@Column (name = "G_email", length = 30, nullable = false)
	private String G_email;
	@ManyToOne
	@JoinColumn(name = "meetings_id", nullable = false)
	private Meeting meeting ;
	
	
	
		

}
