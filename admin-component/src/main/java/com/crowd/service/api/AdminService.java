package com.crowd.service.api;
import com.crowd.entity.Admin;

import java.util.List;


public interface AdminService {

    void saveAdmin(Admin admin);

    List<Admin> queryAll();

    Admin getAdminByLoginAcct(String name, String pwd);

}
