package com.github.kazuhito_m.systemtest.module

import geb.Module

/**
 * Created by kazuhito_m on 15/03/31.
 */
class UserListTableRow extends Module {
    static content = {
        cell { $("td" , it) }
        username { cell(0).text() }
        email { cell(1).text }
        editButton { cell(2).$("a",0)}
        deleteButton { cell(2).$("a",1)}
    }

    /**
     * 削除という行為。
     * 具体的にはバツボタンをクリックする。
     * @return
     */
    def delete() {
        this.deleteButton.click()
    }

    /**
     * 変更を開始する。
     * 具体的には目ボタンをクリックする。
     * @return
     */
    def edit() {
        this.editButton.click()
    }
}
