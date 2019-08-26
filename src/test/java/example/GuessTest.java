package example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tw.Game;


public class GuessTest {
	private static Game game;
	@BeforeAll
    static void initTestEnv() {
		
    }

    @BeforeEach
    void initEveryMethod() {
    	game = new Game();
    }

    @Test
    void test1() {
    	//given
    	String inputString="1 5 6 7";
    	//when
    	String outString=game.solve(inputString);
    	//then
    	assertEquals("1A0B", outString);
    }
    @Test
    void test2() {
    	//given
    	Game game = new Game();
    	String inputString="2 4 7 8";
    	//when
    	String outString=game.solve(inputString);
    	//then
    	assertEquals("0A2B", outString);
    }
    @Test
    void test3() {
    	//given
    	Game game = new Game();
    	String inputString="0 3 2 4";
    	//when
    	String outString=game.solve(inputString);
    	//then
    	assertEquals("1A2B", outString);
    }
    @Test
    void test4() {
    	//given
    	Game game = new Game();
    	String inputString="5 6 7 8";
    	//when
    	String outString=game.solve(inputString);
    	//then
    	assertEquals("0A0B", outString);
    }
    @Test
    void test5() {
    	//given
    	Game game = new Game();
    	String inputString="4 3 2 1";
    	//when
    	String outString=game.solve(inputString);
    	//then
    	assertEquals("0A4B", outString);
    }
    @Test
    void test6() {
    	//given
    	Game game = new Game();
    	String inputString="1 2 3 4";
    	//when
    	String outString=game.solve(inputString);
    	//then
    	assertEquals("4A0B", outString);
    }
    @Test
    void test7() {
    	//given
    	Game game = new Game();
    	String inputString="1 1 2 3";
    	//when
    	String outString=game.solve(inputString);
    	//then
    	assertEquals("输入错误，再次输入", outString);
    }
    @Test
    void test8() {
    	//given
    	Game game = new Game();
    	String inputString="1 2";
    	//when
    	String outString=game.solve(inputString);
    	//then
    	assertEquals("输入错误，再次输入", outString);
    }
}
