package com.aka.disastersupplies;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DisastersuppliesApplication {

  // itemListはクラス変数かインスタンス変数か。クラス変数
  // アイテム名をキーに、数量を紐付けたい
  static Map<String, Integer> itemList = new HashMap<>();

  public static void main(String[] args) {
    SpringApplication.run(DisastersuppliesApplication.class, args);

    // 動作確認用に固定値を登録
    DisastersuppliesApplication.putItem("water", 3);
    System.out.println(itemList);
  }

  // メソッドの種類は？共通のクラスメソッドで
  // アイテム名と数量を紐付けて、static変数のitemListに登録したい
  @PostMapping("/items")
  public static void putItem(String itemName, Integer quantity) {
    DisastersuppliesApplication.itemList.put(itemName, quantity);
  }

  @GetMapping("/items")
  public static Map<String, Integer> getItems() {
    return DisastersuppliesApplication.itemList;
  }
}
