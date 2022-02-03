public class Usuario {
    
    private String nomeUsuario;
    private String cpf;
    private String endereco;
    private String celular;
    
    
    public Usuario(){
    }
    
    public Usuario( String nomeUsuario, String cpf,
    String endereco, String celular){
        this.nomeUsuario = "";
        this.cpf = "";
        this.endereco = "";
        this.celular = "";
    }
    
    public String getNomeUsuario(){
        return nomeUsuario;
    }
    
    public void setnomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getCelular(){
        return celular;
    }
    
    public void setCelular(String celular){
        this.celular = celular;
    }
    
 }
