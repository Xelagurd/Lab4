package lab4;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.List;

public class JSProgram {
    private String packageId;
    private String jsScript;
    private String functionName;

    private List<Test> tests;

    private Test test;

    private static final ScriptEngine engine = new
            ScriptEngineManager().getEngineByName("nashorn");

    public JSProgram() {

    }

    public JSProgram(JSProgram prog) {
        packageId = prog.getPackageId();
        jsScript = prog.getJsScript();
        functionName = prog.getFunctionName();
        tests = prog.getTests();
    }