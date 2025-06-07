//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Produto produtos = new Produto();

        produtos.nome ="Placa mãe";
        produtos.quantidade = 37;
        produtos.preco =  780.99;

  produtos.adicionaProduto(10);
  produtos.adicionaProduto(37);
  produtos.adicionaProduto(57);


Student student = new Student();
student.name = "pedro";
student.grade1 = 4.5;
student.grade2 = 7.5;

Student student1 = new Student();
student1.name = "silva";
student1.grade1=9.5;
student1.grade2 =7.5;

System.out.println();
System.out.println();



Bond bond = new Bond();
bond.name= "Tesouro direto";
bond.balance= 20000.00;

        bond.buyBond(24);
        bond.simulateInterest();


    }

}