package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("beforeClass solo se llama una vez antes de empezar los Test");
    }
    @BeforeEach
    void setUp() {
        System.out.println("Before each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        greeting = new Greeting();

        System.out.println(greeting.helloWorld("John"));
    }

    @AfterEach
    void tearDown() {
      System.out.println("After each...");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("afterClass solo se llama una vez después de finalizar todos los Test");
    }
}