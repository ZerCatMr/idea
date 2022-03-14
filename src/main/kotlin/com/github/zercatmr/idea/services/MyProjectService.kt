package com.github.zercatmr.idea.services

import com.intellij.openapi.project.Project
import com.github.zercatmr.idea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
