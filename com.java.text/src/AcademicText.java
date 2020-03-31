import com.sun.media.sound.AudioFloatInputStream;

import java.util.Scanner;

public class AcademicText {

    public static void main(String[] args){
        // 声明cj为成绩参数
           int cj;
           String  result="";//返回结果参数


        System.out.println("请输入成绩：");
           Scanner sc = new Scanner(System.in);
           cj  = sc.nextInt();

//判断参数条件是否正确

        if( cj == 0 ){

            System.out.println("输入错误,请重新输入");

         return;
        }

        if (cj >0 && cj<100){
            result=("A等");
        }else if (cj>70  ){
            result ="B等";

        }else if (cj!=0) {
            result="C等";

        }

        System.out.println("等级: "+result);

    }
}
