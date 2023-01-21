package Task7;

import java.util.ArrayList;
import java.util.List;

//ZADANIE 7.
//Stwórz klasę imitującą magazynek do broni. Klasa powinna mieć możliwość definiowania rozmiaru magazynka za pomocą konstruktora.
// Zaimplementuj metody:
//loadBullet(String bullet) → dodawanie naboju do magazynka, nie pozwala załadować więcej naboi niż wynosi pojemność magazynka
//isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie
//shot() → jedno wywołanie wystrzeliwuje (wypisuje w konsoli wartość string) jeden - ostatni załadowany nabój i przygotowuje kolejny,
// załadowany przed ostatnim, jeżeli nie ma więcej nabojów to wypisuje w konsoli “pusty magazynek”
public class Gun {
    private int maxMagazineSize;
    private List<String> magazine = new ArrayList<String>();

    {
        System.out.println("Pusty magazynek");
    }

    public Gun(int magazineSize) {
        this.maxMagazineSize = magazineSize;
    }

    public void loadBullet(String bulletName) {


        if (maxMagazineSize <= magazine.size()) {
            System.out.println("Przekroczono limit");
            return;
        }
        magazine.add(bulletName); //dodaje bullet do listy
        System.out.println(magazine);
    }

    public boolean isLoaded(){
        if(magazine.size() > 0){
            return true;
        }else {
            return false;
        }
    }

    public void shot(){
        if(isLoaded()){
            System.out.println("Pif paf " + magazine.remove(magazine.size() - 1));
        }else {
            System.out.println("Pusty magazynek");
        }

    }
    public void loadWithBullets(int numberOfBullets){
        for (int i = 1; i <= numberOfBullets; i++) {
            loadBullet("Bullet" + i);
        }
    }
    public void shotBullets(int numberOfShots){
        for (int i = 1; i <= numberOfShots; i++) {
            shot();
        }
    }
}



