package tw.iii.matt;

public class matt0311t�}�C4 {    //�}�C���r���O����

	public static void main(String[] args) {
		                                    //�}�C�T�t��
		 int[]p =new int[6]; //0-5=>0
		for (int i=0 ;i<100;i++){
			int dice = (int)(Math.random()*6+1);  //1-6
			p[dice]++;
		
			}
		for (int i=0; i<p.length;i++){
			System.out.println((i+1)+"�I�X�{"+p[i]+"��");
		}
	 }
	}

