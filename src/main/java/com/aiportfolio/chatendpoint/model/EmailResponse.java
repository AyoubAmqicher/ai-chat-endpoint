package com.aiportfolio.chatendpoint.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailResponse {
    private String category;
    private double confidence;
    private String explanation;
}
