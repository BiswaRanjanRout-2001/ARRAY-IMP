


public class LinearSearch {
    
    //Linear Search
    public static int linearSearch(int numbers[], int key){//we are passing all number given and key which one we have to findout form that array 

        //in this loop we are trying to findout the key is in which index in simple word we are trying to find index number or key 
        for(int i=0; i<numbers.length; i++){// i<number.length means 0<10

            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;//we are returning -1 if that value is not existing in side the array the output will -1
    }



    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};//Given numbers are these 
        int key = 10;//we have to find out 10 means key using linear search technique

        //store in a variable function return value eg: index no or -1
        int index = linearSearch(numbers, key);

        //using the loop if index is storing value of -1 then then we are printing there is no index of this key & if index does't have -1 value then printing the index no
        if (index == -1) {
            System.out.println("Index NOT found");
        }else{
            System.out.println("index of key is: " + index);
        }

    }
}
