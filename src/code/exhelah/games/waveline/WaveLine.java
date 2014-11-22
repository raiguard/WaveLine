package code.exhelah.games.waveline;

import code.exhelah.games.waveline.gui.GuiHandler;
import code.exhelah.games.waveline.level.KeyBindings;
import code.exhelah.games.waveline.reference.ClassPaths;
import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

import java.io.IOException;

public class WaveLine {
	public static void main(String[] args) throws IOException {
		System.out.println(LogHelper.getLogPrefix("info") + Messages.Init.START);
		
		GuiHandler.init();
		KeyBindings.init();
		
		System.out.println(LogHelper.getLogPrefix("info") + Messages.Init.COMPLETE);
	}
}
