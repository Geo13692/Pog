class Main {
        // n > m
        public static int euclid(int n, int m) {
                int lastN = 0;
                int nMinusM = n-m;
                while (m !=0){
                        int nMinusm = n-m;
                        if(nMinusM > m) {
                                m=m;
                                lastN = n;
                                n = nMinusm;}
                        else{
                                m=nMinusM;
                                lastN = n;
                                n=m;
                            }
                        }
                        if (n==0){
                        return n;
                }
                return m;
        }
        //this hurts
        public static void main(String[] args){
                int greater, lesser;
                greater = 25;
                lesser = 15;
                System.out.println(Integer.toString(euclid(greater, lesser)));
        }
}
