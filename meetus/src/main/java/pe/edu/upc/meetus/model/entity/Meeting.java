package pe.edu.upc.meetus.model.entity;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="meetings")
public class Meeting {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer M_id;
	@Column (name = "M_name", length = 30, nullable = false)
	private String M_name;
	@Column (name = "M_date")
	@Temporal(TemporalType.DATE)
	private Date M_date;
	@Column (name = "M_hour", length = 8, nullable = false)
	private String M_hour;
	@Column (name = "M_type", length = 20, nullable = false)
	private String M_type;
	@Column (name = "M_description", length = 50, nullable = false)
	private String M_description;
	@Column (name = "Local_l_id", length = 2, nullable = false)
	private String Local_l_id;
	@OneToMany(mappedBy = "meeting")
	private List<Guest>guests;
	@OneToMany(mappedBy = "meeting")
	private List<Suggestion>suggestions;
	
	
	
}
