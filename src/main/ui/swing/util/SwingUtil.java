package ui.swing.util;

import javax.swing.SwingUtilities;

@Deprecated
public class SwingUtil {

	public static void invokeAndWait(Runnable runnable) {
		Thread appThread = new Thread() {
			public void run() {
				try {
					SwingUtilities.invokeAndWait(runnable);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		appThread.start();
	}
}
