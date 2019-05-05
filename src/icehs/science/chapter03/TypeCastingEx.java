package icehs.science.chapter03;

public class TypeCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long billWealth = 7000000000L;
		System.out.println("Original Value : " + billWealth);
		
		double doublebillWealth = billWealth;
		System.out.println("double형으로 변환 : " + doublebillWealth);
		
		int intbillWealth = (int) billWealth;
		System.out.println("int형으로 강제 변환 : " + intbillWealth);
		
		byte bytebillWealth = (byte) billWealth;
		System.out.println("byte형으로 강제 변환 : " + bytebillWealth);

	}

}
