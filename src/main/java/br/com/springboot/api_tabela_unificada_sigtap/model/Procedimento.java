package br.com.springboot.api_tabela_unificada_sigtap.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq_procedimento", sequenceName = "seq_procedimento", allocationSize = 1, initialValue = 1)
public class Procedimento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_procedimento")
	private Long id;
	
	private String codigoProcedimento;
	private String nomeProcedimento;
	private String complexidadeProcedimento;
	private String sexoPaciente;
	private String quantidadeMaxima;
	private String diasPermanencia;
	private String pontos;
	private String idadeMinima;
	private String idadeMaxima;
	private String valorServicoHospitalar;
	private String valorServicoAmbulatorio;
	private String valorServicoProfissional;
	private String codFinanciamento;
	private String codRubrica;
	private String tempoPermanencia;
	private String competencia;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigoProcedimento() {
		return codigoProcedimento;
	}
	public void setCodigoProcedimento(String codigoProcedimento) {
		this.codigoProcedimento = codigoProcedimento;
	}
	public String getNomeProcedimento() {
		return nomeProcedimento;
	}
	public void setNomeProcedimento(String nomeProcedimento) {
		this.nomeProcedimento = nomeProcedimento;
	}
	public String getComplexidadeProcedimento() {
		return complexidadeProcedimento;
	}
	public void setComplexidadeProcedimento(String complexidadeProcedimento) {
		this.complexidadeProcedimento = complexidadeProcedimento;
	}
	public String getSexoPaciente() {
		return sexoPaciente;
	}
	public void setSexoPaciente(String sexoPaciente) {
		this.sexoPaciente = sexoPaciente;
	}
	public String getQuantidadeMaxima() {
		return quantidadeMaxima;
	}
	public void setQuantidadeMaxima(String quantidadeMaxima) {
		this.quantidadeMaxima = quantidadeMaxima;
	}
	public String getDiasPermanencia() {
		return diasPermanencia;
	}
	public void setDiasPermanencia(String diasPermanencia) {
		this.diasPermanencia = diasPermanencia;
	}
	public String getPontos() {
		return pontos;
	}
	public void setPontos(String pontos) {
		this.pontos = pontos;
	}
	public String getIdadeMinima() {
		return idadeMinima;
	}
	public void setIdadeMinima(String idadeMinima) {
		this.idadeMinima = idadeMinima;
	}
	public String getIdadeMaxima() {
		return idadeMaxima;
	}
	public void setIdadeMaxima(String idadeMaxima) {
		this.idadeMaxima = idadeMaxima;
	}
	public String getValorServicoHospitalar() {
		return valorServicoHospitalar;
	}
	public void setValorServicoHospitalar(String valorServicoHospitalar) {
		this.valorServicoHospitalar = valorServicoHospitalar;
	}
	public String getValorServicoAmbulatorio() {
		return valorServicoAmbulatorio;
	}
	public void setValorServicoAmbulatorio(String valorServicoAmbulatorio) {
		this.valorServicoAmbulatorio = valorServicoAmbulatorio;
	}
	public String getValorServicoProfissional() {
		return valorServicoProfissional;
	}
	public void setValorServicoProfissional(String valorServicoProfissional) {
		this.valorServicoProfissional = valorServicoProfissional;
	}
	public String getCodFinanciamento() {
		return codFinanciamento;
	}
	public void setCodFinanciamento(String codFinanciamento) {
		this.codFinanciamento = codFinanciamento;
	}
	public String getCodRubrica() {
		return codRubrica;
	}
	public void setCodRubrica(String codRubrica) {
		this.codRubrica = codRubrica;
	}
	public String getTempoPermanencia() {
		return tempoPermanencia;
	}
	public void setTempoPermanencia(String tempoPermanencia) {
		this.tempoPermanencia = tempoPermanencia;
	}
	public String getCompetencia() {
		return competencia;
	}
	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}
	
	
	
}
