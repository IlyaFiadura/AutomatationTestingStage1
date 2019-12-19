public class Client {
    {
        idGenerator++;
    }

    private static int idGenerator = 0;
    private int id = idGenerator;
    private String surname;
    private String firstName;
    private String patronymic;
    private String address;
    private String creditCard;
    private int debitInCents;
    private int creditInCents;
    private int inCityPhoneCallMinutes;
    private int inCountryPhoneCallMinutes;

    Client(String surname, String firstName, String patronymic, String address, String creditCard, int debitInCents, int creditInCents, int inCityPhoneCallMinutes, int inCountryPhoneCallMinutes) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCard = creditCard;
        this.debitInCents = debitInCents;
        this.creditInCents = creditInCents;
        this.inCityPhoneCallMinutes = inCityPhoneCallMinutes;
        this.inCountryPhoneCallMinutes = inCountryPhoneCallMinutes;
    }

    public String getSurname() {
        return surname;
    }

    public int getInCityPhoneCallMinutes() {
        return inCityPhoneCallMinutes;
    }

    public int getInCountryPhoneCallMinutes() {
        return inCountryPhoneCallMinutes;
    }

    public String toString() {
        return String.format("ID: %-5d %-12s %-12s %-15s %-15s %-22s  Дебет %-5d  Кредит %-5d Городские %-5d Междугородние %-5d",
                id, surname, firstName, patronymic, address, creditCard, debitInCents, creditInCents, inCityPhoneCallMinutes, inCountryPhoneCallMinutes);
    }
}
