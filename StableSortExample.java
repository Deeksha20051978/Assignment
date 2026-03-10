class StableSortExample {

    static class Item {
        int value, index;

        Item(int v,int i){
            value=v;
            index=i;
        }
    }

    public static void main(String args[]) {

        Item arr[]={
            new Item(4,1),
            new Item(4,2),
            new Item(3,3)
        };

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){

                if(arr[j].value > arr[j+1].value){

                    Item temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(Item i:arr)
            System.out.println(i.value+" "+i.index);
    }
}