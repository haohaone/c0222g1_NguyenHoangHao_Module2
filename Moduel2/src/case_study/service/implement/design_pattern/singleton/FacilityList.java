package case_study.service.implement.design_pattern.singleton;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.utils.ReadAndWrite;


import java.util.LinkedHashMap;
import java.util.List;

public class FacilityList {
    private static LinkedHashMap<Facility, Integer> facilityList = new LinkedHashMap<>();

    private FacilityList(){}

    public static  LinkedHashMap<Facility, Integer> getFacilityList(){
        facilityList.clear();
        List<String[]> list = ReadAndWrite.read("src\\case_study\\data\\facility.csv");
        for (String[] item : list) {
            if (item[0].equals("Villa")){
                facilityList.put(new Villa(item[0],
                        item[1],
                        item[2],
                        Integer.parseInt(item[3]),
                        Double.parseDouble(item[4]),
                        Integer.parseInt(item[5]),
                        Integer.parseInt(item[6]),
                        item[7],
                        Double.parseDouble(item[8])),Integer.parseInt(item[9]));
            }else if (item[0].equals("House")){
                facilityList.put(new House(item[0],
                        item[1],
                        item[2],
                        Integer.parseInt(item[3]),
                        Double.parseDouble(item[4]),
                        Integer.parseInt(item[5]),
                        Integer.parseInt(item[6]),
                        item[7]),Integer.parseInt(item[8]));
            }else if (item[0].equals("Room")){
                facilityList.put(new Room(item[0],
                        item[1],
                        Double.parseDouble(item[2]),
                        Integer.parseInt(item[3]),
                        Integer.parseInt(item[4]),
                        item[5],
                        item[6]),Integer.parseInt(item[7]));
            }
        }
        return facilityList;
    }
}
