package com.github.kazuhito_m.systemtest.test

import com.github.kazuhito_m.systemtest.page.HeroPage
import geb.spock.GebReportingSpec

/**
 * Created by kazuhito_m on 15/03/29.
 */
class SmorkTest extends GebReportingSpec {

    def "ヒーローページは出てる"() {

        given:
        to HeroPage

        expect:
        to HeroPage

    }
}
