package com.github.kazuhito_m.systemtest.page

import geb.Page
import org.openqa.selenium.WebElement

/**
 * Created by kazuhito_m on 15/03/29.
 */
class UsersPage extends Page {

    static at = {
        title == "Grabbit SecureUser"
    }

    void deleteUser(String username) {
        WebElement e = $("table#table-striped tbody tr")
    }

}
