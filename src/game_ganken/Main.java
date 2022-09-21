package game_ganken;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		//JFrameクラスをインスタンス化
		JFrame frame = new JFrame("じゃんけんゲーム");
		//ウィンドウのサイズを指定
		frame.setSize(640, 480);
		//ウィンドウの位置を、画面の中心へ
		frame.setLocationRelativeTo(null);
		//×でアプリが終了するようにする
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ウィンドウのサイズを変更できないようにする
		frame.setResizable(false);
		
		//ヘッダーパネルを作成
		JPanel headerPanel = makePanel(Color.BLACK,640, 50);
		//ウィンドウにヘッダーパネルを追加
		frame.add(headerPanel, BorderLayout.NORTH);
		
		//コンテンツパネルを作成
		JPanel contentsPanel = makePanel(Color.WHITE);
		//コンテンツパネルを作成
		frame.add(contentsPanel, BorderLayout.CENTER);
				
		//フッターパネル
		JPanel footerPanel = makePanel(Color.BLACK,640, 50);
		//ウィンドウにフッターパネルを追加
		frame.add(footerPanel, BorderLayout.SOUTH);		
	
		//ウィンドウを表示する
		frame.setVisible(true);
	}
	
	//パネルを作るメソッド（幅と高さを指定する用）
	static JPanel makePanel(Color color, int width, int height) {
		//JPanelクラスをインスタンス化
		JPanel panel = new JPanel();
		//パネルの色を変更する
		panel.setBackground(color);
		//パネルのサイズを「width、height」に設定
		panel.setPreferredSize(new Dimension(width, height));
		//作ったパネルを返す
		return panel;
	}
		
	//パネルを作るメソッド（幅と高さを指定しない用）
	static JPanel makePanel(Color color) {
		//JPanelクラスをインスタンス化
		JPanel panel = new JPanel();
		//パネルの色を変更する
		panel.setBackground(color);
		//作ったパネルを返す
		return panel;
	}

}
