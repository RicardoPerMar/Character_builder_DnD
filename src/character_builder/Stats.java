/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package character_builder;
import character_builder.Selector;

/**
 *
 * @author Rizkhard
 */
public class Stats {
    Selector selector = new Selector();
//    int str = 10;
//    int dex = 10;
//    int con = 10;
//    int wis = 10;
//    int intel = 10;
//    int cha = 10;
    int str = selector.str;
    int dex = selector.dex;
    int con = selector.con;
    int wis = selector.wis;
    int intel = selector.intel;
    int cha = selector.cha;

    protected void race_calculator(String race_selected) {

        

        switch (race_selected) {
            case "Dragonborn":
                str += 2;
                cha += 1;
                break;
            case "Dwarf":
                con += 2;
                break;
            case "Elf":
                dex += 2;
                break;
            case "Gnome":
                intel += 2;
                break;
            case "Half-Elf":
                cha += 2;
                break;
            case "Halfling":
                dex += 2;
                break;
            case "Half-Orc":
                str += 2;
                con += 1;
                break;
            case "Human":
                str += 1;
                dex += 1;
                con += 1;
                wis += 1;
                intel += 1;
                cha += 1;
                break;
            case "Tiefling":
                cha += 2;
                intel += 1;
                break;
            default:
                System.out.println("No pasa nada");
                ;
        }

    }
}
