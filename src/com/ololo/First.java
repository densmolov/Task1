package com.ololo;

/*2. В Идее создать новый проект по шаблону hello world. Он есть встроенный. Так у тебя появится класс Main.
        Создать класс First в том же пакете.
        Создать класс Second в другом пакете.
        3. Класс First хранит в себе массив из 10 строк. Любых.
        4. Класс Second умеет печатать эти 10 строк.
        edited
        4. В классе Main в методе main() ты выводишь на печать 10 строк в консоли Идеи. Каждый String с новой строки.
        5. Результат- на гитхабе.*/

public class First {

    private String[] firstString = {"G", "H", "d", "t", "e", "r", "w", "q", "U"};

    public String[] getArr() {
        return firstString;
    }

    public void printSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

