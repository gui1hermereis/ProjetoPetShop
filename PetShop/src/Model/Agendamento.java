
package Model;

public class Agendamento {
    
    private Integer id;
    private String cliente;
    private String servico;
    private float valor;
    private String data;
    private String observacao;
    private String hora;

    public Agendamento(Integer id, String cliente, String servico, float valor, String data, String hora) {
        this.id = id;
        this.servico = servico;
        this.cliente = cliente;
        this.valor = valor;
        this.data= data; 
        this.hora = hora;
    }

    public Agendamento(Integer id, String cliente, String servico, float valor, String data, String hora, String observacao) {
        this(id, cliente,servico,valor,data, hora);
        this.observacao = observacao;
    }

    public Agendamento() {
       
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
