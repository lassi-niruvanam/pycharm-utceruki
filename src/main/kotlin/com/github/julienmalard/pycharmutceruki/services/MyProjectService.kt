package com.github.julienmalard.pycharmutceruki.services

import com.intellij.openapi.project.Project
import com.github.julienmalard.pycharmutceruki.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
