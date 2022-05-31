package Model;

public class Mahasiswa {
    private String[] arr;
    public  Mahasiswa(){}
    public String [] getData (){return arr;}

    public void setarr(String[] arr)
    {this.arr = arr;}//diterima oleh this.data

    public  void selectionsort() {
        int i,j,minindex;
        String small;
        int n = this.arr.length;
        for( i=0; i <n - 1;i++) {
            minindex = i;
            for ( j = i + 1; j < n; j++) {
                if (this.arr[j].compareTo(this.arr[minindex]) < 0) {///
                    small = this.arr[j];// Make arr[j] as minStr and update min_idx

               String temp = this.arr[j];
               this.arr[j] = this.arr[i];
               this.arr[i]= temp;
           }
//                if (smallint != i) {
//                    String temp = arr[smallint];
//                    arr[smallint] = arr[i];
//                    arr[i] = temp;
               }}}
            public void Printarr(){
                System.out.println("Sorted array is");
                for (int i = 0; i < this.arr.length; i++) {
                    System.out.println(this.arr[i]+" ");
                }
            }


        }