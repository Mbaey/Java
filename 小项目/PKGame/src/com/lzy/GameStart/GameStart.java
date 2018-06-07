package com.lzy.GameStart;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import com.lzy.bean.Pai;

public class GameStart {
	//����
	/**
	 * 1.�������ƣ�ÿ����3��
	 * 2.����xianhou��Apai��Bpai
	 * @return pai[0] = Apai, pai[1] = Bpai, 
	 */
	public static ArrayList<Pai>[] faPai() {
		int ying = ZhiZi();
		ArrayList<Pai>[] res = new ArrayList[2];
		ArrayList<Pai> APai, BPai;
		HashSet<Pai> all = new HashSet<>();
		if(ying == 1){
			APai =  generateThree(all);		
			BPai =  generateThree(all);			
		}else{
			APai =  generateThree(all);		
			BPai =  generateThree(all);
		}
		res[0] = APai;
		res[1] = BPai;
		return res;		
	}
	private static ArrayList<Pai> generateThree(HashSet<Pai> all) {
		ArrayList<Pai> paiList= new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			while(true){
				Pai pai = getPai();
				if(!all.contains(pai)){
					all.add(pai);
					paiList.add(pai);
					break;
				}
			}
		}
		return paiList;
	}
	private static Pai getPai() {
		Random random = new Random();
		String huaSe = Pai.Hua.get(random.nextInt(4));
		String dianShu = Pai.Dian.get(random.nextInt(13));
		Pai a = new Pai(huaSe, dianShu);
		return a;
	}
	//Ͷɫ��
	/**
	 * @return����1 A�ȣ�0 B��
	 */
	public static int ZhiZi() {		
		return new Random().nextInt(2);			
	}
}
