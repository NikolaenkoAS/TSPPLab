/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.time.LocalDate;

/**
 *
 * @author ambrosiy
 */
public class Reader {

    final String name;
    final String surname;
    final String patronymic;
    final String adres;
    final String phoneNumber;
    final LocalDate birthDate;

    public Reader(String name, String surname, String patronymic, String adres, String phoneNumber, LocalDate birthDate) {

        // if (name.length()<3 || name.length()>12 || surname.length()>15 || )
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.adres = adres;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAdres() {
        return adres;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

}
