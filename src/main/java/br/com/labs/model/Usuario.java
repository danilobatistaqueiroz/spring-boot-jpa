package br.com.labs.model;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@ToString
public class Usuario {

	public Usuario() {
	}
	
	@Id
	private String usuarioId;
    @Column
    private String nome;
    @Column
    private String username;
    @Column
    private String sobrenome;
    @Column
    private String documento;
    @Column
    private String email;
    @Column
	private int ativo;
	
    @Column
    @JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	

}
