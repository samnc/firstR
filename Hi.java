ackage com.xx.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hi {
	public static void main(String[] args) {
		String [] policyno= {"ZHZ961AP7777903","ZHZ961AP7774038","ZHZ961AP7716198","ZHZ961AP7708888","ZHZ961AP7714565","ZHZ961AP7715728","ZHZ961AP7713754","ZHZ961AP7749963"};
		String [] classcode= {"14770100","14770100","14770100","14770100","14770100","14770100",
				"14770100","14770100","14770100","14770100"};
		for(int i=0;i<policyno.length;i++) {
			System.out.print("select state,policyno from job_policynopay where policyno='"
					+ policyno[i]+"' and classcode='"+classcode[0]);
			if(i!=policyno.length-1) {
				System.out.println("' union all ");
			}else {
				System.out.println("' ;");
			}
		}
		shuDu();
	}
	public static void shuDu() {
		List<Integer> exitNum=new ArrayList<>();
		List<Integer> possable=new ArrayList<>();
		Map<String,List<Integer>> map=new HashMap<>();
		int [] arr= {1,2,3,4,5,6,7,8,9};
		int [] minG= new int[10];
//		int [] [] maxG= {minG,minG,minG,minG,minG,minG,minG,minG,minG,minG};
		int [] [] maxG= new int[10][10];
		maxG[3][1]=8;
		maxG[7][1]=2;
		maxG[2][2]=3;
		maxG[4][2]=8;
		maxG[6][2]=2;
		maxG[8][2]=6;
		
		maxG[1][3]=7;
		maxG[5][3]=9;
		maxG[9][3]=5;
		
		maxG[2][4]=5;
		maxG[8][4]=1;
		
		maxG[3][5]=4;
		maxG[7][5]=6;
		
		maxG[2][6]=2;
		maxG[8][6]=7;
		
		maxG[1][7]=4;
		maxG[5][7]=8;
		maxG[9][7]=6;
		
		maxG[2][8]=7;
		maxG[4][8]=1;
		maxG[6][8]=3;
		maxG[8][8]=9;
		
		maxG[3][9]=1;
		maxG[7][9]=8;
		System.out.println(maxG[1][3]);
		for(int i=1;i<maxG.length;i++) {
			for(int j=1;j<maxG[i].length;j++) {
				exitNum=new ArrayList<>();
				possable=new ArrayList<>();
				if(maxG[i][j]==0) {
					for(int k=1;k<10;k++) {
						if(maxG[i][k]!=0) {
							exitNum.add(new Integer(maxG[i][k]));
						}
						if(maxG[k][j]!=0) {
							exitNum.add(new Integer(maxG[k][j]));
						}
					}
					for(int temp:arr){
						if(!exitNum.contains(new Integer(temp))) {
							possable.add(new Integer(temp));
						}
					}
					if(i<4) {
						if(j<4) {
							for(int k1=1;k1<4;k1++) {
								for(int k2=1;k2<4;k2++) {
									if(maxG[k1][k2]!=0) {
										possable.remove(new Integer(maxG[k1][k2]));
									}
								}
							}
						}
						if(j>3&&j<7) {
							for(int k1=4;k1<7;k1++) {
								for(int k2=4;k2<7;k2++) {
									if(maxG[k1][k2]!=0) {
										possable.remove(new Integer(maxG[k1][k2]));
									}
								}
							}
						}
						if(j>6&&j<10) {
							for(int k1=7;k1<10;k1++) {
								for(int k2=7;k2<10;k2++) {
									if(maxG[k1][k2]!=0) {
										possable.remove(new Integer(maxG[k1][k2]));
									}
								}
							}
						}
					}
					if(i>3&&i<7) {
						if(j<4) {
							for(int k1=4;k1<7;k1++) {
								for(int k2=1;k2<4;k2++) {
									if(maxG[k1][k2]!=0) {
										possable.remove(new Integer(maxG[k1][k2]));
									}
								}
							}
						}
						if(j>3&&j<7) {
							for(int k1=4;k1<7;k1++) {
								for(int k2=4;k2<7;k2++) {
									if(maxG[k1][k2]!=0) {
										possable.remove(new Integer(maxG[k1][k2]));
									}
								}
							}
						}
						if(j>6&&j<10) {
							for(int k1=4;k1<7;k1++) {
								for(int k2=7;k2<10;k2++) {
									if(maxG[k1][k2]!=0) {
										possable.remove(new Integer(maxG[k1][k2]));
									}
								}
							}
						}
					}
					if(i>6&&i<10) {
						if(j<4) {
							for(int k1=7;k1<10;k1++) {
								for(int k2=1;k2<4;k2++) {
									if(maxG[k1][k2]!=0) {
										possable.remove(new Integer(maxG[k1][k2]));
									}
								}
							}
						}
						if(j>3&&j<7) {
							for(int k1=7;k1<10;k1++) {
								for(int k2=4;k2<7;k2++) {
									if(maxG[k1][k2]!=0) {
										possable.remove(new Integer(maxG[k1][k2]));
									}
								}
							}
						}
						if(j>6&&j<10) {
							for(int k1=7;k1<10;k1++) {
								for(int k2=7;k2<10;k2++) {
									if(maxG[k1][k2]!=0) {
										possable.remove(new Integer(maxG[k1][k2]));
									}
								}
							}
						}
					}
					map.put(i+"-"+j,possable);
				}
			}
		}
		for(int i=1;i<maxG.length;i++) {
			for(int j=1;j<maxG[i].length;j++) {
				
			}
		}
		
		
		
		
		
		for(Map.Entry<String, List<Integer>> a: map.entrySet()) {
			System.out.println(a.getKey());
			for(Integer a1:a.getValue()) {
				System.out.print(a1+"--");
			}
			System.out.println();
		}
	}
}
