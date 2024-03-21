package jungsuk.ch09;
public class Ex9_10_1 {
    public static String format(String str, int length, int alignment) {
        if (str.length() >= length) { // 문자열 길이가 length보다 크거나 같은 경우
            return str.substring(0, length); // length만큼만 잘라서 반환
        } else { // 문자열 길이가 length보다 작은 경우
            char[] result = new char[length]; // length 크기의 char 배열 생성
            int spaces = length - str.length(); // 필요한 공백 개수 계산
            int startPos = 0; // 문자열 복사 시작 위치 초기화

            switch (alignment) {
                case 0: // 왼쪽 정렬
                    System.arraycopy(str.toCharArray(), 0, result, 0, str.length());
                    startPos = str.length();
                    break;
                case 1: // 가운데 정렬
                    startPos = spaces / 2;
                    System.arraycopy(str.toCharArray(), 0, result, startPos, str.length());
                    break;
                case 2: // 오른쪽 정렬
                    startPos = spaces;
                    System.arraycopy(str.toCharArray(), 0, result, startPos, str.length());
                    break;
            }

            // 공백 삽입
            for (int i = 0; i < spaces; i++) {
                result[startPos + i] = ' ';
            }

            return new String(result); // char 배열을 문자열로 변환하여 반환
        }
    }

    public static void main(String[] args) {
        String str = "가나다"; 
        
        System.out.println(format(str, 7, 0)); // 왼쪽 정렬
        System.out.println(format(str, 7, 1)); // 가운데 정렬
        System.out.println(format(str, 7, 2)); // 오른쪽 정렬
    }
}