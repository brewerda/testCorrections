public class corrections {


//Recombine 1A)
	public static String recombine(String word1, String word2) {
		return word1.substring(0, (word1.length() / 2)) + word2.substring((word2.length() / 2), word2.length());
	}


//Mixed Words 1B)
	public static String[] mixedWords(String[] words) {
		String[] result = new String[words.length()];
		for (int i=0; i<words.length; i++) {
			if(i % 2 == 0) {
				result[i] = recombine(words[i],words[i+1]);

			} else {
				result[i] = recombine(words[i], words[i-1]);
			}
		}
		return result;
	}

//Get Peak Index 2A)
	public static int getPeakIndex(int[] array) {
		//Original Code Unsimplified
		
	// 	int result = -1;

	// 	for (int i=1; i<array.length() - 1;i++ ) {
	// 		if(array[i] > array[i-1] && array[i] > array[i+1]) {
	// 			result = i;
	// 		}
	// 		}
	// 		return result;
	   for (int k = 1; k<array.length - 1; k++) {
	   	if(array[k-1] <array[k] && array[k] > array[k + 1]) {
	   		return k;
	   	}
	   }
	   return -1;
	 }

//Is Mountain 2B)
	public static boolean isMountain(int[] array) {
		//Original Code Unsimplified
		
		// boolean mountain = false;
		// int peakspot = getPeakIndex(array);
		// int peakheight = array[peakspot];
		// if(isIncreasing(array,peakspot) == true) {
		// 	if(isDecreasing(array,peakspot)) {
		// 		mountain = true;
		// 	}
		// }
		// return mountain;
		int peakspot = getPeakIndex(array);
		return (peak != -1) && isIncreasing(array,peakspot) && isDecreasing(array,peakspot);
	}
}