package entidades;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class Modelo implements Serializable {
	public Modelo() {
	
	}
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(nullable = false,length = 11)
	
	private Integer id;
	@Basic(optional = false,fetch = FetchType.LAZY)
	private String descricao;
	@Column(nullable = true,length = 11)
	private Integer potencia;
	@Column(nullable = false,length = 11)
	@OneToMany
	@JoinColumn(name = "id")
	private List<Marca> marca_id = new ArrayList<>();
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getPotencia() {
		return potencia;
	}
	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}
	
	public List<Marca> getMarca_id() {
		return marca_id;
	}
	public void setMarca_id(List<Marca> marca_id) {
		this.marca_id = marca_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((marca_id == null) ? 0 : marca_id.hashCode());
		result = prime * result + ((potencia == null) ? 0 : potencia.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modelo other = (Modelo) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (marca_id == null) {
			if (other.marca_id != null)
				return false;
		} else if (!marca_id.equals(other.marca_id))
			return false;
		if (potencia == null) {
			if (other.potencia != null)
				return false;
		} else if (!potencia.equals(other.potencia))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Marca [id=" + id + ", descricao=" + descricao + ", potencia=" + potencia + ", marca_id=" + marca_id
				+ "]";
	}
	
	
}