import java.util.Scanner;

public class JAVA1_Complete {
    public static void main(String[] args) {
        int validador=0;

        Scanner ler = new Scanner(System.in);
        validador = intro();
        while (validador>0){
            switch(validador){
                case 1:
                    somaPares();
                    break;
                case 2:
                    somaPares_v2();
                    break;
                case 3:
                    prodImpares();
                    break;
                case 4:
                    prodImpares_v2();
                    break;
                case 5:
                    baseOito();
                    break;
                case 6:
                    palindromo();
                    break;
                case 7:
                    divisores();
                    break;
                case 8:
                    numPrimo();
                    break;
                case 9:
                    minMultiplo();
                    break;
                case 10:
                    percentDigitos();
                    break;
                case 11:
                    numPrimos_v2();
                    break;
                case 12:
                    numPerfeitos();
                    break;
                case 13:
                    fibonacci();
                    break;
                case 14:
                    seq_crescentes();
                    break;
                case 15:
                    pizza();
                    break;
                case 16:
                    alg_repetidos();
                    break;
                case 17:
                    skills();
                    break;
                case 18:
                    relogio();
                    break;
                case 19:
                    div_multiplos3();
                    break;
                case 20:
                    percent_algarismos();
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
                "*******************************************************************\n" +
                "1)Somar Algarismos Pares        2)Somar Algarismos Pares(v2)\n" +
                "3)Produto de Algarismos Impares 4)Produto de Algarismos Impares(v2)\n" +
                "5)Converter de Base8 p/ Decimal 6)Palíndromo\n" +
                "7)Divisores de um Número        8)Número Primo\n" +
                "9)Mínimo Múltiplo Comum         10)Percentagem Dígitos\n" +
                "11)Números Primos(v2)           12)Numeros Perfeitos\n" +
                "13)Fibonacci                    14)Sequências Crescentes\n" +
                "15)Pizza                        16)Algarismos Repetidos\n" +
                "17)Skills                       18)Relógio\n" +
                "19)Divisores Multiplos de 3     20)Percentagem Algarismos Impares\n");
        do {valid = ler.nextInt();}while (valid <= 0 || valid >= 20); //Validador de dados
        return valid;
    }
    public static void somaPares() {
        /*****************************************************************************************
         A - SOMAR ALGARISMOS PARES
         Construa um programa que calcule a soma dos algarismos pares de um número inteiro
         positivo introduzido pelo utilizador.
         Por exemplo, se a entrada for o número 36781 a saída será 14 (8+6)
         ******************************************************************************************/
        //separar digitos
        //numero % 10 -> digito
        //numero / 10 -> retirarmos o digito
        Scanner ler = new Scanner(System.in);

        System.out.println("Introduza um numero inteiro positivo");
        int numero = ler.nextInt();


        int somaPares = 0;
        while (numero > 0) {
            int digito = numero % 10;
            numero = numero / 10;

            if (digito % 2 == 0) {
                somaPares = somaPares + digito;
            }
        }
        System.out.println(somaPares);
    }

    public static void somaPares_v2() {
        /*****************************************************************************************
         B - SOMAR ALGARISMOS PARES (V2)
         Construa um programa que calcule a soma dos algarismos pares de um número inteiro positivo introduzido pelo utilizador.
         Por exemplo, se a entrada for o número 36781 a saída será 14 (8+6)
         O algoritmo deve ser aplicado a uma sequência de números inteiros terminada por um número não positivo.
         ******************************************************************************************/
        //separar digitos
        //numero % 10 -> digito
        //numero / 10 -> retirarmos o digito
        Scanner ler = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduza um numero inteiro positivo");
            numero = ler.nextInt();


            int somaPares = 0;
            int copia = 0;
            while (numero > 0) {
                int digito = numero % 10;
                numero = numero / 10;

                if (digito % 2 == 0) {
                    somaPares = somaPares + digito;
                }
            }
            System.out.println(somaPares);
        } while (numero == 0);
    }

