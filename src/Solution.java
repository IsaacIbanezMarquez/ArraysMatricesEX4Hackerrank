

import java.io.*;
import java.util.*;


//  ENUNCIADO:

// Fusió arrays ordenats:

/* Donats dos arrays de valors enters ORDENATS, crea un tercer array i introdueix els elements de forma ordenada, finalment imprimeix aquest tercer array ordenat.

PISTA: (Cal crear un tercer array de tamany la suma de tamanys dels dos arrays d'entrada)

Input Format

N: Tamany del primer array. N valors enters del primer array. M: Tamany del segon array. M valors enters del segon array.

Constraints

No n'hi ha.

Output Format

Valors ordenats de l'array fusió que té tamany N+M valors.

Sample Input 0

5
2 4 6 8 10
6
3 4 9 11 12 15
Sample Output 0

2 3 4 4 6 8 9 10 11 12 15

 */




public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        int grosor = sc.nextInt();
        int miArray [] = new int [grosor];

        for (int i = 0; i < grosor; i++)
        {
            miArray [i] = sc.nextInt();
        }

        int grosor2 = sc.nextInt();
        int miArray2 [] = new int [grosor2];

        for (int i = 0; i < grosor2; i++)
        {
            miArray2[i] = sc.nextInt();
        }

        int grosor3 = grosor + grosor2;

        int miArray3 [] = new int [grosor3];

        int Contador1 = 0;
        int Contador2 = 0;


        for (int i = 0; i < grosor3; i++)
        {
            if(Contador1 >= grosor)
            {
                System.out.print(miArray2[Contador2] + " ");
                Contador2++;

            }
            else if(Contador2 >= grosor2)
            {
                System.out.print(miArray[Contador1] + " ");
                Contador1++;

            }



            else if (miArray[Contador1] <= miArray2[Contador2])
            {
                System.out.print(miArray[Contador1] + " ");
                Contador1++;
            }
            else
            {
                System.out.print(miArray2[Contador2] + " ");
                Contador2++;
            }



        }
    }
}
