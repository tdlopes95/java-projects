import java.util.Scanner;

public class Java_activities_2 {
    public static void main(String[] args) {
        int validador=0;

        Scanner ler = new Scanner(System.in);
        validador = intro();
        while (validador>0){
            switch(validador){
                case 1:
                    mediaNumeros();
                    break;
                case 2:
                    grafiClassi();
                    break;
                case 3:
                    triangulos();
                    break;
                case 4:
                    algComuns();
                    break;
                case 5:
                    armstrong();
                    break;
                case 6:
                    somaTripla();
                    break;
                case 7:
                    sorteAzar();
                    break;
                case 8:
                    qtdPalavras();
                    break;
                case 9:
                    numUnicos();
                    break;
                case 10:
                    estavelCiclico();
                    break;
                default:
                    break;
            }
            System.out.println("Deseja Continuar? (S/N)");
            String repMain = ler.next();
            if(repMain.equalsIgnoreCase("S")){
                validador=intro();
            }else{
                break;
            }
        }
    }

    public static int intro() {
        int valid;
        Scanner ler = new Scanner(System.in);

        System.out.printf("*******************************************************************\n" +
                "*****                 Sebenda de Exercicios JAVA1             *****\n" +
                "*****                     (Nível Intermédio)                  *****\n" +
                "*******************************************************************\n" +
                "1)A-Media de Números            2)B-Gráfico de Classificações\n" +
                "3)C-Calcular Ângulos Triângulo  4)E-Algarismos em Posições Comuns\n" +
                "5)G-Números de Armstrong        6)J-Soma Tripla\n" +
                "7)K-Sorte ou Azar aos Dados     8)L-Quantidade Palavras numa Frase\n" +
                "9)M-Números com Digitos Únicos  10)N-Estável ou Cíclico\n");
        do {valid = ler.nextInt();}while (valid <= 0 || valid >= 20); //Validador de dados
        return valid;
    }

    public static void mediaNumeros() {
        /*****************************************************************************************
         A - MÉDIA DE NÚMEROS COM MENOS DE X ALGARISMOS
         a) Construa um módulo para determinar a quantidade de dígitos de um número dado como parâmetro.

         b) Utilizando o módulo anterior faça um programa que leia uma sequência de números inteiros com
         menos de N algarismos e determine a sua média. O valor de N deve ser o primeiro número a ser lido. A
         sequência termina quando for introduzido um número com N ou mais algarismos.
         A média deve ser visualizada com 2 casas decimais.

         c) Adapte o programa para terminar no máximo ao fim de K números introduzidos.

         OBS: Utilize uma constante para definir o número máximo de elementos da sequência (K=5)
         ******************************************************************************************/
        int num=0, num_algarismos,cont=0, soma=0;
        double media;
        final int LIMITE = 5;

        Scanner ler = new Scanner(System.in);
        System.out.println("Introduza o numero máximo de algarismos que o número pode ter: ");
        num_algarismos = ler.nextInt();
        while(cont<LIMITE  && contadorAlgarismos(num)<num_algarismos){
            System.out.println("Digite um número: ");
            num = ler.nextInt();
            if(contadorAlgarismos(num)<num_algarismos){
                soma = soma + num;
                cont++;
            }
        }
        media = (double)soma / cont;
        System.out.printf("%.2f\n",media);
    }

    public static int contadorAlgarismos(int num) {
        int contador=0;
        int numero = num;

        if(numero != 0){
            while (numero>0){
                numero = numero / 10;
                contador++;
            }
        }else{
            contador++;
        }
        return contador;
    }

    public static void grafiClassi() {
        /*****************************************************************************************
         B - GRÁFICO DE CLASSIFICAÇÕES
         Faça um programa que represente sob a forma de gráficos de barras, o número de positivas e
         negativas dos alunos de uma turma a um conjunto de disciplinas.
         O programa deverá começar por ler o numero de alunos da turma e o numero de disciplinas e, para cada
         disciplina, ler o nome da disciplina e o numero de alunos aprovados.
         Deve implementar um módulo para imprimir a informação acerca de uma disciplina.
         O output produzido deverá ter o seguinte aspeto, em que cada aluno será representado por um
         asterisco (*):

         Subject: Portuguese
         - Approved: ******
         - Failed: ****
         Subject: Math
         - Approved: *******
         - Failed: ***
         ******************************************************************************************/
        int num_disciplinas,num_alunos,num_positivas;
        String disciplina;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número de alunos que pretende classificar: ");
        num_alunos = ler.nextInt();
        System.out.println("Digite o número de disciplinas que pretende mostrar: ");
        num_disciplinas = ler.nextInt();

        for (int i=1;i<=num_disciplinas;i++){
            System.out.println("Qual é o nome da disciplina?");
            disciplina = ler.next();
            System.out.println("Quantas positivas houve?");
            num_positivas = ler.nextInt();
            notasDisciplina(num_alunos,disciplina,num_positivas);
        }
    }

