package com.marklogic.gradle.task.manage

import org.gradle.api.tasks.TaskAction

import com.marklogic.appdeployer.AppConfig
import com.marklogic.gradle.task.MarkLogicTask

class MergeDatabasePackagesTask extends MarkLogicTask {

    @TaskAction
    void mergeDatabasePackages() {
        println "Merging database packages"
        getAppDeployer().mergeDatabasePackages(getAppConfig())
        println "Finished merging database packages"
    }
}
