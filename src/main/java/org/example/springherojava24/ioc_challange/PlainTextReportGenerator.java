package org.example.springherojava24.ioc_challange;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("plaintext")
public class PlainTextReportGenerator implements ReportGenerator {
    @Override
    public String generateReport(String data) {
        return "plain text report"+data;
    }
}
