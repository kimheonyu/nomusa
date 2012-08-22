class Test
{
	public static void main(String[] args)
	{
		char[] c = {'a','b','c','d','f','g'};
		stringReverse(c);
		
		for(int i = 0; i < c.length; i++){
			System.out.print((i==0) ? "" + c[i] : "," + c[i]);
		}
		System.out.println();
	}
	
	static void stringReverse(char[] c) {
		String str = new String(c);
		int index = 0;
		index = c.length - 1;
		
		for(int i = 0;  i < c.length; i++){
			c[i] = str.charAt(index);
			index--;
		}
	}
}