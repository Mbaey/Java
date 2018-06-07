package com.lzy.GameRule;

import java.util.ArrayList;
import java.util.Comparator;

import com.lzy.bean.Pai;

public class GameRule {
	public enum LeiBie {// 类别
		TongHuaShun, TongHua, ShunZi, TongDian, DuiZi, ZaPai, FeiFa;
	};

	/**
	 * 红桃234  黑桃456 B赢了 红桃234 红桃567 A
	 * 
	 * @param paiA
	 * @param paiB
	 * @return
	 */
	public int TongHuaShun(ArrayList<Pai> paiA, ArrayList<Pai> paiB) {

		int hua = cmpHua(paiA.get(2).getHuaSe(), paiB.get(2).getHuaSe());
		if (hua > 0) {
			return 1;
		} else if (hua < 0) {
			return -1;
		} else {
			return cmpDian(paiA.get(2).getDianShu(), paiB.get(2).getDianShu());
		}
	}

	

	/**
	 * 红桃23A 黑桃45K B赢了 红桃23A 红桃56K A
	 * 
	 * @param paiA
	 * @param paiB
	 * @return
	 */
	public int TongHua(ArrayList<Pai> paiA, ArrayList<Pai> paiB) {
		int hua = cmpHua(paiA.get(2).getHuaSe(), paiB.get(2).getHuaSe());
		if (hua > 0) {
			return 1;
		} else if (hua < 0) {
			return -1;
		} else {
			return cmpDian(paiA.get(2).getDianShu(), paiB.get(2).getDianShu());
		}
	}

	/**
	 * 顺子的 234 456 B 红桃234 黑桃234 B
	 * 
	 * @param paiA
	 * @param paiB
	 * @return
	 */
	public int ShunZi(ArrayList<Pai> paiA, ArrayList<Pai> paiB) {
		int dian = cmpDian(paiA.get(2).getDianShu(), paiB.get(2).getDianShu());
		int hua = cmpHua(paiA.get(2).getHuaSe(), paiB.get(2).getHuaSe());
		if (dian > 0) {
			return 1;
		} else if (dian < 0) {
			return -1;
		} else {
			return hua;
		}
	}



	/**
	 * 333 和 222 A大 没有 六张一样的 222 222
	 * 
	 * @param paiA
	 * @param paiB
	 * @return
	 */
	public int TongDian(ArrayList<Pai> paiA, ArrayList<Pai> paiB) {
		int dian = cmpDian(paiA.get(2).getDianShu(), paiB.get(2).getDianShu());
		if (dian > 0) {
			return 1;
		} else {
			return -1;
		}
	}

	/**
	 * 对子排序后一定是xxy 或yyx 223 556 B 223 224 比较谁的对子有黑桃
	 * 
	 * @param paiA
	 * @param paiB
	 * @return
	 */
	public int DuiZi(ArrayList<Pai> paiA, ArrayList<Pai> paiB) {
		int dian = cmpDian(paiA.get(1).getDianShu(), paiB.get(1).getDianShu());
		if (dian > 0) {
			return 1;
		} else if (dian < 0) {
			return -1;
		} else {
			for(Pai a : paiA){
				if("黑桃".equals(a.getHuaSe()) && paiA.get(1).getDianShu() == a.getDianShu())
					return 1;
			}
			return -1;
		}
	}
	
	public int ZaPai(ArrayList<Pai> paiA, ArrayList<Pai> paiB) {
		int dian = cmpDian(paiA.get(2).getDianShu(), paiB.get(2).getDianShu());
		int hua = cmpHua(paiA.get(2).getHuaSe(), paiB.get(2).getHuaSe());
		if (dian > 0) {
			return 1;
		} else if (dian < 0) {
			return -1;
		} else {
			return hua;
		}
	}
	private int cmpDian(String dianShu, String dianShu2) {
		
		return Integer.compare(Pai.Dian.indexOf(dianShu), Pai.Dian.indexOf(dianShu2));
	}
	private int cmpHua(String huaSe, String huaSe2) {
		return Integer.compare(Pai.Hua.indexOf(huaSe), Pai.Hua.indexOf(huaSe2));
	}
//	private int cmpHuas(ArrayList<Pai> paiA, ArrayList<Pai> paiB) {
//		int hA = 0, hB = 0;
//		for (Pai a : paiA) {
//			hA += Pai.Hua.indexOf(a.getHuaSe());
//		}
//		for (Pai b : paiB) {
//			hB += Pai.Hua.indexOf(b.getHuaSe());
//		}
//		return Integer.compare(hA, hB);
//	}
//
//	private int cmpDians(ArrayList<Pai> paiA, ArrayList<Pai> paiB) {
//		int dA = 0, dB = 0;
//		for (Pai a : paiA) {
//			dA += Pai.Dian.indexOf(a.getDianShu());
//		}
//		for (Pai b : paiB) {
//			dB += Pai.Dian.indexOf(b.getDianShu());
//		}
//		return Integer.compare(dA, dB);
//	}

	public int BuTong(LeiBie aClass, LeiBie bClass) {
		return bClass.compareTo(aClass);
	}

	public LeiBie PanDuan(ArrayList<Pai> pai) {
		if(pai.size() == 3){
			for (Pai p : pai) {
				if(Pai.Dian.indexOf(p.getDianShu())==-1)
					return LeiBie.FeiFa;
				if(Pai.Hua.indexOf(p.getHuaSe())==-1)
					return LeiBie.FeiFa;
			}
			sortByDian(pai);
			// TongDian, DuiZi, ZaPai;
			String dianShu1 = pai.get(1).getDianShu();
			String dianShu0 = pai.get(0).getDianShu();
			String dianShu2 = pai.get(2).getDianShu();
			int dian0 = Pai.Dian.indexOf(dianShu0);
			int dian1 = Pai.Dian.indexOf(dianShu1);
			int dian2 = Pai.Dian.indexOf(dianShu2);
			boolean isShunZi = dian1 == dian0 + 1
					&& dian2 == dian1 + 1;
			boolean isTongHua = pai.get(0).getHuaSe().equals(pai.get(1).getHuaSe())
					&& pai.get(0).getHuaSe().equals(pai.get(2).getHuaSe());
			boolean isTongDian = dianShu1 == dianShu0
					&& dianShu2 == dianShu1;
			boolean isDuiZi = dianShu1 == dianShu0
					|| dianShu2 == dianShu1;
			if (isTongHua) {
				if (isShunZi)
					return LeiBie.TongHuaShun;
				return LeiBie.TongHua;
			} else if (isShunZi) {
				return LeiBie.ShunZi;
			} else if (isTongDian) {
				return LeiBie.TongDian;
			} else if (isDuiZi) {
				return LeiBie.DuiZi;
			} else
				return LeiBie.ZaPai;
			
		}
		return LeiBie.FeiFa;

	}
	
	private void sortByDian(ArrayList<Pai> pai) {
		pai.sort(new Comparator<Pai>() {
			@Override
			public int compare(Pai arg0, Pai arg1) {
				return Integer.compare(Pai.Dian.indexOf(arg0.getDianShu()), Pai.Dian.indexOf(arg1.getDianShu()));
			}
		});
	}

}