    public static void notasDisciplina(int numero_alunos,String nome_disc, int positivas) {
        int negativas;

        StringBuilder impressao = new StringBuilder("Subject: ");
        impressao.append(String.format("%s",nome_disc));

        negativas = numero_alunos-positivas;

        impressao.append("\n-Approved: ");
        for (int i=1;i<=positivas;i++){
            impressao.append("*");
        }
        impressao.append("\n-Failed: ");
        for (int i=1;i<=negativas;i++){
            impressao.append("*");
        }
        System.out.println(impressao);
    }

    public static void triangulos() {
        /*****************************************************************************************
         C - CALCULAR OS ÂNGULOS DE UM TRIÂNGULO
         a) Implemente um método que calcule um ângulo interno de um triângulo, sendo dadas as medidas
         dos três lados desse triângulo. O método deve receber por parâmetro as medidas dos três lados do
         triângulo e retornar o ângulo calculado em graus.
         b) Faça um programa que peça as medidas de três lados, verifique se elas são válidas e se é possível
         formar um triângulo. Em caso afirmativo calcule todos os ângulos internos desse triângulo. Para isso
         invoque três vezes o método desenvolvido na alínea anterior.
         Os resultados deverão ser apresentados em linhas separadas e os valores dos ângulos em graus, com
         duas casas decimais. Caso não seja possível formar um triângulo, a mensagem deverá ser:
         "impossible".
         O resultado deverá apresentar o seguinte formato:
         a=2.00
         b=3.00
         c=4.00
         ang(a,b)=104.48
         ang(a,c)=46.57
         ang(b,c)=28.96
         ******************************************************************************************/
        double cateto_a,cateto_b,cateto_c,angulo_ab,angulo_ac,angulo_bc;
        int valid=0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Iniciando a medição dos ângulos de um triângulo.");
        System.out.println("Digite as medidas do cateto 1: ");
        cateto_a = ler.nextInt();
        System.out.println("Digite as medidas do cateto 2: ");
        cateto_b = ler.nextInt();
        System.out.println("Digite as medidas do cateto 3: ");
        cateto_c = ler.nextInt();

        if(cateto_a>cateto_b && cateto_a>cateto_c){
            if(cateto_a<(cateto_b+cateto_c)){
                valid=1;
            }else{
                System.out.println("Impossible");
            }
        } else if (cateto_b>cateto_a && cateto_b>cateto_c) {
            if(cateto_b<(cateto_a+cateto_c)){
                valid=1;
            }else{
                System.out.println("Impossible");
            }
        }else if (cateto_c>cateto_a && cateto_b<cateto_c){
            if(cateto_c<(cateto_a+cateto_b)){
                valid=1;
            }else{
                System.out.println("Impossible");
            }
        }else{
            System.out.println("Impossible");
        }
        if(valid==1){
            angulo_ab=angulosTriangulo(cateto_a,cateto_b,cateto_c);
            angulo_ac=angulosTriangulo(cateto_a,cateto_c,cateto_b);
            angulo_bc=angulosTriangulo(cateto_b,cateto_c,cateto_a);

            System.out.printf("a=%.2f\nb=%.2f\nc=%.2f\nang(a,b)=%.2f\nang(a,c)=%.2f\nang(b,c)=%.2f\n",cateto_a,cateto_b,cateto_c,angulo_ab,angulo_ac,angulo_bc);
        }

    }

    public static double angulosTriangulo(double ang_1,double ang_2,double ang_3) {
        double angulo;
        angulo=Math.toDegrees(Math.acos((Math.pow(ang_1,2)+Math.pow(ang_2,2)-Math.pow(ang_3,2))/(ang_1*ang_2*2)));
        return angulo;
    }

