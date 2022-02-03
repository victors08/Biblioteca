public class Emprestimo {

    private Livro livro;
    private Usuario usuario;
    private String dataEmprestimo;
    private String dataEntrega;
    
    public Emprestimo() {
    }
    
    public Emprestimo(Livro livro, Usuario usuario, String dataEmprestimo, String dataEntrega){
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = "";
        this.dataEntrega = "";
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    

}
