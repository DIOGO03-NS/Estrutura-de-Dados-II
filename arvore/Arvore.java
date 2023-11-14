import java.util.Random;
public class Arvore{
    public static void main(String[] args) {
        int dadosArvore[] = new int[20];

        NoArvore arvore = new NoArvore();
        Random random = new Random();
        
        int no = random.nextInt(100);
        dadosArvore[0] = no;
        arvore.InsereRaiz(arvore, no);


        for(int i = 1; i < 20; i++){
            int numero = random.nextInt(20);
            dadosArvore[i] = numero;
            arvore.Insere(arvore, numero);
        }

        /* 
        arvore.InsereRaiz(arvore, 8);
        arvore.Insere(arvore, 4);
        arvore.Insere(arvore, 12);
        arvore.Insere(arvore, 2);
        arvore.Insere(arvore, 6);
        arvore.Insere(arvore, 10);
        arvore.Insere(arvore, 14);
        arvore.Insere(arvore, 1);
        arvore.Insere(arvore, 3);
        arvore.Insere(arvore, 5);
        arvore.Insere(arvore, 11);
        arvore.Insere(arvore, 13);
        arvore.Insere(arvore, 15);
        */

        System.out.println("===============================");

        arvore.prefixa(arvore);
        System.out.println();
        arvore.infixa(arvore);
        System.out.println();
        arvore.posfixa(arvore);
        System.out.println();
        arvore.byLevel(arvore);
        System.out.println();

        System.out.println("===============================");
        
        for(int i = 1; i <= 5; i++){
            int numero = random.nextInt(20);
            arvore.Retira(arvore, dadosArvore[numero]);
            dadosArvore[numero] = dadosArvore[numero + 1];
        }

        arvore.prefixa(arvore);
        System.out.println();
        arvore.infixa(arvore);
        System.out.println();
        arvore.posfixa(arvore);
        System.out.println();
        arvore.byLevel(arvore);

        System.out.println();
        System.out.println("===============================");
    }

}