package com.github.kazuhito_m.systemtest.page

import geb.Page

/**
 * Created by posaunehm on 15/03/29.
 */
class DashboadPage extends Page {

    static at = {
        title == "Grabbit Home"
    }

    void toUsersPage(){
        $(".item-admin a").click()
        $("li.item-admin ul li a").click()

    }
}
