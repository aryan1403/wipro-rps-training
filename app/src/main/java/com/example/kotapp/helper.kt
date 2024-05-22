package com.example.kotapp

var tasks = ArrayList<String>()
class helper {
    fun replaceTasks(task: ArrayList<String>) {
        tasks = task
    }
    fun addToList(text: String) {
        tasks.add(text)
    }

    fun getAllTask(): ArrayList<String> {
        return tasks
    }
}

