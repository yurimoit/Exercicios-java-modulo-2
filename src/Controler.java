
public class Controler {
    public static void main(String[] args)  {
        Cliente cliente1=new Cliente(2345678,"yuri","Rua we-09",11999245478L ,"yuri@gmail.com");
        cliente1.dadosClinte();
        String email=cliente1.getEmail();
        System.out.println(email);
        cliente1.setNome("yuri Moura");
        System.out.println(cliente1.getNome());

        Eletronico eletronico1=new Eletronico(1234L,"Aparelo de tv","Samsung","OLED",2022);
        eletronico1.dadosEletronico();

        Eletronico eletronico2=new Eletronico();
        eletronico2.setNumeroSerie(12345L);
        eletronico2.setDescricaoProduto("Celular");
        eletronico2.setFabricante("Motorola");
        eletronico2.setModelo("G20");
        eletronico2.setAno(2020);


         System.out.println("_________________________________________________________");

        cliente1.adicionarEletronico(eletronico1);
        cliente1.adicionarEletronico(eletronico2);
        cliente1.listaEletronicos();

        }
    }