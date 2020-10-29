package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
	public class Automovel implements Serializable {
		public Integer getAnoModelo() {
			return anoModelo;
		}
		public void setAnoModelo(Integer anoModelo) {
			this.anoModelo = anoModelo;
		}
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@Column(nullable = false,length = 11)
		private Integer id;
		@Column(nullable = false,length = 11)
		private Integer anoFabricação;
		@Column(nullable = false,length = 11)
		private Integer anoModelo;
		@Basic(optional = true,fetch = FetchType.LAZY)
		private String observacoes;
		@Column(nullable = false)
		private Float  preco;
		@Column(nullable = true,length = 11)
		private Integer km;
		@JoinColumn(name = "id")
		@OneToMany
	    private List<Modelo> modelo_id = new ArrayList<>();
		
		
		public Automovel() {
		
	}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getAnoFabricação() {
			return anoFabricação;
		}
		public void setAnoFabricação(Integer anoFabricação) {
			this.anoFabricação = anoFabricação;
		}
		public String getObservacoes() {
			return observacoes;
		}
		public void setObservacoes(String observacoes) {
			this.observacoes = observacoes;
		}
		public Float getPreco() {
			return preco;
		}
		public void setPreco(Float preco) {
			this.preco = preco;
		}
		public Integer getKm() {
			return km;
		}
		public void setKm(Integer km) {
			this.km = km;
		}
		
		public List<Modelo> getModelo_id() {
			return modelo_id;
		}
		public void setModelo_id(List<Modelo> modelo_id) {
			this.modelo_id = modelo_id;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((anoFabricação == null) ? 0 : anoFabricação.hashCode());
			result = prime * result + ((anoModelo == null) ? 0 : anoModelo.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((km == null) ? 0 : km.hashCode());
			result = prime * result + ((modelo_id == null) ? 0 : modelo_id.hashCode());
			result = prime * result + ((observacoes == null) ? 0 : observacoes.hashCode());
			result = prime * result + ((preco == null) ? 0 : preco.hashCode());
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
			Automovel other = (Automovel) obj;
			if (anoFabricação == null) {
				if (other.anoFabricação != null)
					return false;
			} else if (!anoFabricação.equals(other.anoFabricação))
				return false;
			if (anoModelo == null) {
				if (other.anoModelo != null)
					return false;
			} else if (!anoModelo.equals(other.anoModelo))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (km == null) {
				if (other.km != null)
					return false;
			} else if (!km.equals(other.km))
				return false;
			if (modelo_id == null) {
				if (other.modelo_id != null)
					return false;
			} else if (!modelo_id.equals(other.modelo_id))
				return false;
			if (observacoes == null) {
				if (other.observacoes != null)
					return false;
			} else if (!observacoes.equals(other.observacoes))
				return false;
			if (preco == null) {
				if (other.preco != null)
					return false;
			} else if (!preco.equals(other.preco))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Automovel [id=" + id + ", anoFabricação=" + anoFabricação + ", anoModelo=" + anoModelo
					+ ", observacoes=" + observacoes + ", preco=" + preco + ", km=" + km + ", modelo_id=" + modelo_id
					+ "]";
		}
	}

