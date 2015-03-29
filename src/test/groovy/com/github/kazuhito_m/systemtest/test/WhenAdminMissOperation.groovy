package com.github.kazuhito_m.systemtest.test

import com.github.kazuhito_m.systemtest.page.HeroPage
import geb.spock.GebReportingSpec

/**
 * Created by kazuhito_m on 15/03/29.
 */
class WhenAdminMissOperation extends GebReportingSpec {

    def "Adminユーザが一人の場合に削除しようとしても削除できない"() {

        given: "Adiminユーザが一人の場合"
        when: "Adminユーザを削除しようとする"
        then: "削除しようとしたユーザが削除できない"

    }
}