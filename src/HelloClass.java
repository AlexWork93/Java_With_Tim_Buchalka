public class HelloClass {
    private String name = "";
    HelloClass(String myName){
        this.name = myName;
    }

    protected void sayHello(){
        System.out.println(generateGreeting());
    }

    private String generateGreeting(){
        return "Hello " + name;
    }

}