    public static void algComuns() {
        /*****************************************************************************************
         E - ALGARISMOS EM POSIÇÕES COMUNS
         a) Implemente um módulo que dados dois números inteiros positivos retorne a quantidade de dígitos
         comuns nas mesmas posições.
         b) Elabore um programa que leia N pares de valores inteiros positivos, sendo N introduzido pelo
         utilizador e validado. Após a leitura dos N pares de valores o programa deve apresentar o par que tiver
         mais dígitos comuns nas mesmas posições. No caso de haver mais do que um par com a mesma
         quantidade de dígitos em comum, deve ser apresentado o último par encontrado.
         O resultado deve conter apenas o par em causa no formato "numero1/numero2".
         No caso de não haver nenhum par de números que tenha algarismos em comum deve ser apresentada
         a mensagem: "no results".
         ******************************************************************************************/
        int qtd_pares,num_1,num_2,num_comuns=0,par_1=0,par_2=0,valid=0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Verificação de algarismos em posições comuns");
        System.out.println("Digite a quantidade de pares que quer verificar: ");
        qtd_pares = ler.nextInt();

        for (int i=1;i<=qtd_pares;i++){
            System.out.println("Digite o primeiro numero: ");
            num_1 = ler.nextInt();
            System.out.println("Digite o segundo numero: ");
            num_2 = ler.nextInt();

            if (algarismosComuns(num_1,num_2)>0){
                if(num_comuns<algarismosComuns(num_1,num_2)){
                    par_1 = num_1;
                    par_2 = num_2;
                }
                valid=1;
            }
        }
        if (valid==1){
            System.out.printf("%d/%d",par_1,par_2);
        }else{
            System.out.println("no results");
        }
    }

    public static int algarismosComuns(int numero_1, int numero_2){
        int digito_1,digito_2,contador=0;

        while ( numero_1>0){
            digito_1 = numero_1 % 10;
            numero_1 = numero_1 / 10;
            digito_2 = numero_2 % 10;
            numero_2 = numero_2 / 10;
            if(digito_1 == digito_2){
                contador++;
            }
        }
        if(contador>0){
            return contador;
        }else{
            return 0;
        }
    }

