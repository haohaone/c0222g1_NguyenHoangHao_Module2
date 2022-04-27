package case_study.service.implement;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.service.FacilityService;
import case_study.service.implement.design_pattern.factory.CreateHouse;
import case_study.service.implement.design_pattern.factory.CreateRoom;
import case_study.service.implement.design_pattern.factory.CreateVilla;
import case_study.service.implement.design_pattern.singleton.FacilityList;
import case_study.utils.ReadAndWrite;
import java.io.Serializable;
import java.util.*;


public class FacilityServiceImp implements FacilityService, Serializable {
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

    @Override
    public void addNewVilla() {
        CreateVilla createVilla = new CreateVilla();

        Villa villa = (Villa) createVilla.create();

        facilityList.put(villa, 0);

        ReadAndWrite.writeFileMap("src\\case_study\\data\\facility.csv", facilityList);
        ReadAndWrite.write("src\\case_study\\data\\villa.csv", villa.getLine());
        System.out.println("Add successful");
    }

    @Override
    public void addNewHouse() {
        CreateHouse createHouse = new CreateHouse();
        House house = (House) createHouse.create();

        facilityList.put(house, 0);


        ReadAndWrite.writeFileMap("src\\case_study\\data\\facility.csv", facilityList);
        ReadAndWrite.write("src\\case_study\\data\\house.csv", house.getLine());
        System.out.println("Add successful");
    }

    @Override
    public void addNewRoom() {
        CreateRoom createRoom = new CreateRoom();
        Room room = (Room) createRoom.create();

        facilityList.put(room, 0);

        ReadAndWrite.writeFileMap("src\\case_study\\data\\facility.csv", facilityList);
        ReadAndWrite.write("src\\case_study\\data\\room.csv", room.getLine());
        System.out.println("Add successful");
    }
}
