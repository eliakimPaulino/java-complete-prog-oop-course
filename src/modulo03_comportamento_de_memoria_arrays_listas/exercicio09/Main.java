package modulo03_comportamento_de_memoria_arrays_listas.exercicio09;

import java.util.Scanner;

import modulo03_comportamento_de_memoria_arrays_listas.exercicio09.entitie.Student;

/*
A dona de um pensionato possui dez quarto para alugar para estudantes, sendo esses quartos 
indentificados pelos números de 0 a 9. Faça um programa que inicie com todos os quartos vazios,
e depois leia uma quantidade N representando o número de estudantes que vão alugar quartos
(N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada registro de
aluguel, informar o nome do estudante, email e o número do quarto escolhido (0 a 9). Suponha que 
seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de todas as 
ocupações do pensionato, por ordem de quarto, conforme exemplo:

How many rooms will be rented? 3
Rent #1:
Name: Maria Brown
Email: maria@gmail.com
Room: 3

Rent #2:
Name: Alex Green
Email: alex@gmail.com
Room: 1

Rent #3:
Name: Bob Grey
Email: bob@gmail.com
Room: 8

Busy rooms:
Room 1: Alex Green, alex@gmail.com
Room 3: Maria Brown, maria@gmail.com
Room 8: Bob Grey, bob@gmail.com

*/

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] rooms = new Student[10];

        System.out.print("How many rooms will be rented? ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println();
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            sc.nextLine(); // Consumir a quebra de linha pendente
            String name = sc.nextLine().trim();
            System.out.print("Email: ");
            String email = sc.nextLine().trim();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            rooms[roomNumber] = new Student(name, email, roomNumber);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                continue; // Pular quartos vazios
            }
            System.out.println(
                    "Room " 
                    + rooms[i].getRoomNumber() 
                    + ": " + rooms[i].getName() 
                    + ", " + rooms[i].getEmail());
        }

        sc.close();
    }

}
