package test.lzy.GameRule;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.lzy.GameOver.GameOver;
import com.lzy.GameRule.GameRule;
import com.lzy.GameRule.GameRule.LeiBie;
import com.lzy.bean.Pai;

public class GameRuleTest {
	public static GameRule gr = new GameRule();
	public static GameOver go = new GameOver();
	@Test//花色不同，大的赢
	public void testTongHuaShun1() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("黑桃", "3"));
		paiA.add(new Pai("黑桃", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("方块", "2"));
		paiB.add(new Pai("方块", "3"));
		paiB.add(new Pai("方块", "4"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.TongHuaShun(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//花色相同，点数大的赢
	public void testTongHuaShun2() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("黑桃", "3"));
		paiA.add(new Pai("黑桃", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("黑桃", "5"));
		paiB.add(new Pai("黑桃", "6"));
		paiB.add(new Pai("黑桃", "7"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.TongHuaShun(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}

	@Test//花色不同，大的赢  A ying
	public void testTongHua() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("黑桃", "7"));
		paiA.add(new Pai("黑桃", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("方块", "2"));
		paiB.add(new Pai("方块", "3"));
		paiB.add(new Pai("方块", "4"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.TongHua(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//花色相同，点数大的赢
	public void testTongHua2() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("黑桃", "7"));
		paiA.add(new Pai("黑桃", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("黑桃", "J"));
		paiB.add(new Pai("黑桃", "Q"));
		paiB.add(new Pai("黑桃", "A"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.TongHua(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//点数大的赢  否则比花色
	public void testShunZi1() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("红桃", "3"));
		paiA.add(new Pai("黑桃", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("黑桃", "J"));
		paiB.add(new Pai("红桃", "Q"));
		paiB.add(new Pai("黑桃", "K"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.ShunZi(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//点数大的赢  否则比最大牌花色
	public void testShunZi2() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("红桃", "3"));
		paiA.add(new Pai("黑桃", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("红桃", "2"));
		paiB.add(new Pai("黑桃", "3"));
		paiB.add(new Pai("红桃", "4"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.ShunZi(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//点数大的赢  只有这一种情况
	public void testTongDian1() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("红桃", "2"));
		paiA.add(new Pai("黑桃", "2"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("红桃", "3"));
		paiB.add(new Pai("黑桃", "3"));
		paiB.add(new Pai("红桃", "3"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.TongDian(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//点数大的赢  否则比最大牌花色
	public void testDuiZi1() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "3"));
		paiA.add(new Pai("红桃", "3"));
		paiA.add(new Pai("黑桃", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("红桃", "2"));
		paiB.add(new Pai("黑桃", "2"));
		paiB.add(new Pai("红桃", "4"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.DuiZi(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//点数大的赢  否则比最大牌花色
	public void testDuiZi2() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("红桃", "2"));
		paiA.add(new Pai("黑桃", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("方块", "2"));
		paiB.add(new Pai("梅花", "2"));
		paiB.add(new Pai("红桃", "4"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.DuiZi(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//点数大的赢  否则比最大牌花色
	public void testZaPai1() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("红桃", "J"));
		paiA.add(new Pai("黑桃", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("方块", "2"));
		paiB.add(new Pai("梅花", "A"));
		paiB.add(new Pai("红桃", "4"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.ZaPai(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//点数大的赢  否则比最大牌花色
	public void testBuTong1() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("红桃", "3"));
		paiA.add(new Pai("黑桃", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("方块", "2"));
		paiB.add(new Pai("梅花", "J"));
		paiB.add(new Pai("红桃", "4"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.BuTong(panDuanA, panDuanB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//点数大的赢  否则比最大牌花色
	public void testZaPai2() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("红桃", "J"));
		paiA.add(new Pai("黑桃", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("方块", "2"));
		paiB.add(new Pai("梅花", "J"));
		paiB.add(new Pai("红桃", "4"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.ZaPai(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	
	@Test//		TongHuaShun, TongHua, ShunZi, TongDian, DuiZi, ZaPai;
	public void testPanDuanTongHuaShun() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("黑桃", "3"));
		paiA.add(new Pai("黑桃", "4"));
		LeiBie panDuan = gr.PanDuan(paiA);
		System.out.println(panDuan);
	}
	@Test//		TongHuaShun, TongHua, ShunZi, TongDian, DuiZi, ZaPai;
	public void testPanDuanTongHua() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("黑桃", "A"));
		paiA.add(new Pai("黑桃", "4"));
		LeiBie panDuan = gr.PanDuan(paiA);
		System.out.println(panDuan);
	}
	@Test//		TongHuaShun, TongHua, ShunZi, TongDian, DuiZi, ZaPai;
	public void testPanDuanShunZi() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("红桃", "3"));
		paiA.add(new Pai("黑桃", "4"));
		LeiBie panDuan = gr.PanDuan(paiA);
		System.out.println(panDuan);
	}
	@Test//		TongHuaShun, TongHua, ShunZi, TongDian, DuiZi, ZaPai;
	public void testPanDuanTongDian() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("红桃", "2"));
		paiA.add(new Pai("黑桃", "2"));
		LeiBie panDuan = gr.PanDuan(paiA);
		System.out.println(panDuan);
	}
	@Test//		TongHuaShun, TongHua, ShunZi, TongDian, DuiZi, ZaPai;
	public void testPanDuanDuiZi() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "2"));
		paiA.add(new Pai("红桃", "2"));
		paiA.add(new Pai("黑桃", "K"));
		LeiBie panDuan = gr.PanDuan(paiA);
		System.out.println(panDuan);
	}
	@Test//		TongHuaShun, TongHua, ShunZi, TongDian, DuiZi, ZaPai;
	public void testPanDuanZaPai() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "A"));
		paiA.add(new Pai("红桃", "8"));
		paiA.add(new Pai("黑桃", "K"));
		LeiBie panDuan = gr.PanDuan(paiA);
		System.out.println(panDuan);
	}
	@Test//		TongHuaShun, TongHua, ShunZi, TongDian, DuiZi, ZaPai, FeiFa;
	public void testPanDuanFeiFa() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("黑桃", "11"));
		paiA.add(new Pai("红桃", "0"));
		paiA.add(new Pai("黑桃", "K"));
		LeiBie panDuan = gr.PanDuan(paiA);
		System.out.println(panDuan);
	}

}
