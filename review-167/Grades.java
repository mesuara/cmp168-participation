
import java.util.Scanner;
import java.util.Arrays;
class Grades {
 static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {


  //  Scanner input = new Scanner(System.in);
//   int[] grades = new int[50];

// int len = readGrades(grades);

boolean found =true;
do {
            int len = 0;
            int[] grades = new int[100];

            len = readGrades(grades);

            if (len != 0) {
                int[] temp = grades;
                grades = new int[len];

                for (int i = 0; i < grades.length; i++) {
                    grades[i] = temp[i];
                }

                System.out.println("Number Of Grades = " + len);
              System.out.println("Maximum Grade = " + maxValue(grades));
                System.out.println("Minimum Grade = " + minValue(grades));
                System.out.println("");

            } else {
                found = false;
            }
        } while (found);



  
  }

public static int readGrades(int[] grades){
  int count = 0;
 
  // Scanner input = new Scanner(System.in);
  //  input.open();
  for(int i=0; i < grades.length; i++){
    System.out.println("Enter a grade : ");
  
    int grade = input.nextInt();
    if(grade < 0){
      break;
    }else{
      grades[i] = grade;
      count++;
    }
  }

  int[] temp = new int[count];
   for(int i=0; i < temp.length; i++){
     temp[i] = grades[i];
   }
// input.close();
   grades = temp;
  return count;
}


// public static int readGrades(int[] grades){
 
//   }

  public static int sum(int[] arr) {
        
     int sum = 0;
     for(int i = 0; i < arr.length; i++)
      {   
          sum += arr[i];
      }
       
       
     return sum;  
        
    }


   public static int sum(int[] arr, int firstIndex, int lastIndex){
        
       int sum = -666;
if(firstIndex <= lastIndex && (firstIndex < arr.length && firstIndex >= 0) && (lastIndex < arr.length && lastIndex >= 0))
       { 
          sum = 0;
   for(int i = firstIndex; i <= lastIndex; i++){
            sum += arr[i];
          }
          return sum;
       }
     return sum;  

    }


public static double average(int[] numbers){
  double sum = 0.0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
  return sum/ numbers.length;
}


    
    public static int maxValue(int[] arr){

        int temp [] = new int [arr.length];
        int j = 0;
        
        for(int i = 0; i < arr.length; i++)
         {
        
           temp[j] = arr[i]; j++;
       
         }
 
        Arrays.sort(temp);

        return temp[temp.length-1];
        
        
        
    }
    public static int maxValue(int[] arr,int firstIndex,int lastIndex){
        int result = -666;

       if(firstIndex <= lastIndex && (firstIndex < arr.length && firstIndex >= 0) && (lastIndex < arr.length && lastIndex >= 0)){
        int temp [] = new int [arr.length];
        int j = 0;
        
        for(int i = firstIndex; i <= lastIndex; i++)
         {
 
           temp[j] = arr[i]; j++;

         }

        Arrays.sort(temp);

        
        return temp[temp.length-1];
        
       }
 System.out.println("result " + result);
       return result;
        
    }

     public static int minValue(int[] arr){
        
        int temp [] = new int [arr.length];
       
        int j = 0;
        
        for(int i = 0; i < arr.length; i++)
         {
  
            temp[j] = arr[i];
                  j++;
            
         }
       Arrays.sort(temp);

        return temp[0];

        
    }
 public static int minValue(int[] arr,int firstIndex,int lastIndex){
        int result = -666;

       if(firstIndex <= lastIndex && (firstIndex < arr.length && firstIndex >= 0) && (lastIndex < arr.length && lastIndex >= 0)){
        int temp [] = new int [lastIndex-firstIndex+1];
        int j = 0;
        
        for(int i = firstIndex; i <= lastIndex; i++)
         {
 
           temp[j] = arr[i]; j++;

         }

        Arrays.sort(temp);

  //          for(int i =0; i < temp.length; i++){
  //     System.out.println(temp[i]);
  //  }
        return temp[0];
        
       }
return result;

 }
    public static int indexOfFirstMaxValue(int[] arr){
      int index=0;
      int max =arr[0];
        for(int i = 0; i < arr.length; i++){
          if(arr[i] > max){
            max = arr[i];
            index = i;
          }
        }

      return index;

    }
       

    public static int indexOfFirstMinValue(int[] arr){
            int index=0;
      int min =arr[0];
        for(int i = 0; i < arr.length; i++){
          if(arr[i] < min){
            min = arr[i];
            index = i;
          }
        }

      return index;
    }
        
public static int numberOfBelowAverageElements(int[] arr){
  int count=0;
  int avg = (int)average(arr);
  for(int i =0; i < arr.length;i++){
    if(arr[i]< avg){
      count++;
    }
  }
  return count;
}

public static int numberOfAboveAverageElements(int[] arr){
  int count=0;
  int avg = (int)average(arr);
  for(int i =0; i < arr.length;i++){
    if(arr[i]> avg){
      count++;
    }
  }
  return count;
}

public static void rotateElements(int[] arr){
      int temp = arr[arr.length-1];
      int tempVal = arr[0];
        for(int i=1; i < arr.length; i++){
         int nextVal = arr[i];
         arr[i] = tempVal;
         tempVal = nextVal;
      }

      arr[0]= temp;

}




public static void reverseArray(int[] arr){
  int n = arr.length;
int[] arrRev = new int[n];

        int j = n;
        for (int i = 0; i < n; i++) {
            arrRev[j - 1] = arr[i];
            j = j - 1;
        }
        for(int i =0; i < arr.length; i++){
          arr[i] = arrRev[i];
        }
          for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
}
public static void rotateElements(int[] arr,int rotationCount){
  
     for(int i = 0; i< rotationCount; i ++){
       rotateElements(arr);
     }


     for(int i =0; i < arr.length;i++){
       System.out.println(arr[i]);
     }
  
}


     private static int indexOf(int[] iArray, int element){
        
        int index = -1;
        
        if(iArray == null)
            return index;
        
        for(int i=0; i < iArray.length; i++){
            if(iArray[i] == element){
                index = i;
                break;
            }
        }
                
        return index;        
    }
    
    

    
}