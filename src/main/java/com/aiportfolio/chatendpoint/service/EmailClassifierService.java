package com.aiportfolio.chatendpoint.service;

import com.aiportfolio.chatendpoint.model.EmailResponse;
import org.springframework.stereotype.Service;

@Service
public class EmailClassifierService {

    public EmailResponse classify(String subject, String body) {
        String text = ((subject != null ? subject : "") + " " + (body != null ? body : "")).toLowerCase();

        String category;
        double confidence;
        String explanation;

        if (text.contains("refund") || text.contains("invoice") || text.contains("payment") || text.contains("billing")) {
            category = "Billing / Refund";
            confidence = 0.9;
            explanation = "Detected billing-related keywords such as 'refund', 'invoice' or 'payment'.";
        } else if (text.contains("error") || text.contains("issue") || text.contains("bug") || text.contains("problem") || text.contains("help")) {
            category = "Support";
            confidence = 0.88;
            explanation = "Detected support-related keywords like 'error', 'issue', 'problem', or 'help'.";
        } else if (text.contains("quote") || text.contains("pricing") || text.contains("price") || text.contains("plan") || text.contains("proposal")) {
            category = "Lead / Sales";
            confidence = 0.87;
            explanation = "Detected lead-related keywords like 'quote', 'pricing', 'proposal', or 'plan'.";
        } else {
            category = "General";
            confidence = 0.7;
            explanation = "No strong billing/support/lead keywords detected; classified as general.";
        }

        return new EmailResponse(category, confidence, explanation);
    }
}
