package class_02;

public class Code_05_Manacher_ShortestEnd {

	public static char[] manacherString(String str) {
		char[] charArr = str.toCharArray();
		char[] res = new char[str.length() * 2 + 1];
		int index = 0;
		for (int i = 0; i != res.length; i++) {
			res[i] = (i & 1) == 0 ? '#' : charArr[index++];
		}
		return res;
	}

	public static String shortestEnd(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		char[] charArr = manacherString(str);
		int[] pArr = new int[charArr.length];
		int C = -1;
		int R = -1;
		int maxContainsEnd = -1;
		for (int i = 0; i != charArr.length; i++) {
			pArr[i] = R > i ? Math.min(pArr[2 * C - i], R - i) : 1;
			while (i + pArr[i] < charArr.length && i - pArr[i] > -1) {
				if (charArr[i + pArr[i]] == charArr[i - pArr[i]])
					pArr[i]++;
				else {
					break;
				}
			}
			if (i + pArr[i] > R) {
				R = i + pArr[i];
				C = i;
			}
			if (R == charArr.length){
				maxContainsEnd = pArr[i];
				break;
			}
		}
		//res：存放结果字符数组
		//str.length() - maxContainsEnd + 1 ： 字符串长度减去回文区域就是需要添加的区域。
		char[] val = new char[str.length()-maxContainsEnd+1];
		for (int i = 0; i < val.length; i++) {
			val[val.length-1-i] = charArr[i*2+1];
		}
		return String.valueOf(val);
	}

	public static void main(String[] args) {
		String str2 = "abcd123321";
		System.out.println(str2);
		System.out.println(shortestEnd(str2));

	}

}
