package javafundamentals;

public class Task_11_2_StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
        sb.append("Java is powerful.");

        System.out.println("After append: " + sb);

        sb.insert(8, "very ");  

        System.out.println("After insert: " + sb);

        sb.delete(13, 21);  

        System.out.println("After delete: " + sb);
	}

}
