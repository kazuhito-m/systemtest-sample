package com.github.kazuhito_m.systemtest.test

import com.github.kazuhito_m.systemtest.page.HeroPage
import geb.spock.GebReportingSpec

/**
 * Created by kazuhito_m on 15/03/29.
 */
class WhenAdminMissOperation extends GebReportingSpec {

    def "Adminユーザを削除しようとしても削除できない"() {

        when: "システムにログインする"
        and: "Adminページに移動する"
        and: "Adminユーザを削除しようとする"
        then: "Adminユーザが削除できない"

    }
}