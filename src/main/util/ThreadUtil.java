/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author PRINCIPAL
 */
@Deprecated
public class ThreadUtil {

	public static void startNewThread(Runnable runnable) {
		new Thread(runnable).start();
	}
    
}
