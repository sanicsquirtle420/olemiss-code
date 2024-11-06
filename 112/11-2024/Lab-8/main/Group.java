public class Group {
    // TODO make a Member array or ArrayList attribute for the class
    // an array will require a logical length variable
    private Member mems[] = new Member[50] ;
    private int count ;

    public void addMember(String name, int age){
        mems[count] = new Member(name , age) ;
        count++ ;
    }



    // TODO create a recursive sum method
    public int sum(int s , int e) {
        if(s > e) {
            return 0 ;
        }

        return mems[s].getAge() + sum(s + 1 , e) ;
    }

    public int averageAge() {
        return sum(0 , count - 1) / count ;
    }


    // TODO create a get method for the logical length of the class attribute
    public int logicalLength() {
        return count ;
    }


    // TODO create a recursive sort method
    public void sort() {
        quickSort(0 , count - 1) ;
    }

    public void quickSort(int min , int max) {
        int p ;
        if(min < max) {
            p = partition(min , max) ;
            quickSort(min , (p - 1)) ;
            quickSort((p + 1) , max) ;
        }
    }

    public int partition(int min , int max) {
        int p = mems[min].getAge() ;
        int l = min ;
        int r = max ;
        while(l < r){
            while(mems[l].getAge() <= p && l < r) {
                l++ ;
            }
            while(mems[r].getAge() > p) {
                r-- ;
            }
            if(l < r) {
                swap(l , r) ;
            }
        }
        swap(min , r) ;

        return r ;
    }

    public void swap(int l , int r) {
        Member temp = mems[l] ;
        mems[l] = mems[r] ;
        mems[r] = temp ;
    }

    // TODO create a print method
    public void print() {
        for(int i = 0 ; i < count ; i++) {
            System.out.println(mems[i].toString()) ;
        }
    }
}
