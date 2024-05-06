package com.example.todoapp.api.Models;

import lombok.Data;

@Data
public class todo {
    String title;
    String desc;
    boolean active;
    String owner;
}
