import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int rg;
    private String nome;
    private String endereco;
    private Long whatsApp;
    private String email;

    private List<Eletronico> listaEletronico=new ArrayList<>();

    public  Cliente(int rg,String nome,String endereco, Long whatsApp, String email){
        this.rg=rg;
        this.nome=nome;
        this.endereco=endereco;
        this.whatsApp=whatsApp;
        this.email=email;
    }

    public Cliente() {

    }

    public void adicionarEletronico(Eletronico eletronico){
        this.listaEletronico.add(eletronico);
    }


    public  void listaEletronicos(){
        System.out.printf("Eletronicos pertecente ao cliente: %s \n",this.nome);
        for(Eletronico item:this.listaEletronico){
            System.out.println(item);
        }
    }

    public void dadosClinte(){
        System.out.printf("Nome: %s \n",this.nome);
        System.out.printf("Rg: %d \n",this.rg);
        System.out.printf("Endereço %s \n",this.endereco);
        System.out.printf("WhatsApp %d \n",this.whatsApp);
        System.out.printf("E-mail %s \n",this.email);
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getWhatsApp() {
        return whatsApp;
    }

    public void setWhatsApp(Long whatsApp) {
        this.whatsApp = whatsApp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
