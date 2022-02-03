public class Multa {
    private Emprestimo dataEmprestimo;
    private Emprestimo dataEntrega;

    public Multa() {
    }

    public Multa(Emprestimo dataEmprestimo, Emprestimo dataEntrega) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataEntrega = dataEntrega;
    }

    public Emprestimo getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Emprestimo dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Emprestimo getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Emprestimo dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
    
}
