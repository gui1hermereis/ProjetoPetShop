package Model;

public class Cliente extends Pessoa {
   
    public Cliente(Integer id, String nome) {
        super(id, nome);     
    }
    
    public Cliente(Integer id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg ) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
    }

    @Override
    public String toString(){
        return getNome();
    }
}
    
