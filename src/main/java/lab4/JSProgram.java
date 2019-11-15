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

    public void setTest(Test test) {
        this.test = test;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public void setJsScript(String jsScript) {
        this.jsScript = jsScript;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }

    public Test getTest() {
        return test;
    }

    public String getPackageId() {
        return packageId;
    }

    public String getJsScript() {
        return jsScript;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<Test> getTests() {
        return tests;
    }


    public String toString() {
        String sTests = "";
        for (Test t : tests) {
            sTests += t.toString() + "\n";
        }
        return packageId + "  " + jsScript + "  " + functionName + "\n" + sTests;
    }

}