package pt.uma.ctesp.arq.aula1;

public class Aula1 {
    public static void Ex6(){
        System.out.println("Hello World");
    }
    
    public static int Ex7(int base, int altura){
        return (2*base) + (2*altura);
    }
    
    public static float Ex8(int comp, int largura, int altura){
        return comp * largura * altura;
    }
    
    public static float Ex9(float converter){
        return (converter - 32) * 5/9;
    }
    
    public static int Ex10(int[] Entrada, int[] Saida){
        int[] finalTime = {00,00,00};
        int segundos = 0;
        for(int i = 0; i < 3; i++){
            if(Entrada[i] > Saida[i]){
                finalTime[i] = Entrada[i] - Saida[i];
            }else{
                finalTime[i] = Saida[i] - Entrada[i];
            }
        }
        if(finalTime[0]!= 0){
            segundos = 3600 * finalTime[0];
        }
        if(finalTime[1] != 0){
            segundos += finalTime[1] * 60;
        }
        if(finalTime[2] != 0){
            segundos += finalTime[2];
        }
        return segundos;
    }
    
    static class Ex11{
        public static int maximo(int[] numeros){
            int retornar = 0;
            for(int i = 0; i < numeros.length; i++ ){
                if(numeros[i] > retornar){
                    retornar = numeros[i];
                }
            }
            return retornar;
        }
        
        public static int minimo(int[] numeros){
            int retornar = 0;
            for(int i = 0; i < numeros.length; i++ ){
                if(numeros[i] < retornar){
                    retornar = numeros[i];
                }
            }
            return retornar;
        }
        
        public static float media(int[] numeros){
            float soma = 0;
            for(int i = 0; i < numeros.length; i++){
                soma += numeros[i];
            }
            return soma / numeros.length;
        }
    }
    
}
