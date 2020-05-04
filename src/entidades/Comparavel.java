
package entidades;


public class Comparavel {
    private Integer num;

    public Comparavel(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
    public void émaiorOuIgual(int num){
    if(num>=10){
                System.out.println("è maior ou igual numero existente");
                System.out.println(true);
    
    }
    else{
        
        System.out.println(false);
    }
    
    }
    
    public void éMenorOuIgual(int num){
    if(num<=10){
        System.out.println("é menor ou igual ao numero existente");
        System.out.println(true);
    }
      else{
        System.out.println();
        System.out.println(false);
    }
   
    
    }
    public int éDiferenteDe (int num){
    if(num==10){
        System.out.println("é igualao numero existente");
        System.out.println(true);
    }
      else{
        System.out.println("é diferente ao numero existente");
        System.out.println(false);
    }
     return num;
}
     
}
