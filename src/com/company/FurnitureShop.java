package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {

    ArrayList <Furniture> purchaceList;
    Furniture arsenal[];
    int credit;
    Scanner scanner;

    public FurnitureShop() {
        System.out.println("Здравствуйте, хотите мебель? У нас есть, выбирайте. \n");
        Furniture ars[] = {new Taburetka(), new Chair(), new Pufik(), new Sofa()};
        arsenal = ars;
        credit = 0;
        purchaceList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void enterShop() {
        System.out.println("1. Табуретка. Стоит 100 рублей. Настоящая фабрика геморроя.\n" +
                "2. Стул. Нормальная тема, все любят стул, особенно твёрдый. Стоит 300.\n" +
                "3. Пуфик. Your wifu's tights. 500 рублей.\n" +
                "4. Диван, который вы точно не видели в мемах за 2000 рублей.\n" +
                "9. Желаете оплатить заказ? Ладушки.\n" +
                "0. А это выходная дверь. Почему вы на неё смотрите, она не продаётся.\n" +
                "Введите номер желаемого варианта: ");
        int variant = scanner.nextInt();
        if (variant >= 1 && variant <= 4) {
            addToCart(variant);
        } else if (variant == 9) {
            if (payday())
                return;

        } else {
            System.out.println("Что? Писю изо рта вынь, я ничерта не понял. Пойдём, проветришься.\n");
            enterShop();
        }
    }

    private void addToCart(int var) {
        purchaceList.add(arsenal[var - 1]);
        credit += arsenal[var - 1].cost;
        System.out.println(arsenal[var - 1].toString() + " теперь в корзине!\n");
        enterShop();
    }

    private boolean payday() {
        if (credit == 0) {
            System.out.println("Товарищ, да вы ничего не выбрали. Вам обратно в зал. \n");
            enterShop();
            return false;
        }
        System.out.println("Так так, пора расплачиваться. Вы выбрали: " + purchaceList.toString() + "\nСумма чека " +
                credit + ", желаете оплатить или продолжитть покупки?\n1. Оплатить. 0. Продолжить покупки.");
        int variant = scanner.nextInt();
        if (variant == 0) {
            enterShop();
            return false;
        } else if (variant != 1) {
            System.out.println("Что? Писю изо рта вынь, я ничерта не понял. Пойдём, в зале проветришься.\n");
            enterShop();
            return false;
        } else {
            System.out.println("Прекрасно. Оплата картой. Введите номер своей карты и 3 цифры на обратной" +
                    "стороне через пробел: ");
            Scanner num = new Scanner(System.in);
            String card = num.nextLine();
            System.out.println("Вау, рельно повёлся? Мебель то не настоящая. Ну, всего доброго, хе хе. \n");
            System.out.println(card);
            return true;
        }
    }
}
