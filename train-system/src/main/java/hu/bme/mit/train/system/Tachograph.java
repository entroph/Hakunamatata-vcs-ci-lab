package hu.bme.mit.train.system;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
import java.util.Date;

public class Tachograph{

    public Table<Date, Integer, Integer> tab = HashBasedTable.create();

    public void addNewValue (int pos, int speed){
        tab.put(new Date(), pos, speed);
    }
}