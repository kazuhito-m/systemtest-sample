package com.github.kazuhito_m.systemtest.page

import com.github.kazuhito_m.systemtest.module.UserListTableRow
import geb.Page
import geb.*
import org.openqa.selenium.WebElement


/**
 * Created by kazuhito_m on 15/03/29.
 */
class UsersPage extends Page {

    static at = {
        title == "Grabbit SecureUser"
    }

    static content = {
        users { moduleList UserListTableRow, $(".table tbody tr") } // tail()しているのは
    }

    void deleteUser(String username) {
//        WebElement e = $(".table#table-striped tbody tr")
    }

}
