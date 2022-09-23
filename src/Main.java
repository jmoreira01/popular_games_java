import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();
    //Euromilhões
    static List<Chave> listaChaves;
    static int calc=1;
    static int contest = 0, contnum = 0;

    //Saco
    static List<Ouvinte> listaOuvintes;


    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        listaChaves = new ArrayList<>();
        listaOuvintes = new ArrayList<>();

        Arcade();



    }

    private static void Arcade() throws InstantiationException, IllegalAccessException {
        Scanner nn = new Scanner(System.in);

        System.out.println("********************************************");
        System.out.println("*                                          *");
        System.out.println("*     sssss    ooooo    jjjjj    ooooo     *");
        System.out.println("*     s        o   o        j    o   o     *");
        System.out.println("*     sssss    o   o        j    o   o     *");
        System.out.println("*         s    o   o    j   j    o   o     *");
        System.out.println("*     sssss    ooooo     jjj     ooooo     *");
        System.out.println("*                                          *");
        System.out.println("*                SOJO ARCADE               *");
        System.out.println("*                                          *");
        System.out.println("*     1 - EUROMILHÕES                      *");
        System.out.println("*     2 - JOGO DO 21                       *");
        System.out.println("*     3 - JOGO DO SACO                     *");
        System.out.println("*     0 - SAIR                             *");
        System.out.println("*                                          *");
        System.out.println("********************************************");
        int arc = nn.nextInt();
        switch (arc){
            case 0:{
                break;
            }
            case 1:{
                Euromilhoes();
                break;
            }
            case 2:{
                JogoDoVinteUm();
                break;
            }
            case 3:{
                JogoDoSaco();
                break;
            }
            default:{
                System.out.println("Opção inválida, por favor tente novamente");
                return;
            }

        }
    }

    private static void JogoDoSaco() {
        InicializarOuvintes();
        System.out.println("Bem vindo ao jogo do saco!");


        MenuPrincipalSaco();
    }

    private static void InicializarOuvintes() {
        listaOuvintes.add(new Ouvinte("Anabela", "Malhadas"));
        listaOuvintes.add(new Ouvinte("João", "Paitorto"));
        listaOuvintes.add(new Ouvinte("Natércio", "Meixomil"));
        listaOuvintes.add(new Ouvinte("Adalberto", "Penamaior"));
        listaOuvintes.add(new Ouvinte("Otília", "Serzedo"));
        listaOuvintes.add(new Ouvinte("Milu", "Grijó"));
        listaOuvintes.add(new Ouvinte("Laurentina", "Fontaínhas"));
        listaOuvintes.add(new Ouvinte("Adão", "Canelas"));
    }

    private static void MenuPrincipalSaco() {

        System.out.println("Por favor escolha a sua opção");
        System.out.println("1 - Criar, editar e eliminar ouvintes");
        System.out.println("2 - Ver dados de um ouvinte");
        System.out.println("3 - Ver ranking de ouvintes");
        System.out.println("4 - Jogar");
        System.out.println("5 - Regras");
        System.out.println("0 - Sair");
        int op = in.nextInt();

        switch (op) {
            case 0: {
                System.out.println("Programa interrompido a seu pedido");
                break;
            }
            case 1: {
                MexerOuvintes();
                break;
            }
            case 2: {
                VerDadosOuvinte();
                break;
            }
            case 3: {
                VerRanking();
                break;
            }
            case 4: {
                JogarSaco();
                break;
            }
            case 5: {
                System.out.println("O \"Jogo do Saco\", programa da Rádio Brigantia, em Bragança, apresentado pelo locutor\n" +
                        "        // Sidónio Costa, era, diariamente, pedido aos ouvintes que acertassem o peso de um\n" +
                        "        // saco com alguma coisa dentro. Em cada programa era dada aos ouvintes uma margem de 150g\n" +
                        "        // (ex.: entre 4,200kg e 4,350kg) para acertarem no peso do saco.");
                MenuPrincipalSaco();
                break;
            }
        }


    }

    private static void VerDadosOuvinte() {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor seleccione qual o ouvinte que deseja consultar:");
        OuvinteIdNome();
        int ver = in.nextInt();

        System.out.println(listaOuvintes.get(ver - 1) + " e tem " + listaOuvintes.get(ver - 1).getRanking() + " pontos!");

        MenuFimSaco();

    }

    private static void MexerOuvintes() {
        //        System.out.println("1 - Criar, editar e eliminar ouvintes");

        System.out.println("Por favor indique o que pretende:");
        System.out.println("1 - Criar novo ouvinte");
        System.out.println("2 - Editar ouvinte existente");
        System.out.println("3 - Eliminar ouvinte");
        System.out.println("4 - Voltar ao menu anterior");
        System.out.println("5 - Ver lista de Ouvintes");
        System.out.println("0 - Sair");
        int op = in.nextInt();
        switch (op) {
            case 0: {
                System.out.println("Programa interrompido a seu pedido");
                break;
            }
            case 1: {
                CriarOuvinte();
                break;
            }
            case 2: {
                EditarOuvinte();
                break;
            }
            case 3: {
                EliminarOuvinte();
                break;
            }
            case 4: {
                MenuPrincipalSaco();
                break;
            }
            case 5: {
                VerOuvintes();
                break;
            }
        }


        MenuFimSaco();
    }

    private static void EliminarOuvinte() {

        Scanner in = new Scanner(System.in);
        System.out.println("Usando o numero por favor indique qual o ouvinte que deseja eliminar:");
        /*OuvinteIdNome();*/

//talvez tentar adicioanr antes

        OuvinteIdNome();

        int eliminar = in.nextInt();

        int ind = eliminar - 1;

        listaOuvintes.remove(ind);


        System.out.println("Ouvinte removido com sucesso");

        MenuFimSaco();

    }

    private static void OuvinteIdNome() {
        for (int i = 0; i < listaOuvintes.size(); i++) {
            System.out.println((i + 1) + " - " + listaOuvintes.get(i).getNome());
        }

    }


    private static void EditarOuvinte() {

        Scanner in = new Scanner(System.in);
        System.out.println("Usando o numero por favor indique qual o ouvinte que deseja editar:");

        OuvinteIdNome();

        int editar = in.nextInt();

        int ind = editar - 1;

        System.out.println(listaOuvintes.get(ind));

        System.out.println("Por favor indique o que deseja editar");
        System.out.println("1 - Nome");
        System.out.println("2 - Localidade");
        System.out.println("3 - Voltar menu anterior");
        System.out.println("0 - Sair");
        int ed = in.nextInt();

        switch (ed) {
            case 0: {
                System.out.println("Programa interrompido a seu pedido");
                break;
            }
            case 1: {
                Scanner on = new Scanner(System.in);
                System.out.println("Por favor indique o novo nome");
                String novonome = on.nextLine();
                listaOuvintes.get(ind).setNome(novonome);
                System.out.println(listaOuvintes.get(ind));
            }
            case 2: {
                Scanner un = new Scanner(System.in);
                System.out.println("Por favor indique a nova localidade");
                String novolocal = un.nextLine();
                listaOuvintes.get(ind).setLocalidade(novolocal);
                System.out.println(listaOuvintes.get(ind));
            }
            case 3:
                MexerOuvintes();

            default: {
                System.out.println("Opção inválida, tente novamente");
                MexerOuvintes();
            }


        }


    }

    private static void CriarOuvinte() {

        Scanner in = new Scanner(System.in);

        System.out.println("Qual o nome do novo ouvinte?");
        String nome = in.nextLine();

        in = new Scanner(System.in);
        System.out.println("Qual a localidade do novo ouvinte?");
        String localidade = in.nextLine();

        listaOuvintes.add(new Ouvinte(nome, localidade));

        System.out.println("Ouvinte criado com sucesso");
        System.out.println("Pretende adicionar novo ouvinte?");
        System.out.println("1-Sim");
        System.out.println("0-Não");
        in = new Scanner(System.in);
        int op = in.nextInt();

        if (op == 1)
            CriarOuvinte();
        else
            MenuFimSaco();

    }


    private static void MenuFimSaco() {
        System.out.println(" ");
        System.out.println("Deseja voltar ao Menu Principal? (Sim(1) ou Não(0)");
        int op = in.nextInt();
        switch (op) {
            case 0:
                System.out.println("System Out!");
                break;
            case 1:
                MenuPrincipalSaco();
                break;
            default: {
                System.out.println("Opção Inválida. Tente novamente!");
            }
        }
    }

    private static void VerOuvintes() {

        for (int i = 0; i < listaOuvintes.size(); i++) {
            System.out.println(listaOuvintes.get(i));
        }


    }

    private static void VerRanking() {


        for (int i = 0; i < listaOuvintes.size(); i++) {

            System.out.println(listaOuvintes.get(i) + " jogou " + listaOuvintes.get(i).getJogos() + " vezes e venceu " + listaOuvintes.get(i).getRanking() + " vezes.");
        }

        MenuFimSaco();

    }

    private static void JogarSaco() {
/*
        List<Person> list = new ArrayList<Person>(); // Create the list
        list.add(new Person()); // Add the person to the list

        list.get(0); // Returns the person you added*/

        Random rnd = new Random();

        //1- escolher um valor aleatorio entre 100g e 10 kg-10000g
        int n1 = rnd.nextInt(1, 10000);

        //2- ver o limite inferior e o superior
        int liminf = n1 - 75;
        int limsup = n1 + 75;

        //3- valor aleatório dentro desse limite
        int saco = rnd.nextInt(liminf, limsup);
        System.out.println("O saco tem entre "+liminf+" e "+limsup+" gramas");

        //4- ir buscar x ouvintes+dar est+dar valor
        int jogadores = rnd.nextInt(1, ((listaOuvintes.size() / 2)+1));

        for (int i = 0; i < jogadores; i++) {
            int ouvinte = rnd.nextInt(0, listaOuvintes.size());
            listaOuvintes.get(ouvinte).setEstimativa(rnd.nextInt(liminf, limsup));
            System.out.println("A estimativa de " + listaOuvintes.get(ouvinte).getNome() + " de " + listaOuvintes.get(ouvinte).getLocalidade() + " é de " + listaOuvintes.get(ouvinte).getEstimativa() + " gramas.");
            int dif = Math.abs(saco-listaOuvintes.get(ouvinte).getEstimativa());
            listaOuvintes.get(ouvinte).setJogos(listaOuvintes.get(ouvinte).getJogos()+1);
            listaOuvintes.get(ouvinte).setEstimativa(dif);
        }

        //7- ver o vencedor
        Collections.sort(listaOuvintes);
        listaOuvintes.get(0).setRanking(listaOuvintes.get(0).getRanking()+1);

        System.out.println("O saco pesa "+saco+" gramas");
        System.out.println("O vencedor deste jogo é "+listaOuvintes.get(0).getNome()+" de "+listaOuvintes.get(0).getLocalidade());



        //voltar a colocar a estimativa a 200

        for (int i = 0; i < jogadores; i++) {
            listaOuvintes.get(i).setEstimativa(200);
        }

        MenuFimSaco();
    }



    private static void Euromilhoes() throws InstantiationException, IllegalAccessException { MenuPrincipal();
    }
    private static void MenuPrincipal() throws InstantiationException, IllegalAccessException {

        System.out.println("Bem vindo ao Euromilhões!");
        System.out.println("Por favor seleccione uma opção:");
        System.out.println("1 - Simular sorteio");
        System.out.println("2 - Inserir boletins + sorteio");
        System.out.println("3 - Boletins aleatórios + sorteio");
        System.out.println("4 - Quanto para vencer?");
        System.out.println("0 - Sair");

        int op = in.nextInt();
        switch (op) {
            case 0: {
                System.out.println("Operação interrompida por sua ordem");
                Arcade();
            }
            case 1:
                SimularSorteio();
                break;
            case 2:
                InserirBoletim();
                break;
            case 3:
                BoletimAleatorio();
                break;
            case 4:
                Vencer();
                break;
            default: {
                System.out.println("Opcao Invalida. Tente novamente!");
                MenuPrincipal();
            }
        }

    }
    private static void MenuFimFuncao() throws InstantiationException, IllegalAccessException {
        System.out.println(" ");
        System.out.println("Deseja voltar ao Menu Principal? (Sim(1) ou Não(0)");
        int op = in.nextInt();
        switch (op) {
            case 0:
                System.out.println("System Out!");
                break;
            case 1:
                MenuPrincipal();
                break;
            default: {
                System.out.println("Opcao Invalida. Tente novamente!");
            }
        }


    }
    private static void GerarChave() {

        int[] sorteionum = new int[5];
        int[] sorteioest = new int[2];


        //ir buscar 50 nums e baralhá-los
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};

        List<Integer> intList = Arrays.asList(intArray);

        Collections.shuffle(intList);

        intList.toArray(intArray);

        //ir buscar prim 5 depois de desordenado
        for (int i = 0; i < 5; i++) {
            sorteionum[i] = intArray[i];
        }
        Arrays.sort(sorteionum);


        for (int i = 0; i < 2; i++) {
            Random rnd = new Random();
            sorteioest[i] = rnd.nextInt(1, 12);
        }
        Arrays.sort(sorteioest);
        if (sorteioest[0] == sorteioest[1]) {
            if (sorteioest[1] < 11)
                sorteioest[1] = (sorteioest[1]) + 1;
            else {
                sorteioest[0] = 10;
            }
        }

        listaChaves.add(new Chave(sorteionum, sorteioest));


        //System.out.println("Chave: Números- "+Arrays.toString(sorteionum)+ " // Estrelas- "+Arrays.toString(sorteioest));

    }
    private static void SimularSorteio() throws InstantiationException, IllegalAccessException {

        GerarChave();

        System.out.println(listaChaves.get(0));

        //limpeza de chaves

        listaChaves.remove(0);
        MenuFimFuncao();

    }
    private static void InserirChave() throws InstantiationException, IllegalAccessException {

        int[] sorteionum = new int[5];
        int[] sorteioest = new int[2];

        System.out.println("*----*----* Números *----*----*");
        for (int i = 0; i < 5; i++) {
            System.out.println("Por favor insira um número (1 a 50) para adicionar à chave");
            int num = in.nextInt();


            //validar que numero está dentro dos parâmetros

            while (num <= 0 || num >= 51) {
                System.out.println("O número não está compreendido entre 1 e 50 inclusivé, por favor insira um número válido");
                num = in.nextInt();
            }

            //Certificar que não há numeros repetidos
            if (i == 1) {
                Scanner in = new Scanner(System.in);
                while (num == sorteionum[0])
                    System.out.println("Número já inserido anteriormente, por favor tente novamente");
                num = in.nextInt();
            } else if (i == 2) {
                Scanner in = new Scanner(System.in);
                while (num == sorteionum[0] || num == sorteionum[1])
                    System.out.println("Número já inserido anteriormente, por favor tente novamente");
                num = in.nextInt();
            } else if (i == 3) {
                Scanner in = new Scanner(System.in);
                while (num == sorteionum[0] || num == sorteionum[1] || num == sorteionum[2])
                    System.out.println("Número já inserido anteriormente, por favor tente novamente");
                num = in.nextInt();
            } else if (i == 4) {
                Scanner in = new Scanner(System.in);
                while (num == sorteionum[0] || num == sorteionum[1] || num == sorteionum[2] || num == sorteionum[3])
                    System.out.println("Número já inserido anteriormente, por favor tente novamente");
                num = in.nextInt();
            }


            sorteionum[i] = num;
        }
        Arrays.sort(sorteionum);

        System.out.println("*----*----* Estrelas *----*----*");
        for (int i = 0; i < 2; i++) {
            System.out.println("Por favor insira uma estrela (1 a 11) para adicionar à chave");
            int est = in.nextInt();

            while (est <= 0 || est >= 12) {
                System.out.println("O número não está compreendido entre 1 e 11 inclusivé, por favor insira um número válido");
                est = in.nextInt();
            }
            sorteioest[i] = est;
        }
        Arrays.sort(sorteioest);

        listaChaves.add(new Chave(sorteionum, sorteioest));

    }
    private static void CalculoPremio() {

        for (int i = 0; i < 5; i++) {
            if(listaChaves.get(0).getNumeros(i)==listaChaves.get(calc).getNumeros(i)){
                contnum=contnum+1;
            }
        }
        /*comparar numeros das 2 chaves

        if (listaChaves.get(0).getNumeros(0) == listaChaves.get(calc).getNumeros(0) || listaChaves.get(0).getNumeros(0) == listaChaves.get(calc).getNumeros(1) || listaChaves.get(0).getNumeros(0) == listaChaves.get(calc).getNumeros(2) || listaChaves.get(0).getNumeros(0) == listaChaves.get(calc).getNumeros(3) || listaChaves.get(0).getNumeros(0) == listaChaves.get(calc).getNumeros(4)) {
            contnum = contnum + 1;
        }
        if (listaChaves.get(0).getNumeros(1) == listaChaves.get(calc).getNumeros(0) || listaChaves.get(0).getNumeros(1) == listaChaves.get(calc).getNumeros(1) || listaChaves.get(0).getNumeros(1) == listaChaves.get(calc).getNumeros(2) || listaChaves.get(0).getNumeros(1) == listaChaves.get(calc).getNumeros(3) || listaChaves.get(0).getNumeros(1) == listaChaves.get(calc).getNumeros(4)) {
            contnum = contnum + 1;
        }
        if (listaChaves.get(0).getNumeros(2) == listaChaves.get(calc).getNumeros(0) || listaChaves.get(0).getNumeros(2) == listaChaves.get(calc).getNumeros(1) || listaChaves.get(0).getNumeros(2) == listaChaves.get(calc).getNumeros(2) || listaChaves.get(0).getNumeros(2) == listaChaves.get(calc).getNumeros(3) || listaChaves.get(0).getNumeros(2) == listaChaves.get(calc).getNumeros(4)) {
            contnum = contnum + 1;
        }
        if (listaChaves.get(0).getNumeros(3) == listaChaves.get(calc).getNumeros(0) || listaChaves.get(0).getNumeros(3) == listaChaves.get(calc).getNumeros(1) || listaChaves.get(0).getNumeros(3) == listaChaves.get(calc).getNumeros(2) || listaChaves.get(0).getNumeros(3) == listaChaves.get(calc).getNumeros(3) || listaChaves.get(0).getNumeros(3) == listaChaves.get(calc).getNumeros(4)) {
            contnum = contnum + 1;
        }
        if (listaChaves.get(0).getNumeros(4) == listaChaves.get(calc).getNumeros(0) || listaChaves.get(0).getNumeros(4) == listaChaves.get(calc).getNumeros(1) || listaChaves.get(0).getNumeros(4) == listaChaves.get(calc).getNumeros(2) || listaChaves.get(0).getNumeros(4) == listaChaves.get(calc).getNumeros(3) || listaChaves.get(0).getNumeros(4) == listaChaves.get(calc).getNumeros(4)) {
            contnum = contnum + 1;
        }*/
        for (int i = 0; i < 2; i++) {
            if(listaChaves.get(0).getNumeros(1)==listaChaves.get(calc).getNumeros(i)){
                contest=contest+1;
            }
        }
        /*comparar estrelas das duas chaves
        if (listaChaves.get(0).getEstrelas(0) == listaChaves.get(calc).getEstrelas(0) || listaChaves.get(0).getEstrelas(0) == listaChaves.get(calc).getEstrelas(1)) {
            contest = contest + 1;
        }
        if (listaChaves.get(0).getEstrelas(1) == listaChaves.get(calc).getEstrelas(0) || listaChaves.get(0).getEstrelas(1) == listaChaves.get(calc).getEstrelas(1)) {
            contest = contest + 1;
        }*/


        //    1.º Prémio 5 Números + 2 Estrelas
        if (listaChaves.get(0) == listaChaves.get(calc)) {
            System.out.println("primeiro premio");
        }

        //    2.º Prémio 5 Números + 1 Estrela
        else if (contnum == 5 && contest == 1) {
            System.out.println("segundo prémio");
        }

        //    3.º Prémio 5 Números + 0 Estrelas
        else if (contnum == 5 && contest == 0) {
            System.out.println("terceiro prémio");
        }

        //    4.º Prémio 4 Números + 2 Estrelas
        else if (contnum == 4 && contest == 2) {
            System.out.println("terceiro prémio");
        }

        //    5.º Prémio 4 Números + 1 Estrela
        else if (contnum == 4 && contest == 1) {
            System.out.println("terceiro prémio");
        }

        //    6.º Prémio 3 Números + 2 Estrelas
        else if (contnum == 3 && contest == 2) {
            System.out.println("terceiro prémio");
        }

        //    7.º Prémio 4 Números + 0 Estrelas
        else if (contnum == 4 && contest == 0) {
            System.out.println("terceiro prémio");
        }

        //    8.º Prémio 2 Números + 2 Estrelas
        else if (contnum == 2 && contest == 2) {
            System.out.println("terceiro prémio");
        }

        //    9.º Prémio 3 Números + 1 Estrela
        else if (contnum == 3 && contest == 1) {
            System.out.println("terceiro prémio");
        }

        //    10.º Prémio 3 Números + 0 Estrelas
        else if (contnum == 3 && contest == 0) {
            System.out.println("terceiro prémio");
        }

        //    11.º Prémio 1 Número + 2 Estrelas
        else if (contnum == 1 && contest == 2) {
            System.out.println("terceiro prémio");
        }

        //    12.º Prémio 2 Números + 1 Estrela
        else if (contnum == 2 && contest == 1) {
            System.out.println("terceiro prémio");
        }

        //    13.º Prémio 2 Números + 0 Estrelas
        else if (contnum == 2 && contest == 0) {
            System.out.println("terceiro prémio");
        }

        else{
            System.out.println("sem prémio");
        }


    }
    private static void InserirBoletim ()throws InstantiationException, IllegalAccessException {

        System.out.println("Por favor indique quantas chaves deseja criar (máximo 5): ");
        int chaves = in.nextInt();

        if (chaves > 0 && chaves < 6) {

            GerarChave();


            for (int i = 0; i < chaves; i++) {
                System.out.println("Por favor insira a " + (i + 1) + "ª chave:");
                InserirChave();
            }

            System.out.println("*----*----*----* Chaves inserida *----*----*----*");
            for (int i = 0; i < chaves; i++) {
                System.out.println(listaChaves.get(i + 1));
            }

            System.out.println("*----*----*----* Chave sorteada *----*----*----*");
            System.out.println(listaChaves.get(0));

            //calcular o prémio de cada chave
            for (int i = 0; i < chaves; i++) {
                calc = i + 1;
                System.out.println("*----*----* "+listaChaves.get(i + 1)+" *----*----*");
                CalculoPremio();
            }

            //limpeza de chaves
            for (int i = 0; i < listaChaves.size(); i++) {
                listaChaves.remove(i);
            }

            MenuFimFuncao();

        } else {
            System.out.println("Numero invalido. Por favor tente novamente");
            InserirBoletim();
        }


    }
    private static void BoletimAleatorio ()throws InstantiationException, IllegalAccessException {

        System.out.println("Por favor indique quantas chaves deseja criar (máximo 5): ");
        int chaves = in.nextInt();

        if (chaves > 0 && chaves < 6) {

            GerarChave();
            System.out.println("*----*----*----* Chave gerada *----*----*----*");
            for (int i = 0; i < chaves; i++) {
                GerarChave();
                System.out.println(listaChaves.get(i + 1));

            }

            System.out.println("*----*----*----* Chave sorteada *----*----*----*");
            System.out.println(listaChaves.get(0));

            //calcular o prémio de cada chave
            for (int i = 0; i < chaves; i++) {
                calc = i + 1;
                System.out.println("*----*----* "+listaChaves.get(i + 1)+" *----*----*");
                CalculoPremio();
            }

            //limpeza de chaves
            for (int i = 0; i < listaChaves.size(); i++) {
                listaChaves.remove(i);
            }

            MenuFimFuncao();

        } else {
            System.out.println("Numero invalido. Por favor tente novamente");
        }

    }
    private static void Vencer () {
        int calc = 1;
        GerarChave();
        System.out.println("*----*----* Chave Vencedora *----*----*");
        System.out.println(listaChaves.get(0));
        System.out.println(" \n ");
        GerarChave();

        while (listaChaves.get(0)!=listaChaves.get(calc)) {
            System.out.println("Tentativa número: " + calc + "  // Chave: " + listaChaves.get(calc));
            calc = calc + 1;
            GerarChave();
        }
        System.out.println("Foram necesárias " + calc + "tentativas para conseguir o primeiro prémio!");

    }

    private static void MenuPrincipal21() {
        System.out.println("Bem vindo ao jogo dos 21!");
        System.out.println("Por favor seleccione a opção de jogo pretendida:");
        System.out.println("1 - Dois Jogadores");
        System.out.println("2 - Jogar contra o computador (com inteligência)");
        System.out.println("3 - Jogar contra o computador (sem inteligência)");
        System.out.println("4 - Regras e Objectivo");
        System.out.println("0 - Sair");
        int op = in.nextInt();

        switch (op) {
            case 0: {
                System.out.println("Programa interrompido a seu predido");
                break;
            }
            case 1: {
                Jogo2Jogadores();
                break;
            }
            case 2: {
                JogoCompInt();
                break;
            }
            case 3: {
                JogoCompDesint();
                break;
            }
            case 4: {
                System.out.println("O jogo dos 21 fósforos! \n " +
                        "Começa com 21 fósforos e coloca dois oponentes a retirar fósforos, à vez, até sobrar o último.\n" +
                        "Quem ficar com o último fósforo perde. \n " +
                        "Em cada jogada é possível retirar 1, 2, 3 ou 4 fósforos. \n" +
                        "Boas jogadas!");
                break;
            }


        }

    }
    private static void JogoDoVinteUm() {
        MenuPrincipal21();
    }
    private static void Jogo2Jogadores() {
        //1. Dois jogadores humanos;
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor insira o nome do primeiro jogador");
        String nome1 = in.nextLine();
        System.out.println("Por favor insira o nome do segundo jogador");
        String nome2 = in.nextLine();
        String vencedor = "";

        int rest = 21, jog1, jog2;

        while (rest != 1) {
            System.out.println(nome1 + " pode Jogar");
            jog1 = in.nextInt();
            while (jog1 < 1 || jog1 > 4) {
                System.out.println("Número inválido, por favor tente novamente");
                jog1 = in.nextInt();
            }
            //validação de número (resultado um ou mais)
            if (rest == 2 && jog1 > 1) {
                System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                jog1 = in.nextInt();
                while (jog1 > 1) {
                    System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                    jog1 = in.nextInt();
                }
            }
            if (rest == 3 && jog1 > 2) {
                System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                jog1 = in.nextInt();
                while (jog1 > 2) {
                    System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                    jog1 = in.nextInt();
                }
            }
            if (rest == 4 && jog1 > 3) {
                System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                jog1 = in.nextInt();
                while (jog1 > 3) {
                    System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                    jog1 = in.nextInt();
                }}
            //fim da validação
            vencedor = nome1;
            rest = rest - jog1;
            System.out.println("Há " + rest + " fósforos em jogo");
            System.out.println(nome2 + " pode Jogar");
            jog2 = in.nextInt();
            while (jog2 < 1 || jog2 > 4) {
                System.out.println("Número inválido, por favor tente novamente");
                jog2 = in.nextInt();
            }
            //validação de número (resultado um ou mais)
            if (rest == 2 && jog2 > 1) {
                System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                jog2 = in.nextInt();
                while (jog2 > 1) {
                    System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                    jog2 = in.nextInt();
                }
            }
            if (rest == 3 && jog2 > 2) {
                System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                jog2 = in.nextInt();
                while (jog2 > 2) {
                    System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                    jog2 = in.nextInt();
                }
            }
            if (rest == 4 && jog2 > 3) {
                System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                jog2 = in.nextInt();
                while (jog2 > 3) {
                    System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                    jog2 = in.nextInt();
                }
            }
            //fim da validação
            vencedor = nome2;
            rest = rest - jog2;
            System.out.println("Há " + rest + " fósforos em jogo");
        }


        System.out.println("Fim do Jogo!" + vencedor + " é o vencedor deste jogo!");

        System.out.println("\nQuerem desforra? 1- Sim 0 - Não");
        int op = in.nextInt();
        if (op == 1) {

            while (rest != 1) {
                System.out.println(nome2 + " pode Jogar");
                jog2 = in.nextInt();
                while (jog2 < 1 || jog2 > 4) {
                    System.out.println("Número inválido, por favor tente novamente");
                    jog2 = in.nextInt();
                }
                //validação de número (resultado um ou mais)
                if (rest == 2 && jog2 > 1) {
                    System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                    jog2 = in.nextInt();
                    while (jog2 > 1) {
                        System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                        jog2 = in.nextInt();
                    }
                }
                if (rest == 3 && jog2 > 2) {
                    System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                    jog2 = in.nextInt();
                    while (jog2 > 2) {
                        System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                        jog2 = in.nextInt();
                    }
                }
                if (rest == 4 && jog2 > 3) {
                    System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                    jog2 = in.nextInt();
                    while (jog2 > 3) {
                        System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                        jog2 = in.nextInt();
                    }
                }
                //fim da validação
                vencedor = nome2;
                rest = rest - jog2;
                System.out.println("Há " + rest + " fósforos em jogo");
                System.out.println(nome1 + " pode Jogar");
                jog1 = in.nextInt();
                while (jog1 < 1 || jog1 > 4) {
                    System.out.println("Número inválido, por favor tente novamente");
                    jog1 = in.nextInt();
                }
                //validação de número (resultado um ou mais)
                if (rest == 2 && jog1 > 1) {
                    System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                    jog1 = in.nextInt();
                    while (jog1 > 1) {
                        System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                        jog1 = in.nextInt();
                    }
                }
                if (rest == 3 && jog1 > 2) {
                    System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                    jog1 = in.nextInt();
                    while (jog1 > 2) {
                        System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                        jog1 = in.nextInt();
                    }
                }
                if (rest == 4 && jog1 > 3) {
                    System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                    jog1 = in.nextInt();
                    while (jog1 > 3) {
                        System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                        jog1 = in.nextInt();
                    }}
                //fim da validação
                vencedor = nome1;
                rest = rest - jog1;
                System.out.println("Há " + rest + " fósforos em jogo");
            }


            System.out.println("Fim do Jogo!" + vencedor + " é o vencedor deste jogo!");

        } else if (op == 0) {
            System.out.println("Programa interrompido a seu pedido");
            return;
        } else {
            System.out.println("Opção inválida, fim do programa");
            return;

        }
    }
    private static void JogoCompInt () {
        Scanner in = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo contra o computador com inteligência!");
        System.out.println("Qual é o seu nome?");
        String nome = in.nextLine();
        String vencedor = "";

        int rest = 21, jog, pc;

        while (rest != 1) {
            System.out.println(nome + " pode Jogar");
            jog = in.nextInt();
            while (jog < 1 || jog > 4) {
                System.out.println("Número inválido, por favor tente novamente");
                jog = in.nextInt();
            }
            rest = rest - jog;
            vencedor = nome;
            System.out.println("Há " + rest + " fósforos em jogo");
            pc = 5 - jog;
            System.out.println("Vez do computador - tirou " + pc + " fósforos");
            vencedor = "Computador";
            rest = rest - pc;

            System.out.println("Há " + rest + " fósforos em jogo");
        }


        System.out.println("Fim do Jogo!" + vencedor + " é o vencedor deste jogo!");
    }
    private static void JogoCompDesint () {

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Bem vindo ao jogo contra o computador sem inteligência!");
        System.out.println("Qual é o seu nome?");
        String nome = in.nextLine();
        String vencedor = "";

        int rest = 21, jog = 0, pc = 0;

        while (rest != 1) {
            //validar bound pc
            if (rest == 2) {
                pc = rnd.nextInt(1, 2);
            }
            if (rest == 3) {
                pc = rnd.nextInt(1, 3);
            }
            if (rest == 4) {
                pc = rnd.nextInt(1, 4);
            } else {
                pc = rnd.nextInt(1, 5);
            }
            System.out.println("Vez do computador - tirou " + pc + " fósforos");
            vencedor = "Computador";
            rest = rest - pc;
            System.out.println("Há " + rest + " fósforos em jogo");

            System.out.println(nome + " pode Jogar");
            jog = in.nextInt();
            while (jog < 1 || jog > 4) {
                System.out.println("Número inválido, por favor tente novamente");
                jog = in.nextInt();
            }
            //validação de número (resultado um ou mais)
            if (rest == 2 && jog > 1) {
                System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                jog = in.nextInt();
                while (jog > 1) {
                    System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                    jog = in.nextInt();
                }
            }
            if (rest == 3 && jog > 2) {
                System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                jog = in.nextInt();
                while (jog > 2) {
                    System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                    jog = in.nextInt();
                }
            }
            if (rest == 4 && jog > 3) {
                System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                jog = in.nextInt();
                while (jog > 3) {
                    System.out.println("Número inválido, o resultado tem de ser no mínimo 1, e se assim for vencerá!");
                    jog = in.nextInt();
                }
            }
            //fim da validação
            vencedor = nome;
            rest = rest - jog;
            System.out.println("Há " + rest + " fósforos em jogo");
        }


        System.out.println("Fim do Jogo!" + vencedor + " é o vencedor deste jogo!");

    }


}