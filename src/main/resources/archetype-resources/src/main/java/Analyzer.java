package ${package};

import org.owasp.dependencycheck.Engine;
import org.owasp.dependencycheck.analyzer.AbstractFileTypeAnalyzer;
import org.owasp.dependencycheck.analyzer.AnalysisPhase;
import org.owasp.dependencycheck.analyzer.exception.AnalysisException;
import org.owasp.dependencycheck.dependency.Dependency;
import org.owasp.dependencycheck.exception.InitializationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileFilter;

public class Analyzer extends AbstractFileTypeAnalyzer {
    private static final Logger logger = LoggerFactory.getLogger(Analyzer.class);

    @Override
    protected FileFilter getFileFilter() {
        FileFilter ret = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".jar");
            }
        };

        return ret;
    }

    @Override
    protected void initializeFileTypeAnalyzer() throws InitializationException {
    }

    @Override
    protected void analyzeFileType(Dependency dependency, Engine engine) throws AnalysisException {
    }

    @Override
    protected String getAnalyzerEnabledSettingKey() {
        return "${package}.analyzer.Enabled";
    }

    @Override
    public String getName() {
        return "Analyzer";
    }

    @Override
    public AnalysisPhase getAnalysisPhase() {
        return AnalysisPhase.INFORMATION_COLLECTION;
    }
}
