public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public void adicionaProduto (int novoProduto){
         quantidade += novoProduto;
    }
    public void verderProdutos ( int vendaDeProdutos){
        if (vendaDeProdutos>quantidade){
            System.out.println("Estoque insuficiente/ Estoque atual" +quantidade);
        }
        else{
            quantidade -=vendaDeProdutos;
            System.out.println(vendaDeProdutos + "Unidades vendidas. Estoque restantes:"+ quantidade);
        }
    }









}

