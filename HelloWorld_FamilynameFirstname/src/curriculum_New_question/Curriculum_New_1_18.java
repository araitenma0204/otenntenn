package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	
	// Q1：文字列と整数を引数に取り「Hello JavaSE 11」と出力
	
	public static void sayHello(String text, int number) {
        System.out.println("Hello JavaSE " + number);
    }

    // Q2：整数2つを掛け算して出力
	
    public static void multiply(int a, int b) {
        System.out.println("掛け算結果: " + (a * b));
    }

    // Q3：整数配列を受け取り、1つずつ出力
    
    public static void printArray(int[] array) {
        System.out.println("配列の要素:");
        for (int value : array) {
            System.out.println(value);
        }
    }

    // Q4：Q2のオーバーロード、小数2つを受け取り、足し算して出力
    
    public static void multiply(double a, double b) {
        System.out.println("小数の和: " + (a + b));
    }

    // Q5：指定回数だけランダム（1～100）な整数を生成して配列に格納＆出力、配列を返す
    
    public static int[] generateRandomNumbers(int count) {
        Random rand = new Random();
        int[] result = new int[count];
        int i = 0;
        while (i < count) {
            int num = rand.nextInt(100) + 1; // 1～100の乱数
            
            if (num != 0) {
                result[i] = num;
                System.out.println("生成された数: " + num);
                i++;
            }
        }
        return result;
    }

    // Q6：配列の平均値を出力
    
    public static double printAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        double avg = (double) sum / array.length;
        System.out.println("平均値: " + avg);
        return avg;
    }

    // Q7：平均値が50以上ならtrue、それ以外はfalse
    
    public static boolean isAboveAverage(double avg) {
        boolean result = avg >= 50;
        System.out.println("50以上か？: " + result);
        return result;
    }

    public static void main(String[] args) {
        // Q1
    	
        sayHello("Java", 11);

        // Q2
        
        multiply(3, 5);

        // Q3
        
        int[] numbers = {10, 20, 30, 40};
        printArray(numbers);

        // Q4
        
        multiply(3.5, 7.2);

        // Q5
        
        int[] randomNumbers = generateRandomNumbers(5);

        // Q6
        
        double average = printAverage(randomNumbers);

        // Q7
        
        isAboveAverage(average);
    }
}


	
		
		 