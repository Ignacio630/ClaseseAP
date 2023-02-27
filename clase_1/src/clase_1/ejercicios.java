package clase_1;

public class ejercicios {

	public static void main(String[] args) {
		int numI = 2;
		int numF = 12;
		boolean flag = true;
		
		while (numI <= numF) {
			if(numI %2 == 0 && flag) {
				System.out.println(numI);
			}
			if(numI %2 != 0 && !flag){
				System.out.println(numI);
			}
			numI++;
		}
	}

}