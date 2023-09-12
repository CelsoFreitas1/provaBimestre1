package autor;

import org.springframework.data.annotation.Id;


@Entity
@Table(name = "AUTOR")
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ID")
	private Long id;
	@Column(name = "NOME", nullable = false, length = 50)
	private String nome;
	@Column(name = "EMAIL", nullable = false, length = 50)
	private String email;
	@Column(name = "LINKEDIN", nullable = false, length = 50)
	private String linkedin;
	@Column(name = "INTAGRAM", nullable = false, length = 50)
	private String instagram;
	@Column(name = "TWITER", nullable = false, length = 50)
	private String twitter;
	@Column(name = "SUMARIO")
	private String sumário;
}
