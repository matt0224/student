package tw.iii.matt;

public class matt0311tA {

	public static void main(String[] args) {
				for(int i=1,j=10; i<9; i++,j--){   // 可以隔開述序句
					System.out.println(i+":"+j);
					if(j==7){                        //兩個==叫比對
						break;                        //條件成立提早離開 
					}
				}
		System.out.println("-----------------");
		
		for (int i=0; i<10; i++){
			if(i%2==0) continue;   //只要能被2整除直接回到i++ 16行不做
			System.out.println(i);       //印出基數
		}
		System.out.println("-----------------");
		matt: // break matt 只能標記迴圈結構 脫離到這邊 不能標記其他敘述句
		for (int i=0; i<10;i++){
			for(int j=9; j>0 ;j--){
				System.out.println(i+":"+j);
				if(j%5==0) break  matt;    //如果這行變成contine matt 將執行標記的大迴圈 如沒標記就在小迴圈
				  //cotiune; sysout   這行將顯示沒意義
			}     //<上面的break 脫離到這圈  
			
			
		}
	}

}
