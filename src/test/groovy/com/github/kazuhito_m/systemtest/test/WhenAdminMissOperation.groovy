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

        and: "ユーザは一軒以上ある"
        users.size > 0

        when: "管理者アカウントがあり"
        def adminUserInfo = users.find{ it.username == "admin" }
        adminUserInfo != null

        and: "削除したとしても"
        withConfirm(true) { adminUserInfo.delete() } == "本当に削除してよろしいですか?"

        then: "一覧にステイしたままで"
        at UsersPage

        and: "かつ削除されない"
        users.any { it.username == "admin"  }

    }
}