package tw.iii.matt;

public class matt0311tapokerv1 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();  //�B�z�ɶ�����t
		  int[] poker = new int[52] ; //0-51
		  for (int i=0 ; i<52 ; i++){
			  int temp = (int) (Math.random()*52);
			  //�ˬd����  �O�_������
			 boolean isRepeat = false;
			  for(int j=0; j<i;j++){           //�ˬd�e���O�_��I����
				  if (poker[j]==temp){
					  isRepeat = true;
					  break;        //�o���p�G�S�L�N�O���� ���X
				  }
			  }
			  if(!isRepeat){
				  poker[i] =temp;
				 System.out.println(poker[i]);
			  }else{
				  i--;    //���ƪ������A�i�h�]
				  
			  }
			
		  }
        System.out.println(System.currentTimeMillis()-start);
	}

}