    static void prodImpares() {
        /*****************************************************************************************
         C - PRODUTO DOS ALGARISMOS ÍMPARES
         Construa um programa que calcule o produto dos algarismos ímpares de um número inteiro
         positivo introduzido pelo utilizador.
         Por exemplo, se a entrada for o número 56983 a saída será 135 (3*9*5).
         Se o número não contiver algarismos ímpares deve ser visualizada a mensagem "no odd digits".
         ******************************************************************************************/

        Scanner ler = new Scanner(System.in);
        int numero;

        System.out.println("Introduza um numero inteiro positivo");
        numero = ler.nextInt();


        int prodImpar = 1;
        int cont = 0;
        while (numero > 0) {
            int digito = numero % 10;
            numero = numero / 10;

            if (digito % 2 != 0) {
                prodImpar = prodImpar * digito;
                cont = cont + 1;
            }
        }
        if (cont == 0) {
            System.out.println("There are no odd digits");
        } else {
            System.out.println(prodImpar);
        }
    }

    public static void prodImpares_v2() {
        /*****************************************************************************************
         D - PRODUTO DOS ALGARISMOS ÍMPARES (V2)
         Construa um programa que calcule o produto dos algarismos ímpares de um número inteiro positivo
         introduzido pelo utilizador. Por exemplo, se a entrada for o número 56983 a saída será 135 (3*9*5).
         Se o número não contiver algarismos ímpares deve ser visualizada a mensagem "no odd digits".
         O algoritmo deve ser aplicado a uma sequência de números inteiros terminada por um número não positivo.
         Cada resultado deve ser visualizado em linhas separadas.
         ******************************************************************************************/
        Scanner ler = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduza um numero inteiro positivo");
            numero = ler.nextInt();
            if (numero > 0) {

                int prodImpar = 1;
                int cont = 0;
                while (numero > 0) {
                    int digito = numero % 10;
                    numero = numero / 10;

                    if (digito % 2 != 0) {
                        prodImpar = prodImpar * digito;
                        cont = cont + 1;
                    }
                }
                if (cont == 0) {
                    System.out.println("There are no odd digits");
                } else {
                    System.out.println(prodImpar);
                }
            }else {
                break;
            }
        }while (numero == 0) ;
    }

    public static void baseOito() {
        /*****************************************************************************************
         E - CONVERTER DE BASE 8 PARA DECIMAL
         Construa um programa que recebe um número inteiro na base 8 e converte-o para o sistema decimal.
         O algoritmo deve ser aplicado a uma sequência de números inteiros terminada por um número não positivo.
         Cada resultado deve ser visualizado em linhas separadas.
         Abordagem: Percorra cada dígito do número (da direita para esquerda) e multiplique-o pela potência de 8 correspondente.
         Conceito matemático: Em base 8, cada posição representa uma potência de 8.
         Ex: 12345₈ = 1×8⁴ + 2×8³ + 3×8² + 4×8¹ + 5×8⁰
         ******************************************************************************************/
        Scanner ler = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduza um numero inteiro positivo");
            numero = ler.nextInt();
            if (numero > 0) {

                double numDecimal = 0;
                int cont = 0;
                while (numero > 0) {
                    int digito = numero % 10;
                    numero = numero / 10;
                    numDecimal = numDecimal + (digito * Math.pow(8,cont));
                    cont = cont + 1;

                }
                System.out.printf("%.0f %n",numDecimal);

            }else {
                break;
            }
        }while (numero == 0) ;
    }

    public static void palindromo() {
        /*****************************************************************************************
         F - PALÍNDROMO
         Palíndromo é uma palavra, frase ou número que permanece igual quando lida de trás para diante e vice versa,
         por exemplo "madam", "kayak", 1001 ou 1230321.
         Construa um programa que recebe um número inteiro positivo e verifique se é ou não um palíndromo.
         O resultado deve ser a mensagem "palindrome" ou "not palindrome".
         ******************************************************************************************/
        Scanner ler = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduza um numero inteiro positivo");
            numero = ler.nextInt();
            if (numero > 0) {

                int notInvertido = numero;
                int invertido = 0;
                while (numero > 0) {
                    int digito = numero % 10;
                    invertido = invertido * 10 + digito;
                    numero = numero / 10;
                }
                if (invertido == notInvertido) {
                    System.out.println("palindrome\n");
                } else {
                    System.out.println("not palindrome\n");
                }
            }else {
                break;
            }
        }while (numero == 0);
    }

    public static void divisores() {
        /*****************************************************************************************
         G - DIVISORES DE UM NÚMERO
         Construa um programa que dado um número inteiro positivo escreve todos os seus divisores e,
         no final, a quantidade de divisores entre parêntesis.
         Todos os valores devem ser escriros em linhas separadas.
         ******************************************************************************************/
        Scanner ler = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduza um numero inteiro positivo");
            numero = ler.nextInt();
            if (numero > 0) {

                int cont = 0;
                for (int i=1; i<=numero; i++) {

                    if (numero % i == 0) {
                        System.out.printf("%d ",i);
                        cont=cont+1;
                    }
                }
                if (cont == 0) {
                    System.out.println("There are no divisors");
                } else {
                    System.out.printf("(%d)\n",cont);
                }
            }else {
                break;
            }
        }while (numero > 0) ;
    }

    public static void numPrimo() {
        /*****************************************************************************************
         H - NÚMERO PRIMO
         Construa um programa que dado um número inteiro positivo verifica se é ou não um número primo.
         Um número é primo se for inteiro e se só for divisível por ele próprio e por 1. Ou seja,
         que possua exatamente dois divisores.
         O resultado deve ser a mensagem "prime" ou "not prime".
         ******************************************************************************************/
        Scanner ler = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduza um numero inteiro positivo");
            numero = ler.nextInt();
            if (numero > 0) {

                int cont = 0;
                System.out.println("Divisores do número inserido:");
                for (int i=1; i<=numero; i++) {

                    if (numero % i == 0) {
                        System.out.printf("%d ",i);
                        cont=cont+1;
                    }
                }
                if (cont > 2) {
                    System.out.println("\nnot prime\n");
                } else {
                    System.out.println("\nprime\n");
                }
            }else {
                break;
            }
        }while (numero > 0) ;
    }

    public static void minMultiplo() {
        /*****************************************************************************************
         I - MÍNIMO MÚLTIPLO COMUM
         Construa um programa que dados dois números inteiros positivos calcula o mínimo múltiplo comum (MMC).
         O MMC de dois números é o menor número positivo múltiplo desses dois números.
         ******************************************************************************************/
        Scanner ler = new Scanner(System.in);
        int numero_1;
        int numero_2;

        do {
            System.out.println("Introduza o primeiro numero inteiro positivo");
            numero_1 = ler.nextInt();
            System.out.println("Introduza o segundo numero inteiro positivo");
            numero_2 = ler.nextInt();
            if (numero_1 > 0 && numero_2 > 0) {

                int valid = 0;
                int produto = numero_1 * numero_2;

                for (int i=produto; i>=1; i--) {

                    if (i % numero_1 == 0 && i % numero_2 == 0) {
                        valid = i;
                    }
                }
                if (valid > 0) {
                    System.out.println(valid);
                } else {
                    System.out.println("Erro. Números inválidos.");
                }
            }else {
                break;
            }
        }while (numero_1 > 0 && numero_2 > 0) ;
    }
    public static void percentDigitos() {
        /*****************************************************************************************
         J - PERCENTAGEM DE DÍGITOS DIVISORES DO PRÓPRIO
         NÚMERO
         Construa um programa que leia uma sequência de N números inteiros positivos, sendo N
         definido pelo utilizador.
         Se o valor de N for negativo o programa termina de imediato.
         O programa deve apresentar numa linha separada, para cada um dos números lidos, a
         percentagem dos dígitos que são divisores do próprio número (usando 2 casas decimais). O
         dígito zero (0) não deve ser considerado como potencial divisor mas deve ser contabilizado
         como dígito.
         No final deve mostrar a maior dessas percentagens entre parêntesis.
         ******************************************************************************************/
        int num_pessoas, digito,num,contador, numero, cont_num;
        double percent, bigPercent=0;

        Scanner ler = new Scanner(System.in);

        do {num_pessoas = ler.nextInt();}while (num_pessoas <= 0); //Validador de dados

        for (int i=1; i<=num_pessoas;i++){
            num = ler.nextInt();
            numero = num;
            contador=0;
            cont_num=0;

            while (numero > 0) {
                digito = numero % 10;
                numero = numero / 10;
                cont_num++;
                if (digito != 0){
                    if (num % digito == 0){
                        contador++;
                    }
                }
            }
            percent = (double)contador / cont_num * 100;
            System.out.printf("%.2f%% \n", percent);
            if (bigPercent < percent){
                bigPercent=percent;
            }
        }
        System.out.printf("(%.2f%%)", bigPercent);
    }

    public static void numPrimos_v2() {
        /*****************************************************************************************
         K - NÚMEROS PRIMOS ATÉ UM LIMITE
         Construa um programa que determine e visualize os números primos até um determinado
         valor N inserido pelo utilizador.
         Um número é primo se for inteiro, maior que 1 e se só for divisível, por ele próprio e por 1.
         Cada número deve aparecer "na mesma linha".
         ******************************************************************************************/
        int num, contador;

        Scanner ler = new Scanner(System.in);

        do {num = ler.nextInt();}while (num < 0); //Validador de dados

        for (int i=1; i<=num;i++) {
            contador = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.printf("%d \n", i);
            }
        }
    }
    public static void numPerfeitos() {
        /*****************************************************************************************
         L - NÚMEROS PERFEITOS
         Construa um programa que determine e visualize os N primeiros números perfeitos.
         Um número é perfeito se for natural e for igual à soma de todos os seus divisores (excluindo o
         próprio número).
         Cada número deve aparecer numa linha separada.
         ******************************************************************************************/
        Scanner ler = new Scanner(System.in);
        int numero, soma, i=1;

        System.out.println("Introduza um numero de numeros perfeitos que deseja visualizar");
        numero = ler.nextInt();
        if (numero > 0) {

            int cont = 0;
            do {
                soma = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        soma = soma + j;
                    }
                }
                if (soma == i) {
                    cont++;
                    System.out.println(soma);
                }
                i++;
            } while (cont != numero);
        }
    }

    public static void fibonacci() {
        /*****************************************************************************************
         M - SEQUÊNCIA DE FIBONACCI
         Construa um programa para mostrar os N primeiros termos da sucessão de Fibonacci.
         Nesta sucessão, o primeiro termo é zero (0), o segundo termo é um (1) e qualquer um dos
         outros termos é igual à soma dos dois termos anteriores.
         Cada número deve aparecer numa linha separada.
         ******************************************************************************************/
        Scanner ler = new Scanner(System.in);
        int numero, soma,fibo_new=1,fibo_old=0,cont=0;

        System.out.println("Introduza um numero de numeros da sucessão de Fibonacci que deseja visualizar");
        numero = ler.nextInt();

        for (int i=0;i<numero;i++){
            if(cont==0){
                soma=fibo_old;
                System.out.printf("%d\n",soma);
                cont++;
            }else{
                if(cont==1){
                    soma=fibo_new;
                    System.out.printf("%d\n",soma);
                cont++;
                }else{
                    soma=fibo_old+fibo_new;
                    System.out.printf("%d\n",soma);
                    fibo_old=fibo_new;
                    fibo_new=soma;
                }

            }
        }
    }
    public static void seq_crescentes() {
        /*****************************************************************************************
         N - SEQUÊNCIAS CRESCENTES
         Construa um programa para ler um conjunto de números inteiros positivos e visualizar os que
         se inserem numa sequência crescente.
         A leitura termina quando for inserido um número negativo.
         Um número pertence a uma sequência crescente se for maior que o número anterior e os
         seus algarismos se apresentarem por ordem crescente da esquerda para a direita.
         Cada número deve ser visualizado numa linha separada Cada número deve aparecer numa
         linha separada.
         ******************************************************************************************/
        Scanner ler = new Scanner(System.in);
        int num,numOld=-1;
        StringBuilder result = new StringBuilder();
        System.out.println("Insira um número positivo: (-1 para encerrar)");
        do {
            num = ler.nextInt();
            if(numOld==-1){
                numOld=num;
            }
            if (isOrdemCrescente(num)) {
                if (num>numOld){
                    result.append(String.format("%d\n",num));
                }

            }
            numOld=num;
        }while(num>0);
        System.out.println("Sequência de números crescentes: ");
        System.out.print(result);
    }
    public static boolean isOrdemCrescente (int numero) {

        if ( numero <= 9){
            return false;
        }

        int digitoAnterior = numero % 10;
        numero = numero / 10;

        while ( numero != 0){

            int digito = numero % 10;
            numero = numero / 10;

            if (digito >= digitoAnterior){
                return false;
            }
            digitoAnterior = digito;
        }
        return true;
    }

    public static void pizza() {
        /*****************************************************************************************
         O - PIZZA
         Uma Pizzaria possui uma variedade de Pizzas no seu menu. A variedade das Pizzas surge da
         diferente utilização de 10 ingredientes possíveis. Cada ingrediente é identificado por um
         algarismo de 0 a 9.
         Desta forma, cada Pizza é identificada por um número inteiro cujos algarismos correspondem
         aos ingredientes que a compõem. Por exemplo, a Pizza 6501 contém os ingredientes 0,1,5 e 6.
         No momento do pedido, o cliente declara os ingredientes de que não gosta ou a que é alérgico
         e a Pizzaria apenas sugere, de entre as Pizzas disponíveis do menu, aquelas que não contêm
         qualquer um desses ingredientes.
         entrada:
         Um número inteiro representando os ingredientes que o cliente não gosta ou é alérgico.
         De seguida, é introduzido o número de Pizzas (N) existentes no menu.
         Finalmente, são introduzidos N números inteiros referentes às N Pizzas do menu (descrição
         dos ingredientes).
         saída:
         Mostrar em linhas separadas cada Pizza que satisfaça as pretensões do cliente (que não
         contenha qualquer ingrediente de que ele não gosta ou é alérgico), no seguinte formato:
         Suggestion #<i>:<pizza>
         Em que <i> é a ordem da sequência da sugestão e <pizza> é o código da pizza.
         ******************************************************************************************/
        int badIngredients,single_Bad,single_Good,num_pizzas,ingredientsPizza;
        int ingredientTester,valid,goodIngredients,n=1;

        Scanner ler = new Scanner(System.in);
        StringBuilder suggestion = new StringBuilder("Sugestões da cozinha: \n");

        System.out.println("Insira os ingredientes que não gosta/é alergico: (0 a 9)");
        badIngredients=ler.nextInt();
        System.out.println("Qual é o numero de pizzas existentes no menu? ");
        do {num_pizzas = ler.nextInt();}while (num_pizzas < 0); //Validador de dados
        for (int i=1;i<=num_pizzas;i++){
            valid=0;
            System.out.println("Digite a combinação de ingredientes da pizza: ");
            ingredientsPizza=ler.nextInt();
            ingredientTester=badIngredients;
            while(ingredientTester>0){
                single_Bad = ingredientTester % 10;
                ingredientTester = ingredientTester/10;
                goodIngredients = ingredientsPizza;
                while(goodIngredients>0){
                    single_Good = goodIngredients % 10;
                    goodIngredients = goodIngredients/10;
                    if (single_Good == single_Bad){
                        valid = -1;
                    }
                }
            }
            if (valid != -1){
                suggestion.append(String.format("Suggestion #%d:%d\n",n,ingredientsPizza));
                n++;
            }
        }
        System.out.print(suggestion);
    }

    public static void alg_repetidos() {
        /*****************************************************************************************
         P - ALGARISMOS REPETIDOS
         Verificar se um número inteiro, lido do teclado, possui algarismos repetidos. A verificação
         deve ser feita da direita para a esquerda.
         Se for detetada uma repetição deve apresentar de imediato o algarismo repetido e as
         respetivas posições em que ocorrem (a contar da direita para a esquerda), no seguinte
         formato:
         <number> : digit (<d>) repeated in positions (<p1>) and (<p2>)
         em que <number> é o número lido do teclado, <d> é o algarismo repetido e <p1> e <p2> as
         posições em que ocorrem.
         Por exemplo, o número 890230 possui o algarismo (0) repetido nas posições (1) e (4).
         O algoritmo deve ser aplicado a uma sequência de números inteiros terminada por um
         número negativo.
         ******************************************************************************************/
        int num, digito,digito_repeat,teste_num,cont=1,cont_first,cont_second,valid=0,original,digitoRepetido = -1;

        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Insira um número inteiro positivo: ");
            num = ler.nextInt();
            teste_num = num;
            original = num;
            cont_first=0;
            cont_second=0;
            while (teste_num>0){
                digito_repeat = teste_num % 10;
                teste_num = teste_num/10;
                num=original;
                valid=0;
                cont=1;
                while(num>0){
                    digito = num % 10;
                    num = num/10;
                    if (digito == digito_repeat && valid != 2){
                        valid=valid+1;
                        if(valid == 1) {
                            cont_first = cont;
                        }else{
                            cont_second = cont;
                            digitoRepetido = digito;
                        }
                    }
                    cont++;
                }
                if (valid == 2){
                    System.out.printf("%d : digit(%d) repeated in positions (%d) and (%d)\n",original,digitoRepetido,cont_first,cont_second);
                    break;
                }
            }


        }while(original>0);
    }

    public static void skills() {
        /*****************************************************************************************
         Q - SKILLS
         A empresa SoftSkills pretende saber que competências tem ao seu dispor de entre todos os
         seus colaboradores.
         Cada competência é representada por um algarismo. O algarismo zero (0) não representa
         qualquer competência.
         As competências de um funcionário são expressas através de um número inteiro cujos
         algarismos representam as respetivas competências.
         Pretende-se ler os números com as competências dos trabalhadores da empresa e
         determinar o número que possui a junção de todas as competências distintas disponíveis.
         A leitura termina com o número zero.
         Na empresa, as competências são analisadas da esquerda para a direita dos número.
         O numero resultante deve ter os algarismos pela sequência em que aparecem, da esquerda
         para a direita.
         entrada:
         Um conjunto de números inteiros, um em cada linha, representando as competências de cada funcionário. O último número é zero.
         saída:
         O número inteiro com as competências distintas encontradas, de entre todos os funcionários
         nota: Deve resolver o problema usando apenas variáveis do tipo inteiro.
         ******************************************************************************************/
        int num,verificarExiste,somatorio,num_invertido=0,digito_invertido,digito,digitoSomatorio,valid;
        int numInserido;
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira um número inteiro positivo: ");
        do {num = ler.nextInt();}while (num < 0); //Validador de dados
        somatorio = num;
        do {
            System.out.println("Insira outro número inteiro positivo: ");
            numInserido = ler.nextInt();
            num = numInserido;
            while (num>0){

                while(num>0) { //INVERSÃO DO NUMERO
                    digito_invertido = num % 10;
                    num = num / 10;
                    if (num_invertido == 0) {
                        num_invertido = digito_invertido;
                    } else {
                        num_invertido = num_invertido * 10 + digito_invertido;
                    }
                }
                while(num_invertido > 0){
                    digito = num_invertido % 10;
                    num_invertido = num_invertido / 10;
                    verificarExiste = somatorio;
                    valid=1;
                    while(verificarExiste > 0){
                        digitoSomatorio = verificarExiste % 10;
                        verificarExiste = verificarExiste / 10;
                        if (digitoSomatorio == digito){
                            valid = 0;
                        }
                    }
                    if(valid == 1 && digito != 0){
                        somatorio = somatorio * 10 + digito;
                    }
                }
            }
        }while(numInserido>0);
        System.out.println(somatorio);
    }

    public static void relogio() {
        /*****************************************************************************************
         X - RELÓGIO
         Construa um programa em que dado um valor inteiro, representativo de um código de um
         relógio (Code), indique a marca do mesmo (Brand).
         ******************************************************************************************/
        int num;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Insira um número inteiro positivo: ");
            do {num = ler.nextInt();}while (num < 0); //Validador de dados
            switch (num){
                case 1:
                    System.out.println("Tag Heuer");
                    break;
                case 2:
                    System.out.println("Rolex");
                    break;
                case 3:
                    System.out.println("Omega");
                    break;
                case 4:
                    System.out.println("Cartier");
                    break;
                case 5:
                    System.out.println("Bvlgari");
                    break;
                case 6:
                    System.out.println("Raymond Weil");
                    break;
                default:
                    System.out.println("Invalid Brand.");
                    break;
            }
        }while(num > 0);
    }

    public static void div_multiplos3() {
        /*****************************************************************************************
         Y - DIVISORES MÚLTIPLOS DE 3
         Construa um programa que leia um número inteiro positivo e apresente todos os seus
         divisores que sejam múltiplos de 3.
         Deverá visualizar um divisor por linha.
         Caso não existam divisores deverá ser visualizada a mensagem "without dividers multiples of
         3".
         ******************************************************************************************/
        Scanner ler = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduza um numero inteiro positivo");
            numero = ler.nextInt();
            if (numero > 0) {

                int cont = 0;
                for (int i=1; i<=numero; i++) {

                    if (numero % i == 0 && i % 3 == 0) {
                        System.out.printf("%d \n",i);
                        cont=cont+1;
                    }
                }
                if (cont == 0) {
                    System.out.println("Without dividers multiples of 3");
                }
            }else {
                break;
            }
        }while (numero > 0) ;
    }

    public static void percent_algarismos() {
        /*****************************************************************************************
         Z - PERCENTAGEM DE ALGARISMOS PARES E MAIOR ÍMPAR
         Construa um programa em que dado um número inteiro positivo, determine a percentagem de
         algarismos pares e o maior algarismo ímpar.
         Mostre a percentagem com 2 casas decimais e os resultados em linhas separadas.
         Se não existirem algarismos ímpares deverá ser enviada a mensagem "no odd digits"
         ******************************************************************************************/
        int num, digito,contaPares=0,maiorImpar=0,cont=0;
        double percent;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número positivo: ");
        do {num = ler.nextInt();}while (num <= 0); //Validador de dados

        while (num > 0) {
            digito = num % 10;
            num = num / 10;
            cont++;
            if (digito != 0){
                if (digito % 2 == 0){
                    contaPares++;
                }else{
                    if(maiorImpar<digito){
                        maiorImpar=digito;
                    }
                }
            }else{
                contaPares++;
            }
        }
        percent = (double)contaPares / cont * 100;
        System.out.printf("%.2f%% \n", percent);
        if(maiorImpar == 0){
            System.out.println("There are no odd digits.");
        }else{
            System.out.println(maiorImpar);
        }
    }
}
