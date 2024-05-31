package study.lang.literal;

public class Test02 {
    public static void main(String[] args) {
        int decimal = 100; // 10진수
        int binary = 0b01100100; // 2진수
        int octal = 0144; // 8진수
        int hex = 0x64; // 16진수

        System.out.println(decimal);
        System.out.println(binary);
        System.out.println(octal);
        System.out.println(hex);

        System.out.println("---------------------------------------");

        System.out.println(decimal);
        System.out.println(Integer.toBinaryString(decimal)); // 2진수
        System.out.println(Integer.toOctalString(decimal)); // 8진수
        System.out.println(Integer.toHexString(decimal)); // 16진수

    }

}
