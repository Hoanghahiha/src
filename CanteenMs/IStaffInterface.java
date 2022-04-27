package CanteenMs;

import java.util.ArrayList;

public interface IStaffInterface {
    ArrayList<Staff> list();
    void create(Staff staff);
    void update(Staff staff);
    void delete(Staff staff);
}
