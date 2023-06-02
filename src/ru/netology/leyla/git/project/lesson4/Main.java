package ru.netology.leyla.git.project.lesson4;

public class Main {
    public static void main(String[] args){
        MagicBox<String> stringMagicBox = new MagicBox<>(5);
        stringMagicBox.add("87");
        stringMagicBox.add("boxBox");
        stringMagicBox.add("magicMagic");
        stringMagicBox.add("boxQ");
        stringMagicBox.add("longBox");

        String pick = stringMagicBox.pick();
        System.out.println(pick);

    }
}
