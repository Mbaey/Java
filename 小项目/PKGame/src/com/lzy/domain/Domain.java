package com.lzy.domain;

import java.util.ArrayList;

import com.lzy.GameOver.GameOver;
import com.lzy.GameRule.GameRule;
import com.lzy.GameRule.GameRule.LeiBie;
import com.lzy.GameStart.GameStart;
import com.lzy.bean.Pai;

public class Domain {
	public static void main(String[] args) {
		ArrayList<Pai>[] faPai = GameStart.faPai();
		ArrayList<Pai> APai = faPai[0];
		ArrayList<Pai> BPai = faPai[1];
		GameRule gr = new GameRule();
		LeiBie AClass = gr.PanDuan(APai);
		LeiBie BClass = gr.PanDuan(BPai);
		
		System.out.println(APai);
		System.out.println(BPai);
		System.out.println(AClass);
		System.out.println(BClass);
		int ASuccess = 1;
		if (AClass == BClass) {
			switch (AClass) {
			case TongHuaShun:
				ASuccess = gr.TongHuaShun(APai,BPai);
				break;
			case TongHua:
				ASuccess = gr.TongHua(APai,BPai);
				break;
			case ShunZi:
				ASuccess = gr.ShunZi(APai,BPai);
				break;
			case TongDian:
				ASuccess = gr.TongDian(APai,BPai);
				break;
			case DuiZi:
				ASuccess = gr.DuiZi(APai,BPai);
				break;
			case ZaPai:
				ASuccess = gr.ZaPai(APai,BPai);
				break;

			default:
				break;
			}
		}else {
			ASuccess = gr.BuTong(AClass,BClass);
		}
		
		GameOver.sayShuYing(ASuccess);
	}
}
