package org.example.springherojava24.core.ioc_challange;

import org.springframework.stereotype.Service;

@Service("httmlReporterBean")
public class HtmlReportGenerator implements ReportGenerator{
    @Override
    public String generateReport(String data) {
        return "<html><body><h1>"+data+"</h1><p_tag>${data}</p_tag></body></html>";
    }
}
