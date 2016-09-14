
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Atendente {

    public ArrayList<ItemProduct> pedido = new ArrayList<>();

    public void adicionarPedido(LancheBuilder lancheBuilder){
        MontadorDirector montadorDirector = new MontadorDirector(lancheBuilder);
        montadorDirector.montarItem();
        pedido.add(montadorDirector.getItem());
    }

    public void lerPedido(){
        lerSanduiche();
    }

    private void lerSanduiche(){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escolha seu sanduíche : ");
        System.out.println("0 - Hamburguer : ");
        System.out.println("1 - CheeseBurguer : ");
        try {

            String inputString = br.readLine();
            if ("0".equals(inputString)) {
                MontadorDirector montadorDirector = new MontadorDirector(new HanburguerBuilder());
                montadorDirector.montarItem();
                pedido.add(montadorDirector.getItem());
                System.out.println("Name entered : " + inputString);
                lerBatata();
            }

            if ("1".equals(inputString)) {
                MontadorDirector montadorDirector = new MontadorDirector(new CheeseburgerBuilder());
                montadorDirector.montarItem();
                pedido.add(montadorDirector.getItem());

                System.out.println("Name entered : " + inputString);
                lerBatata();
            }
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }

    private void lerBatata(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escolha sua batata : ");
        System.out.println("0 - Pequena : ");
        System.out.println("1 - Média : ");
        System.out.println("2 - Grande : ");

        try {

            String inputString = br.readLine();
            if ("0".equals(inputString)) {
                MontadorDirector montadorDirector = new MontadorDirector(new BatataPequenaBuilder());
                montadorDirector.montarItem();
                pedido.add(montadorDirector.getItem());
            }

            if ("1".equals(inputString)) {
                MontadorDirector montadorDirector = new MontadorDirector(new BatataMediaBuilder());
                montadorDirector.montarItem();
                pedido.add(montadorDirector.getItem());
            }

            if ("2".equals(inputString)) {
                MontadorDirector montadorDirector = new MontadorDirector(new BatataGrandeBuilder());
                montadorDirector.montarItem();
                pedido.add(montadorDirector.getItem());

            }

        } catch (Exception exception){
            exception.printStackTrace();
        }

    }

    private void lerBrinquedo(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escolha seu brinquedo : ");
        System.out.println("0 - Carrinho : ");
        System.out.println("1 - Bonequinha : ");

        try {
            String inputString = br.readLine();
            if ("0".equals(inputString)) {
                MontadorDirector montadorDirector = new MontadorDirector(new CarrinhoBuilder());
                montadorDirector.montarItem();
                pedido.add(montadorDirector.getItem());

                lerRefrigerante();
            }

            if ("1".equals(inputString)) {
                MontadorDirector montadorDirector = new MontadorDirector(new BonequinhaBuilder());
                montadorDirector.montarItem();
                pedido.add(montadorDirector.getItem());

                lerRefrigerante();
            }


            System.out.println("input : " + inputString);
            System.out.println("-----------\n");

        }
        catch (Exception exception) {
            exception.printStackTrace();
        }


    }

    private void lerRefrigerante(){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escolha seu refrigerante: ");
        System.out.println("0 - Coca : ");
        System.out.println("1 - Guaraná : ");
        try {
            String inputString = br.readLine();

            if ("0".equals(inputString)) {
                MontadorDirector montadorDirector = new MontadorDirector(new CocaBuilder());
                montadorDirector.montarItem();
                pedido.add(montadorDirector.getItem());
            }

            if ("1".equals(inputString)) {
                MontadorDirector montadorDirector = new MontadorDirector(new GuaranaBuilder());
                montadorDirector.montarItem();
                pedido.add(montadorDirector.getItem());
            }


            System.out.println("input : " + inputString);
            System.out.println("-----------\n");
        } catch (Exception exception){
            exception.printStackTrace();
        }


        imprimirPedido();
    }

    public void imprimirPedido(){

        for (ItemProduct itemProduct: pedido){
            System.out.println("-----------------------------------------------");
            System.out.println("Nome: " + itemProduct.nome);
            System.out.println("-----------------------------------------------");
        }
    }




}
