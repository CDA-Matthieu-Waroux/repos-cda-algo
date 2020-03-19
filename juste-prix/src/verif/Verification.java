package verif;

public class Verification {
	private static boolean result=false;

	public static boolean verifCompteur(int compteur) {
		if ( compteur >15) {
			result=true;
		}
		return result;
	}
	
	public static boolean verifEntree(int max , int min) {
		if(min<10000 || max>50000) {
			result=true;
		}
		return result;
	}
}
