class Renshu {

    int answer;
    
        // xを2倍にして返す関数
        public int doubleValue(int x) {
            return x * 2;
        }
    
        //ここに続きを実装していく。
    
        public int sumUpToN(int n){
            answer = 0;
            while(n>=0){
                answer = answer + n;
                n-=1;
            }
            return answer;
        }
    
        public int sumFromPtoQ(int p,int q){
            answer = 0;
            if(p>q){
                return -1;
            }else{
            for(int i=p;i<=q;i++){
                answer = answer + i;
            }
            return answer;
            }
        }
    
        public int sumFromArrayIndex(int[] a,int index){
            answer = 0;
    
            if(index>=a.length){
                return -1;
            }else{
                for(int i=index;i<a.length;i++){
                    answer += a[i];
                }
            }
            return answer;
        }
    
        public int selectMaxValue(int[] a){
            answer = a[0];
            for(int i=1;i<a.length;i++){
                if(answer<a[i]){
                    answer = a[i];
                }
            }
            return answer;
        }
    
        public int selectMinValue(int[] a){
            answer = a[0];
            for(int i=1;i<a.length;i++){
                if(answer>a[i]){
                    answer = a[i];
                }
            }
            return answer;
        }
    
        public int selectMaxIndex(int[] a){
            int start = a[0];
            for(int i=1;i<a.length;i++){
                if(start<a[i]){
                    start = a[i];
                    answer = i;
                }
            }
            return answer;
        }
    
        public int selectMinIndex(int[] a){
            int start = a[0];
            for(int i=1;i<a.length;i++){
                if(start>a[i]){
                    start = a[i];
                    answer = i;
                }
            }
            return answer;
        }
    
        public void swapArrayElements(int[] p,int i,int j){
            int box = 0;
            box = p[i];
            p[i] = p[j];
            p[j] = box;
        }
    
        public boolean swapTwoArrays(int []a,int[] b){
    
            if(a.length != b.length ){
                return false;
            }else{
            int box = 0;
    
            for(int i=0;i<a.length;i++){
                box = a[i];
                a[i]=b[i];
                b[i]=box;
            }
            return true;
            }
        }
    
        public int bubbleSort(int []a){
            answer = 0;
            return answer;
        }
    
    }