package tw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.bytebuddy.asm.Advice.This;
import tw.commands.GuessInputCommand;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

	private static final int RUN_TIMES = 6;

	public static void main(String[] args) throws Exception {

		Game game = new Game();
		for (int i = 0; i < RUN_TIMES; i++) {
			String input = new GuessInputCommand().input();
			String output = game.solve(input);
			if ("Ê¤Àû".equals(output)) {
				System.out.println(output);
				break;
			}else {
				System.out.println(output);
			}

		}
	}

}
