package com.github.kazuhito_m.systemtest.page

import geb.Page

/**
 * Created by kazuhito_m on 15/03/29.
 */
class HeroPage extends Page  {
    static url = ""
    static at = { title == "Grabbit" }

    static content = {
        username {$("input#username")}
        password {$("input#password")}
    }

    /**
     * ログインする。
     */
    void login(){
        $("#submit").click()
    }

    /**
     * ログインする。
     * より操作しやす形のリファクタリング版オーバライド。
     * @param user
     * @param pass
     */
    void login(user,pass) {
        this.username = user
        this.password = pass
        login()
    }
}
