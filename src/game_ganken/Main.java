package game_ganken;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
		//ヘッダーパネルに、レイアウトマネージャとしてBorderLayoutを指定
		headerPanel.setLayout(new BorderLayout());
		//JLabelクラスをインスタンス化
		JLabel label = new JLabel("「さあ、じゃんけんで勝負だ！」");
		//テキストの文字を白にする
		label.setForeground(Color.WHITE);
		//テキストのフォントを設定
		label.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 24));
		//テキストの位置を、水平方向の中心にする
		label.setHorizontalAlignment(JLabel.CENTER);
		//テキストの位置を、垂直方向の中心にする
		label.setVerticalAlignment(JLabel.CENTER);
		//ヘッダーパネルにテキストを追加
		headerPanel.add(label);
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
