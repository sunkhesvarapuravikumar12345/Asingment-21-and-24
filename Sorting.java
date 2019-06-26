class sorting {
    public static void main(String[] args) {
        int[] a= {1,1,1,1,0,0,1,0};
        for (int i : a) {
            System.out.print(i);
        }
        System.out.println();
        sort(a,a.length);
    }

    private static void sort(int[] a, int n) {
        int i, j,temp;
        for (i = 0; i < n-1; i++)
            for (j = 0; j < n-i-1; j++)
                if (a[j] > a[j+1]) {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
        for (int k : a) {
            System.out.print(k);
        }
    }

}