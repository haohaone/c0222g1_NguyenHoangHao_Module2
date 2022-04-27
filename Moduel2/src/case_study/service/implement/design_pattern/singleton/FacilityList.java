package case_study.service.implement.design_pattern.singleton;

import case_study.models.facility.Facility;
import case_study.utils.ReadAndWrite;

import java.util.LinkedHashMap;

public class FacilityList {
    private static LinkedHashMap<Facility, Integer> facilityList = null;

    private FacilityList(){}

    public static  LinkedHashMap<Facility, Integer> getFacilityList(){
        try {
            facilityList = ReadAndWrite.readFileMap("src\\case_study\\data\\facility.csv");
            return facilityList;
        }catch (NullPointerException e){
        }
        return new LinkedHashMap<>();
    }
}
