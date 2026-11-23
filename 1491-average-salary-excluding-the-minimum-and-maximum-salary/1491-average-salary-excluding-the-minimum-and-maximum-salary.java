class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = 0;

        for (int num : salary) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return (double) (sum - min - max) / (salary.length - 2);
    }
}