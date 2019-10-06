import java.util.*;
public class matriz
{
    public static void main(String[] args) 
    {
      Scanner posicion = new Scanner(System.in);
      int num1, num2, veces, conejost, victorias = 0, fallidas = 0;
      boolean[][] matriz = new boolean[5][5]; 
      char op, ento, p3;
      int y1, p2; 
      int p1, same; 
    
      
     do 
     {
         veces = 0;
         veces = veces +1;
         conejost = 0;
         for(int x = 0; x <= 4; x++) {
         for(int y = 0; y <= 4; y++) {
         matriz[x][y] = false; 
        }
      }
      System.out.println("\f");
    
      int num3 = 0; 
      do 
      {
      num1 = (int)(Math.random() * 4) + 1;
      num2 = (int)(Math.random() * 4) + 1;
      if (matriz[num1][num2] == false) {
          matriz[num1][num2] = true;
          num3 = num3 + 1; 
      }
     } while(num3 < 4);
     do {
     int v1 = 6; 
     int con = 0;  
     System.out.println("\f");
     System.out.println("BIENVENIDO AL JUEGO DE BUSCAR CONEJOS.");
     System.out.println("PARA BUSCAR A UN CONEJO DEBES EXPLORAR LAS SIGUIENTES COORDENADAS");
     System.out.println();
     System.out.println("      1)  2)  3)  4)  5)");
     System.out.println("____________________________");
     System.out.println(" 1)   x   x   x   x   x");
     System.out.println("____________________________");
     System.out.println(" 2)   x   x   x   x   x");
     System.out.println("____________________________");
     System.out.println(" 3)   x   x   x   x   x");
     System.out.println("____________________________");
     System.out.println(" 4)   x   x   x   x   x");
     System.out.println("____________________________");
     System.out.println(" 5)   x   x   x   x   x");
     System.out.println("                            ");
     System.out.println("PARA INTRODUCIR UNA COORDENADA, PRIMERO INGRESA LA FILA");
     System.out.println("DESPUES INTRODUCE LA COLUMNA DESEADA");
     do {
        
      do { 
        System.out.println("Selecciona la fila (1 - 5) donde piensas que esta un conejo: ");
        p1 = posicion.nextInt();
        if (p1 > 5 || p1 <= 0) {
        System.out.println("Coordenadas incorrecta, lea con atención las instrucciones");
        v1 = v1 - 1;
        System.out.println("Vidas restantes: " + v1);
        }
    
      } while(p1 != 1 && p1 != 2 && p1 != 3 && p1 != 4 && p1 != 5);

      do {
        System.out.println("Selecciona la columna (1 - 5) donde piensas que esta un conejo: SS ");
        p2 = posicion.nextInt();
        if (p2 > 5 || p2 <= 0) {
        System.out.println("Coordenadas incorrecta, lea con atención las instrucciones");
        v1 = v1 - 1;
        System.out.println("Vidas restantes: " + v1);
        }
    } while(p2 != 1 && p2 != 2 && p2 != 3 && p2 != 4 && p2 != 5);
    
        p1 = p1 - 1; 
        p2 = p2 - 1;
    

    if(matriz[p1][p2] == true) {
        con = con + 1; 
        System.out.println("        ¡Encontraste un conejo!");
        System.out.println("                            ");
        System.out.println("        Conejos encontrados: " + con);
        System.out.println("                            ");
        System.out.println("        Vidas restantes " + v1);
        System.out.println("                            ");
        matriz[p1][p2] = false;
    }
    else if(matriz[p1][p2] == false) {
        v1 = v1 - 1;
        System.out.println("        ¡No encontraste nada!");
        System.out.println("                            ");
        System.out.println("        Conejos encontrados: " + con);
        System.out.println("                            ");
        System.out.println("        Vidas restantes " + v1);
        System.out.println("                            ");
        matriz[p1][p2] = false;
    }
  } while(v1 != 0 && con != 4);
  
  if(con == 4) {
    System.out.println("Felicidades, encontraste todos los conejos");
    victorias = victorias + 1;
  }
  else if(v1 <= 0) {
    System.out.println("Mala suerte, has perdido todos tus intentos");
    fallidas = fallidas + 1;
  }
  
   conejost = conejost + con;
    System.out.println();
     System.out.println(" Esta era la posición de los conejos, un conejo se encuentra donde dice TRUE ");
     System.out.println();
     System.out.println("       1 )        2 )          3 )           4 )          5 )     ");
     System.out.println(" 1 ) "+matriz[0][0]+"      "+matriz[0][1]+"        "+matriz[0][2]+"         "+matriz[0][3]+"        "+matriz[0][4]);
     System.out.println("\n");
     System.out.println(" 2 )"+matriz[1][0]+"        "+matriz[1][1]+"        "+matriz[1][2]+"       "+matriz[1][3]+"         "+matriz[1][4]);
     System.out.println("\n");
     System.out.println(" 3 )"+matriz[2][0]+"        "+matriz[2][1]+"        "+matriz[2][2]+"       "+matriz[2][3]+"         "+matriz[2][4]);
     System.out.println("\n");
     System.out.println(" 4 )"+matriz[3][0]+"        "+matriz[3][1]+"        "+matriz[3][2]+"       "+matriz[3][3]+"         "+matriz[3][4]);
     System.out.println("\n"); 
     System.out.println(" 5 )"+matriz[4][0]+"        "+matriz[4][1]+"        "+matriz[4][2]+"       "+matriz[4][3]+"         "+matriz[4][4]);
     System.out.println("\n");
     System.out.println();
    System.out.println("DESEAS VOLVER A JUGAR? S / N");
    op = posicion.next().charAt(0);
    op = Character.toUpperCase(op);
    
         } while((op != 'N') && (op != 'S'));
        } while(op != 'N');
  
    double porcentaje;
    porcentaje = (victorias / fallidas)*100;
        
  
    System.out.println();
    System.out.println("Encontraste una cantidad de: "+conejost+" conejos, en un total de "+veces+" partidas.");
    System.out.println();
    System.out.println("Ganaste un total de "+victorias+" veces y perdiste "+fallidas+" veces, tu porcentaje de victoria es de %"+porcentaje);
    System.out.println("Gracias por jugar");
    }

  
}