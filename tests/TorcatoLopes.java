
import java.util.Scanner;

/*****************************************
 ********* Teste Java ********************
 ****************************************/
public class TorcatoLopes {
    public static void main(String[] args) {
        int num_aulas,num_intrutor,num_participantes,nivel_dif,cont_participantes=0;
        int totalA=0,totalB=0,contA=0,contB=0;
        double media,faturacaoA,faturacaoB;
        final int PRECO_A = 8;
        final int PRECO_B = 12;
        Scanner ler = new Scanner(System.in);
        

        System.out.println("Academia de Fitness");
        System.out.println("Digite o número de aulas que pretende registar (1 a 15): ");
        do{num_aulas=ler.nextInt();}while(num_aulas<1 || num_aulas>15);

        for (int i = 0; i<num_aulas;i++){
            System.out.println("Digite o número do intrutor que deu a aulas (1 a 6): "); //Intrutor
            do{num_intrutor=ler.nextInt();}while(num_intrutor<1 || num_intrutor>6);
            System.out.println("Digite o número de participantes (1 a 20): "); //Participantes
            do{num_participantes=ler.nextInt();}while(num_participantes<1 || num_participantes>20);
            System.out.println("Digite o nível de dificuldade (1-Iniciante 2-Avançado): "); //Nivel de dificultade
            do{nivel_dif=ler.nextInt();}while(nivel_dif<1 || nivel_dif>2);
            cont_participantes=cont_participantes+num_participantes;

            if(num_intrutor % 2 == 0){
                contB=contB+num_participantes;
                if(nivel_dif==1){
                    totalB=totalB + (num_participantes * PRECO_A);
                }else{
                    totalB=totalB + (num_participantes * PRECO_B);
                }
            }else{
                contA=contA+num_participantes;
                if(nivel_dif==1){
                    totalA=totalA + (num_participantes * PRECO_A);
                }else{
                    totalA=totalA + (num_participantes * PRECO_B);
                }
            }
        }
        media = (double)cont_participantes/num_aulas;
        faturacaoA = (double)totalA / (totalA+totalB);
        faturacaoB = (double)totalB / (totalA+totalB);

        System.out.printf("Média de participantes por aula: %.1f\n",media);
        System.out.printf("Faturação: turno A=%.1f%% e turno B=%.1f%%\n",faturacaoA*100,faturacaoB*100);
        if(contA > contB){
            System.out.println("O turno A teve mais participantes");
        }else if(contA < contB){
            System.out.println("O turno B teve mais participantes");
        }else{
            System.out.println("Os dois turnos tiveram o mesmo número de participantes");
        }
        ler.close();
    }
}
