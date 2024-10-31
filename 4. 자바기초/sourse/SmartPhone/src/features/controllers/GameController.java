package features.controllers;

import features.games.*;

import java.util.Scanner;

public class GameController extends Ab_Games{
    Scanner sc = new Scanner(System.in);
    public void start(){
       System.out.println("게임을 선택해주세요");
        System.out.println("1.동물의숲 | 2.슈퍼마리오 | 3.포켓몬스터");
      int choice = sc.nextInt();
        System.out.println();
      if(choice == 1) {
          Ab_Games animal = new AnimalForest();
          animal.playGame();
      } else if (choice == 2){
          Ab_Games mario = new Supermario();
          mario.playGame();
      } else if (choice == 3){
          Ab_Games pocket = new Pocketmon();
          pocket.playGame();
      } else {
          System.out.println("번호를 잘못 입력 하셨습니다!");
      }
    };
}
