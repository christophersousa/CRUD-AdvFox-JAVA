package AdvFox.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_usuario")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String email;
    private String data_nascimento;
    private String senha;
   	
	private ArrayList <Advogados> agendamentos = new ArrayList <Advogados> ();

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public ArrayList<Advogados> getAgendamentos(){
    	return agendamentos;
    }
    
    public void setAgendamentos(Advogados advogados){
    	this.agendamentos.add(advogados);
    }
}
