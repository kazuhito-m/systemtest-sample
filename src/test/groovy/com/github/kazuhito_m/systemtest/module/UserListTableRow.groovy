package com.github.kazuhito_m.systemtest.module

import geb.Module

/**
 * Created by kazuhito_m on 15/03/31.
 */
class UserListTableRow extends Module {
    static context = {
        cell { $("td" , it) }
        username { cell(0).text() }
        email { cell(1).text }
        editButton { cell(3).$("a",0)}
        deleteButton { cell(3).$("a",1)}
    }
}
