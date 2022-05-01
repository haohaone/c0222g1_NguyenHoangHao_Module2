package case_study.service.implement;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.service.FacilityService;
import case_study.service.implement.design_pattern.factory.Create;
import case_study.service.implement.design_pattern.singleton.FacilityList;
import case_study.utils.ReadAndWrite;

import java.io.File;
import java.util.*;


public class FacilityServiceImp implements FacilityService{
    public Scanner scanner = new Scanner(System.in);
    public static LinkedHashMap<Facility, Integer> facilityList = FacilityList.getFacilityList();

    @Override
    public void display() {
        facilityList = FacilityList.getFacilityList();
        try {
            for (Map.Entry<Facility, Integer> element : facilityList.entrySet()) {
                System.out.println(element.getKey() + ", amount rented = " + element.getValue() + "]");
            }
        }catch (Exception e){
            System.out.println("Facility list is 0");
        }
    }

    @Override
    public void displayMaintain() {
        facilityList = FacilityList.getFacilityList();
        System.out.println("--------------Maintain facility ---------------");
        int count = 0;
        for (Map.Entry<Facility, Integer> element : facilityList.entrySet()) {
            if (element.getValue() >= 5) {
                System.out.println(element.getKey() + ", amount rented = " + element.getValue() + "]");
                count++;
            }
        }
        if (count == 0){
            System.out.println("Not facility need to maintain");
        }
    }

    public static void writeFacilityList(LinkedHashMap<Facility, Integer> facility){

        File file = new File("src\\case_study\\data\\facility.csv");
        file.delete();

        for (Map.Entry<Facility, Integer> element : facility.entrySet()) {
            ReadAndWrite.write("src\\case_study\\data\\facility.csv", element.getKey().getLine()+","+element.getValue());
        }
    }

    @Override
    public void addNewVilla() {
        facilityList = FacilityList.getFacilityList();
        Villa villa = (Villa) Create.create("Villa", facilityList);

        ReadAndWrite.write("src\\case_study\\data\\facility.csv", villa.getLine()+",0");
        System.out.println("Add successful");
    }

    @Override
    public void addNewHouse() {
        facilityList = FacilityList.getFacilityList();
        House house = (House) Create.create("House", facilityList);

        ReadAndWrite.write("src\\case_study\\data\\facility.csv", house.getLine()+",0");
        System.out.println("Add successful");
    }

    @Override
    public void addNewRoom() {
        Room room = (Room) Create.create("Room", facilityList);

        ReadAndWrite.write("src\\case_study\\data\\facility.csv", room.getLine()+",0");
        System.out.println("Add successful");
    }
}
