package Curriculum_27_app;

import java.util.Scanner;

import Curriculum_27_logic.Chimpanzee;
import Curriculum_27_logic.Elephant;
import Curriculum_27_logic.Lion;
import Curriculum_27_logic.Panda;
import Curriculum_27_logic.Parrot;
import Curriculum_27_logic.Zebra;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("動物情報を「名前：速度：重量」の形式でコンソールに入力してください > ");
            String input = scanner.nextLine();

            // 【ヌルチェック＆空文字チェック】
            
            if (input == null || input.trim().isEmpty()) {
                System.out.println("入力が空です。もう一度入力してください。");
                continue; // 空入力なら再入力へ戻る
            }

            // 全角・半角コロン両方対応で分割
            
            String[] parts = input.split("[：:]");

            if (parts.length != 3) {
                System.out.println("入力形式が間違っています。正しく入力してください。");
                continue; // 形式違反なら再入力へ戻る
            }

            String name = parts[0];
            double speed = 0;
            int weight = 0;

            try {
                speed = Double.parseDouble(parts[1]); //コンソールに入力している値は文字列だから変換してる
                weight = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e) {
                System.out.println("速度または重量が数値として正しくありません。");
                continue; // 数値変換失敗なら再入力へ戻る
            }

            boolean found = true;

            if (name.equals("ライオン")) {
                new Lion(name, speed, weight).display();
            } else if (name.equals("ゾウ")) {
                new Elephant(name, speed, weight).display();
            } else if (name.equals("パンダ")) {
                new Panda(name, speed, weight).display();
            } else if (name.equals("チンパンジー")) {
                new Chimpanzee(name, speed, weight).display();
            } else if (name.equals("シマウマ")) {
                new Zebra(name, speed, weight).display();
            } else if (name.equals("オウム")) {
                new Parrot(name, speed, weight).display();
            } else {
                System.out.println("その動物には対応していません。");
                found = false;
            }

            if (found)
                break; // 成功したらループ終了
        }

        scanner.close();
    }
}

