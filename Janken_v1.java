//Code by Justin Clune
import java.io.*;
 
public class Janken_v1 {
	public static void main(String[] args) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String jankenWords[] = {"グー", "チョキ", "パー"};
			int userJanken;
			int computerJanken;

			//generate a random integer between 1 and 3
			computerJanken = (int)(Math.floor(Math.random()*3)+1);

			System.out.println("じゃんけんをしましょう！");
			System.out.println("1: グー、2: チョキ、3: パー です。");
			System.out.println("じゃーんけーん・・");	
			System.out.println("出す手を入力 => ");	
	
	     	        //read user's janken choice and parse to integer
			String userInput = reader.readLine();
			userJanken = Integer.parseInt(userInput);

			if (userJanken >= 1 && userJanken <= 3 ){
			        System.out.println("ぽん！");
				System.out.println("あなた: " + jankenWords[userJanken-1] + "、コンピュータ:" + jankenWords[computerJanken-1]);
			}
			switch (userJanken){
				//user has グー
				case 1:
					switch(computerJanken){
						case 2: System.out.println("あなたの勝ちです！"); break;
						case 3: System.out.println("あなたの負けです！"); break;
               	 	        		default: System.out.println("あいこでした！");
				} break;
				//user has チョキ
				case 2:
                       		        switch(computerJanken){
                                       		case 3: System.out.println("あなたの勝ちです！"); break;
                                        	case 1: System.out.println("あなたの負けです！"); break;						           				         default: System.out.println("あいこでした！");
				} break;
				//user has パー
				case 3:
                        		switch(computerJanken){
                                        	case 1: System.out.println("あなたの勝ちです！"); break;
                                        	case 2: System.out.println("あなたの負けです！"); break;
		                        	default: System.out.println("あいこでした！");
                       		} break;                
				default: System.out.println("1～3で入力してください！");		        
			}
                } catch(IOException e){
                        System.out.println("error: "+e);
                } catch(NumberFormatException e){
                        System.out.print("数字の形式が正しくありません");
                }

	}
}
