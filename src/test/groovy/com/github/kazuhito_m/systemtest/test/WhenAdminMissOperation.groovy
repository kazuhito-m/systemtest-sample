package com.github.kazuhito_m.systemtest.test

import com.github.kazuhito_m.systemtest.page.DashboadPage
import com.github.kazuhito_m.systemtest.page.HeroPage
import com.github.kazuhito_m.systemtest.page.UsersPage
import geb.spock.GebReportingSpec

/**
 * Created by kazuhito_m on 15/03/29.
 */
class WhenAdminMissOperation extends GebReportingSpec {

    def "Adminユーザを削除しようとしても削除できない"() {
        given: "トップページにアクセスする"
        to HeroPage

        expect: "未ログインページが表示される"
        at HeroPage

        when: "システムにログインする"
        username = "admin"
        password = "admin"
        login()


        then: "ダッシュボードが表示される"
        at DashboadPage

        when: "Adminページに移動する"
        toUsersPage()

        then: "ユーザー一覧ページに移動する"
        at UsersPage

        and: "Adminユーザを削除しようとする"
        users[0].username == "admin"
//        users[0].delete()
        // TODO 上記は努力目標
//        deleteUser("admin")
//
//        then: "Adminユーザが削除できない"
//        users[0].name = "admin"
    }
}