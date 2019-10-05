package week_6.ruby;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TopViewTest {
	@Test
	public void 큰숫자만출력() {
		//assertEquals(GoodlandElectricity.pylons(4, new int[]{0,0,0,1,0,0,0,0,0,0,0,1}), -1);
		//1,2,5,6
		//input(new int[] {1,2,5,3,4,6});
		//1 2 4 14 23 37 108 111 115 116 83 84 85 
		input(new int[] {37,23,108,59,86,64,94,14,105,17,111,65,55,31,79,97,78,25,50,22,66,46,104,98,81,90,68,40,103,77,74,18,69,82,41,4,48,83,67,6,2,95,54,100,99,84,34,88,27,72,32,62,9,56,109,115,33,15,91,29,85,114,112,20,26,30,93,96,87,42,38,60,7,73,35,12,10,57,80,13,52,44,16,70,8,39,107,106,63,24,92,45,75,116,5,61,49,101,71,11,53,43,102,110,1,58,36,28,76,47,113,21,89,51,19,3});
	}
	
	public static void input(int[] numarr) {
        int t = numarr.length;
        Node root = null;
        for(int i=0; i<t; i++) {
            int data = numarr[i];
            root = TopView.insert(root, data);
        }
        TopView.topView(root);
    }	
}
