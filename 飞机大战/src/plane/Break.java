package plane;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JDialog;

/**
 * 
 * @author æ¹é¶å?
 * æ¬ç±»æè¿°é£æºçç¸
 *
 */

public class Break {
	
	private Image enemy_b[];//ææºçç¸å¾çæ°ç»
	private int x, y;//åæ 
	JDialog f;
	public Break(int x, int y) {
		//å®ä¾åææºçç¸å¾çæ°ç»?
		enemy_b = new Image[6];
		for(int i = 0; i < enemy_b.length; i++) {
			enemy_b[i] = Toolkit.getDefaultToolkit().getImage(getClass()
					.getResource("/images/bomb_enemy_" + i + ".png"));
		}
		//åå§ååæ ?
		this.x = x;
		this.y = y;
	}

	/**
	 * ææºçç¸å¾çç»å¶æ¹æ³
	 * @param g
	 * @param c
	 * @param i
	 */
	void enemy_break(Graphics g, Canvas c, int i) {
		g.drawImage(enemy_b[i/5], x, y, GamePanel.ENEMY_SIZE, GamePanel.ENEMY_SIZE, c);
	}
	/**
	 * é£æºçç¸å¾çç»å¶æ¹æ³
	 * @param g
	 * @param c
	 * @param i
	 */
	void plane_break(Graphics g, Canvas c, int i) {
		if(i < 30)
			g.drawImage(enemy_b[i/5], x, y, GamePanel.PLANE_SIZE, GamePanel.PLANE_SIZE, c);
	}
	
	/**
	 * bossçç¸
	 * @param g
	 * @param c
	 * @param i
	 */
	void boss_break(Graphics g, Canvas c, int i) {
		if(i < 30)
			g.drawImage(enemy_b[i/5], x, y, GamePanel.BOSS_WIDTH, GamePanel.BOSS_HEIGHT, c);
	}
	
}
