/*
  E(r) = a (bb*)*
 Para realizar el programa utilizamos metodos para simular cada estado (q's)

 */
package automatas;


import java.util.Scanner;//Aquí importamos la librería que nos permitirá ingresar cadenas

public class prueba {
    
    Scanner entra =  new Scanner(System.in);//Creamos el objeto entra para poder ingresar
    String cadena;//Declaramos la variable cadena de tipo string
    int cont=0;//
    char [] c;// Creamos una cadena de caracteres que nos permitirá recorrer la cadena
    public prueba()//Constructor
    {
      cadena=entra.next();
      c = cadena.toCharArray();//nuestro arreglo de caracteres lo igualamos a nuestra cadena mediante la función toCharArray();
      inicio();
    }
    
    public void inicio()// Metodo donde igualamos nuestro contador a 0 y llamamos a nuestro estado inicial del autómata
    {
        cont = 0;
        q0();
    }
    
    public void q0()//Estado q0. Primero nos confirma si el tamaño del contador es menor que el arreglo de caracteres
    {               
        if(cont<c.length)
        {
            if(c[cont]=='a')//  Nos valida si la posición donde está es igual a "a". Si así es, pasará al siguiente estado, ya que cumplió la expresión regular. Y aumentamos el contador
            {
                cont++;
                q1();
            }
            else// Claramente si es diferente de a, no será una cadena valida, ya que no cumple con la expresión regular
            {
                System.out.print("Cadena no valida");
            }
        }
        else
        {
            System.out.print("Cadena valida");
        }
        
    }
    public void q1()
    {
         if(cont<c.length)
        {
            if(c[cont]=='a')//  Nos valida si la posición donde está es igual a "a". Si así es, no pasará al siguiente estado, ya que no cumplió la expresión regular. Ya que solamente puede ir una a
            {
                System.out.print("Cadena no valida");
                
            }
            else
            {
                if(c[cont]=='b')//  Nos valida si la posición donde está es igual a "b". Si así es, pasará al siguiente estado, ya que cumplió la expresión regular. Y aumentamos el contador
                {
                    cont++;
                    q2();
                
                }
                else// Claramente si es diferente de a, no será una cadena valida, ya que no cumple con la expresión regular
                {
                    System.out.print("Cadena no valida");
                }
            }
        }
         else
        {
            System.out.print("Cadena valida");
        }
        
    }
    public void q2()
    {
        if(cont<c.length)
        {
            if(c[cont]=='a')//  Nos valida si la posición donde está es igual a "a". Si así es, no pasará al siguiente estado, ya que no cumplió la expresión regular. Ya que solamente puede ir una a y es al principio
            {
                System.out.print("Cadena no valida");
                
            }
            else
            {
                if(c[cont]=='b')//  Nos valida si la posición donde está es igual a "b". Si así es, pasará al siguiente estado(en este caso regresará al estado q1), ya que cumplió la expresión regular. Y aumentamos el contador
                {
                    cont++;
                    q1();
                }
                else
                {
                    System.out.print("Cadena no valida");
                }
            }
        }
        else
        {
            System.out.print("Cadena valida");
        }
        
    }
  
}
