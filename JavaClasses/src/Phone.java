import java.util.List;

public class Phone {
    public static void main(String[] args) {
        TelecomOperator telecomOperator = new TelecomOperator();
        telecomOperator.addClientToPhoneList(new Client("Анваров", "Анвар", "Шахбулатович", "Молодежная", "4231_0000_5678_0000", 456, 0, 123, 0));
        telecomOperator.addClientToPhoneList(new Client("Жук", "Анна", "Олеговна", "Калинина", "5678_1200_2323_0000", 0, 66, 45, 0));
        telecomOperator.addClientToPhoneList(new Client("Клявдо", "Борис", "Евгеньевич", "Денисова", "9567_1111_5678_2222", 785, 0, 57, 13));
        telecomOperator.addClientToPhoneList(new Client("Тихоненко", "Валерий", "Иванович", "Строительная", "5651_0000_5678_3333", 1773, 0, 270, 0));
        telecomOperator.addClientToPhoneList(new Client("Абрикосов", "Владислав", "Александрович", "Якуба Коласа", "1131_0550_5678_4545", 0, 87, 863, 105));
        telecomOperator.addClientToPhoneList(new Client("Спиридонов", "Геннадий", "Николаевич", "Парковая", "2221_0066_5678_6566", 639, 0, 452, 377));
        telecomOperator.addClientToPhoneList(new Client("Скакун", "Денис", "Павлович", "Молодежная", "8771_1110_5678_4545", 0, 46, 50, 0));
        telecomOperator.addClientToPhoneList(new Client("Иванов", "Иван", "Иванович", "Молодежная", "6661_3330_5678_6666", 0, 50, 603, 0));
        telecomOperator.addClientToPhoneList(new Client("Яскевич", "Игорь", "Денисович", "Молодежная", "7891_6666_5678_8888", 65, 0, 562, 78));
        telecomOperator.addClientToPhoneList(new Client("Мартыненко", "Кирилл", "Игнатович", "Молодежная", "8733_1100_5678_4343", 1276, 42, 62, 0));
        telecomOperator.addClientToPhoneList(new Client("Рандомов", "Тимур", "Александрович", "Пврковая", "8731_1110_5678_5454", 555, 0, 55, 1));
        telecomOperator.addClientToPhoneList(new Client("Кныш", "Любовь", "Павловна", "Гайдара", "9431_0550_4478_4534", 0, 55, 461, 12));
        telecomOperator.addClientToPhoneList(new Client("Новосельцева", "Марина", "Антоновна", "Молодежная", "4331_4400_5678_8743", 79, 0, 52, 0));
        telecomOperator.addClientToPhoneList(new Client("Валенко", "Ольга", "Дмитриевна", "Молодежная", "4231_1100_5645_1440", 76, 0, 333, 65));
        telecomOperator.addClientToPhoneList(new Client("Журавлева", "Наталья", "Сергеевна", "Калинина", "4231_0550_5678_0000", 790, 0, 123, 47));
        telecomOperator.addClientToPhoneList(new Client("Николаев", "Станислав", "Антонович", "Денисова", "4231_6560_4478_2300", 819, 0, 573, 76));
        telecomOperator.addClientToPhoneList(new Client("Клявдо", "Степан", "Евгеньевич", "Молодежная", "4231_1110_3378_0054", 1285, 0, 546, 495));
        telecomOperator.addClientToPhoneList(new Client("Методова", "Татьяна", "Зеноновна", "Блохина", "4231_6660_3378_0233", 82, 0, 55, 0));
        telecomOperator.addClientToPhoneList(new Client("Кецко", "Федор", "Валерьевич", "Дзержинского", "4231_0000_5348_2300", 780, 19, 85, 0));

        System.out.println("\nСведения об абонентах, у которых время внутригородских разговоров превышает заданное (120 минут):");
        List<Client> listByCityTime = telecomOperator.getListByCityTimeThreshold(120);
        for (Client i : listByCityTime) {
            System.out.println(i);
        }

        System.out.println("\nСведения об абонентах, которые пользовались междугородной связью:");
        List<Client> listByUsingCountryTime = telecomOperator.getListByUsingCountryTime();
        for (Client i : listByUsingCountryTime) {
            System.out.println(i);
        }

        System.out.println("\nСведения об абонентах в алфавитном порядке:");
        List<Client> listSortBySurname = telecomOperator.getListSortBySurname();
        for (Client i : listSortBySurname) {
            System.out.println(i);
        }
    }
}
