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
	@Test//��ɫ��ͬ�����Ӯ
	public void testTongHuaShun1() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "3"));
		paiA.add(new Pai("����", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("����", "2"));
		paiB.add(new Pai("����", "3"));
		paiB.add(new Pai("����", "4"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.TongHuaShun(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//��ɫ��ͬ���������Ӯ
	public void testTongHuaShun2() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "3"));
		paiA.add(new Pai("����", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("����", "5"));
		paiB.add(new Pai("����", "6"));
		paiB.add(new Pai("����", "7"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.TongHuaShun(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}

	@Test//��ɫ��ͬ�����Ӯ  A ying
	public void testTongHua() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "7"));
		paiA.add(new Pai("����", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("����", "2"));
		paiB.add(new Pai("����", "3"));
		paiB.add(new Pai("����", "4"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.TongHua(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//��ɫ��ͬ���������Ӯ
	public void testTongHua2() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "7"));
		paiA.add(new Pai("����", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("����", "J"));
		paiB.add(new Pai("����", "Q"));
		paiB.add(new Pai("����", "A"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.TongHua(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//�������Ӯ  ����Ȼ�ɫ
	public void testShunZi1() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "3"));
		paiA.add(new Pai("����", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("����", "J"));
		paiB.add(new Pai("����", "Q"));
		paiB.add(new Pai("����", "K"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.ShunZi(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//�������Ӯ  ���������ƻ�ɫ
	public void testShunZi2() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "3"));
		paiA.add(new Pai("����", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("����", "2"));
		paiB.add(new Pai("����", "3"));
		paiB.add(new Pai("����", "4"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.ShunZi(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//�������Ӯ  ֻ����һ�����
	public void testTongDian1() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "2"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("����", "3"));
		paiB.add(new Pai("����", "3"));
		paiB.add(new Pai("����", "3"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.TongDian(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//�������Ӯ  ���������ƻ�ɫ
	public void testDuiZi1() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "3"));
		paiA.add(new Pai("����", "3"));
		paiA.add(new Pai("����", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("����", "2"));
		paiB.add(new Pai("����", "2"));
		paiB.add(new Pai("����", "4"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.DuiZi(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//�������Ӯ  ���������ƻ�ɫ
	public void testDuiZi2() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("����", "2"));
		paiB.add(new Pai("÷��", "2"));
		paiB.add(new Pai("����", "4"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.DuiZi(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//�������Ӯ  ���������ƻ�ɫ
	public void testZaPai1() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "J"));
		paiA.add(new Pai("����", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("����", "2"));
		paiB.add(new Pai("÷��", "A"));
		paiB.add(new Pai("����", "4"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.ZaPai(paiA, paiB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//�������Ӯ  ���������ƻ�ɫ
	public void testBuTong1() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "3"));
		paiA.add(new Pai("����", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("����", "2"));
		paiB.add(new Pai("÷��", "J"));
		paiB.add(new Pai("����", "4"));
		LeiBie panDuanA = gr.PanDuan(paiA);
		LeiBie panDuanB = gr.PanDuan(paiB);
		System.out.println(panDuanA);
		System.out.println(panDuanB);
		int tongHuaShun = gr.BuTong(panDuanA, panDuanB);
		go.sayShuYing(tongHuaShun);
	}
	@Test//�������Ӯ  ���������ƻ�ɫ
	public void testZaPai2() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "J"));
		paiA.add(new Pai("����", "4"));
		ArrayList<Pai> paiB = new ArrayList<Pai>();
		paiB.add(new Pai("����", "2"));
		paiB.add(new Pai("÷��", "J"));
		paiB.add(new Pai("����", "4"));
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
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "3"));
		paiA.add(new Pai("����", "4"));
		LeiBie panDuan = gr.PanDuan(paiA);
		System.out.println(panDuan);
	}
	@Test//		TongHuaShun, TongHua, ShunZi, TongDian, DuiZi, ZaPai;
	public void testPanDuanTongHua() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "A"));
		paiA.add(new Pai("����", "4"));
		LeiBie panDuan = gr.PanDuan(paiA);
		System.out.println(panDuan);
	}
	@Test//		TongHuaShun, TongHua, ShunZi, TongDian, DuiZi, ZaPai;
	public void testPanDuanShunZi() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "3"));
		paiA.add(new Pai("����", "4"));
		LeiBie panDuan = gr.PanDuan(paiA);
		System.out.println(panDuan);
	}
	@Test//		TongHuaShun, TongHua, ShunZi, TongDian, DuiZi, ZaPai;
	public void testPanDuanTongDian() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "2"));
		LeiBie panDuan = gr.PanDuan(paiA);
		System.out.println(panDuan);
	}
	@Test//		TongHuaShun, TongHua, ShunZi, TongDian, DuiZi, ZaPai;
	public void testPanDuanDuiZi() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "2"));
		paiA.add(new Pai("����", "K"));
		LeiBie panDuan = gr.PanDuan(paiA);
		System.out.println(panDuan);
	}
	@Test//		TongHuaShun, TongHua, ShunZi, TongDian, DuiZi, ZaPai;
	public void testPanDuanZaPai() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "A"));
		paiA.add(new Pai("����", "8"));
		paiA.add(new Pai("����", "K"));
		LeiBie panDuan = gr.PanDuan(paiA);
		System.out.println(panDuan);
	}
	@Test//		TongHuaShun, TongHua, ShunZi, TongDian, DuiZi, ZaPai, FeiFa;
	public void testPanDuanFeiFa() {
		ArrayList<Pai> paiA = new ArrayList<Pai>();
		paiA.add(new Pai("����", "11"));
		paiA.add(new Pai("����", "0"));
		paiA.add(new Pai("����", "K"));
		LeiBie panDuan = gr.PanDuan(paiA);
		System.out.println(panDuan);
	}

}
