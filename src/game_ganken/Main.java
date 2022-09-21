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
		
		//JPanelクラスをインスタンス化
		JPanel headerPanel = new JPanel();
		//パネルの色を黒にする
		headerPanel.setBackground(Color.BLACK);
		//ヘッダーパネルのサイズを「横幅640、縦幅50」に設定
		headerPanel.setPreferredSize(new Dimension(640, 50));
		//ウィンドウにヘッダーパネルを追加
		frame.add(headerPanel, BorderLayout.NORTH);
		
		//コンテンツパネル
		JPanel contentsPanel = new JPanel();
		contentsPanel.setBackground(Color.WHITE);
		frame.add(contentsPanel, BorderLayout.CENTER);
				
		//フッターパネル
		JPanel footerPanel = new JPanel();
		footerPanel.setBackground(Color.BLACK);
		footerPanel.setPreferredSize(new Dimension(640, 50));
		frame.add(footerPanel, BorderLayout.SOUTH);		
		
		//ウィンドウを表示する
		frame.setVisible(true);
	}

}
