package case_study.service.implement.design_pattern.singleton;

import case_study.models.booking_contracts.Booking;
import case_study.models.booking_contracts.Contract;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class ContractList {
    private static List<Contract> contractList = null;

    private ContractList(){}

    public static List<Contract> getContractList(){
        contractList= new ArrayList<>();
        List<String[]> list = ReadAndWrite.read("src\\case_study\\data\\contract.csv");
        for (String[] item: list){
            contractList.add(new Contract(Integer.parseInt(item[0]),
                    item[1],
                    Integer.parseInt(item[2]),
                    Double.parseDouble(item[3]),
                    Double.parseDouble(item[4]),
                    item[5],
                    item[6]));
        }
        return contractList;
    }
}
