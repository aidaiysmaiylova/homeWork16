public class Main {
    public static void main(String[] args) {
        Families ffamilies1 = new FirstFamily();
        Families ffamilies2 = new FirstFamily();
        Families ffamilies3 = new FirstFamily();
        Families ffamilies4 = new FirstFamily();
        Families[] firstFamily = {ffamilies1, ffamilies2, ffamilies3, ffamilies4};
        for (Families family1 : firstFamily) {
            family1.payCommunalServices();
        }
        int count = 0;
        for (int i = 0; i < firstFamily.length; i++) {
count++;
        }
        System.out.println(count + ": The count of first family");

        Families sfamilies1 = new SecondFamily();
        Families sfamilies2 = new SecondFamily();
        Families[] secondFamily = {sfamilies1, sfamilies2};
        for (Families family2 : secondFamily) {
            family2.payRent();
        }
        int count1 = 0;
        for (int i = count1; i < secondFamily.length; i++) {
count1++;
        }
        System.out.println(count1 + ": The count of second family");

        Families tfamilies1 = new ThirdFamily();
        Families tfamilies2 = new ThirdFamily();
        Families tfamilies3 = new ThirdFamily();
        Families[] thirdFamily = {tfamilies1, tfamilies2, tfamilies3};
        for (Families family3 : thirdFamily) {
            family3.payRent();
        }
        int count2 = 0;
        for (int i = 0; i <= secondFamily.length; i++) {
            count2++;
        }
        System.out.println(count2 + ": The count of third family");


    }
}