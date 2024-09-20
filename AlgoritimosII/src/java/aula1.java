

public class aula1 {
    public static void main(String[] args){

        int[] a = {7, 2, 5, 8, 4};
        int[] b = {4, 2, 9, 5};
        String c = diferenca(a, b);
        System.out.println(c);
      }
    
      public static String diferenca (int[] a, int[] b) {
      
        String res = " ";
        boolean achou = false;
        for(int i = 0; i < a.length;i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    achou = true;
                    break;
                }
            }
            if(!achou){
                res = res + a[i]+ " ";
            }
        }
        return res;
    }

 }


