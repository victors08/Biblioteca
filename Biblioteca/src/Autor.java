public class Autor {
    
    private int idAutor;
    private String nomeAutor;
    private Livro livro [];
    
    public Autor(){
    }
    
    public Autor( int idAutor, String nomeAutor, Livro livro []){
        this.idAutor = 0;
        this.nomeAutor = "";
        this.livro  = livro;
    }
    
    public int getIdAutor(){
        return idAutor;
    }
    
    public void setIdAutor(int idAutor){
        this.idAutor = idAutor;
    }
    
    public String getNomeAutor(){
        return nomeAutor;
    }
    
    public void setNomeAutor(String nomeAutor){
        this.nomeAutor = nomeAutor;
    }

    public Livro[] getLivro() {
        return livro;
    }

    public void setLivro(Livro[] livro) {
        this.livro = livro;
    }
    
}
