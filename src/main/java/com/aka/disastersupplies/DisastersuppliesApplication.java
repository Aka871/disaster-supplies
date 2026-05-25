package com.aka.disastersupplies;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DisastersuppliesApplication {

  public static void main(String[] args) {
    SpringApplication.run(DisastersuppliesApplication.class, args);

    // ItemNameとquantityの宣言
    // 代入
    // printlnで出力してみる
    String itemName = "water";
    int quantity = 1;
    System.out.println(itemName);
    System.out.println(quantity);

    // Map使ってみる
    Map<String, Integer> itemList = new HashMap<>();
    itemList.put("water", 1);
    System.out.println(itemList);
  }

}
