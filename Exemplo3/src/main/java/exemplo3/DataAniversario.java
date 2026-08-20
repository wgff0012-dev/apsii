package exemplo3;

public class DataAniversario {
    private int dia;
    private int mes;

    public DataAniversario(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }
    
    // Dia
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    // Més
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
}