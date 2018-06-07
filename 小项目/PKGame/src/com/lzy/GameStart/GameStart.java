package com.lzy.GameStart;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import com.lzy.bean.Pai;

public class GameStart {
	//发牌
	/**
	 * 1.发两幅牌，每幅牌3张
	 * 2.根据xianhou给Apai或Bpai
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
	//投色子
	/**
	 * @return返回1 A先，0 B先
	 */
	public static int ZhiZi() {		
		return new Random().nextInt(2);			
	}
}
