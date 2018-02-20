import java.util.ArrayList;

/**
 * Created by �������� on 18.02.2018.
 * ����������� ���������� �������. �� ����� �������� � ���� ������ �������� (Candy, Jellybean, etc.)
 * � ������ �������� ���� ��������, ���, ���� � ���� ���������� ��������. ���������� ������� ������� �� ���������.
 * ����� ����� ��� �������, ����� ��������� ������� � ������� �� ������� ���������� � ���� ��������� � �������.
 */
public class Init {
    public static void main(String[] args) {
        int sumWeight = 0;
        int sumPrice = 0;
        ArrayList<Sweets> candyList = new ArrayList<Sweets>();
        Candy candy = new Candy("Morozko", 10, 230, "Russia");
        Jellybean jellybean = new Jellybean("Sladko", 23, 340, true);
        Toffee toffee = new Toffee("toffee", 233, 300, "Litva");
        candyList.add(candy);
        candyList.add(jellybean);
        candyList.add(toffee);
        for(Sweets sweets : candyList){
            sumPrice = sumPrice + sweets.getPrice();
            sumWeight = sumWeight + sweets.getWeight();
        }
        System.out.println("Present sum weight: " + sumWeight);
        System.out.println("Present sum price: " + sumPrice);
    }
}