    public static void armstrong() {
        /*****************************************************************************************
         G - NÚMEROS DE ARMSTRONG
         Um número de Armstrong possui a seguinte característica: a soma dos algarismos elevados à
         quantidade de algarismos é igual ao próprio número.
         Por exemplo:
         2 = 2^1 (1 algarismo => somar todos os algarismos elevados a 1)
         407 =4^3 + 0^3 + 7^3 (3 algarismos => somar todos os algarismos elevados a 3)
         1634 = 1^4 + 6^4 + 3^4 + 4^4 (4 algarismos => somar todos os algarismos elevados a 4)
         a) Construa um método para verificar se um número inteiro é um número de Armstrong.
         b) Faça um programa que imprima todos os números de Armstrong até um valor N inserido pelo
         utilizador.
         ******************************************************************************************/
        int qtd_numeros,valid=0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Verificação de números de Armstrong.");
        System.out.println("Digite até que número deseja visualizar: ");
        qtd_numeros = ler.nextInt();

        for (int i=1;i<=qtd_numeros;i++) {
            if(numerosArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean numerosArmstrong(int numero_1){
        int digito_1,original,contador=0;
        double soma=0;

        original=numero_1;
        while(numero_1>0){
            numero_1 = numero_1 / 10;
            contador++;
        }
        numero_1=original;
        while (numero_1>0){
            digito_1 = numero_1 % 10;
            numero_1 = numero_1 / 10;

            soma=soma+Math.pow(digito_1,contador);
        }
        return soma == original;
    }

    public static void somaTripla() {
        /*****************************************************************************************
         J - SOMA TRIPLA
         Faça um programa que, leia um número inteiro positivo N (N<=100) e visualize todas as suas
         decomposições distintas como soma de três inteiros positivos.
         As triplas que possuam os mesmos valores, mas por ordem diferente, devem ser ignoradas. No final
         deve ainda visualizar a quantidade de triplas distintas calculadas.
         Os valores maiores devem aparecer à esquerda.
         Apresente a informação no seguinte formato:
         <n1> + <n2> + <n3>
         <n4> + <n5> + <n6>
         .....
         triples=<triplas distintas>
         Implemente um método que calcule, visualize as triplas e retorne a quantidade de triplas distintas.
         ******************************************************************************************/
        int num,valid=0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Visualização de decomposições distintas.");
        System.out.println("Digite o número deseja visualizar: ");
        num = ler.nextInt();

        decompost(num);
    }

    public static void decompost(int numero_1){
        int digito_1,digito_2,digito_3,contador=1,soma;
        StringBuilder result = new StringBuilder();

        digito_1=numero_1-2;
        digito_2=1;
        digito_3=1;

        System.out.printf("%d + %d + %d\n",digito_1,digito_2,digito_3);
        while(digito_1>=digito_2 && digito_1>digito_3){


            if(digito_2>digito_3 && (digito_2)!=(digito_3+1)){
                digito_2--;
                digito_3++;
                contador++;
            }else if(digito_1>digito_2 && digito_1!=(digito_2+1)) {
                digito_1--;
                digito_2++;
                contador++;
            }else if (digito_1>digito_2 && digito_2>digito_3){
                digito_1--;
                digito_3++;
                contador++;
            }
            System.out.printf("%d + %d + %d\n",digito_1,digito_2,digito_3);

            if(digito_1==digito_3){
                break;
            }
            if(digito_1==digito_2 && digito_3+1==digito_2){
                break;
            }
        }
        System.out.printf("triples=%d\n",contador);


    }

    public static void sorteAzar() {
        /*****************************************************************************************
         K - SORTE OU AZAR AOS DADOS
         Faça um programa que simule um jogo de dados em que um jogador lança um dado um conjunto de
         vezes. A pontuação do jogador é a soma do valor das faces do dado. As faces do dado são numeradas
         de 1 a 6. Se saírem duas faces iguais consecutivas, a pontuação passa a negativo. Quando uma face é
         igual à anterior, os pontos da segunda face são negativos, caso contrário são positivos.
         O programa deve ler um número inteiro positivo, cujos algarismos representam o valor das faces que
         saíram, e visualizar a pontuação final.
         Implemente um método que receba um número inteiro e retorne a pontuação de acordo com as regras
         do jogo.
         3165: 3 > (3) + 1 > (4) + 6 > (10) + 5 > (15)
         344: 3 > (3) + 4 > (7) + 4 > (-7) - 4 > (-11)
         34414: 3 > (3) + 4 > (7) + 4 > (-7) - 4 > (-11) + 1 > (-10) + 4 > (-6)
         ******************************************************************************************/
        int num;

        Scanner ler = new Scanner(System.in);

        System.out.println("SORTE OU AZAR.");
        System.out.println("Digite o conjunto das faces que sairam no dado: ");
        num = ler.nextInt();

        System.out.printf("points=%d",contadorDado(num));
    }

    public static int contadorDado(int numero_1){
        int inverso=0, digito, digito_inverso,pontuacao=0,digito_anterior=0;

        while(numero_1>0){
            digito = numero_1 % 10;
            numero_1 = numero_1 /10;

            if(inverso == 0) {
                inverso = digito;
            }else{
                inverso = inverso*10+digito;
            }
        }
        while(inverso>0) {
            digito_inverso = inverso % 10;
            inverso = inverso / 10;
            if (digito_anterior == digito_inverso && pontuacao > 0) {
                pontuacao = pontuacao * (-1) - digito_inverso;
            } else if (digito_anterior==digito_inverso && pontuacao < 0) {
                pontuacao = pontuacao - digito_inverso;
            }else {
                pontuacao=pontuacao+digito_inverso;
            }
            digito_anterior=digito_inverso;
        }
        return pontuacao;
    }

    public static void qtdPalavras() {
        /*****************************************************************************************
         Elabore um programa que leia uma frase e escreva quantas palavras possui essa frase.
         Considera-se uma palavra um qualquer conjunto de símbolos que se encontram entre espaços.
         Implemente um método que recebe a frase e retorna a quantidade de palavras existentes nessa frase.
         ******************************************************************************************/
        String palavra;

        Scanner ler = new Scanner(System.in);

        System.out.println("Leitor de palavras.");
        System.out.println("Digite uma frase: ");
        palavra = ler.nextLine();

        System.out.printf("%d",contadorPalavras(palavra));
    }

    public static int contadorPalavras(String palavra){
        int contador=1;

        if(palavra.isEmpty()) {
            return 0;
        }else{
            for (int i = 0;i<palavra.length();i++){
                if(palavra.charAt(i) == ' ' && palavra.charAt(i-1) != ' '){
                    contador++;
                }
            }
            return contador;
        }
    }

    public static void numUnicos() {
        /*****************************************************************************************
         M - NÚMEROS COM ALGARISMOS ÚNICOS
         Faça um programa que permita identificar números inteiros que possuam digitos únicos, ou seja, sem
         digitos repetidos.
         O programa deve ler números inteiros, positivos e/ou negativos e mostrar os que não têm algarismos
         repetidos.
         A leitura termina com o número zero.
         No final deve mostrar, também, a percentagem de números positivos, negativos e sem algarismos
         repetidos (usando duas casa deimais e símbolo de %), no seguinte formato:
         <n1>
         <n2>
         negatives: <n3>%
         positives: <n4>%
         with unique digits: <n5>%
         Apenas variáveis primitivas do tipo inteiro e modularização de responsabilidade única devem ser
         usadas.
         ******************************************************************************************/
        int num,contPositivos=0,contNegativos=0,contUnicos=0;
        double positive,negative,unique;
        StringBuilder unicos = new StringBuilder();

        Scanner ler = new Scanner(System.in);

        System.out.println("Leitor de numeros.");
        System.out.println("Digite os números que pretende verificar: (0 para terminar)");
        do {
            num = ler.nextInt();
            if (num != 0) {
                if (num < 0) {
                    contNegativos++;
                } else {
                    contPositivos++;
                }

                if(digitosUnicos(num)){
                    unicos.append(String.format("\n%d",num));
                    contUnicos++;
                }

            }
        }while(num != 0);
        positive=(double)contPositivos/(contPositivos+contNegativos)*100;
        negative=(double)contNegativos/(contPositivos+contNegativos)*100;
        unique=(double)contUnicos/(contPositivos+contNegativos)*100;
        System.out.printf("%s\n" +
                "negatives: %.2f%%\n" +
                "positives: %.2f%%\n" +
                "with unique digits: %.2f%%\n",unicos,negative,positive,unique);
    }

    public static boolean digitosUnicos(int numero){
        int digito,digito_check,original,num_teste,cont,valid=1;


        if(numero<0){
            numero=numero*-1;
        }
        original=numero;
        while(numero>0){
            digito = numero % 10;
            numero = numero / 10;
            num_teste = original;
            cont=0;
            while(num_teste>0){
                digito_check = num_teste % 10;
                num_teste = num_teste / 10;
                if (digito_check == digito){
                    cont++;
                }
                if (cont>=2){
                    valid=0;
                }
            }
        }
        if (valid==1){
            return true;
        }else{
            return false;
        }
    }

    public static void estavelCiclico() {
        /*****************************************************************************************
         N - ESTAVÉL OU CÍCLICO
         Diz-se que um número tem um “ciclo de vida” definido pelo seguinte processo:
         Começa com um número inteiro positivo n.
         Calcula-se a soma dos quadrados dos seus dígitos.
         Substitui-se n por esse resultado.
         Repete o processo até que:
         - n se torne 1 (nesse caso, o número é "Stable"), ou
         - n repita um valor já visto (nesse caso, o número entra num ciclo infinito, e é "Cyclic").
         O objetivo é determinar se um número é Stable ou Cyclic e quantos passos demorou a chegar a esse
         resultado.
         entrada:
         Um número inteiro n (1 ≤ n ≤ 10⁹).
         saída:
         Imprimir duas linhas:
         A sequência de números até ser obtida a solução, formatado como nos exemplos.
         a palavra "Stable" ou "Cyclic", seguida de " : ", e o número de iterações até ao resultado final.
         ******************************************************************************************/
        int contador=0,valid=0;
        long soma;
        String teste;
        StringBuilder ciclo = new StringBuilder();

        Scanner ler = new Scanner(System.in);

        System.out.println("Estavel ou cíclico?");
        System.out.println("Digite o número que pretende analisar: ");
        do{soma=ler.nextLong();}while(soma<1 || soma>Math.pow(10,9));

        while (soma!=1) {
            ciclo.append(String.format(" %d ", soma));
            soma = teste_ciclos(soma);
            teste = " "+soma+" ";
            if (ciclo.indexOf(teste) != -1) {
                ciclo.append(String.format("> %d", soma));
                contador++;
                valid=0;
                break;
            }else{
                ciclo.append(">");
                contador++;
                valid=1;
            }
        }
        if(valid==1){
            ciclo.append(String.format(" %d", soma));
            System.out.println(ciclo);
            System.out.printf("Stable: %d\n",contador);
        }else{
            System.out.println(ciclo);
            System.out.printf("Cyclic: %d\n",contador);
        }
    }

    public static long teste_ciclos(long numero){
        long soma=0,digito;

        while(numero>0){
            digito = numero % 10;
            numero = numero / 10;
            soma=soma+ (long)Math.pow(digito,2);
        }
        return soma;
    }
}
