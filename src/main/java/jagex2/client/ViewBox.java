package jagex2.client;

import deob.ObfuscatedName;
import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("b")
public class ViewBox extends Frame {

	@ObfuscatedName("b.a")
	public int field31 = 8;

	@ObfuscatedName("b.b")
	public GameShell shell;

	public ViewBox(int arg0, int arg1, GameShell arg2, int arg3) {
		if (arg1 != 35731) {
			this.field31 = -475;
		}
		this.shell = arg2;
		this.setTitle("Jagex");
		this.setResizable(false);
		this.show();
		this.toFront();
		this.resize(arg3 + 8, arg0 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		this.shell.update(arg0);
	}

	public final void paint(Graphics arg0) {
		this.shell.paint(arg0);
	}
}
