package com.heroDemo;

public class TestThread {

	public static void main(String[] args) {

		final Hero gareen = new Hero();
		gareen.name = "����";
		gareen.hp = 10000;

		System.out.printf("���׵ĳ�ʼѪ���� %.0f%n", gareen.hp);

		// ���߳�ͬ������ָ���Ƕ���߳�ͬʱ�޸�һ�����ݵ�ʱ�򣬵��µ�����

		// ���������10000��Ѫ�������ڻ����ͬʱ�ֱ��Է����Ӣ�۹���

		// ��JAVA��������ʾ�������ж���߳��ڼ��ٸ��׵�hp
		// ͬʱ���ж���߳��ڻظ����׵�hp

		// n���߳����Ӹ��׵�hp

		int n = 90000;

		Thread[] addThreads = new Thread[n];
		Thread[] reduceThreads = new Thread[n];

		for (int i = 0; i < n; i++) {
			Thread t = new Thread() {
				public void run() {
					gareen.recover();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			t.start();
			addThreads[i] = t;

		}

		// n���̼߳��ٸ��׵�hp
		for (int i = 0; i < n; i++) {
			Thread t = new Thread() {
				public void run() {
					gareen.hurt();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			t.start();
			reduceThreads[i] = t;
		}
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(500);
						System.out.printf("���׵�Ѫ������� %.0f%n", gareen.hp);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();

		// �ȴ����������߳̽���
		for (Thread t : addThreads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// �ȴ����м����߳̽���
		for (Thread t : reduceThreads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// ����ִ�е�����������Ӻͼ����̶߳�������

		// ���Ӻͼ����̵߳�������һ���ģ�ÿ�ζ����ӣ�����1.
		// ��ô�����̶߳������󣬸��׵�hpӦ�û��ǳ�ʼֵ

		// ������ʵ�Ϲ۲쵽���ǣ�

		System.out.printf("%d�������̺߳�%d�������߳̽�����%n���׵�Ѫ������� %.0f%n", n, n, gareen.hp);

	}

}