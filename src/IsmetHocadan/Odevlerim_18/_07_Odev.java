package Odevlerim.IsmetHocadan.Odevlerim_18_;

public class _07_Odev {
    //7. Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
    //   ilk ve son elementlerini kapsayan yeni array'e return edin. Oluşturacağınız int array'i =   ([1, 2, 3, 4])
    //   Sonuç bu şekilde olmalıdır. [1, 4]
    public static void main(String[] args) {

    int[] dortluDizi={1,2,3,4};
    int[] ikiliYeniDizi=new int[2];

        System.out.print("Dötlü Dizi = ");

        for (int i = 0; i < dortluDizi.length; i++)
            System.out.print(" " + dortluDizi[i]);

    ikiliYeniDizi[0]=dortluDizi[0];

    int sonIndex= dortluDizi.length-1;
    ikiliYeniDizi[1]=dortluDizi[sonIndex];

    System.out.println("\nikili Yeni Dizi = " + ikiliYeniDizi[0] + " " + ikiliYeniDizi[1]);
    }
}
