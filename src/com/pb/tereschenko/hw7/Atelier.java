package com.pb.tereschenko.hw7;

import static com.pb.tereschenko.hw7.Size.*;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[]{
                new Tshirt(L, 154, "синий"),
                new Skirt(S, 499, "желтый"),
                new Pants(XXS, 40, "зеленый"),
                new Skirt(M, 38, "Оранжевый"),
                new Tie(XS, 22, "красный")
        };


        System.out.println("Список мужской одежды");
        dressMan(clothes);
        System.out.println();

        System.out.println("Список женской одежды");
        dressWomen(clothes);

    }

    static void dressMan(Clothes[] clothes) {
        for (Clothes el : clothes) {
            if (el instanceof ManClothes) {
                ((ManClothes) el).dressMan();
                System.out.println();
            }
        }
    }
    static void dressWomen(Clothes[] clothes){
        for (Clothes el: clothes){
            if(el instanceof WomenClothes){
                ((WomenClothes) el).dressWomen();
                System.out.println();
            }
        }
    }
}
