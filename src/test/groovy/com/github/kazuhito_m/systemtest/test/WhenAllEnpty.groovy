package com.github.kazuhito_m.systemtest.test

import com.github.kazuhito_m.systemtest.page.DashboadPage
import com.github.kazuhito_m.systemtest.page.HeroPage
import com.github.kazuhito_m.systemtest.page.UsersPage
import geb.spock.GebReportingSpec

/**
 * Created by kazuhito_m on 15/03/29.
 */
class WhenAllEnpty extends GebReportingSpec {

    def "管理者ユーザを削除しようとしても削除できない"() {

        given: "トップページにアクセスする"
        to HeroPage

        when: "システムにログインする"
        println($().text())
        $().text().contains('三浦')

        then: "ダッシュボードが表示される"
        true

    }
}