abstract class TemplateMethod {
    public final void execute() {
        step1();
        step2();
        step3();
    }

    protected abstract void step1();

    protected abstract void step2();

    protected abstract void step3();
}


