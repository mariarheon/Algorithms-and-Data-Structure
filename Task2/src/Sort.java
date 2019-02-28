/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria Mikhaleva
 * @version dated Feb 22 2019
 */
public class Sort {
    //сортировка пузырьком
    public static void sortBubble(int[] mass){
    int in, out;
    for (out = mass.length - 1; out >= 1; out--)
        for (in = 0; in < out; in++){
            if (mass[in] > mass[in + 1])
               change(mass, in, in + 1);
        }
    }
    //сортировка методом выбора
    public static void sortSelect(int[] mass){
        int mark;
        for (int i = 0; i < mass.length; i++){
            mark = i;
            for (int j = i + 1; j < mass.length; j++)
                if(mass[j] < mass[mark])
                    mark = j;
            change(mass, i, mark);
        }
    }
    
    //сортировка методом вставки
    public static void sortInsert(int[] mass){
        int i, j;
        for (i = 1; i < mass.length; i++){
            for (j = i - 1; j >= 0; j--)
                if (mass[j] > mass[j+1])
                    change(mass, j, j+1);
        }
    }
    
    public static void change(int[] mass, int i, int j){
        int temp = mass[i];
        mass[i] = mass[j];
        mass[j] = temp;
    }
}
