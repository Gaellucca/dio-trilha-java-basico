public class operadores {
    public static void main(String[] args) throws Exception {

        String nomeCompleto = "Limguagem"+"Java";
        System.out.println(nomeCompleto);

        //qual o resultado das expressoes abaixo?
        String concatenacao ="?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);

        int numero = 5;
        
        // numero = - numero;
        System.out.println(- numero);
        // numero = numero * -1;
        System.out.println(numero);

        //x repeticao
        //numero = numero + 1;
        //numero--;
        numero++;
        System.out.println(numero);
        
        boolean variavel =true;
        
        variavel = !variavel;

        System.out.println(variavel);

        //operador ternario
        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";
                    //forma simplificada á cima
        //if (a==b) 
          //  resultado = "verdadeiro";
        //else
          //  resultado = "falso"; 

            System.out.println(resultado);
            
            //operadores logicos

            boolean condicao1 = false;
            
            boolean condicao2 = true;

            if (condicao1 && condicao2)  {
                System.out.println("as duas condiçoes sao verdadeiras");

            }
            if (condicao1 || condicao2)  {
                System.out.println("as duas condiçoes sao verdadeiras");

            }



            
        }
} 

