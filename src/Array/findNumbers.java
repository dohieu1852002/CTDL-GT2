package Array;

import java.util.Scanner;

public class findNumbers {
    public static int findNumber(int[] nums) {
        int count = 0;
        for (int i : nums) {
            int soLuongChuso = tinhSochuSo(nums[i]);
            if (soLuongChuso % 2 == 0)
                count++;
            return count;
        }

        return count;
    }

    private static int tinhSochuSo(int num) {
        int bienDem = 0;
        int kq = num;
        while (kq != 0) {
            kq = num / 10;
            num = kq;
            bienDem++;

        }
        return bienDem;
    }
    public static void main(String[] args) {
        int[] nums={111,222,4444,9999,191919191,1919191919};
        System.out.println(findNumber(nums));

    }
}



