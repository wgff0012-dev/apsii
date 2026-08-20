package exemplo3;

public class Aniversariante {
    private String nome;
    private DataAniversario dataAniversario;

    public Aniversariante(String nome, DataAniversario dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }
    
    // Nome do aniversariante
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // data de aniversario
    public DataAniversario getDataAniversario() {
        return dataAniversario;
    }
    public void setDataAniversario(DataAniversario dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
}