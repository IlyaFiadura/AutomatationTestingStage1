import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TelecomOperator {
    private ArrayList<Client> clientList = new ArrayList<>();

    void addClientToPhoneList(Client i) {
        clientList.add(i);
    }

    public List<Client> getListByCityTimeThreshold(int cityTimeThreshold) {
        List<Client> list = new ArrayList<>();
        for (Client i : clientList) {
            if (i.getInCityPhoneCallMinutes() > cityTimeThreshold) {
                list.add(i);
            }
        }
        return list;
    }

    public List<Client> getListByUsingCountryTime() {
        List<Client> list = new ArrayList<>();
        for (Client i : clientList) {
            if (i.getInCountryPhoneCallMinutes() > 0) {
                list.add(i);
            }
        }
        return list;
    }

    List<Client> getListSortBySurname() {
        List<Client> list = new ArrayList<>(clientList);
        Collections.sort(list, new Comparator<Client>() {
            @Override
            public int compare(Client i, Client j) {
                return i.getSurname().compareTo(j.getSurname());
            }
        });
        return list;
    }
}
