/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * *
 * @author ACER
 * Nama: Siti Furkotun Najiyah
 * NIM: 23215056
 * PRODI: Teknik Informatika
 */
import java.util.Scanner;

public class Cakep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kamu ngerjain sendiri latihan 17 sampai latihan 30 ini? (Yoi/Enggak): ");
        String jawaban = scanner.nextLine().toLowerCase();

        if (jawaban.equals("yoi")) {
            System.out.println("Cakep Bener. Good Job");
        } else {
            System.out.println("Tetep cakep sih.");
            System.out.println("Sing penting paham konsep nya yee.");
            System.out.println("Keep the code works dude");
        }
    }
}
