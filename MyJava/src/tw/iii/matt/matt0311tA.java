package tw.iii.matt;

public class matt0311tA {

	public static void main(String[] args) {
				for(int i=1,j=10; i<9; i++,j--){   // �i�H�j�}�z�ǥy
					System.out.println(i+":"+j);
					if(j==7){                        //���==�s���
						break;                        //���󦨥ߴ������} 
					}
				}
		System.out.println("-----------------");
		
		for (int i=0; i<10; i++){
			if(i%2==0) continue;   //�u�n��Q2�㰣�����^��i++ 16�椣��
			System.out.println(i);       //�L�X���
		}
		System.out.println("-----------------");
		matt: // break matt �u��аO�j�鵲�c ������o�� ����аO��L�ԭz�y
		for (int i=0; i<10;i++){
			for(int j=9; j>0 ;j--){
				System.out.println(i+":"+j);
				if(j%5==0) break  matt;    //�p�G�o���ܦ�contine matt �N����аO���j�j�� �p�S�аO�N�b�p�j��
				  //cotiune; sysout   �o��N��ܨS�N�q
			}     //<�W����break ������o��  
			
			
		}
	}

}
