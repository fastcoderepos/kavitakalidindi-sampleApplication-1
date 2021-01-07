package com.fastcode.sampleapplication1.addons.reporting.domain.report;

import com.fastcode.sampleapplication1.addons.reporting.application.report.dto.ReportDetailsOutput;
import java.time.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IReportRepositoryCustom {
    Page<ReportDetailsOutput> getAllReportsByUserId(Long userId, String search, Pageable pageable) throws Exception;
}
