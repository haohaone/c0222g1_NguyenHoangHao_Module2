package case_study.service.implement.design_pattern.singleton;

import case_study.models.booking_contracts.Contract;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class ContractList {
    private static List<Contract> list = null;

    private ContractList(){}

    public static List<Contract> getContractList(){
        List<Contract> list;
        try {
            list = ReadAndWrite.readFileArrayList("src\\case_study\\data\\contract.csv");
            return list;
        }catch (NullPointerException ignored){
        }
        return new ArrayList<>();
    }
}
