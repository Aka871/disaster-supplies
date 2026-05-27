package com.aka.disastersupplies;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DisastersuppliesApplication {

  // itemListはクラス変数かインスタンス変数か。クラス変数
  static Map<Integer, String> itemList = new HashMap<>();

  public static void main(String[] args) {
    SpringApplication.run(DisastersuppliesApplication.class, args);

    // ItemNameとquantityの宣言
    // 代入
    // printlnで出力してみる
    String itemName = "water";
    int quantity = 1;
    System.out.println(itemName);
    System.out.println(quantity);

    DisastersuppliesApplication.putItem();
    DisastersuppliesApplication.getItems();
  }

  // メソッドの種類は？共通のクラスメソッドで
  public static void putItem() {
    itemList.put(2, "food");
    itemList.put(3, "dryBattery");
    System.out.println(itemList);
  }

  @GetMapping("/items")
  public static Map getItems() {
    return DisastersuppliesApplication.itemList;
  }
}
