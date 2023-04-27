package CaixaPOO.TesteCaixa;
import CaixaPOO.CadastroContas;
import CaixaPOO.Cliente;
import CaixaPOO.Terminal;
import CaixaPOO.Conta;


public class Main {
    public static void main(String[] args){

  
        Cliente a1 = new Cliente("001", "Aecio");
        Cliente b2 = new Cliente("002", "Marcos");
        Cliente c3 = new Cliente("003", "Osvaldo");
        Cliente d4 = new Cliente("004", "Evaldinolia");
        Conta A1 = new Conta(312, a1, 433, 900.0);
        Conta B2 = new Conta(761, b2, 757, 700.0);
        Conta C3 = new Conta(331, c3, 747, 1800.0);
        Conta D4 = new Conta(105, d4, 737, 2100.0);
        CadastroContas cadastro = new CadastroContas(4);
              
          cadastro.adicionaConta(c1);
          cadastro.adicionaConta(c2);
          cadastro.adicionaConta(c3);
          cadastro.adicionaConta(c4);
  
          Terminal bb = new Terminal(cadastro);
        
          bb.iniciaOperacao();
        
    }
}
