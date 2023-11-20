public class TemplateExample {

    public static void main(String[] args) {
        TemplateMethod templateMethod1 = new ConcreteClass();
        templateMethod1.execute();

        System.out.println();

        TemplateMethod templateMethod2 = new AnotherConcreteClass();
        templateMethod2.execute();
    }
}